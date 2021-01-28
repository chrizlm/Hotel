<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>input chef details</h2>
<form action="addChef">
ID: <input type="text" name="ChefID"><br>
Name: <input type="text" name="name"><br>
Section: <input type="text" name="section"><br>
Gender: <input type="text" name="gender"><br>
Age: <input type="text" name="age"><br>
WorkinHRS:<input type="text" name="workingHours"><br>
YrsExepnce:<input type="text" name="yearsOfExperience"><br>
<input type="submit">
</form>
<h2>get the list of chef</h2>
<form action="getChefs">
<input type="submit">
</form>
<h2>find a specific chef</h2>
<form action="getChef">
<input type="text" name="ChefID"><br>
<input type="submit">
</form>
<h2>delete chef</h2>
<form action="deleteChef">
<input type="text" name="ChefID"><br>
<input type="submit">
</form>
<br>
<a href="staff"><input type="submit" value="back"></a>

</body>
</html>