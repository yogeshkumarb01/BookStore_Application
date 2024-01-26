package app.bookstore.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.bookstore.model.Model;
import app.bookstore.view.Book;

public class Home extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		int bookid = Integer.parseInt(req.getParameter("bookid"));

		String bookname = req.getParameter("bookname");

		int bookedition = Integer.parseInt(req.getParameter("bookedition"));
		int bookprice = Integer.parseInt(req.getParameter("bookprice"));
		Book b = new Book();
		b.setBookid(bookid);
		b.setBookname(bookname);
		b.setBookedition(bookedition);
		b.setBookprice(bookprice);

		Model m = new Model();
		boolean bool = m.insertHome(b);
		if (bool == true) {
			res.sendRedirect("/BookManagmentSystem/HomeSuccess.jsp");
		} else {
			res.sendRedirect("/BookManagmentSystem/HomeFailure.jsp");
		}

	}
}
