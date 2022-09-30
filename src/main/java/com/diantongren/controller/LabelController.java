package com.diantongren.controller;

import cn.hutool.json.JSONUtil;
import com.diantongren.model.Label;
import com.diantongren.service.LabelService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class LabelController {
    final LabelService labelService;

    @QueryMapping
    public List<Label> queryLabels(@Argument Integer limit, @Argument Integer offset, @Argument String name) {
        return labelService.findLabels(limit, offset, name);
    }

    @QueryMapping
    public Optional<Label> findById(@Argument Long id) {
        return labelService.findById(id);
    }

    @QueryMapping
    public List<Label> t_label(@Argument Integer limit, @Argument Integer offset, @Argument Map<String, Object> where) {
        System.out.println(JSONUtil.toJsonPrettyStr(where));
        JSONUtil.parseObj(where.get("where"));

        return null;
    }

}
