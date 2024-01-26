package app.bookstore.view;

public class Book {
	int bookid;
	String bookname;
	int bookprice;
	int bookedition;

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public int getBookprice() {
		return bookprice;
	}

	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}

	public int getBookedition() {
		return bookedition;
	}

	public void setBookedition(int bookedition) {
		this.bookedition = bookedition;
	}
}
