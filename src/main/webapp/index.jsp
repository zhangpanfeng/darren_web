<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
    <form action="goRegister.do" method="post">
        <input type="submit" value="注册">
    </form>

    <form action="login.do" method="post">
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
                <td><input type="reset" value="重置" /></td>
                <td><input type="submit" name="登陆" /></td>
            </tr>
        </table>
    </form>
</body>
</html>
