package cn.dao;

import cn.entity.Sale_Order_Line;

import java.io.Serializable;

/**
 * 订单详情
 */
public interface Sale_Order_LineDao {
    /**
     * 添加订单详情
     * @param sale_Order_Line
     * @return
     */
    public Serializable insert(Sale_Order_Line sale_Order_Line );

    /**
     * 删除订单详情
     * @param sale_Order_Line
     */
    public void delecte(Sale_Order_Line sale_Order_Line);
}
