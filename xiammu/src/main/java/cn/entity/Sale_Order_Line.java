package cn.entity;

/**
 * 订单明细信息表
 */
public class Sale_Order_Line {
    public Sale_Order_Line() {
        super();
    }

    public Sale_Order_Line(int order_id) {
        this.order_id = order_id;
    }

    private int id;//定单明细编号
    private int order_id;//所属的订单编号
    private String product_Name;//产品名称
    private Float product_Price;//产品单价
    private int product_Count;//产品数量

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getProduct_Name() {
        return product_Name;
    }

    public void setProduct_Name(String product_Name) {
        this.product_Name = product_Name;
    }

    public Float getProduct_Price() {
        return product_Price;
    }

    public void setProduct_Price(Float product_Price) {
        this.product_Price = product_Price;
    }

    public int getProduct_Count() {
        return product_Count;
    }

    public void setProduct_Count(int product_Count) {
        this.product_Count = product_Count;
    }

    @Override
    public String toString() {
        return "Sale_Order_Line{" +
                "id=" + id +
                ", order_id=" + order_id +
                ", product_Name='" + product_Name + '\'' +
                ", product_Price=" + product_Price +
                ", product_Count=" + product_Count +
                '}';
    }
}
