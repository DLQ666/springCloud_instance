package com.dlqcloud.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @description: 库存服务dao层接口
 * @author: Hasee
 * @create: 2020-07-18 21:26
 */
@Mapper
public interface StorageDao {

    /**
     * 扣减库存
     */
    void decrease(@Param("productId") Long productId,@Param("count") Integer count);
}
