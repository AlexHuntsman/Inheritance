package ctec.view;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ctec.controller.BookController;
import ctec.model.Book;

public class InheritanceView extends JPanel
{
private BookController baseController;
	private JButton sortButton;
	private SpringLayout baseLayout;
	private JTextArea textArea;
	private JScrollPane textPane;
	
	public InheritanceView(BookController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		sortButton = new JButton("Sort");
		textArea = new JTextArea(10,30);
		
		setupTextPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, textArea, 41, SpringLayout.SOUTH, sortButton);
		baseLayout.putConstraint(SpringLayout.WEST, textArea, 34, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, sortButton, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, sortButton, 41, SpringLayout.WEST, this);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.CYAN);
		this.add(textPane);
		this.add(sortButton);
		textArea.setEnabled(false);
	}
	
	private void setupTextPane()
	{
		textPane = new JScrollPane(textArea);
		baseLayout.putConstraint(SpringLayout.NORTH, textPane, 50, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textPane, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, textPane, 200, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, textPane, -50, SpringLayout.EAST, this);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
		textPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		textPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	}
	
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
