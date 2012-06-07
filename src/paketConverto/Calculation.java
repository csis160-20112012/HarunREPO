package paketConverto;


import javax.swing.AbstractButton;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;


import java.awt.BorderLayout;
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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
	
// EVERY METHOD NEEDS TO SPECIFY THE okvirC size and bounds !
	
	public void CalculationCurr()
	{
	

			calcPanel();
			//final double result=0;
			// EVERY METHOD NEEDS TO SPECIFY THE okvirC size and bounds ! 
			/* >>>> */ okvirC.setSize(500,310);
			/* >>>> */ okvirC.setLocation(500, 180);
			panelC.setBackground(Color.green);
		
			
			
			 String[] currencyFrom = {"EURO","USD","BAM","HRK", "RSD","GBP"};
			 final JList currenciesFR = new JList(currencyFrom);    
			 String[] currencyTO = {"EURO","USD","BAM","HRK", "RSD","GBP"};
			 final JList currenciesTO = new JList(currencyFrom); 

			 

			 currenciesFR.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			 currenciesFR.setFont(new Font("Century Gothic", 1, 19));
			 currenciesFR.setForeground(Color.white);
			 currenciesFR.setBackground(Color.green);
			 panelC.add(currenciesFR);
			 currenciesFR.setBounds(200, 50, 100, 180);


			 currenciesTO.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			 panelC.add(currenciesTO);
			 currenciesTO.setFont(new Font("Century Gothic", 1, 19));
			 currenciesTO.setForeground(Color.white);
			 currenciesTO.setBackground(Color.green);
			 currenciesTO.setBounds(330, 50, 100, 180);
     
			 final JTextField input = new JTextField();
			 panelC.add(input);
			 input.setBounds(20, 60, 120, 30);
			 input.setFont(new Font("Century Gothic", 1, 17));
			 input.setText("1");
			
			   
			  
			   
	     input.setText(null);
	     
	     
		 currenciesFR.addListSelectionListener(new ListSelectionListener()
		 {
				public void valueChanged(ListSelectionEvent fr)
				{
				
					currenciesTO.addListSelectionListener(new ListSelectionListener()
					{
						 
							
						public void valueChanged(ListSelectionEvent to)
							{													
							JTextArea resultText = new JTextArea();
							   resultText.setText("  CONVERTED : ");
							   resultText.setFont(new Font("Century Gothic", 1, 22));
							   resultText.setForeground(Color.white);
							   resultText.setBackground(Color.green);
							   panelC.add(resultText);
							   final String value = input.getText();
								final int fromAmount = Integer.parseInt(value);
								double result=0;
							   resultText.setBounds(60, 240, 35000, 30);
						
							
							
				if (currenciesFR.getSelectedIndex() == 0)
					{ 
					
					if (currenciesTO.getSelectedIndex()== 0)
					{
						//euro and euro chosen, so balance is 1
						double curr = 1;	
	             	result=fromAmount*curr;
	             	             	
	             	resultText.setText("  CONVERTED : "+result +" €");
				    }
					if (currenciesTO.getSelectedIndex()== 1)
						{
						//euro and usd chosen
						double curr = 1.4241;	
		             result= fromAmount*curr;
		             	
		             	resultText.setText("  CONVERTED : "+result +" $");
					    }
		             
		             if (currenciesTO.getSelectedIndex()== 2)
						{
		            	//euro and bam chosen
		            	 double curr = 1.9534;
		             result=fromAmount*curr;
		             	
		             	resultText.setText("  CONVERTED : "+result +" KM");

		                	}
					}
	             
	             if (currenciesFR.getSelectedIndex()== 1)
					{
	            	 if (currenciesTO.getSelectedIndex()== 0)
						{
							//usd and euro chosen
	            		 double curr =  0.83256;	
		             result=fromAmount*curr;		             	             	
		             	resultText.setText("  CONVERTED : "+result +" €");
		             	
					    }
						if (currenciesTO.getSelectedIndex()== 1)
							{
							//usd and usd chosen, so balance is 1
							float curr = 1;	
			             	result=fromAmount*curr;
			             	
			             	resultText.setText("  CONVERTED : "+result +" $");
						    } 
			             
			             if (currenciesTO.getSelectedIndex()== 2)
							{
			            	//usd and bam chosen
			            	 double curr = 1.532;
			            result=fromAmount*curr;
			             	resultText.setText("  CONVERTED : "+result+" KM");
	            						    
				    }
					}
	             
	             if (currenciesFR.getSelectedIndex()== 2)
					{
	            	 if (currenciesTO.getSelectedIndex()== 0)
						{
							//bam and euro chosen
	            		 float curr = (float) 0.51;	
		          result=fromAmount*curr;
		             	             	
		             	resultText.setText("  CONVERTED : "+result+" €");
					    }
						if (currenciesTO.getSelectedIndex()== 1)
							{
							//bam and usd chosen
							double curr = 1.4;	
			   result=fromAmount*curr;
			             	
			             	resultText.setText("  CONVERTED : "+result+" $");
						    }
			             
			             if (currenciesTO.getSelectedIndex()== 2)
							{
			            	//euro and bam chosen
			            	 double curr =  1;
			       result=fromAmount*curr;
			             	resultText.setText("  CONVERTED : "+result+"KM");
					} 
	            	 
	                	}
							
	             
				}
					
					});
		    
				}}
				 );}
	
	
	// LENGTH NEEDS TO BE MODIFIED , just put in the values to replace the existing ones.
		   
	/*public void CalculationLength()

	{
		calcPanel();
		final double result=0;
		final String amount;
		amount = JOptionPane.showInputDialog(okvirC, "Input the Amount You wish to Convert");


		 String[] lengthFrom = {"kg","g","mg","tonne","ounces (oz)","stones(st)"};
		 final JList lengthsFR = new JList(lengthFrom);    
		 String[] lengthTO = {"kg","g","mg","tonne","ounces (oz)","stones(st)"};
		 final JList lengthsTO = new JList(lengthFrom); 

		 lengthsFR.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		 lengthsFR.setFont(new Font("Century Gothic", 1, 19));
		 lengthsFR.setForeground(Color.white);
		 lengthsFR.setBackground(Color.blue);
		 panelC.add(lengthsFR);
		 lengthsFR.setBounds(70, 70, 100, 100);

		 lengthsTO.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		 panelC.add(lengthsTO);
		 lengthsTO.setFont(new Font("Century Gothic", 1, 19));
		 lengthsTO.setForeground(Color.white);
		 lengthsTO.setBackground(Color.blue);
		 lengthsTO.setBounds(270, 70, 100, 100);

		 lengthsFR.addListSelectionListener(new ListSelectionListener()
		 {
				public void valueChanged(ListSelectionEvent fr)
				{
					lengthsTO.addListSelectionListener(new ListSelectionListener()
					{


						public void valueChanged(ListSelectionEvent to)
							{													
							JTextArea resultText = new JTextArea();
							   resultText.setText("  CONVERTED : ");
							   resultText.setFont(new Font("Century Gothic", 1, 22));
							   resultText.setForeground(Color.white);
							   resultText.setBackground(Color.blue);

							   panelC.add(resultText);
							   resultText.setBounds(70, 250, 400, 30);
							   final double fromAmount;
							    fromAmount = Integer.parseInt(amount);
								double result=0;

								if (lengthsFR.getSelectedIndex() == 0) //////////////////////////////////////////0
								{ 

								     if (lengthsTO.getSelectedIndex()== 0)
								     {
									//kg and kg are chosen, so balance is 1
								   double val = 1;	
				             	   result=fromAmount*val;
				             	   resultText.setText("  CONVERTED : "+result +" kg");
							       }
								if (lengthsTO.getSelectedIndex()== 1)
									{
									//kg and g chosen
									double val = 1000;	
					             	result=fromAmount*val;

					             	resultText.setText("  CONVERTED : "+result +" g");
								    }

				
								if (lengthsTO.getSelectedIndex()== 2)
								{
				            	//kg and mg chosen
				            	 double val = 1000000;
				             	result=fromAmount*val;

				             	resultText.setText("  CONVERTED : "+result +" mg");

				                	}
			            	 if (lengthsTO.getSelectedIndex()==3)
			            	 {
			            	 //kg and tonne chosen 	 
			            	 double val=1/1000;
						     result = fromAmount*val;
						     resultText.setText("CONVERTED:"+result+"t");
			            	 } 
			            	 
		                	
			            	 
								
		             			    
					
					}
					}
					
				});
				}}
				 );}
	*/

	public void CalculationWeight()

	{
	calcPanel();
	//final double result=0;
	
	okvirC.setSize(500,310);
	okvirC.setLocation(500, 180);
	panelC.setBackground(Color.GRAY);
	
	


	String[] weightFrom = {"kg","g","tonne","ounces","stones"};
	final JList weightsFR = new JList(weightFrom);
	String[] weightTO = {"kg","g","tonne","ounces","stones"};
	final JList weightsTO = new JList(weightFrom);

	weightsFR.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	weightsFR.setFont(new Font("Century Gothic", 1, 19));
	weightsFR.setForeground(Color.white);
	weightsFR.setBackground(Color.GRAY);
	panelC.add(weightsFR);
	weightsFR.setBounds(200, 50, 100, 180);

	weightsTO.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	panelC.add(weightsTO);
	weightsTO.setFont(new Font("Century Gothic", 1, 19));
	weightsTO.setForeground(Color.white);
	weightsTO.setBackground(Color.GRAY);
	weightsTO.setBounds(330, 50, 100, 180);
	
	
	final JTextField input = new JTextField();
	 panelC.add(input);
	 input.setBounds(20, 60, 120, 30);
	 input.setFont(new Font("Century Gothic", 1, 17));
	 
	input.setText("1");
	
	
	

	weightsFR.addListSelectionListener(new ListSelectionListener()
	{
	public void valueChanged(ListSelectionEvent fr)
	{
	weightsTO.addListSelectionListener(new ListSelectionListener()
	{


	public void valueChanged(ListSelectionEvent to)
	{
	JTextArea resultText = new JTextArea();
	resultText.setText(" CONVERTED : ");
	resultText.setFont(new Font("Century Gothic", 1, 22));
	resultText.setForeground(Color.white);
	resultText.setBackground(Color.GRAY);

	panelC.add(resultText);
	resultText.setBounds(70, 230, 400, 30);
	final String value = input.getText();
	final int fromAmount = Integer.parseInt(value);
	double result=0;

	if (weightsFR.getSelectedIndex() == 0) 	{

	if (weightsTO.getSelectedIndex()== 0)
	{
	//kg and kg are chosen, so balance is 1
	double val = 1;
	result=fromAmount*val;
	resultText.setText(" CONVERTED : "+result +" kg");
	}
	if (weightsTO.getSelectedIndex()== 1)
	{
	//kg and g chosen
	double val = 1000;
	result=fromAmount*val;

	resultText.setText(" CONVERTED : "+result +" g");
	}


	if (weightsTO.getSelectedIndex()== 2)
	{
	//kg and tonne chosen
	double val = 1/1000;
	result=fromAmount*val;

	resultText.setText(" CONVERTED : "+result +" t");

	}
	if (weightsTO.getSelectedIndex()==3)
	{
	//kg and ounces chosen
	double val=35.2739;
	result = fromAmount*val;
	resultText.setText("CONVERTED: "+result+" oz");
	}

	if(weightsTO.getSelectedIndex()==4)
	{
		//kg and stones chosen
		double val=0.15747;
		result = fromAmount*val;
		resultText.setText("CONVERTED : "+result+" st");



	}

	}

	if (weightsFR.getSelectedIndex() == 1) 	{

		if (weightsTO.getSelectedIndex()== 0)
		{
		//g and kg chosen
		double val = (1/1000);
		result=fromAmount*val;
		resultText.setText(" CONVERTED : "+result +" kg");
		}
		if (weightsTO.getSelectedIndex()== 1)
		{
		//g and g chosen
		double val = 1;
		result=fromAmount*val;

		resultText.setText(" CONVERTED : "+result +" g");
		}


		if (weightsTO.getSelectedIndex()== 2)
		{
		//g and tonne chosen
		double val = 1/1000000;
		result=fromAmount*val;

		resultText.setText(" CONVERTED : "+result +" t");

		}
		if (weightsTO.getSelectedIndex()==3)
		{
		//g and ounces chosen
		double val=0.0352739;
		result = fromAmount*val;
		resultText.setText("CONVERTED : "+result+" oz");
		}

		if(weightsTO.getSelectedIndex()==4)
		{
			//g and stones chosen
			double val=0.00015747;
			result = fromAmount*val;
			resultText.setText("CONVERTED : "+result+" st");
 


		}

		}
	if (weightsFR.getSelectedIndex() == 2) 	{

		if (weightsTO.getSelectedIndex()== 0)
		{
		//tonne and kg chosen
		double val = 1000;
		result=fromAmount*val;
		resultText.setText(" CONVERTED : "+result +" kg");
		}
		if (weightsTO.getSelectedIndex()== 1)
		{
		//tonne and g chosen
		double val = 1000000;
		result=fromAmount*val;

		resultText.setText(" CONVERTED : "+result +" g");
		}


		if (weightsTO.getSelectedIndex()== 2)
		{
		//tonne and tonne chosen
		double val = 1;
		result=fromAmount*val;

		resultText.setText(" CONVERTED : "+result +" t");

		}
		if (weightsTO.getSelectedIndex()==3)
		{
		//tonne and ounces chosen
		double val=35273.9;
		result = fromAmount*val;
		resultText.setText("CONVERTED : "+result+" oz");
		}

		if(weightsTO.getSelectedIndex()==4)
		{
			//kg and stones chosen
			double val=157.47;
			result = fromAmount*val;
			resultText.setText("CONVERTED : "+result+" st");



		}

		}
	if (weightsFR.getSelectedIndex() == 3) 	{

		if (weightsTO.getSelectedIndex()== 0)
		{
		//ounces and kg are chosen
		double val = 1/35.2739;
		result=fromAmount*val;
		resultText.setText(" CONVERTED : "+result +" kg");
		}
		if (weightsTO.getSelectedIndex()== 1)
		{
		//ounces and g chosen
		double val = 0.0352739;
		result=fromAmount*val;

		resultText.setText(" CONVERTED : "+result +" g");
		}


		if (weightsTO.getSelectedIndex()== 2)
		{
		//ounces and tonne chosen
		double val = 1/35273.9;
		result=fromAmount*val;

		resultText.setText(" CONVERTED : "+result +" t");

		}
		if (weightsTO.getSelectedIndex()==3)
		{
		//ounces and ounces chosen
		double val=1;
		result = fromAmount*val;
		resultText.setText("CONVERTED : "+result+" oz");
		}

		if(weightsTO.getSelectedIndex()==4)
		{
			//kg and stones chosen
			double val=0.15747/35.2739;
			result = fromAmount*val;
			resultText.setText("CONVERTED : "+result+" st");



		}

		}

	if (weightsFR.getSelectedIndex() == 4) 	{

		if (weightsTO.getSelectedIndex()== 0)
		{
		//stones and kg chosen
		double val = 1/0.15747;
		result=fromAmount*val;
		resultText.setText(" CONVERTED : "+result +" kg");
		}
		if (weightsTO.getSelectedIndex()== 1)
		{
		//stones and g chosen
		double val = 1000/0.15747;
		result=fromAmount*val;

		resultText.setText(" CONVERTED : "+result +" g");
		}


		if (weightsTO.getSelectedIndex()== 2)
		{
		//ounces and tonne chosen
		double val = 1/157.47;
		result=fromAmount*val;

		resultText.setText(" CONVERTED : "+result +" t");

		}
		if (weightsTO.getSelectedIndex()==3)
		{
		//stones and ounces chosen
		double val=35.2739/0.15747;
		result = fromAmount*val;
		resultText.setText("CONVERTED : "+result+" oz");
		}

		if(weightsTO.getSelectedIndex()==4)
		{
			//stones and stones chosen
			double val=1;
			result = fromAmount*val;
			resultText.setText("CONVERTED : "+result+" st");



		}

		}

	}

	});
	}}
	);}


	
	
	
	
	
	
	

	
	public   void calcPanel()
	{
		
		
		
	    panelC.setLayout(null);

	    

	     panel.setVisible(false);
	     okvir2.setVisible(false);


		 okvirC.add(panel1);
		 okvirC.add(panelC);
		 
		 okvirC.setVisible(true);
		 okvirC.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
		 okvirC.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\users\\Ðuliæ\\desktop\\HARUN_FAKULTET\\logoIconSmall.jpg"));
		 okvirC.setResizable(false);

		 JLabel value = new JLabel();
		 value.setText("How much:"); 
		 value.setFont(new Font("Century Gothic", 1, 17));	 
		 value.setForeground(Color.white);
		 panelC.add(value);
		 value.setBounds(20, 10, 100, 50);
		 
		 
		 JLabel from = new JLabel();
		 from.setText("From:"); 
		 from.setFont(new Font("Century Gothic", 1, 22));	 
		 from.setForeground(Color.white);
		 panelC.add(from);
		 from.setBounds(200, 10, 200, 50);

		 JLabel to = new JLabel();
		 to.setText("To:");
		 to.setFont(new Font("Century Gothic", 1, 22));
		 to.setForeground(Color.white);
		 panelC.add(to);
		 to.setBounds(330, 10, 100, 50);
	
	}
		 
	
	
}
	
		 
	
		 

