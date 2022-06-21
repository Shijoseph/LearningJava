package basicsObjectOriented;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// obj 1 is for constructor
		Book obj1 = new Book(" Manish Kumar", " the History of India", 258);
		

		
		// obj 2 is for getauthor method
		Book obj2 = new Book();
		String name = obj2.getAuthor(obj1.authorName);
		System.out.println("name of the author is  " + name);

		
		// obj3 is for getName method
		Book obj3 = new Book();
		String bookName = obj3.getName(obj1.title);
		System.out.println("title of the book  is  " + bookName);

		//obj 4 is for getPages method
		
		Book obj4 = new Book();
		int page = obj4.getPages(obj1.pageCount);
		System.out.println("no of pages in the book is "+ page);
	}

}
