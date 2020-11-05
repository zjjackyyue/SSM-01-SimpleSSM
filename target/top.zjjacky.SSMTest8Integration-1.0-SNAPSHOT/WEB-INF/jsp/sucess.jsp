<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/4
  Time: 3:10
  To change this template use File | Settings | File Templates.
--%>
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
        <div class="col-md-12 column"></div>
            <div class="page-header">
                <h1>
                    <small>数据列表——显示所有书籍</small>
                </h1>
            </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thread>
                    <tr>
                        <th>id</th>
                        <th>name</th>
                        <th>money</th>
                    </tr>
                </thread>

                <tbody>
                    <c:forEach var="account" items="${allAccount}">
                        <tr>
                            <td>${account.id}</td>
                            <td>${account.name}</td>
                            <td>${account.money}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

</body>
</html>