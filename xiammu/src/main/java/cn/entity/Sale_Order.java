package cn.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 订单信息表
 */
public class Sale_Order {
    public Sale_Order() {
        super();
    }

    public Sale_Order(int id) {
        this.id = id;
    }

    private int id;//订单编号
    private int customer_ID;//客户编号
    private String customer_Name;//客户名称
    private String deliver_Addr;//送货地址
    private Date order_Date;//下单日期
    private Date deliver_Date;//送货日期
    private String status;//订单状态

    private Set<Sale_Order_Line> line=new HashSet<Sale_Order_Line>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomer_ID() {
        return customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        this.customer_ID = customer_ID;
    }

    public String getCustomer_Name() {
        return customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        this.customer_Name = customer_Name;
    }

    public String getDeliver_Addr() {
        return deliver_Addr;
    }

    public void setDeliver_Addr(String deliver_Addr) {
        this.deliver_Addr = deliver_Addr;
    }

    public Date getOrder_Date() {
        return order_Date;
    }

    public void setOrder_Date(Date order_Date) {
        this.order_Date = order_Date;
    }

    public Date getDeliver_Date() {
        return deliver_Date;
    }

    public void setDeliver_Date(Date deliver_Date) {
        this.deliver_Date = deliver_Date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<Sale_Order_Line> getLine() {
        return line;
    }

    public void setLine(Set<Sale_Order_Line> line) {
        this.line = line;
    }
}
