<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajax初体验</title>

    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.5.1.min.js"></script>

    <script>
        function a() {
            $.post({
                url:"${pageContext.request.contextPath}/a2",
                data:{"name":$("#username").val()},
                success:function (data,status) {
                    console.log(data);
                    console.log(status);
                }
            })
        }
    </script>
</head>
<body>

<%--失去焦点的时候，发起一个请求到后台--%>
用户名：<input type="text" id="username" onblur="a()">


</body>
</html>
