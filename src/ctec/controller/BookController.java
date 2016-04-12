package ctec.controller;

import java.util.ArrayList;
import ctec.model.*;

public class BookController
{
	public BookController()
	{
		//build all model components
		makeBookList();
	}
	
	private ArrayList<Book> bookList;
	
	public String showBookRating()
	{
		String bookRatings = "";
		for(Book currentBook : bookList)
		{
			bookRatings.concat("This is " + currentBook.toString() + " and has a rating of " + currentBook.Rating() + "\n");
		}
		
		return bookRatings;
	}
	
	private void makeBookList()
	{
		bookList.add(new WayOfKings());
		bookList.add(new RangersApprentice());
	}
	
	public void start()
	{
		
	}
	
	
}
