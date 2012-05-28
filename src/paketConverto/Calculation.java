package paketConverto;


import javax.swing.AbstractButton;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.io.InputStreamReader;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.xml.bind.ParseConversionEvent;



public abstract class Calculation extends CategoriesUnits implements ActionListener {
	
	JPanel panelC = new JPanel();
    JFrame okvirC  = new JFrame("calculate");
	
	
	
	public void CalculationCurr()
	{
		
		calcPanel();
		//final double result=0;
		final String amount;
		amount = JOptionPane.showInputDialog(okvirC, "Input the Amount You wish to Convert");
		 
			
			
		
		
		
		
		 String[] currencyFrom = {"EURO","USD","BAM"};
		 final JList currenciesFR = new JList(currencyFrom);    
		 String[] currencyTO = {"EURO","USD","BAM"};
		 final JList currenciesTO = new JList(currencyFrom); 
		

		      
		 currenciesFR.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		 panelC.add(currenciesFR);
		 currenciesFR.setBounds(50, 50, 100, 100);
		 currenciesFR.setSelectedIndex(0);
		 

		 
		 
		 currenciesTO.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		 panelC.add(currenciesTO);
		 
		 
		currenciesTO.setBounds(250, 50, 100, 100);
		 currenciesTO.setSelectedIndex(0);
	
		 currenciesFR.addListSelectionListener(new ListSelectionListener()
		 {
				public void valueChanged(ListSelectionEvent fr)
				{
					
				
			   
					currenciesTO.addListSelectionListener(new ListSelectionListener()
					{
						 
							
						public void valueChanged(ListSelectionEvent to)
							{
							JTextArea resultText = new JTextArea();
							   resultText.setText("COVNERTED :\n");
							   panelC.add(resultText);
							   resultText.setBounds(150, 240, 150, 50);
							   final int fromAmount;
								fromAmount = Integer.parseInt ( amount);
								double result=0;
							
							
				if (currenciesFR.getSelectedIndex() == 0)
					{ 
					
					if (currenciesTO.getSelectedIndex()== 0)
					{
						//euro and euro chosen, so balance is 1
	             	double curr = 1;	
	             	result=fromAmount*curr;
	             	             	
	             	resultText.setText("COVNERTED :\n"+result +" €");
				    }
					if (currenciesTO.getSelectedIndex()== 1)
						{
						//euro and usd chosen
		             	double curr = 1.4241;	
		             	result=fromAmount*curr;
		             	
		             	resultText.setText("COVNERTED :\n"+result +" $");
					    }
		             
		             if (currenciesTO.getSelectedIndex()== 2)
						{
		            	//euro and bam chosen
		             	double curr = 1.9534;
		             	result=fromAmount*curr;
		             	resultText.setText("COVNERTED :\n"+result +" KM");

		                	}
	            	 
				    }
					
	             
	             if (currenciesFR.getSelectedIndex()== 1)
					{
	            	 if (currenciesTO.getSelectedIndex()== 0)
						{
							//usd and euro chosen
		             	double curr = 0.83256;	
		             	result=fromAmount*curr;		             	             	
		             	resultText.setText("COVNERTED :\n"+result +" €");
		             	
					    }
						if (currenciesTO.getSelectedIndex()== 1)
							{
							//usd and usd chosen, so balance is 1
			             	double curr = 1;	
			             	result=fromAmount*curr;
			             	
			             	resultText.setText("COVNERTED :\n"+result +" $");
						    }
			             
			             if (currenciesTO.getSelectedIndex()== 2)
							{
			            	//usd and bam chosen
			             	double curr = 1.532;
			             	result=fromAmount*curr;
			             	resultText.setText("COVNERTED :\n"+result+" KM");
	            						    
				    }
	             
	             if (currenciesFR.getSelectedIndex()== 2)
					{
	            	 if (currenciesTO.getSelectedIndex()== 1)
						{
							//euro and euro chosen, so balance is 1
		             	double curr = 1;	
		             	result=fromAmount*curr;
		             	             	
		             	resultText.setText("COVNERTED :\n"+result);
					    }
						if (currenciesTO.getSelectedIndex()== 1)
							{
							//euro and usd chosen
			             	double curr = 1.4;	
			             	result=fromAmount*curr;
			             	
			             	resultText.setText("COVNERTED :\n"+result);
						    }
			             
			             if (currenciesTO.getSelectedIndex()== 2)
							{
			            	//euro and bam chosen
			             	double curr = 1.7;
			             	result=fromAmount*curr;
			             	resultText.setText("COVNERTED :\n"+result);
					}
	            	 
	                	}
							
				
				}
				}
					});
		    
				
				}}
				 );}
		   
		   
	
	
	
	
	
	
	
	
	
	
	
	
	public void calcPanel()
	{
    panelC.setLayout(null);
	
    panelC.setBackground(new Color(53,165,244));

     panel.setVisible(false);
     okvir2.setVisible(false);
	
	
	 okvirC.add(panel1);
	 okvirC.add(panelC);
	 okvirC.setSize(500,400);
	 okvirC.setVisible(true);
	 okvirC.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
	 okvirC.setLocation(500, 180);
	 okvirC.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\users\\Ðuliæ\\desktop\\HARUN_FAKULTET\\CovertoLogoALFAsmall.jpg"));
	 okvirC.setResizable(false);
	 
	 
	 JLabel from = new JLabel();
	 from.setText("From:"); 
	 panelC.add(from);
	 from.setBounds(50, 20, 100, 10);
	
	 JLabel to = new JLabel();
	 to.setText("To:");
	 panelC.add(to);
	 to.setBounds(250, 20, 100, 10);
	}
		 
	

}
	
		 
	
		 

