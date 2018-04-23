package cn.entity;

/**
 * 客户信息表
 */
public class Cus_Customer {
   private int cus_ID;//客户编号
   private String cus_Name;//客户名称
   private String cus_Addr;//送货地址

    public int getCus_ID() {
        return cus_ID;
    }

    public void setCus_ID(int cus_ID) {
        this.cus_ID = cus_ID;
    }

    public String getCus_Name() {
        return cus_Name;
    }

    public void setCus_Name(String cus_Name) {
        this.cus_Name = cus_Name;
    }

    public String getCus_Addr() {
        return cus_Addr;
    }

    public void setCus_Addr(String cus_Addr) {
        this.cus_Addr = cus_Addr;
    }
}
