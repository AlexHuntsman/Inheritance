package ctec.model;

import javax.swing.JOptionPane;

public class RangersApprentice extends Book
{
	public RangersApprentice()
	{
	this.setTitle("The Ruins of Gorlan");
	this.setAuthor("John Flanagan");
	this.setNumberOfPages(282);
	this.setRating(4.0);
	
	}
	
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
	
	
	
	
}
