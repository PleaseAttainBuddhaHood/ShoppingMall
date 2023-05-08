<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="join_ok">
	아이디: <input type="text" name="id"><br>
	비밀번호: <input type="password" name="pw"><br>
	이름: <input type="text" name="name"><br>
	폰번호: <input type="text" name="phone"><br>
	주소: <input type="text" name="address"><br>
	성별: <input type="radio" name="gender" value="male">남성 <input type="radio" name="gender" value="female">여성<br>
	이메일: <input type="text" name="email"><br>
	<input type="submit" value="전송">
</form>
</body>
</html>