package cn.dao;

import cn.entity.Sale_Product;

import java.util.List;

/**
 * 产品信息
 */
public interface Sale_ProductDao {
    /**
     * 查询所有产品信息
     * @param sale_Product
     * @return
     */
    List<Sale_Product> selectProduct(Sale_Product sale_Product);
}
