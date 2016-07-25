class Book
{
	String name;
	int bookId;
	
	public Book(String name,int bookId)
	{
		this.name = name;
		this.bookId = bookId;
	}
	
	public static Book Librarian(String name)
	{
		Book b = new Book(name,1234);
		return b;
		
	}
}

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book bk = Book.Librarian("Java");
		System.out.println(bk.toString());
	}

}
