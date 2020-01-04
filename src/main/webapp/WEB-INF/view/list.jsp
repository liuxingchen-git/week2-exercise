<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<!-- 引入 css -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}resource/css/index3.css">
<!-- 引入js -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/jquery-3.2.1.js"></script>
</head>
<body>
	<div>
		<form action="list" method="post" id="form1">
			价格:<input type="text" name="startPrice" value="${goodsVo.startPrice}">--
			<input type="text" name="endPrice" value="${goodsVo.endPrice}">
			百分比:<input type="text" name="startSales"
				value="${goodsVo.startSales}">-- <input type="text"
				name="endSales" value="${goodsVo.endSales}"> 排序:<select
				name="orderColum">
				<option value="price" ${goodsVo.orderColum=="price"?"selected":""}>价格</option>
				<option value="sales" ${goodsVo.orderColum=="sales"?"selected":""}>
					百分比</option>
			</select> <select name="orderMethod">
				<option value="desc" ${goodsVo.orderMethod=="desc"?"selected":""}>降序</option>
				<option value="asc" ${goodsVo.orderMethod=="asc"?"selected":""}>升序</option>
			</select>
			<button type="submit">查询</button>
		</form>
	</div>
	<table class="table">
		<tr>
			<td>商品编号</td>
			<td>商品名称</td>
			<td>商品价格</td>
			<td>销售比</td>
		</tr>
		<c:forEach items="${info.list}" var="g">
			<tr>
				<td>${g.id}</td>
				<td>${g.name}</td>
				<td>￥${g.price}</td>
				<td>${g.sales}%</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="10">
				当前是${info.pageNum}/${info.pages}页——共${info.total}条数据 <a
				href="list?pageNum=1&startPrice=${goodsVo.startPrice}&endPrice=${goodsVo.endPrice}&startSales=${goodsVo.startSales}&endSales=${goodsVo.endSales}&orderColum=${goodsVo.orderColum}">
					<button>首页</button>
			</a> <a
				href="list?pageNum=${info.prePage==0?1:info.prePage}&startPrice=${goodsVo.startPrice}&endPrice=${goodsVo.endPrice}&startSales=${goodsVo.startSales}&endSales=${goodsVo.endSales}&orderColum=${goodsVo.orderColum}">
					<button>上一页</button>
			</a> <a
				href="list?pageNum=${info.nextPage==0?info.pages:info.nextPage}&startPrice=${goodsVo.startPrice}&endPrice=${goodsVo.endPrice}&startSales=${goodsVo.startSales}&endSales=${goodsVo.endSales}&orderColum=${goodsVo.orderColum}">
					<button>下一页</button>
			</a> <a
				href="list?pageNum=${info.pages}&startPrice=${goodsVo.startPrice}&endPrice=${goodsVo.endPrice}&startSales=${goodsVo.startSales}&endSales=${goodsVo.endSales}&orderColum=${goodsVo.orderColum}">
					<button>尾页</button>
			</a><!-- &orderMethod=${goodsVo.orderMethod} -->
			</td>
		</tr>
	</table>
</body>
</html>