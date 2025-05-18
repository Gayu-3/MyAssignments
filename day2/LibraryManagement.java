package week1.day2;



public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library lrb = new Library();
		String c = lrb.addBook("LibraryManagement");
		System.out.println(c);
		lrb.issueBook();
		

	}

}
