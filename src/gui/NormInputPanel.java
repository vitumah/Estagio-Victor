package gui;

import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class NormInputPanel extends JPanel implements Runnable 
{
	public NormInputPanel()
	{
		GridBagLayout gridbag = new GridBagLayout();
        setLayout(gridbag);
        
        GridBagConstraints c = new GridBagConstraints();
        //c.fill = GridBagConstraints.HORIZONTAL;
        //c.weightx = 0.5;
        
        c.gridx = 0;
        c.gridy = 0;
        makeLabel("Name: ", gridbag, c);
        
        c.gridx = 1;
        c.gridy = 0;
        makeTextField(35, gridbag, c);
        
        c.gridx = 0;
        c.gridy = 1;
        makeLabel("NormType: ", gridbag, c);
        
        c.gridx = 1;
        c.gridy = 1;
        String[] names = {"Obligation", "Permission", "Prohibited" }; 
        makeRadioButtons(names, gridbag, c);
	}
	
	protected void makeButton(String name, GridBagLayout layout, GridBagConstraints c) 
	{
		Button button = new Button(name);
		layout.setConstraints(button, c);
		add(button);
	}
	
	protected void makeTextField(int col, GridBagLayout layout, GridBagConstraints c)
	{
		JTextField textField = new JTextField(col);
		layout.setConstraints(textField, c);
		add(textField);
	}
	
	protected void makeLabel(String name, GridBagLayout layout, GridBagConstraints c)
	{
		JLabel label = new JLabel(name);
		layout.setConstraints(label, c);
		add(label);
	}
	
	protected void makeRadioButtons(String[] names, GridBagLayout layout, GridBagConstraints c)
	{
		ButtonGroup radioGroup = new ButtonGroup();
		
		for(String name : names)
		{
			JRadioButton button = new JRadioButton(name, false);
			radioGroup.add(button);
			add(button);
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	}
	
}