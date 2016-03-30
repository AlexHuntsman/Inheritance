package ctec.model;

public class Book implements BookShelf
{
	private String title;
	private String author;
	private int numberOfPages;
	
	
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
