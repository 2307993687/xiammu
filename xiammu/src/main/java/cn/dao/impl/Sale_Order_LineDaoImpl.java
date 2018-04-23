package cn.dao.impl;

import cn.dao.Sale_Order_LineDao;
import cn.entity.Sale_Order_Line;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
/**
 * 订单详情
 */
@Repository
public class Sale_Order_LineDaoImpl extends HibernateDaoSupport implements Sale_Order_LineDao {
    /**
     * 添加订单详情
     * @param sale_Order_Line
     * @return
     */
    public Serializable insert(Sale_Order_Line sale_Order_Line) {
        return this.currentSession().save(sale_Order_Line);
    }
    /**
     * 删除订单详情
     * @param sale_Order_Line
     */
    public void delecte(Sale_Order_Line sale_Order_Line){
        this.currentSession().delete(sale_Order_Line);
    }
}
