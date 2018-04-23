<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>显示所有订单</title>
</head>
<body>
<h1>显示所有订单</h1>
<table border="1">
    <tr>
        <td>订单编号</td>
        <td>客户编号</td>
        <td>客户名称</td>
        <td>送货地址</td>
        <td>下单日期</td>
        <td>送货日期</td>
        <td>订单状态</td>
        <td>操作</td>
    </tr>
    <s:iterator value="ordList">
        <tr>
            <td>${id}</td>
            <td>${customer_ID}</td>
            <td>${customer_Name}</td>
            <td>${deliver_Addr}</td>
            <td>${order_Date}</td>
            <td>${deliver_Date}</td>
            <td>${status}</td>
            <td><a href="getOrderUser.action?itemId=${id}">查看</a></td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
