package com.lyw.nall.nosql.repository;

import com.lyw.nall.dao.EsProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Author: liyouwei
 * @Date: 2019/10/30 11:03
 * @description:
 */
public interface EsProductRepository extends ElasticsearchRepository<EsProduct, Long> {


    /**
     * 搜索查询
     *
     * @param name              商品名称
     * @param subTitle          商品标题
     * @param keywords          商品关键字
     * @param page              分页信息
     * @return
     */
    Page<EsProduct> findByNameOrSubTitleOrKeywords(String name, String subTitle, String keywords, Pageable page);


}
