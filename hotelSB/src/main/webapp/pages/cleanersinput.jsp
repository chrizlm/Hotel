<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>input cleaners details</h2>
<form action="addCleaner">
ID: <input type="text" name="CleanersID"><br>
Name: <input type="text" name="name"><br>
Section: <input type="text" name="section"><br>
Gender: <input type="text" name="gender"><br>
Age: <input type="text" name="age"><br>
WorkinHRS:<input type="text" name="workinghours"><br>
sectionAssigned:<input type="text" name="sectionAssigned"><br>
<input type="submit">
</form>

<h2>get list of cleaners</h2>
<form action="getCleaners">
<input type="submit">
</form>

<h2>get specific cleaner</h2>
<form action="getCleaner">
ID: <input type="text" name="CleanersID"><br>
<input type="submit">
</form>

<h2>delete cleaner</h2>
<form action="deleteCleaner">
ID: <input type="text" name="CleanersID"><br>
<input type="submit">
</form>

<br>
<a href="staff"><input type="submit" value="back"></a>
</body>
</html>