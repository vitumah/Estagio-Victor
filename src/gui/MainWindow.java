package gui;

import javax.swing.JFrame;

public class MainWindow extends JFrame 
{
	
	private NormInputPanel normPanel;
	
	public MainWindow()
	{
		normPanel = new NormInputPanel();
		initUI();
	}
	
	private void initUI()
	{
		setTitle("Input for New Norm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(Settings.SCREEN_WIDTH, Settings.SCREEN_HEIGHT);
		setLocationRelativeTo(null);
		setResizable(false);
		setFocusable(true);
		setVisible(true);
		
		Thread thread = new Thread(normPanel);
		add(normPanel);
		
		thread.start();
	}
}
