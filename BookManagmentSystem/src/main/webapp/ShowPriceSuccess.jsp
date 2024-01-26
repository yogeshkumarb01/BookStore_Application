<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Displayed</title>
</head>
<body>
<script>
alert("Succesfully displayed Click ok to continue");
</script>
<h1> Here is your BookPrice</h1>
<p> Book id: ${res.bookid}</p>
<p> Book Price: ${res.bookprice}</p>

<a href = "delete_bookid.jsp">remove for more data</a>
    <a href = "home.jsp">Home</a>
</body>
</html>