package cn.entity;

/**
 * 产品信息表
 */
public class Sale_Product {
    private int id;//产品编号
    private String prod_Name;//产品名称
    private Float prod_Price;//产品单价

    public Sale_Product() {
        super();
    }

    public Sale_Product(int id, String prod_Name) {
        this.id = id;
        this.prod_Name = prod_Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProd_Name() {
        return prod_Name;
    }

    public void setProd_Name(String prod_Name) {
        this.prod_Name = prod_Name;
    }

    public Float getProd_Price() {
        return prod_Price;
    }

    public void setProd_Price(Float prod_Price) {
        this.prod_Price = prod_Price;
    }
}
