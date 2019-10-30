package com.lyw.nall.dao;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: liyouwei
 * @Date: 2019/10/30 10:45
 * @description:
 */

////标示映射到Elasticsearch文档上的领域对象
//indexName 索引库名次，mysql中数据库的概
    //type 文档类型， mysql中表的概念
    //shards 默认分片数
    //replicas 默认副本数量
@Document(indexName = "pms", type = "product",shards = 1,replicas = 0)
@Data
public class EsProduct implements Serializable {

    private static final long serialVersionUID = -1L;

    ////表示是文档的id，文档可以认为是mysql中表行的概念
    @Id
    private Long id;
    // Keyword//不会进行分词建立索引的类型
    @Field(type = FieldType.Keyword)
    private String productSn;
    private Long brandId;
    @Field(type = FieldType.Keyword)
    private String brandName;
    private Long productCategoryId;
    @Field(type = FieldType.Keyword)
    private String productCategoryName;
    private String pic;
    //Text,//会进行分词并建了索引的字符类型
    // analyzer//分词器名次
    @Field(analyzer = "ik_max_word",type = FieldType.Text)
    private String name;
    @Field(analyzer = "ik_max_word",type = FieldType.Text)
    private String subTitle;
    @Field(analyzer = "ik_max_word",type = FieldType.Text)
    private String keywords;
    private BigDecimal price;
    private Integer sale;
    private Integer newStatus;
    private Integer recommandStatus;
    private Integer stock;
    private Integer promotionType;
    private Integer sort;
    // Nested,//嵌套对象类型
    @Field(type =FieldType.Nested)
    private List<EsProductAttributeValue> attrValueList;




}
