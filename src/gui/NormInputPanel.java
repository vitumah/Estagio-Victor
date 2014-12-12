package gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class NormInputPanel extends JPanel implements Runnable 
{
	public NormInputPanel()
	{
		//GridLayout gridbag = new GridLayout(3, 3);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
        //setLayout(gridbag);
        
        add( new JLabel("Name: ") );
        add( new JTextField(26) );
        add( new JLabel("NormType: ") );
        
        String[] names = {"Obligation", "Permission", "Prohibited" };
        ButtonGroup radioGroupNormType = new ButtonGroup();
        for(String name : names) 
        {
        	JRadioButton button = new JRadioButton(name, false);
        	radioGroupNormType.add(button);
			add(button);
		}
        
        add( new JLabel("Norm Context: ") );
        add( new JTextField(24) );
        
        add( new JLabel("Norm Resource: ") );
        add( new JTextField(23) );
        
        add( new JLabel("Norm Constraint: ") );
        String[] constraits = {"Before", "Between", "After" };
        
        ButtonGroup radioGroupConstraits = new ButtonGroup();
        for(String name : constraits) 
        {
        	JRadioButton button = new JRadioButton(name, false);
        	radioGroupConstraits.add(button);
			add(button);
		}
        
        add( new Button("Create Norm") );
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	}
	
}