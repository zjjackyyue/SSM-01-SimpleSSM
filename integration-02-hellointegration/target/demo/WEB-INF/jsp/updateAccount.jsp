<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改账户</title>
    <!--使用Bootstrap的css-->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
    <!--使用Bootstrap的js插件，必须先调入jQuery-->
    <script src="http://libs.baidu.com/jquery/1.9.0/jquery.min.js"></script>
    <!-- 包括所有bootstrap的js插件或者可以根据需要使用的js插件调用　-->
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="pagezai-header">
                <h1>
                    <small>修改账户</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/account/updateAccount" method="POST">
        <div class="form-group">
            <label for="id">账户ID</label>
            <input type="text" class="form-control" id="id" name="id" value="${id}">
        </div>
        <div class="form-group">
            <label for="name">账户名称</label>
            <input type="text" class="form-control" id="name" name="name" value="${name}">
        </div>
        <div class="form-group">
            <label for="money">账户余额</label>
            <input type="text" class="form-control" id="money" name="money" value="${money}">
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="添加">
        </div>
    </form>
</div>
</body>
</html>
