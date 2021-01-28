<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Please select hour for reservation</h2>
1. 6pm - 7pm <br>
2. 7pm - 8pm <br>
3. 8pm - 9pm <br>
4. Exit
<form action="reserve">
Reserved hour:<input type="text" name="hourReserved"><br>
Number of ppl: <input type="text" name="numberOfPeople"><br>
<input type="submit">
</form>
<br>
<a href="home"><input type="submit" value="back"></a>
</body>
</html>