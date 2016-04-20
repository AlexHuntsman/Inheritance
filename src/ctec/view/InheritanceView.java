package ctec.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ctec.controller.BookController;
import ctec.model.Book;

public class InheritanceView extends JPanel
{
private BookController baseController;
	private JButton sortButton;
	private JTextArea textArea;
	
	
	private void setupListeners()
	{
		sortButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.insertionSort();
				String temp = "The sorted contents are: \n";
				for(Book current : baseController.getBookList())
				{
					temp += current.toString() + "\n";
				}
				textArea.setText(temp);
			}
			
		});
			
		
	}
}
