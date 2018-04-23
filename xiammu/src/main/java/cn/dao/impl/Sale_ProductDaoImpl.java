package cn.dao.impl;

import cn.dao.Sale_ProductDao;
import cn.entity.Sale_Product;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class Sale_ProductDaoImpl extends HibernateDaoSupport implements Sale_ProductDao {
    /**
     * 查询所有产品信息
     * @param sale_Product
     * @return
     */
    public List<Sale_Product> selectProduct(Sale_Product sale_Product) {
        Criteria cc = this.currentSession().createCriteria(Sale_Product.class);
        if(null !=sale_Product && sale_Product.getId()>0){
            cc.add(Restrictions.eq("id",sale_Product.getId()));
        }
        return cc.list();
    }
}
