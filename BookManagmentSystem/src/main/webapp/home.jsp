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
<h1 class="bg-danger text-white text-center">Book Registration</h1>
<form class = "table-active was-validated" 
action="Home" method="post">
<table class="table table-hover">

<tr>
<td>Book ID</td>
<td><input type="text" name="bookid"></td>
<td><a href="show_book.jsp">show</a></td>
<td><a href="delete_bookid.jsp">Delete</a></td>
</tr>
<tr>
<td>Book Name</td>
<td><input type="text" name="bookname"></td>
<td><a href="edit_bookname.jsp">edit</a></td>
<td><a href="delete_bookname.jsp">Show</a></td>
</tr>

<tr>
<td>Book Price</td>
<td><input type="text" name="bookprice"></td>
<td><a href="edit_bookprice.jsp">edit</a></td>
<td><a href="Show_bookprice.jsp">Show</a></td>
</tr>

<tr>
<td>Book Edition</td>
<td><input type="text" name="bookedition"></td>
<td><a href="edit_bookedition.jsp">edit</a></td>
<td><a href="Show_bookEdition.jsp">Show</a></td>
</tr>


</table>
<table>
<tr>
<td ><input type="submit" value="register" 
style="background-color:aqua;
border:aqua; margin-left:150px;
margin-bottom:25px;"></td>
<td><input  type="reset" value="cancel" 
style="background-color:aqua;
border:aqua; margin-left:300px;
 margin-bottom:25px;"></td>
 </tr>
</table>

<a href="login.jsp">Back</a>


</form>
</body>
</html>