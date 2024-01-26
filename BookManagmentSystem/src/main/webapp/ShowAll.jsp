<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Displayed</title>
</head>
<body>
<script> 
alert("continue");
</script>
    <h1>the detail data</h1>
    <h1>Book Details</h1>
    <p>Book id: ${res.bookid}</p>
    <p>Book name: ${res.bookname}</p>
    <p>Book price: ${res.bookprice}</p>
    <p>Edition: ${res.bookedition}</p>
    
    
    <a href = "delete_bookid.jsp">remove for more data</a>
    <a href = "home.jsp">Home</a>
</body>
</html>