package com.diantongren.service.impl;

import cn.hutool.core.util.StrUtil;
import com.diantongren.converter.LabelConverter;
import com.diantongren.mapper.LabelEntityDynamicSqlSupport;
import com.diantongren.mapper.LabelEntityMapper;
import com.diantongren.model.Label;
import com.diantongren.model.LabelEntity;
import com.diantongren.service.LabelService;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.mybatis.dynamic.sql.SqlBuilder.*;
import static org.mybatis.dynamic.sql.render.RenderingStrategies.MYBATIS3;

@Service
@RequiredArgsConstructor
public class LabelServiceImpl implements LabelService {
    final LabelEntityMapper labelEntityMapper;
    final LabelConverter labelConverter;

    @Override
    public List<Label> findLabels(Integer limit, Integer offset, String name) {
        val label = LabelEntityDynamicSqlSupport.labelEntity;
        val dsl = select(label.allColumns())
                .from(label)
                .where(label.name, isLikeWhenPresent(StrUtil.format("%{}%", name)))
                .limit(limit)
                .offset(offset)
                .build()
                .render(MYBATIS3);
        return labelEntityMapper.selectMany(dsl).stream()
                .map(labelConverter::to)
                .collect(Collectors.toList());
    }


    @Override
    public Optional<Label> findById(Long id) {
        return labelEntityMapper.selectByPrimaryKey(id)
                .map(labelConverter::to);
    }

    @Override
    public List<Label> t_label(Integer limit, Integer offset, Map<String, Object> where) {
        System.out.println(where);
        return null;
    }
}
