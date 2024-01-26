package app.bookstore.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.bookstore.model.Model;
import app.bookstore.view.Book;

public class Dbook extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int bid = Integer.parseInt(request.getParameter("bookid"));
		// VIEW GETTERS AND SETTERS
		Book b = new Book();
		b.setBookid(bid);
		// Model DATABASE INTERACTION
		Model m = new Model();
		boolean success = m.DeleteData(b);
		if (success) {
			response.sendRedirect("HomeSuccess.jsp");
		} else {
			response.sendRedirect("DBookFailure.jsp");
		}
	}

}
