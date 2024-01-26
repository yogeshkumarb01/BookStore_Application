package app.bookstore.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.bookstore.model.Model;
import app.bookstore.view.Book;

public class Sbook extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int bid = Integer.parseInt(request.getParameter("bookid"));

		Book b = new Book();
		b.setBookid(bid);

		Model m = new Model();
		boolean success = m.ShowData(b);
		if (success) {
			// Assuming you want to send this data back to a JSP page for display
			request.setAttribute("res", b);
			request.getRequestDispatcher("ShowAll.jsp").forward(request, response);
		} else {
			response.sendRedirect("HomeFailure.jsp"); // Redirect to a page for handling not found
		}
	}
}