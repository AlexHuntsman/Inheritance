package ctec.view;

import javax.swing.JFrame;

import ctec.controller.BookController;

public class BookFrame extends JFrame
{	
	private BookController baseController;
	private BookPanel basePanel;
	
	public BookFrame(BookController baseController)
	{
		this.baseController = baseController;
		basePanel = new BookPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(300,300);
		this.setTitle("Java library");
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public BookController getBaseController()
	{
		return baseController;
	}
}




