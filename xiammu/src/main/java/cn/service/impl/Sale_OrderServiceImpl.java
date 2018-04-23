package cn.service.impl;

import cn.dao.Sale_OrderDao;
import cn.dao.Sale_Order_LineDao;
import cn.dao.Sale_ProductDao;
import cn.entity.Sale_Order;
import cn.entity.Sale_Order_Line;
import cn.entity.Sale_Product;
import cn.service.Sale_OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class Sale_OrderServiceImpl implements Sale_OrderService {
    @Resource
    private Sale_OrderDao orDao;
    @Resource
    private Sale_ProductDao prDao;
    @Resource
    private Sale_Order_LineDao lineDao;
    /**
     * 查询订单
     * @param order
     * @return
     */
    public List<Sale_Order> getOrder(Sale_Order_Line order) {
   /*     List<Sale_Order> li=orDao.getOrder(order);
        for (Sale_Order item:li) {
            System.out.println("@@@@@@@@@@"+item.getLine());
        }*/
        return orDao.getOrder(order);
    }

    /**
     * 查询所有产品信息
     * @param sale_Product
     * @return
     */
    public List<Sale_Product> getProduct(Sale_Product sale_Product){
        return prDao.selectProduct(sale_Product);
    }
    /**
     * 添加订单详情
     * @param line
     * @return
     */
    public boolean addLine(Sale_Order_Line line){
        try {
            lineDao.insert(line);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /**
     * 删除订单详情
     * @param sale_Order_Line
     */
    public boolean removeLine(Sale_Order_Line sale_Order_Line){
        try {
            lineDao.delecte(sale_Order_Line);
            return true;
        }catch (Exception e) {
            return false;
        }
    }
}
