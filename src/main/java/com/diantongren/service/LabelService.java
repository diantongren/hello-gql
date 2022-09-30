package com.diantongren.service;

import com.diantongren.model.Label;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface LabelService {

    List<Label> findLabels(Integer limit, Integer offset, String name);

    Optional<Label> findById(Long id);

    List<Label> t_label(Integer limit, Integer offset, Map<String, Object> where);
}
