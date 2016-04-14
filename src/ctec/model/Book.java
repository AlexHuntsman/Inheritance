package ctec.model;

public class Book implements BookShelf
{
	private String title;
	private String author;
	private int numberOfPages;
	private double rating;
	private String description;
	
	public int compareTo(Object compared)
	{
		int comparedValue = -1;
		
		if(compared instanceof Book)
		{
			if(this.Rating() > ((Book) compared).Rating())
			{
				comparedValue = 1;
			}
			else if(this.Rating() < ((Book) compared).Rating())
			{
				comparedValue = -1;
			}
			else 
			{
				comparedValue = 0;
			}
		}
		
		return comparedValue;
	}
	
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public int getNumberOfPages()
	{
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages)
	{
		this.numberOfPages = numberOfPages;
	}
	
	public double getRating()
	{
		return rating;
	}
	public void setRating(double rating)
	{
		this.rating = rating;
	}
	@Override
	public String Read()
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Double Rating()
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void Burn()
	{
		// TODO Auto-generated method stub
		
	}
	
	
}
