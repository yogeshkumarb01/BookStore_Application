package app.bookstore.model;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import app.bookstore.view.Book;

public class Model {
	private PreparedStatement pstmt;
	private Connection conn;
	private ResultSet res;

	public Model() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/bookstore";
			String usn = "root";
			String pwd = "kbyogesh@01";
			conn = DriverManager.getConnection(url, usn, pwd);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean insertHome(Book b) {
		try {
			String sql = "insert into home values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, b.getBookid());
			pstmt.setString(2, b.getBookname());
			pstmt.setInt(3, b.getBookprice());
			pstmt.setInt(4, b.getBookedition());

			int x = pstmt.executeUpdate();
			if (x > 0) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return false;
	}

	public boolean ShowData(Book b) {
		try {
			String query = "select * from home where bookid=?";
//			USE STATEMENT (CREATE OR PREPARE STATEMENT)
			pstmt = conn.prepareStatement(query);
//			EXECUTE THE QUERY 
			pstmt.setInt(1, b.getBookid());
			res = pstmt.executeQuery();

			if (res.next()) {
				// Set the attributes of Library object with data from result set
				b.setBookid(res.getInt("bookid"));
				b.setBookname(res.getString("bookname"));
				b.setBookprice(res.getInt("bookprice"));
				b.setBookedition(res.getInt("bookedition"));
				return true;

			}
		} catch (Exception exep) {
			exep.printStackTrace();
		}

		return false;
	}

	public boolean DeleteData(Book b) {
		try {
			String query = "delete from home where bookid = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, b.getBookid());
			int x = pstmt.executeUpdate();
			if (x > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	public boolean EditData(Book b) {
		try {
			String query = "update home set bookname=? where bookid = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, b.getBookname());
			pstmt.setInt(2, b.getBookid());
			int x = pstmt.executeUpdate();
			if (x > 0) {
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	public boolean EBookPrice(Book b) {
		try {
			String query = "update home set bookprice=? where bookid=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, b.getBookprice());
			pstmt.setInt(2, b.getBookid());
			int x = pstmt.executeUpdate();
			if (x > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean DBookName(Book b) {
		try {
			String query = "select * from home where bookid=?";
//			USE STATEMENT (CREATE OR PREPARE STATEMENT)
			pstmt = conn.prepareStatement(query);
//			EXECUTE THE QUERY 
			pstmt.setInt(1, b.getBookid());
			res = pstmt.executeQuery();

			if (res.next()) {
				// Set the attributes of Library object with data from result set
				b.setBookid(res.getInt("bookid"));
				b.setBookname(res.getString("bookname"));

				return true;

			}
		} catch (Exception exep) {
			exep.printStackTrace();
		}

		return false;
	}

	public boolean EBookEdition(Book b) {
		try {
			String query = "update home set bookedition = ? where bookid = ? ";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, b.getBookedition());
			pstmt.setInt(2, b.getBookid());
			int x = pstmt.executeUpdate();
			if (x > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception x) {
			x.printStackTrace();
		}
		return false;
	}

	public boolean DBookPrice(Book b) {
		try {
			String query = "select * from home where bookid=?";
//		USE STATEMENT (CREATE OR PREPARE STATEMENT)
			pstmt = conn.prepareStatement(query);
//		EXECUTE THE QUERY 
			pstmt.setInt(1, b.getBookid());
			res = pstmt.executeQuery();

			if (res.next()) {
				// Set the attributes of Library object with data from result set
				b.setBookid(res.getInt("bookid"));
				b.setBookprice(res.getInt("bookprice"));

				return true;

			}
		} catch (Exception exep) {
			exep.printStackTrace();
		}

		return false;
	}

	public boolean SBookEdition(Book b) {
		try {
			String query = "select * from home where bookid = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, b.getBookid());
			res = pstmt.executeQuery();
			if (res.next()) {
				b.setBookid(res.getInt("bookid"));
				b.setBookedition(res.getInt("bookEdition"));

				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}