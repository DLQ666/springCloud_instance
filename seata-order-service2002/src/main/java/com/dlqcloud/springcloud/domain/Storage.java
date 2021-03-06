package com.dlqcloud.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: cloud01
 * @description: 库存实体类
 * @author: Hasee
 * @create: 2020-07-18 21:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;


    /**
     * 已用库存
     */
    private Integer used;


    /**
     * 剩余库存
     */
    private Integer residue;

}
