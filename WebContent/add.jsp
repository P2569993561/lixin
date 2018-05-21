<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改商品信息</title>

</head>
<body> 
	<!-- 上传图片是需要指定属性 enctype="multipart/form-data" -->
	<form id="productForm" action="${pageContext.request.contextPath }/Product/addProduct" 
	method="post" enctype="multipart/form-data">
<%-- 	<form id="itemForm"	action="${pageContext.request.contextPath }/items/updateitem.action" method="post"> --%>
	<%--	<input type="hidden" name="id" value="${item.id }" />--%> 增加商品信息：
		<table width="100%" border=1>
			<tr>
				<td>商品名称</td>
				<td><input type="text" name="name" value="${product.name }" /></td>
			</tr>
			<tr>
				<td>商品价格</td>
				<td><input type="text" name="price" value="${product.price }" /></td>
			</tr>
			<tr>
				<td>库存数量</td>
				<td><input type="text" name="number" value="${product.number }" /></td>
			</tr>
			<tr>
				<td>1级分类</td>
				<td><input type="text" name="oneMenu" value="${product.oneMenu }" /></td>
			</tr>
			<tr>
				<td>2级分类</td>
				<td><input type="text" name="twoMenu" value="${product.twoMenu }" /></td>
			</tr>

<%--	private Long id;  //商品主键id

    private String name;   //商品名

    private String sellPoint;  //卖点或介绍

    private Long price;  //价格  单位为分

    private Integer number;  //库存数量

    private Byte oneMenu;   //1级分类

    private Byte twoMenu;   //2级分类

    private String image;  //图片地址

    private Long cid;   //商品详情表id

    private Byte status;  //状态 0：下架  1：上架--%>
			
			<tr>
				<td>商品图片</td>
				<td>
					<c:if test="${product.image !=null}">
						<img src="/pic/${product.image}" width=100 height=100/>
						<br/>
					</c:if>
					<input type="file"  name="imageFile"/> 
				</td>
			</tr>
			 
			<tr>
				<td>商品简介</td>
				<td><textarea rows="3" cols="30" name="sellPoint">${product.sellPoint }</textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="提交" />
				</td>
			</tr>
		</table>

	</form>
</body>

</html>