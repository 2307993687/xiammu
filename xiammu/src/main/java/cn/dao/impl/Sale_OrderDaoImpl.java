package cn.dao.impl;

import cn.dao.Sale_OrderDao;
import cn.entity.Sale_Order;
import cn.entity.Sale_Order_Line;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Sale_OrderDaoImpl extends HibernateDaoSupport implements Sale_OrderDao {
    /**
     * 查询订单
     * @param order
     * @return
     */
    public List<Sale_Order> getOrder(Sale_Order_Line order) {
        Criteria cc = this.currentSession().createCriteria(Sale_Order.class);

        if(order !=null && order.getOrder_id()>0){
            cc.add(Restrictions.eq("id",order.getOrder_id()));
        }
        return cc.list();
    }
}
