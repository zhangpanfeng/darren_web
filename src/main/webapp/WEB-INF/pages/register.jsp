<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

    <form action="register.do" method="post">
        <table>
            <tr>
                <td><label>用户名：</label></td>
                <td><input type="text" name="userName" /></td>
            </tr>
            <tr>
                <td><label>密码：</label></td>
                <td><input type="password" name="password" /></td>
            </tr>
            <tr>
                <td><label>确认密码：</label></td>
                <td><input type="password" name="confirmPassword" /></td>
            </tr>
            <tr>
                <td><input type="reset" value="重置" /></td>
                <td><input type="submit" name="提交" /></td>
            </tr>
        </table>
    </form>
</body>
</html>