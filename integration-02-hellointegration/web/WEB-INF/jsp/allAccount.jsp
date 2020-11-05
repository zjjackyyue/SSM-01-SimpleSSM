<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
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
            <div class="page-header">
                <h1>
                    <small>数据列表——显示所有账户</small>
                </h1>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4 column">
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/account/toAddPaper">新增账户</a>
            </div>
        </div>
    </div>
    <%--查询账户--%>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thread>
                    <tr>
                        <th>id</th>
                        <th>name</th>
                        <th>money</th>
                        <th>操作</th>
                    </tr>
                </thread>

                <tbody>
                    <c:forEach var="account" items="${allAccount}">
                        <tr>
                            <td>${account.id}</td>
                            <td>${account.name}</td>
                            <td>${account.money}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/account/toUpdatePaper?id=${account.id}&name=${account.name}&money=${account.money}">修改</a>&nbsp; | &nbsp;
                                <a href="${pageContext.request.contextPath}/account/deleteAccountById?id=${account.id}">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

</body>
</html>