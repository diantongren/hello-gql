package com.diantongren.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class LabelEntityDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.222+08:00", comments="Source Table: t_label")
    public static final LabelEntity labelEntity = new LabelEntity();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.222+08:00", comments="Source field: t_label.id")
    public static final SqlColumn<Long> id = labelEntity.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.222+08:00", comments="Source field: t_label.name")
    public static final SqlColumn<String> name = labelEntity.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.222+08:00", comments="Source Table: t_label")
    public static final class LabelEntity extends AliasableSqlTable<LabelEntity> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public LabelEntity() {
            super("t_label", LabelEntity::new);
        }
    }
}