package ctec.controller;

import java.util.ArrayList;
import ctec.model.*;

public class BookController
{
	public BookController()
	{
		this.bookList = new ArrayList<Book>();
		//build all model components
		makeBookList();
	}
	
	private ArrayList<Book> bookList;
	
	public ArrayList<Book> getBookList() {
		return bookList;
	}

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
	
	public void swap(int firstLocation, int secondLocation)
	{
		Book temp = bookList.get(firstLocation);
		bookList.set(firstLocation, bookList.get(secondLocation));
		bookList.set(secondLocation, temp);
	}
	
	public void insertionSort()
	{
		for (int outerLoop = 1; outerLoop < bookList.size(); outerLoop++)
		{
			int innerLoop = outerLoop;
			while(innerLoop > 0 && (bookList.get(innerLoop-1).compareTo(bookList.get(innerLoop))) > 0)
			{
				swap(innerLoop, innerLoop-1);
				innerLoop--;
			}
		}
	}
	
	public void quicksort(int low,int high)
	{
		if(low < high)
		{
			int midpoint = partition(low, high);
			quicksort(low, midpoint-1);
			quicksort(midpoint+1, high);
		}
	}
	
	public int partition(int low, int high)
	{
		int position = low;
		Book pivot = bookList.get(high);
		
		for(int spot = low; spot < high-1; spot++)
		{
			if(bookList.get(spot).compareTo(pivot) <= 0)
			{
				swap(position, spot);
				position++;
			}
		}
		swap(position, high);
		return position;
	}
}
