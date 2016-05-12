package ctec.view;


import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

import ctec.controller.BookController;



public class BookPanel extends JPanel
{
	private BookController baseController;
	private SpringLayout baseLayout;
	private JButton sortButton;
	private JTextArea textArea;
	private JScrollPane textPane;
	private JLabel ratingLabel;
	
	public BookPanel(BookController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		textArea = new JTextArea(10, 30);
		sortButton = new JButton("Sort");
		ratingLabel = new JLabel("sort by rating top-bottom");
		
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();		
	}

	private void setupListeners()
	{
		sortButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				for (int index = 1; index < baseController.bookList.size(); index++)
				{
					
				}
			}
		});
		
	}

	private void setupLayout()
	{
		
		
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.LIGHT_GRAY);
		this.add(textPane);
		this.add(sortButton);
		this.add(ratingLabel);
		textArea.setEnabled(false);
		
	}

	private void setupScrollPane()
	{
		textPane = new JScrollPane(textArea);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
		textPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		textPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
	}
	
}


