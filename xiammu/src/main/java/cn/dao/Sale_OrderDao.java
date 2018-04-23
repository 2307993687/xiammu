package cn.dao;

import cn.entity.Sale_Order;
import cn.entity.Sale_Order_Line;

import java.util.List;

/**
 * 订单信息表
 */
public interface Sale_OrderDao {
    /**
     * 查询订单
     * @param order
     * @return
     */
    List<Sale_Order> getOrder(Sale_Order_Line order);
}
