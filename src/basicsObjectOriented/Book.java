package basicsObjectOriented;

public class Book {

	String authorName;
	String title;
	int pageCount;
	
	Book()
	{//default constructor
	}
	
	
	Book(String author, String name, int pages) {
		authorName = author;
		title = name;
		pageCount = pages;

	}

	String getAuthor(String bookAuthorsName) {
		return bookAuthorsName;
	}

	String getName(String nameOfTheBook)

	{
		return nameOfTheBook;
	}

	int getPages(int numberOfPages)

	{
		return numberOfPages;
	}

}
