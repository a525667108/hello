package com.lyw.nall.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: liyouwei
 * @Date: 2019/10/30 11:12
 * @description:搜索系统中的商品管理自定义Dao
 */
@Mapper
public interface EsProductDao {

    List<EsProduct> getAllEsProductList(@Param("id") Long id);



}
