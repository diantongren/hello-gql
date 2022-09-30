package com.diantongren.model;

import javax.annotation.Generated;

public class LabelEntity {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.218+08:00", comments="Source field: t_label.id")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.22+08:00", comments="Source field: t_label.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.22+08:00", comments="Source field: t_label.id")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.22+08:00", comments="Source field: t_label.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.22+08:00", comments="Source field: t_label.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.22+08:00", comments="Source field: t_label.name")
    public void setName(String name) {
        this.name = name;
    }
}