/**
 * 当下拉类表的值发生改变时
 * @param oSelect
 */
function setoo(){
    var itemId= $("[name='sale_Product.id']").val();
    $.ajax({
        url:"getAJaxUser.action?itemId="+itemId,
        type:"post",
        dataType:"json",
        success:function(dd){
            // alert(data);
           /*
                只有dataType:"text",时才需要转换 "json",时不需要
                var dd = eval("("+ data +")");
                var dd=jQuery.parseJSON(data);
                上面两种都是装换json格式

                for(var i = 0; i < dd.list.length; i++){
                    console.log(dd.list[i].prod_Name);
                }只有在传过来的数据为集合或者数组时，才需要循环
            */
            // console.log(dd);
            $("[name='line.product_Name']").val(dd.prod_Name);
            $("[name='line.product_Price']").val(dd.prod_Price);
        }
    })
}

/**
 * 当输入产品数量时发生改变
 */
function summoney(){
    var money=$("[name='line.product_Price']").val();
    var num= $("[name='line.product_Count']").val();
    $("[name='sum_Money']").val(money*num);
}