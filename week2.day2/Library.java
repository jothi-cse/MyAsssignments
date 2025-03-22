package week1.day2;

public class Library {

	String addBook(String bookTitle) {
		return bookTitle;
	}

	public void issueBook() {
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lb = new Library();
		Library lb1 = new Library();
		System.out.println(lb.addBook("NightMare"));
		lb1.issueBook();
	}

}
