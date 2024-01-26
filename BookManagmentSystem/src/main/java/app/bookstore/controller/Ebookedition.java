package app.bookstore.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.bookstore.model.Model;
import app.bookstore.view.Book;

public class Ebookedition extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int bid = Integer.parseInt(request.getParameter("bookid"));
		int bedition = Integer.parseInt(request.getParameter("bookedition"));

		Book b = new Book();
		b.setBookid(bid);
		b.setBookedition(bedition);

		Model m = new Model();
		boolean success = m.EBookEdition(b);
		if (success) {
			response.sendRedirect("ESuccess.jsp");
		} else {
			response.sendRedirect("EFailed.jsp");
		}

	}

}
