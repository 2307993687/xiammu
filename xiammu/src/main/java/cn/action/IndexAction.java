package cn.action;

import cn.entity.Sale_Order;
import cn.entity.Sale_Order_Line;
import cn.entity.Sale_Product;
import cn.service.Sale_OrderService;
import cn.util.Comm;
import com.alibaba.fastjson.JSON;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.stereotype.Controller;
import org.apache.struts2.ServletActionContext;


import javax.annotation.Resource;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
public class IndexAction extends ActionSupport {
    @Resource
    private Sale_OrderService ord;

    private List<Sale_Order> ordList;
    private int itemId;
    private Sale_Order order;
    private Sale_Order_Line line;
    private List<Sale_Product> productsList;
    public static int i;//用来存放订单id
    private int byId;//用来存放删除id
    /**
     * 进入首页
     * @return
     */
    public String showIndex(){
        ordList=ord.getOrder(null);
        return SUCCESS;
    }

    /**
     * 进入订单详情页面
     * @return
     */
    public String getOrderIndex(){
        if(itemId>0){
            Sale_Order_Line oo=new Sale_Order_Line(itemId);
            order=ord.getOrder(oo).get(0);
            if(null==Comm.productList){
                Comm.productList=ord.getProduct(null);//查询所有产评信息
            }
            productsList=Comm.productList;
            return "getOrder";
        }
        if(null !=line && line.getOrder_id()>0){//添加订单明细信息
            if(ord.addLine(line)){
                i=line.getOrder_id();
                Sale_Order_Line oo=new Sale_Order_Line(i);
                order=ord.getOrder(oo).get(0);
                return "public";
            }
        }
        return "input";
    }

    /**
     * 删除订单明细信息
     * @return
     */
    public String removeLineIndex(){
        if(byId>0){
            Sale_Order_Line oo=new Sale_Order_Line();
            oo.setId(byId);
            if(ord.removeLine(oo)){
                i=itemId;
                ordList=ord.getOrder(null);
                return "public";
            }
        }
        return "input";
    }
    /**
     * ajax请求响应产品信息
     */
    public void getAJaxIndex(){
        Sale_Product sp=null;
        for (Sale_Product item:Comm.productList) {
            if(item.getId() ==itemId){
                 sp=item;
                 break;
            }
        }
        try {
            String str= JSON.toJSONString(sp);
            PrintWriter out = ServletActionContext.getResponse().getWriter();
            out.print(str);
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 公共    刷新getOrder.jsp页面
     * @return
     */
    public String publicIndex(){
        Sale_Order_Line oo=new Sale_Order_Line(i);
        order=ord.getOrder(oo).get(0);
        productsList=ord.getProduct(null);//查询所有产评信息
        return "getOrder";
    }


    public Sale_OrderService getOrd() {
        return ord;
    }

    public void setOrd(Sale_OrderService ord) {
        this.ord = ord;
    }

    public List<Sale_Order> getOrdList() {
        return ordList;
    }

    public void setOrdList(List<Sale_Order> ordList) {
        this.ordList = ordList;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public Sale_Order getOrder() {
        return order;
    }

    public void setOrder(Sale_Order order) {
        this.order = order;
    }

    public Sale_Order_Line getLine() {
        return line;
    }

    public void setLine(Sale_Order_Line line) {
        this.line = line;
    }

    public List<Sale_Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Sale_Product> productsList) {
        this.productsList = productsList;
    }

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        IndexAction.i = i;
    }

    public int getById() {
        return byId;
    }

    public void setById(int byId) {
        this.byId = byId;
    }
}
