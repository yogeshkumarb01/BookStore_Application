package app.bookstore.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.bookstore.model.Model;
import app.bookstore.view.Book;

public class Dbookedition extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int bid = Integer.parseInt(request.getParameter("bookid"));

		Book b = new Book();
		b.setBookid(bid);

		Model m = new Model();
		boolean success = m.SBookEdition(b);
		if (success) {
			request.setAttribute("res", b);
			request.getRequestDispatcher("ShowEditionSuccess.jsp").forward(request, response);
		} else {
			response.sendRedirect("DbookFailure.jsp");
		}

	}

}
