<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>显示详细订单</title>
</head>
<body>
<h1>显示详细订单</h1>
<table border="1">
    <tr>
        <td>订单编号</td><td>${order.id}</td>
        <td>客户名称</td> <td>${order.customer_Name}</td>
    </tr>
    <tr>
        <td>下单日期</td><td>${order.order_Date}</td>
        <td>送货日期</td> <td>${order.deliver_Date}</td>
    </tr>
    <tr>
        <td>送货地址</td><td colspan="3">${order.deliver_Addr}</td>
    </tr>

        <table width="80%" border="1">
            <tr>
                <td>产品名称</td>
                <td>单价</td>
                <td>数量</td>
                <td>总价</td>
                <td>操作</td>
            </tr>
            <s:form action="" method="POST">
                <s:iterator value="order.line">
                    <tr>
                        <td>${product_Name}</td>
                        <td>${product_Price}</td>
                        <td>${product_Count}</td>
                        <td>${product_Price*product_Count}</td>
                        <td>
                            <a href="removeLineUser.action?itemId=${order.id}&byId=${id}">删除</a>
                        </td>
                    </tr>
                </s:iterator>
            </s:form>
            <s:form action="getOrderUser.action" method="POST">
                <tr>
                   <td><s:select list="productsList" listKey="id" onchange="setoo()"
                                 listValue="prod_Name" value="0"
                                 headerKey="1" headerValue="请选择..."
                                 name="sale_Product.id"/></td>
                    <td>
                        <input type="hidden" name="line.order_id" value="${order.id}">
                        <input type="hidden" name="line.product_Name">
                        <s:textfield name="line.product_Price"/></td>
                    <td><s:textfield name="line.product_Count" onblur="summoney()"/></td>
                    <td><s:textfield name="sum_Money"/></td>
                    <td>
                        <s:submit value="保存订单行"/>
                    </td>
                </tr>
            </s:form>
            <tr>
                <td colspan="5" style="text-align: center;"><button onclick="location.href='showUser.action'">返回</button></td>
            </tr>
        </table>
</table>
</body>
<script type="text/javascript" src="js/jquery-1.12.3.min.js"></script>
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="js/getOrder.js"></script>
</html>