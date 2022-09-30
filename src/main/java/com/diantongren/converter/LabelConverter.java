package com.diantongren.converter;

import com.diantongren.model.Label;
import com.diantongren.model.LabelEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LabelConverter {
    Label to(LabelEntity labelEntity);

    LabelEntity from(Label label);
}
