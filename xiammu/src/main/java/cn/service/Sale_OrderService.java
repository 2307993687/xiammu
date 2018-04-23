package cn.service;

import cn.entity.Sale_Order;
import cn.entity.Sale_Order_Line;
import cn.entity.Sale_Product;

import java.util.List;

public interface Sale_OrderService {
    /**
     * 查询订单
     * @param order
     * @return
     */
    public List<Sale_Order> getOrder(Sale_Order_Line order);
    /**
     * 查询所有产品信息
     * @param sale_Product
     * @return
     */
    public List<Sale_Product> getProduct(Sale_Product sale_Product);
    /**
     * 添加订单详情
     * @param line
     * @return
     */
    public boolean addLine(Sale_Order_Line line);

    /**
     * 删除订单详情
     * @param sale_Order_Line
     */
    public boolean removeLine(Sale_Order_Line sale_Order_Line);
}
