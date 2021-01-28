<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>input waiter details</h2>
<form action="addWaiter">
ID: <input type="text" name="WaiterID"><br>
Name: <input type="text" name="name"><br>
Section: <input type="text" name="section"><br>
Gender: <input type="text" name="gender"><br>
Age: <input type="text" name="age"><br>
WorkinHRS:<input type="text" name="workingHours"><br>
tableAssigned:<input type="text" name="tableAssigned"><br>
<input type="submit">
</form>

<h2>get all waiters</h2>
<form action="getWaiters">
<input type="submit">
</form>

<h2>get specific waiter</h2>
<form action="getWaiter">
ID: <input type="text" name="WaiterID"><br>
<input type="submit">
</form>

<h2>delete waiter</h2>
<form action="deleteWaiter">
ID: <input type="text" name="WaiterID"><br>
<input type="submit">
</form>

<br>
<a href="staff"><input type="submit" value="back"></a>
</body>
</html>