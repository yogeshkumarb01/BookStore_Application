<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Store</title>
<link rel="stylesheet" href="css/bootstrap.css">
</head>
<body class="container-fluid card" style="width:60rem; 
margin-top:60px;">
<h1 class="bg-danger text-white text-center">Welcome</h1>
<form class = "table-active was-validated" 
action="Ebookname" method="post">
<table class="table table-hover">

<tr>
<td>Book ID</td>
<td><input type="text" name="bookid"></td>
<td><a href="show_book.jsp">show</a></td>
</tr>
<tr>
<tr>
<td>Book Name</td>
<td><input type="text" name="bookname"></td>
</tr>
<tr>


</table>
<table>
<tr>
<td ><input type="submit" value="SAVE" 
style="background-color:aqua;
border:aqua; margin-left:150px;
margin-bottom:25px;"></td>
<td><input  type="reset" value="CLEAR" 
style="background-color:aqua;
border:aqua; margin-left:300px;
 margin-bottom:25px;"></td>
 </tr>
</table>


<a href="home.jsp">Back</a>

</form>
</body>
</html>