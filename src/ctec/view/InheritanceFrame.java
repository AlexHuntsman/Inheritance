package ctec.view;

import javax.swing.JFrame;
import ctec.controller.BookController;

public class InheritanceFrame extends JFrame
{
	private BookController baseController;
	private InheritanceView basePanel;
/**
 * 
 * @param baseController
 */
	
	public InheritanceFrame(BookController baseController)
	{
		this.baseController = baseController;
		basePanel = new InheritanceView(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400,400);
		this.setTitle("Alex's ChatBot");
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public BookController getBaseController()
	{
		return baseController;
	}
}
