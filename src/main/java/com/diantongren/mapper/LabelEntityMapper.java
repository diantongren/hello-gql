package com.diantongren.mapper;

import static com.diantongren.mapper.LabelEntityDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.diantongren.model.LabelEntity;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonSelectMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface LabelEntityMapper extends CommonSelectMapper, CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.228+08:00", comments="Source Table: t_label")
    BasicColumn[] selectList = BasicColumn.columnList(id, name);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.222+08:00", comments="Source Table: t_label")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="row.id")
    int insert(InsertStatementProvider<LabelEntity> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.224+08:00", comments="Source Table: t_label")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultipleWithGeneratedKeys")
    @Options(useGeneratedKeys=true,keyProperty="records.id")
    int insertMultiple(@Param("insertStatement") String insertStatement, @Param("records") List<LabelEntity> records);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.225+08:00", comments="Source Table: t_label")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="LabelEntityResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR)
    })
    List<LabelEntity> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.225+08:00", comments="Source Table: t_label")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("LabelEntityResult")
    Optional<LabelEntity> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.225+08:00", comments="Source Table: t_label")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, labelEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.226+08:00", comments="Source Table: t_label")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, labelEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.226+08:00", comments="Source Table: t_label")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.226+08:00", comments="Source Table: t_label")
    default int insert(LabelEntity row) {
        return MyBatis3Utils.insert(this::insert, row, labelEntity, c ->
            c.map(name).toProperty("name")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.227+08:00", comments="Source Table: t_label")
    default int insertMultiple(Collection<LabelEntity> records) {
        return MyBatis3Utils.insertMultipleWithGeneratedKeys(this::insertMultiple, records, labelEntity, c ->
            c.map(name).toProperty("name")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.227+08:00", comments="Source Table: t_label")
    default int insertSelective(LabelEntity row) {
        return MyBatis3Utils.insert(this::insert, row, labelEntity, c ->
            c.map(name).toPropertyWhenPresent("name", row::getName)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.229+08:00", comments="Source Table: t_label")
    default Optional<LabelEntity> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, labelEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.229+08:00", comments="Source Table: t_label")
    default List<LabelEntity> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, labelEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.229+08:00", comments="Source Table: t_label")
    default List<LabelEntity> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, labelEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.229+08:00", comments="Source Table: t_label")
    default Optional<LabelEntity> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.23+08:00", comments="Source Table: t_label")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, labelEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.23+08:00", comments="Source Table: t_label")
    static UpdateDSL<UpdateModel> updateAllColumns(LabelEntity row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalTo(row::getName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.23+08:00", comments="Source Table: t_label")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(LabelEntity row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalToWhenPresent(row::getName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.23+08:00", comments="Source Table: t_label")
    default int updateByPrimaryKey(LabelEntity row) {
        return update(c ->
            c.set(name).equalTo(row::getName)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-09-30T14:45:08.231+08:00", comments="Source Table: t_label")
    default int updateByPrimaryKeySelective(LabelEntity row) {
        return update(c ->
            c.set(name).equalToWhenPresent(row::getName)
            .where(id, isEqualTo(row::getId))
        );
    }
}