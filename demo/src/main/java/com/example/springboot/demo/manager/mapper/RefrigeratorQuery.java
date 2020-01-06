package com.example.springboot.demo.manager.mapper;

import com.example.springboot.demo.manager.domain.Refrigerator;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Query Mapper 是对资源的读操作，方便当数据量大了以后的读写分离优化。
 */
@Mapper
public interface RefrigeratorQuery {

    @Select("select * from t_refrigerator where state = 0 limit 1 ")
    Refrigerator findSpace();


}
