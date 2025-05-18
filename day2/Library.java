package week1.day2;

public class Library {
	
	public  String addBook(String bookTitle) {
	System.out.println("Book added successfully");
	return "the name is :"+bookTitle;
	}
	
	public void issueBook() {
		System.out.println("Book issued successfully");
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library lr= new Library() ;
		String l = lr.addBook("Java");
		System.out.println(l);
		lr.issueBook();
			
		

	}

}
