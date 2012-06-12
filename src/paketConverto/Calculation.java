package paketConverto;

import javax.swing.JList;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
* @author Harun Djulic & Amar Svraka
* @version JavaSE-1.6 
* The class defines the frame,panel and methods for calculation in the categories button.
*  

*/

public abstract class Calculation extends CategoriesUnits implements ActionListener { 

	JPanel panelC = new JPanel();
    JFrame okvirC  = new JFrame("calculate");
    final JTextField input = new JTextField();
    final JTextField round = new JTextField();
    final JTextArea precisionOf = new JTextArea();
   
// EVERY METHOD NEEDS TO SPECIFY THE okvirC size and bounds !
    /**
     * @author Harun Djulic & Amar Svraka
     * JavaSE-1.6 
     * @param okvirC   defines the frame, title, size and location of a frame (same for other Calculation methods in this class).
     * @param panelC   defines the panel, and the color of the panel
     * @param currenciesFR  the list for "from" values (same for other Calculation methods in this class).
     * @param currenciesTO  the list for "to" values (same for other Calculation methods in this class).
     * @param input  the field for inputing the value to convert (same for other Calculation methods in this class).
     * @param round  the fiel for inputing the value to which to round the result (same for other Calculation methods in this class).
     *
     * */
    
    
	public void CalculationCurr()
	{


			calcPanel();
			// EVERY METHOD NEEDS TO SPECIFY THE okvirC size and bounds ! 
			/* >>>> */ okvirC.setSize(500,310);
			/* >>>> */ okvirC.setLocation(600, 180);
			panelC.setBackground(Color.green);
            okvirC.setTitle("currency");
			
			 String[] currencyFrom = {"EURO","USD","BAM","HRK", "RSD","GBP"};
			 final JList currenciesFR = new JList(currencyFrom);    
			 String[] currencyTO = {"EURO","USD","BAM","HRK", "RSD","GBP"};
			 final JList currenciesTO = new JList(currencyTO ); 



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
     
			 

	    


		 currenciesFR.addListSelectionListener(new ListSelectionListener()
		 {
				public void valueChanged(ListSelectionEvent fr)
				{

					currenciesTO.addListSelectionListener(new ListSelectionListener()
					{


						public void valueChanged(ListSelectionEvent to)
							{													
							JTextArea resultText = new JTextArea();
							   resultText.setText("CONVERTED : ");
							   resultText.setFont(new Font("Century Gothic", 1, 22));
							   resultText.setForeground(Color.white);
							   resultText.setBackground(Color.green);
							   panelC.add(resultText);
							   final String value = input.getText();
								final double fromAmount = Double.parseDouble(value);
								double result=0;
							   resultText.setBounds(7, 240, 35000, 30);
							 
							final String rounder = round.getText();
							final double raunder2 = Double.parseDouble(rounder);
							String roundio = null;
							if (raunder2==0)
							{
								roundio="#.######";
							}
							else if (raunder2==1)
							{
								roundio="#.#";
							}
							else if (raunder2==2)
							{
								roundio="#.##";
							}
							else if (raunder2==3)
							{
								roundio="#.###";
							}
							else if (raunder2==4)
							{
								roundio="#.####";
							}
							else if (raunder2==5)
							{
								roundio="#.#####";
							}
							 else {
								roundio="#.######";
							}
							DecimalFormat decForm = new DecimalFormat(roundio);
							 
											
								 


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
		             double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" $");
					    }

		             if (currenciesTO.getSelectedIndex()== 2)
						{
		            	//euro and bam chosen
		            	 double curr = 1.953;
		             result=fromAmount*curr;
		             double resultDec =  Double.valueOf(decForm.format(result));

		             	resultText.setText("  CONVERTED : "+resultDec +" KM");

		                	}
		             
		             if (currenciesTO.getSelectedIndex()== 3)
						{
		            	//euro and hrk chosen
		            	 double curr = 7.554;
		             result=fromAmount*curr;
		             double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" HRK");
						}
		             if (currenciesTO.getSelectedIndex()== 4)
						{
		            	//euro and rsd chosen
		            	 double curr = 114.913;
		             result=fromAmount*curr;
		             double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" RSD");
					}

		             
		             if (currenciesTO.getSelectedIndex()== 5)
						{
		            	//euro and gbp chosen
		            	 double curr = 0.8089;
		             result=fromAmount*curr;
		             double resultDec =  Double.valueOf(decForm.format(result));
		             resultText.setText("  CONVERTED : "+resultDec +" £");
		             }
					}
		             
	             if (currenciesFR.getSelectedIndex()== 1)
					{
	            	 if (currenciesTO.getSelectedIndex()== 0)
						{
							//usd and euro chosen
	            		 double curr =  0.83256;	
		             result=fromAmount*curr;	
		             double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" €");

					    }
						if (currenciesTO.getSelectedIndex()== 1)
							{
							//usd and usd chosen, so balance is 1
							double curr = 1;	
			             	result=fromAmount*curr;
			             	double resultDec =  Double.valueOf(decForm.format(result));
			             	resultText.setText("  CONVERTED : "+resultDec +" $");
						    } 

			             if (currenciesTO.getSelectedIndex()== 2)
							{
			            	//usd and bam chosen
			            	 double curr = 1.532;
			                 result=fromAmount*curr;
			                 double resultDec =  Double.valueOf(decForm.format(result));
			             	 resultText.setText("  CONVERTED : "+resultDec+" KM");

							}
			             if (currenciesTO.getSelectedIndex()== 3)
							{
			            	//usd and hrk chosen
			            	double curr = 6.04;
			                result=fromAmount*curr;
				            double resultDec =  Double.valueOf(decForm.format(result));
			             	resultText.setText("  CONVERTED : "+resultDec +" HRK");

							}
			             if (currenciesTO.getSelectedIndex()== 4)
							{
			            	//usd and rsd chosen
			            	 double curr = 91.886;
			                 result=fromAmount*curr;
					         double resultDec =  Double.valueOf(decForm.format(result));
			             	resultText.setText("  CONVERTED : "+resultDec +" RSD");
							}
			             if (currenciesTO.getSelectedIndex()== 5)
							{
			            	//usd and gbp chosen
			            	double curr = 0.6468;
			                result=fromAmount*curr;
				            double resultDec =  Double.valueOf(decForm.format(result));
			             	resultText.setText("  CONVERTED : "+resultDec +" £");
							}
					}
			             
			        
			             
					

	             if (currenciesFR.getSelectedIndex()== 2)
					{
	            	 if (currenciesTO.getSelectedIndex()== 0)
						{
							//bam and euro chosen
	            		 float curr = (float) 0.51;	
	            		 result=fromAmount*curr;
	            		 double resultDec =  Double.valueOf(decForm.format(result));

		             	resultText.setText("  CONVERTED : "+resultDec+" €");
							}
					if (currenciesTO.getSelectedIndex()== 1)
							{
							//bam and usd chosen
							double curr = 0.65;	
			                result=fromAmount*curr;
			                double resultDec =  Double.valueOf(decForm.format(result));

			             	resultText.setText("  CONVERTED : "+resultDec+" $");
						    }

						if (currenciesTO.getSelectedIndex()== 2)
							{
			            	//bam and bam chosen
			            	 double curr =  1;
			            	 result=fromAmount*curr;
			            	 double resultDec =  Double.valueOf(decForm.format(result));
			             	resultText.setText("  CONVERTED : "+resultDec+" KM");
							} 
			             if (currenciesTO.getSelectedIndex()== 3)
							{
			            	//bam and hrk chosen
			            	 double curr = 3.85;
			             result=fromAmount*curr;
		            	 double resultDec =  Double.valueOf(decForm.format(result));
			             resultText.setText("  CONVERTED : "+resultDec +" HRK");

							}
			             
					if (currenciesTO.getSelectedIndex()== 4)
							{
			            	//bam and rsd chosen
			            	 double curr = 50;
			             result=fromAmount*curr;
		            	 double resultDec =  Double.valueOf(decForm.format(result));
			             	resultText.setText("  CONVERTED : "+resultDec +" RSD");
							}
							if (currenciesTO.getSelectedIndex()== 5)
							{
			            	//bam and gbp chosen
			            	 double curr = 0.42;
			             result=fromAmount*curr;
		            	 double resultDec =  Double.valueOf(decForm.format(result));
			             	resultText.setText("  CONVERTED : "+resultDec +" £");
							}
						}
			             
	             if (currenciesFR.getSelectedIndex()==3)
		            {
		            	if (currenciesTO.getSelectedIndex()== 0)
						{
		            	//hrk and euro chosen
		            	 double curr = 0.1324;
		             result=fromAmount*curr;
	            	 double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" €");
						}
		            	if (currenciesTO.getSelectedIndex()== 1)
						{
		            	//hrk and usd chosen
		            	 double curr = 0.1655;
		             result=fromAmount*curr;
	            	 double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" $");
						}
		            	if (currenciesTO.getSelectedIndex()== 2)
						{
		            	//hrk and bam chosen
		            	 double curr = 0.24;
		             result=fromAmount*curr;
	            	 double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" KM");
						}
		            	if (currenciesTO.getSelectedIndex()== 3)
						{
		            	//hrk and hrk chosen
		            	 double curr = 1;
		             result=fromAmount*curr;
	            	 double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" HRK");
						}
		            	if (currenciesTO.getSelectedIndex()== 4)
						{
		            	//hrk and rsd chosen
		            	 double curr = 15.21;
		             result=fromAmount*curr;
	            	 double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" RSD");
						}
		            	if (currenciesTO.getSelectedIndex()== 5)
						{
		            	//hrk and gbp chosen
		            	 double curr = 0.1070;
		             result=fromAmount*curr;
	            	 double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" £");
						}
		            }

		            if(currenciesFR.getSelectedIndex()==4)
		            {
		            	if (currenciesTO.getSelectedIndex()== 0)
						{
		            	//rsd and euro chosen
		            	 double curr = 0.008;
		             result=fromAmount*curr;
	            	 double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" €");
						}
		            	if (currenciesTO.getSelectedIndex()== 1)
						{
		            	//rsd and usd chosen
		            	 double curr = 0.0106;
		             result=fromAmount*curr;
	            	 double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" $");
						}
		            	if (currenciesTO.getSelectedIndex()== 2)
						{
		            	//rsd and bam chosen
		            	 double curr = 0.02;
		             result=fromAmount*curr;
	            	 double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" KM");
						}
		            	if (currenciesTO.getSelectedIndex()== 3)
						{
		            	//rsd and hrk chosen
		            	 double curr = 0.0636;
		             result=fromAmount*curr;
	            	 double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" HRK");
						}
		            	if (currenciesTO.getSelectedIndex()== 4)
						{
		            	//rsd and rsd chosen
		            	 double curr = 1;
		             result=fromAmount*curr;
	            	 double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" RSD");
						}
		            	if (currenciesTO.getSelectedIndex()== 5)
						{
		            	//rsd and gbp chosen
		            	 double curr = 0.0068;
		             result=fromAmount*curr;
	            	 double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" £");
						}


		            }
		            if(currenciesFR.getSelectedIndex()==5)
		            {
		            	if (currenciesTO.getSelectedIndex()== 0)
						{
		            	//gbp and eur chosen
		            	 double curr = 1.24;
		             result=fromAmount*curr;
	            	 double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" €");
						}
		            	if (currenciesTO.getSelectedIndex()== 1)
						{
		            	//gbp and usd chosen
		            	 double curr = 1.55;
		             result=fromAmount*curr;
	            	 double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" $");
						}
		            	if (currenciesTO.getSelectedIndex()== 2)
						{
		            	//gbp and bam chosen
		            	 double curr = 2.4;
		             result=fromAmount*curr;
	            	 double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" KM");
						}
		            	if (currenciesTO.getSelectedIndex()== 3)
						{
		            	//gbp and hrk chosen
		            	 double curr = 9.338;
		             result=fromAmount*curr;
	            	 double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" HRK");
						}
		            	if (currenciesTO.getSelectedIndex()== 4)
						{
		            	//gbp and rsd chosen
		            	 double curr = 142.04;
		             result=fromAmount*curr;
	            	 double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" RSD");
						}
		            	if (currenciesTO.getSelectedIndex()== 5)
						{
		            	//gbp and gbp chosen
		            	 double curr = 1;
		             result=fromAmount*curr;
	            	 double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" £");
						}
			             
			             
			             
			             
			             
			             
			             
	                	}


				}

					});

				}}
				 );}


	  /**
     * @author Harun Djulic
     * JavaSE-1.6 
     * @param okvirC   defines the frame, title, size and location of a frame (same for other Calculation methods in this class).
     * @param panelC   defines the panel, and the color of the panel
     * @param tempFR  the list for "from" values (same for other Calculation methods in this class).
     * @param tempTO  the list for "to" values (same for other Calculation methods in this class).
     
     * */
	
	
	
	
	
	
	
	
	public void CalculationTemp()
	{


			calcPanel();
			// EVERY METHOD NEEDS TO SPECIFY THE okvirC size and bounds ! 
			/* >>>> */ okvirC.setSize(500,310);
			/* >>>> */ okvirC.setLocation(600, 180);
			panelC.setBackground(Color.ORANGE);
            okvirC.setTitle("temperature");



			 String[] tempFrom = {"Celsius","Fahrenheit","Kelvin"};
			 final JList tempFR = new JList(tempFrom);    
			 String[] temperTO = {"Celsius","Fahrenheit","Kelvin"};
			 final JList tempTO = new JList(temperTO); 



			 tempFR.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			 tempFR.setFont(new Font("Century Gothic", 1, 19));
			 tempFR.setForeground(Color.white);
			 tempFR.setBackground(Color.ORANGE);
			 panelC.add(tempFR);
			 tempFR.setBounds(200, 50, 100, 180);


			 tempTO.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			 panelC.add(tempTO);
			 tempTO.setFont(new Font("Century Gothic", 1, 19));
			 tempTO.setForeground(Color.white);
			 tempTO.setBackground(Color.ORANGE);
			 tempTO.setBounds(330, 50, 100, 180);
     
	
	    


	     tempFR.addListSelectionListener(new ListSelectionListener()
		 {
				public void valueChanged(ListSelectionEvent fr)
				{

					tempTO.addListSelectionListener(new ListSelectionListener()
					{


						public void valueChanged(ListSelectionEvent to)
							{													
							JTextArea resultText = new JTextArea();
							   resultText.setText("  CONVERTED : ");
							   resultText.setFont(new Font("Century Gothic", 1, 22));
							   resultText.setForeground(Color.white);
							   resultText.setBackground(Color.ORANGE);
							   panelC.add(resultText);
							   final String value = input.getText();
								final double fromAmount = Double.parseDouble(value);
								double result=0;
								resultText.setBounds(7, 240, 35000, 30);

							   final String rounder = round.getText();
								final double raunder2 = Double.parseDouble(rounder);
								String roundio = null;
								if (raunder2==0)
								{
									roundio="#.######";
								}
								else if (raunder2==1)
								{
									roundio="#.#";
								}
								else if (raunder2==2)
								{
									roundio="#.##";
								}
								else if (raunder2==3)
								{
									roundio="#.###";
								}
								else if (raunder2==4)
								{
									roundio="#.####";
								}
								else if (raunder2==5)
								{
									roundio="#.#####";
								}
								 else {
									roundio="#.######";
								}
								DecimalFormat decForm = new DecimalFormat(roundio);

				if (tempFR.getSelectedIndex() == 0)
					{ 

					if (tempTO.getSelectedIndex()== 0)
					{
						//C and C, so balance is 1
						double temp = 1;	
	             	result=fromAmount*temp;
	             	double resultDec =  Double.valueOf(decForm.format(result));
	             	resultText.setText("  CONVERTED : "+resultDec +" °C");
				    }
					if (tempTO.getSelectedIndex()== 1)
						{
						//C and F : Multiply by 9, then divide by 5, then add 32
						double temp = 9;	
		             	result=((fromAmount*temp)/5) + 32;
		             	double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" °F");
					    }

		             if (tempTO.getSelectedIndex()== 2)
						{
		            	//C and K
		            	 double temp = 273;	
			             result=fromAmount + temp;
			             	double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" K");

		                	}
					}

	             if (tempFR.getSelectedIndex()== 1)
					{
	            	 if (tempTO.getSelectedIndex()== 0)
						{
							//F and C chosen : Deduct 32, then multiply by 5, then divide by 9
	            		 	
		             result=((fromAmount-32)*5)/9;
		             	double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" °C");

					    }
						if (tempTO.getSelectedIndex()== 1)
							{
							//F and F chosen, so balance is 1
							float temp = 1;	
			             	result=fromAmount*temp;
			             	double resultDec =  Double.valueOf(decForm.format(result));
			             	resultText.setText("  CONVERTED : "+resultDec +" °F");
						    } 

			             if (tempTO.getSelectedIndex()== 2)
							{
			            	//F and K chosen : (5/9 * (fromAmount - 32) + 273 )
			            	 double temp = 0.55555;
			            result= ((fromAmount - 32)*temp) + 273;
		             	double resultDec =  Double.valueOf(decForm.format(result));
			             	resultText.setText("  CONVERTED : "+resultDec+" K");

				    }
					}

	             if (tempFR.getSelectedIndex()== 2)
					{
	            	 if (tempTO.getSelectedIndex()== 0)
						{
							//K and C chosen
	            		 float temp = 273;	
		          result=fromAmount-temp;
	             	double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec+" °C");
					    }
						if (tempTO.getSelectedIndex()== 1)
							{
							//K and F chosen >((Kelvin - 273) * 1.8 ) + 32;
							double temp = 1.8;	
			                 result=((fromAmount - 273)*temp ) + 32;
				             	double resultDec =  Double.valueOf(decForm.format(result));
			             	resultText.setText("  CONVERTED : "+resultDec+" °F");
						    }

			             if (tempTO.getSelectedIndex()== 2)
							{
			            	//K and K chosen
			            	 double temp =  1;
			       result=fromAmount*temp;
	             	double resultDec =  Double.valueOf(decForm.format(result));
			             	resultText.setText("  CONVERTED : "+resultDec+" K");
					} 

	                	}


				}

					});

				}}
				 );}
	
	
	
	

	  /**
     * @author Vedad Causevic 
     * JavaSE-1.6 
     * @param okvirC   defines the frame, title, size and location of a frame (same for other Calculation methods in this class).
     * @param panelC   defines the panel, and the color of the panel
     * @param powFR  the list for "from" values (same for other Calculation methods in this class).
     * @param powTO  the list for "to" values (same for other Calculation methods in this class).
     
     * */
	public void CalculationPower()
	{


			calcPanel();
			// EVERY METHOD NEEDS TO SPECIFY THE okvirC size and bounds ! 
			/* >>>> */ okvirC.setSize(500,310);
			/* >>>> */ okvirC.setLocation(600, 180);
			panelC.setBackground(Color.blue);
			okvirC.setTitle("power");


			 String[] powFrom = {"HP","kW","kVA"};
			 final JList powFR = new JList(powFrom);    
			 String[] powerTO = {"HP","kW","kVA"};
			 final JList powTO = new JList(powerTO); 



			 powFR.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			 powFR.setFont(new Font("Century Gothic", 1, 19));
			 powFR.setForeground(Color.white);
			 powFR.setBackground(Color.blue);
			 panelC.add(powFR);
			 powFR.setBounds(200, 50, 100, 180);


			 powTO.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			 panelC.add(powTO);
			 powTO.setFont(new Font("Century Gothic", 1, 19));
			 powTO.setForeground(Color.white);
			 powTO.setBackground(Color.blue);
			 powTO.setBounds(330, 50, 100, 180);
     
			 final JTextField input = new JTextField();
			 panelC.add(input);
			 input.setBounds(20, 60, 120, 30);
			 input.setFont(new Font("Century Gothic", 1, 17));
			 input.setText("1");




	    


	     powFR.addListSelectionListener(new ListSelectionListener()
		 {
				public void valueChanged(ListSelectionEvent fr)
				{

					powTO.addListSelectionListener(new ListSelectionListener()
					{


						public void valueChanged(ListSelectionEvent to)
							{													
							JTextArea resultText = new JTextArea();
							   resultText.setText("  CONVERTED : ");
							   resultText.setFont(new Font("Century Gothic", 1, 22));
							   resultText.setForeground(Color.white);
							   resultText.setBackground(Color.blue);
							   panelC.add(resultText);
							   final String value = input.getText();
								final double fromAmount = Double.parseDouble(value);
								double result=0;
								resultText.setBounds(7, 240, 35000, 30);
							   final String rounder = round.getText();
								final double raunder2 = Double.parseDouble(rounder);
								String roundio = null;
								if (raunder2==0)
								{
									roundio="#.######";
								}
								else if (raunder2==1)
								{
									roundio="#.#";
								}
								else if (raunder2==2)
								{
									roundio="#.##";
								}
								else if (raunder2==3)
								{
									roundio="#.###";
								}
								else if (raunder2==4)
								{
									roundio="#.####";
								}
								else if (raunder2==5)
								{
									roundio="#.#####";
								}
								 else {
									roundio="#.######";
								}
								DecimalFormat decForm = new DecimalFormat(roundio);



				if (powFR.getSelectedIndex() == 0)
					{ 

					if (powTO.getSelectedIndex()== 0)
					{
						//HP and HP  so balance is 1
						double power = 1;	
	             	result=fromAmount*power;
	             	double resultDec =  Double.valueOf(decForm.format(result));

	             	resultText.setText("  CONVERTED : "+resultDec +" HP");
				    }
					if (powTO.getSelectedIndex()== 1)
						{
						//HP and kW
						double power = 0.735 ;	
		             	result=fromAmount*power;
		             	double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" kW");
					    }

		             if (powTO.getSelectedIndex()== 2)
						{
		            	//HP and kVA> can't be done
		                resultText.setFont(new Font("Century Gothic", 1, 18));
		             	resultText.setText(" this conversion can't be done");

		                	}
					}

	             if (powFR.getSelectedIndex()== 1)
					{
	            	 if (powTO.getSelectedIndex()== 0)
						{
							//kW and HP chosen 
	            		 double power = 1.360 ;	
		             result=fromAmount*power;	
		             double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" HP");

					    }
						if (powTO.getSelectedIndex()== 1)
							{
							//kW and kW
							float power = 1;	
			             	result=fromAmount*power;
			             	double resultDec =  Double.valueOf(decForm.format(result));
			             	resultText.setText("  CONVERTED : "+resultDec +" kW");
						    } 

			             if (powTO.getSelectedIndex()== 2)
							{
			            	//kW and kVA
			            	 double power = 1.25;
			            result=fromAmount*power;
			            double resultDec =  Double.valueOf(decForm.format(result));
			             	resultText.setText("  CONVERTED : "+resultDec+" K");

				    }
					}

	             if (powFR.getSelectedIndex()== 2)
					{
	            	 if (powTO.getSelectedIndex()== 0)
						{
							//kVA and HP chosen> not possible
	            		 
	            		 resultText.setFont(new Font("Century Gothic", 1, 18));
			             resultText.setText(" this conversion can't be done");

					    }
						if (powTO.getSelectedIndex()== 1)
							{
							//kVA and kW
							double power = 0.8;	
			                 result=fromAmount*power;
			                 double resultDec =  Double.valueOf(decForm.format(result));
			             	resultText.setText("  CONVERTED : "+resultDec+" kW");
						    }

			             if (powTO.getSelectedIndex()== 2)
							{
			            	//kVA and kVA chosen
			            	 double power =  1;
			       result=fromAmount*power;
			       double resultDec =  Double.valueOf(decForm.format(result));
			             	resultText.setText("  CONVERTED : "+resultDec+" kVA");
					} 

	                	}


				}

					});

				}}
				 );}
	
	

	  /**
   * @author Harun Djulic
   * JavaSE-1.6 
   * @param okvirC   defines the frame, title, size and location of a frame (same for other Calculation methods in this class).
   * @param panelC   defines the panel, and the color of the panel
   * @param areaFR  the list for "from" values (same for other Calculation methods in this class).
   * @param areTO  the list for "to" values (same for other Calculation methods in this class).
   
   * */
	
	
	public void CalculationArea()
	{


			calcPanel();
			// EVERY METHOD NEEDS TO SPECIFY THE okvirC size and bounds ! 
			/* >>>> */ okvirC.setSize(500,310);
			/* >>>> */ okvirC.setLocation(600, 180);
			panelC.setBackground(Color.LIGHT_GRAY);
			okvirC.setTitle("area");


			 String[] areaFrom = {"m²","cm²","ft²"};
			 final JList areaFR = new JList(areaFrom);    
			 String[] areaTO = {"m²","cm²","ft²"};
			 final JList areTO = new JList(areaTO); 



			 areaFR.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			 areaFR.setFont(new Font("Century Gothic", 1, 19));
			 areaFR.setForeground(Color.white);
			 areaFR.setBackground(Color.LIGHT_GRAY);
			 panelC.add(areaFR);
			 areaFR.setBounds(200, 50, 100, 180);


			 areTO.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			 panelC.add(areTO);
			 areTO.setFont(new Font("Century Gothic", 1, 19));
			 areTO.setForeground(Color.white);
			 areTO.setBackground(Color.LIGHT_GRAY);
			 areTO.setBounds(330, 50, 100, 180);
    
	    


			 areaFR.addListSelectionListener(new ListSelectionListener()
		 {
				public void valueChanged(ListSelectionEvent fr)
				{

					areTO.addListSelectionListener(new ListSelectionListener()
					{


						public void valueChanged(ListSelectionEvent to)
							{													
							JTextArea resultText = new JTextArea();
							   resultText.setText("  CONVERTED : ");
							   resultText.setFont(new Font("Century Gothic", 1, 22));
							   resultText.setForeground(Color.white);
							   resultText.setBackground(Color.LIGHT_GRAY);
							   panelC.add(resultText);
							   final String value = input.getText();
								final double fromAmount = Double.parseDouble(value);
								double result=0;
								resultText.setBounds(7, 240, 35000, 30);
                               
							   final String rounder = round.getText();
								final double raunder2 = Double.parseDouble(rounder);
								String roundio = null;
								if (raunder2==0)
								{
									roundio="#.######";
								}
								else if (raunder2==1)
								{
									roundio="#.#";
								}
								else if (raunder2==2)
								{
									roundio="#.##";
								}
								else if (raunder2==3)
								{
									roundio="#.###";
								}
								else if (raunder2==4)
								{
									roundio="#.####";
								}
								else if (raunder2==5)
								{
									roundio="#.#####";
								}
								 else {
									roundio="#.######";
								}
								DecimalFormat decForm = new DecimalFormat(roundio);

							   
				if (areaFR.getSelectedIndex() == 0)
					{ 

					if (areTO.getSelectedIndex()== 0)
					{
						//m² and m²  so balance is 1
						double area = 1;	
	             	result=fromAmount*area;
	             	double resultDec =  Double.valueOf(decForm.format(result));
	             	resultText.setText("  CONVERTED : "+resultDec +" m²");
				    }
					if (areTO.getSelectedIndex()== 1)
						{
						//meters and centimeters chosen
						double area = 10000 ;	
		             	result=fromAmount*area;
		             	double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" cm²");
					    }

		             if (areTO.getSelectedIndex()== 2)
						{
		            	//m  and f 
		            	 double area = 10.76391 ;	
			             result=fromAmount*area;
			             double resultDec =  Double.valueOf(decForm.format(result));
		                resultText.setText("  CONVERTED : "+resultDec +" ft²");

		                	}
					}

	             if (areaFR.getSelectedIndex()== 1)
					{
	            	 if (areTO.getSelectedIndex()== 0)
						{
							//cm and m
	            		 double area = 0.0001 ;	
		             result=fromAmount*area;
		             double resultDec =  Double.valueOf(decForm.format(result));
		             	resultText.setText("  CONVERTED : "+resultDec +" m²");

					    }
						if (areTO.getSelectedIndex()== 1)
							{
							//cm and cm
							float area = 1;	
			             	result=fromAmount*area;
			             	double resultDec =  Double.valueOf(decForm.format(result));
			             	resultText.setText("  CONVERTED : "+resultDec +" cm²");
						    } 

			             if (areTO.getSelectedIndex()== 2)
							{
			            	//cm and ft 
			            	 double area = 0.00107;
			            result=fromAmount*area;
			            double resultDec =  Double.valueOf(decForm.format(result));
			             	resultText.setText("  CONVERTED : "+resultDec+" ft²");

				    }
					}

	             if (areaFR.getSelectedIndex()== 2)
					{
	            	 if (areTO.getSelectedIndex()== 0)
						{
	            		// ft and meter chosen
		            	 double area = 0.09290 ;	
			             result=fromAmount*area;
			             double resultDec =  Double.valueOf(decForm.format(result));
		                resultText.setText("  CONVERTED : "+resultDec +" m²");

					    }
						if (areTO.getSelectedIndex()== 1)
							{
							//ft and cm
							double area = 929.03040;	
			                 result=fromAmount*area;
			                 double resultDec =  Double.valueOf(decForm.format(result));
			             	resultText.setText("  CONVERTED : "+resultDec+" cm²");
						    }

			             if (areTO.getSelectedIndex()== 2)
							{
			            	 // ft and ft chosen
			            	 double area = 1 ;	
				             result=fromAmount*area;
				             double resultDec =  Double.valueOf(decForm.format(result));
			                resultText.setText("  CONVERTED : "+resultDec +" ft²");
					} 

	                	}


				}

					});

				}}
				 );}
	
	
	
/**
 * @author Amar Svraka 
 * JavaSE-1.6 
 * @param okvirC   defines the frame, title, size and location of a frame (same for other Calculation methods in this class).
 * @param panelC   defines the panel, and the color of the panel
 * @param weightsFR  the list for "from" values (same for other Calculation methods in this class).
 * @param weightsTO  the list for "to" values (same for other Calculation methods in this class).
 
 * */	
	
	

	public void CalculationWeight()

	{
	calcPanel();
	okvirC.setSize(500,310);
	okvirC.setLocation(600, 180);
	panelC.setBackground(Color.GRAY);
	okvirC.setTitle("weight");




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
	resultText.setBounds(7, 240, 35000, 30);
	
	final String value = input.getText();
	final double fromAmount = Double.parseDouble(value);
	double result=0;
	
	 final String rounder = round.getText();
		final double raunder2 = Double.parseDouble(rounder);
		String roundio = null;
		if (raunder2==0)
		{
			roundio="#.######";
		}
		else if (raunder2==1)
		{
			roundio="#.#";
		}
		else if (raunder2==2)
		{
			roundio="#.##";
		}
		else if (raunder2==3)
		{
			roundio="#.###";
		}
		else if (raunder2==4)
		{
			roundio="#.####";
		}
		else if (raunder2==5)
		{
			roundio="#.#####";
		}
		
		 else {
			roundio="#.######";
		}
		DecimalFormat decForm = new DecimalFormat(roundio);

	if (weightsFR.getSelectedIndex() == 0) 	{

	if (weightsTO.getSelectedIndex()== 0)
	{
	//kg and kg are chosen, so balance is 1
	double val = 1;
	result=fromAmount*val;
	double resultDec =  Double.valueOf(decForm.format(result));
	resultText.setText(" CONVERTED : "+resultDec +" kg");
	}
	if (weightsTO.getSelectedIndex()== 1)
	{
	//kg and g chosen
	double val = 1000;
	result=fromAmount*val;
	double resultDec =  Double.valueOf(decForm.format(result));
	resultText.setText(" CONVERTED : "+resultDec +" g");
	}


	if (weightsTO.getSelectedIndex()== 2)
	{
	//kg and tonne chosen
	double val = 0.001;
	result=fromAmount*val;
	double resultDec =  Double.valueOf(decForm.format(result));
	resultText.setText(" CONVERTED : "+resultDec +" t");

	}
	if (weightsTO.getSelectedIndex()==3)
	{
	//kg and ounces chosen
	double val=35.2739;
	result = fromAmount*val;
	double resultDec =  Double.valueOf(decForm.format(result));
	resultText.setText("CONVERTED: "+resultDec+" oz");
	}

	if(weightsTO.getSelectedIndex()==4)
	{
		//kg and stones chosen
		double val=0.15747;
		result = fromAmount*val;
		double resultDec =  Double.valueOf(decForm.format(result));
		resultText.setText("CONVERTED : "+resultDec+" st");
	}

	}

	if (weightsFR.getSelectedIndex() == 1) 	{

		if (weightsTO.getSelectedIndex()== 0)
		{
		//g and kg chosen
		double val = 0.001;
		result=fromAmount*val;
		double resultDec =  Double.valueOf(decForm.format(result));
		resultText.setText(" CONVERTED : "+resultDec +" kg");
		}
		if (weightsTO.getSelectedIndex()== 1)
		{
		//g and g chosen
		double val = 1;
		result=fromAmount*val;
		double resultDec =  Double.valueOf(decForm.format(result));
		resultText.setText(" CONVERTED : "+resultDec +" g");
		}


		if (weightsTO.getSelectedIndex()== 2)
		{
		//g and tonne chosen
		double val = 0.000001;
		result=fromAmount*val;
		double resultDec =  Double.valueOf(decForm.format(result));
		resultText.setText(" CONVERTED : "+resultDec +" t");

		}
		if (weightsTO.getSelectedIndex()==3)
		{
		//g and ounces chosen
		double val=0.0352739;
		result = fromAmount*val;
		double resultDec =  Double.valueOf(decForm.format(result));
		resultText.setText("CONVERTED : "+resultDec+" oz");
		}

		if(weightsTO.getSelectedIndex()==4)
		{
			//g and stones chosen
			double val=0.00015747;
			result = fromAmount*val;
			double resultDec =  Double.valueOf(decForm.format(result));
			resultText.setText("CONVERTED : "+resultDec+" st");
 		}

		}
	if (weightsFR.getSelectedIndex() == 2) 	{

		if (weightsTO.getSelectedIndex()== 0)
		{
		//tonne and kg chosen
		double val = 1000;
		result=fromAmount*val;
		double resultDec =  Double.valueOf(decForm.format(result));
		resultText.setText(" CONVERTED : "+resultDec +" kg");
		}
		if (weightsTO.getSelectedIndex()== 1)
		{
		//tonne and g chosen
		double val = 1000000;
		result=fromAmount*val;
		double resultDec =  Double.valueOf(decForm.format(result));
		resultText.setText(" CONVERTED : "+resultDec +" g");
		}


		if (weightsTO.getSelectedIndex()== 2)
		{
		//tonne and tonne chosen
		double val = 1;
		result=fromAmount*val;
		double resultDec =  Double.valueOf(decForm.format(result));
		resultText.setText(" CONVERTED : "+resultDec +" t");

		}
		if (weightsTO.getSelectedIndex()==3)
		{
		//tonne and ounces chosen
		double val=35273.9;
		result = fromAmount*val;
		double resultDec =  Double.valueOf(decForm.format(result));
		resultText.setText("CONVERTED : "+resultDec+" oz");
		}

		if(weightsTO.getSelectedIndex()==4)
		{
			//kg and stones chosen
			double val=157.47;
			result = fromAmount*val;
			double resultDec =  Double.valueOf(decForm.format(result));
			resultText.setText("CONVERTED : "+resultDec+" st");
		}

		}
	if (weightsFR.getSelectedIndex() == 3) 	{

		if (weightsTO.getSelectedIndex()== 0)
		{
		//ounces and kg are chosen
		double val = 0.02834;
		result=fromAmount*val;
		double resultDec =  Double.valueOf(decForm.format(result));
		resultText.setText(" CONVERTED : "+resultDec +" kg");
		}
		if (weightsTO.getSelectedIndex()== 1)
		{
		//ounces and g chosen
		double val = 0.0352739;
		result=fromAmount*val;
		double resultDec =  Double.valueOf(decForm.format(result));
		resultText.setText(" CONVERTED : "+resultDec +" g");
		}


		if (weightsTO.getSelectedIndex()== 2)
		{
		//ounces and tonne chosen
		double val = 0.0000283;
		result=fromAmount*val;
		double resultDec =  Double.valueOf(decForm.format(result));
		resultText.setText(" CONVERTED : "+resultDec +" t");

		}
		if (weightsTO.getSelectedIndex()==3)
		{
		//ounces and ounces chosen
		double val=1;
		result = fromAmount*val;
		double resultDec =  Double.valueOf(decForm.format(result));
		resultText.setText("CONVERTED : "+resultDec+" oz");
		}

		if(weightsTO.getSelectedIndex()==4)
		{
			//kg and stones chosen
			double val=0.0044642;
			result = fromAmount*val;
			double resultDec =  Double.valueOf(decForm.format(result));
			resultText.setText("CONVERTED : "+resultDec+" st");
		}

		}

	if (weightsFR.getSelectedIndex() == 4) 	{

		if (weightsTO.getSelectedIndex()== 0)
		{
		//stones and kg chosen
		double val = 6.3504;
		result=fromAmount*val;
		double resultDec =  Double.valueOf(decForm.format(result));
		resultText.setText(" CONVERTED : "+resultDec +" kg");
		}
		if (weightsTO.getSelectedIndex()== 1)
		{
		//stones and g chosen
		double val = 6350.4159;
		result=fromAmount*val;
		double resultDec =  Double.valueOf(decForm.format(result));
		resultText.setText(" CONVERTED : "+resultDec +" g");
		}


		if (weightsTO.getSelectedIndex()== 2)
		{
		//ounces and tonne chosen
		double val = 0.0063504;
		result=fromAmount*val;
		double resultDec =  Double.valueOf(decForm.format(result));
		resultText.setText(" CONVERTED : "+resultDec +" t");

		}
		if (weightsTO.getSelectedIndex()==3)
		{
		//stones and ounces chosen
		double val=224.00393;
		result = fromAmount*val;
		double resultDec =  Double.valueOf(decForm.format(result));
		resultText.setText("CONVERTED : "+resultDec+" oz");
		}

		if(weightsTO.getSelectedIndex()==4)
		{
			//stones and stones chosen
			double val=1;
			result = fromAmount*val;
			double resultDec =  Double.valueOf(decForm.format(result));
			resultText.setText("CONVERTED : "+resultDec+" st");

		}

		}

	}

	});
	}}
	);}
	
	
	/**
	 * @author Amar Svraka 
	 * JavaSE-1.6 
	 * @param okvirC   defines the frame, title, size and location of a frame (same for other Calculation methods in this class).
	 * @param panelC   defines the panel, and the color of the panel
	 * @param lengthsFR  the list for "from" values (same for other Calculation methods in this class).
	 * @param lengthsTO  the list for "to" values (same for other Calculation methods in this class).
	 
	 * */
	
	

	public void CalculationLength()

	{
		calcPanel();
		okvirC.setSize(500,310);
		okvirC.setLocation(600, 180);
		panelC.setBackground(Color.CYAN);
        okvirC.setTitle("length");

		 String[] lengthFrom = {"m","km","cm","inch","mile"};
		 final JList lengthsFR = new JList(lengthFrom);    
		 String[] lengthTO = {"m","km","cm","inch","mile"};
		 final JList lengthsTO = new JList(lengthFrom); 

		 lengthsFR.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		 lengthsFR.setFont(new Font("Century Gothic", 1, 19));
		 lengthsFR.setForeground(Color.white);
		 lengthsFR.setBackground(Color.CYAN);
		 panelC.add(lengthsFR);
		 lengthsFR.setBounds(200, 50, 100, 180);

		 lengthsTO.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		 panelC.add(lengthsTO);
		 lengthsTO.setFont(new Font("Century Gothic", 1, 19));
		 lengthsTO.setForeground(Color.white);
		 lengthsTO.setBackground(Color.CYAN);
		 lengthsTO.setBounds(330, 50, 100, 180);

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
							   resultText.setBackground(Color.CYAN);
							   panelC.add(resultText);
							   final String value = input.getText();
								final double fromAmount = Double.parseDouble(value);
								double result=0;
							   resultText.setBounds(7, 240, 35000, 30);
							   
							
								final String rounder = round.getText();
								final double raunder2 = Double.parseDouble(rounder);
								String roundio = null;
								
								if (raunder2==0)
								{
									roundio="#.######";
								}
								else if (raunder2==1)
								{
									roundio="#.#";
								}
								else if (raunder2==2)
								{
									roundio="#.##";
								}
								else if (raunder2==3)
								{
									roundio="#.###";
								}
								else if (raunder2==4)
								{
									roundio="#.####";
								}
								else if (raunder2==5)
								{
									roundio="#.#####";
								}
								
								 else {
									roundio="#.######";
								}
								DecimalFormat decForm = new DecimalFormat(roundio);
								if (lengthsFR.getSelectedIndex() == 0) 
								{ 

								     if (lengthsTO.getSelectedIndex()== 0)
								     {
									//m and m are chosen, so balance is 1
								   double val = 1;	
				             	   result=fromAmount*val;
				             	  double resultDec =  Double.valueOf(decForm.format(result));
				             	   resultText.setText("  CONVERTED : "+resultDec +" m");
							       }
								if (lengthsTO.getSelectedIndex()== 1)
									{
									//m and km chosen
									double val = 0.001;	
					             	result=fromAmount*val;
									double resultDec =  Double.valueOf(decForm.format(result));
					             	resultText.setText("  CONVERTED : "+resultDec +" km");
								    }


								if (lengthsTO.getSelectedIndex()== 2)
								{
				            	//m and cm chosen
				            	 double val = 100;
				             	result=fromAmount*val;
								double resultDec =  Double.valueOf(decForm.format(result));
				             	resultText.setText("  CONVERTED : "+resultDec +" cm");

				                	}
			            	 if (lengthsTO.getSelectedIndex()==3)
			            	 {
			            	 //m and inch chosen 	 
			            	 double val=39.37;
						     result = fromAmount*val;
							double resultDec =  Double.valueOf(decForm.format(result));
						     resultText.setText("CONVERTED: "+resultDec+" inch");
			            	 } 
			            	 if (lengthsTO.getSelectedIndex()==4)
			            	 {
			            	 //m and mile chosen 	 
			            	 double val=0.0006;
						     result = fromAmount*val;	
						     double resultDec =  Double.valueOf(decForm.format(result));
						     resultText.setText("CONVERTED: "+resultDec+" miles");
			            	 } 
			            	 }
								
								
								
					if(lengthsFR.getSelectedIndex()==1)
					{

						if (lengthsTO.getSelectedIndex()==0)
		            	 {
		            	 //km and m chosen 	 
		            	 double val=1000;
					     result = fromAmount*val;
						 double resultDec =  Double.valueOf(decForm.format(result));
					     resultText.setText("CONVERTED: "+resultDec+" m");
		            	 } 
						if (lengthsTO.getSelectedIndex()==1)
		            	 {
		            	 //km and km chosen 	 
		            	 double val=1;
					     result = fromAmount*val;
						 double resultDec =  Double.valueOf(decForm.format(result));
					     resultText.setText("CONVERTED: "+resultDec+" km");
		            	 } 
						if (lengthsTO.getSelectedIndex()==2)
		            	 {
		            	 //km and cm chosen 	 
		            	 double val=100000;
					     result = fromAmount*val;
						 double resultDec =  Double.valueOf(decForm.format(result));
					     resultText.setText("CONVERTED: "+resultDec+" cm");
		            	 } 
						if (lengthsTO.getSelectedIndex()==3)
		            	 {
		            	 //km and inch chosen 	 
		            	 double val=39.370;
					     result = fromAmount*val;
						 double resultDec =  Double.valueOf(decForm.format(result));
					     resultText.setText("CONVERTED: "+resultDec+" inch");
		            	 } 
						if (lengthsTO.getSelectedIndex()==4)
		            	 {
		            	 //km and mile chosen 	 
		            	 double val= 0.621;
					     result = fromAmount*val;
						 double resultDec =  Double.valueOf(decForm.format(result));
					     resultText.setText("CONVERTED: "+resultDec+" miles");
		            	 } 
											}
				if(lengthsFR.getSelectedIndex()==2)
				{
					if (lengthsTO.getSelectedIndex()==0)
	            	 {
	            	 //cm and m chosen 	 
	            	 double val=0.01;
				     result = fromAmount*val;
					 double resultDec =  Double.valueOf(decForm.format(result));
				     resultText.setText("CONVERTED: "+resultDec+"m");
	            	 } 
					if (lengthsTO.getSelectedIndex()==1)
	            	 {
	            	 //cm and km chosen 	 
	            	 double val=0.00001;
				     result = fromAmount*val;
					 double resultDec =  Double.valueOf(decForm.format(result));
				     resultText.setText("CONVERTED: "+resultDec+" km");
	            	 } 
					if (lengthsTO.getSelectedIndex()==2)
	            	 {
	            	 //cm and cm chosen 	 
	            	 double val=1;
				     result = fromAmount*val;
					 double resultDec =  Double.valueOf(decForm.format(result));

				     resultText.setText("CONVERTED: "+resultDec+" cm");
	            	 } 
					if (lengthsTO.getSelectedIndex()==3)
	            	 {
	            	 //cm and inch chosen 	 
	            	 double val=0.3937;
				     result = fromAmount*val;
					 double resultDec =  Double.valueOf(decForm.format(result));
				     resultText.setText("CONVERTED: "+resultDec+" inch");
	            	 } 
					if (lengthsTO.getSelectedIndex()==4)
	            	 {
	            	 //cm and miles chosen 	 
	            	 double val=0.000006;
				     result = fromAmount*val;
					 double resultDec =  Double.valueOf(decForm.format(result));
				     resultText.setText("CONVERTED: "+resultDec+" miles");
	            	 } 

				}
			if (lengthsFR.getSelectedIndex()==3)
			{
				if (lengthsTO.getSelectedIndex()==0)
           	 {
           	 //inch and m chosen 	 
           	 double val=0.0254;
			 result = fromAmount*val;
		     double resultDec =  Double.valueOf(decForm.format(result));
   		     resultText.setText("CONVERTED: "+resultDec+"m");
           	 } 
				if (lengthsTO.getSelectedIndex()==1)
           	 {
           	 //inch and km chosen 	 
           	 double val=0.00002;
			 result = fromAmount*val;
			 double resultDec =  Double.valueOf(decForm.format(result));
			 resultText.setText("CONVERTED: "+resultDec+"km");
           	 } 
				
				if (lengthsTO.getSelectedIndex()==2)
	           	 {
	           	 //inch and cm chosen 	 
	           	 double val=2.54;
				 result = fromAmount*val;
				 double resultDec =  Double.valueOf(decForm.format(result));
				 resultText.setText("CONVERTED: "+resultDec+"cm");
	           	 }
				if (lengthsTO.getSelectedIndex()==3)
	           	 {
	           	 //inch and inch chosen 	 
	           	 double val=1;
				 result = fromAmount*val;
				 double resultDec =  Double.valueOf(decForm.format(result));
				 resultText.setText("CONVERTED: "+resultDec+"inch");
	           	 }
				if (lengthsTO.getSelectedIndex()==4)
	           	 {
	           	 //inch and mile chosen 	 
	           	 double val=0.00001;
				 result = fromAmount*val;
				 double resultDec =  Double.valueOf(decForm.format(result));
			     resultText.setText("CONVERTED: "+resultDec+"mile");
	           	 }

			}
			if(lengthsFR.getSelectedIndex()==4)
			{
				if (lengthsTO.getSelectedIndex()==0)
	           	 {
	           	 //mile and m chosen 	 
	           	 double val=1609;
				 result = fromAmount*val;
				 double resultDec =  Double.valueOf(decForm.format(result));
				 resultText.setText("CONVERTED: "+resultDec+"m");
	           	 }
				if (lengthsTO.getSelectedIndex()==1)
	           	 {
	           	 //mile and km chosen 	 
	           	 double val=1.609;
				 result = fromAmount*val;
			     double resultDec =  Double.valueOf(decForm.format(result));
			     resultText.setText("CONVERTED: "+resultDec+"km");
	           	 }
				if (lengthsTO.getSelectedIndex()==2)
	           	 {
	           	 //mile and cm chosen 	 
	           	 double val=160934;
				 result = fromAmount*val;
				 double resultDec =  Double.valueOf(decForm.format(result));
			     resultText.setText("CONVERTED: "+resultDec+"cm");
	           	 }
				if (lengthsTO.getSelectedIndex()==3)
	           	 {
	           	 //mile and inch chosen 	 
	           	 double val=63360;
				 result = fromAmount*val;
				 double resultDec =  Double.valueOf(decForm.format(result));
				 resultText.setText("CONVERTED: "+resultDec+"inch");
	           	 }
				if (lengthsTO.getSelectedIndex()==4)
	           	 {
	           	 //mile and mile chosen 	 
	           	 double val=1;
				 result = fromAmount*val;
				 double resultDec =  Double.valueOf(decForm.format(result));
				 resultText.setText("CONVERTED: "+resultDec+"mile");
	           	 }
			}
							}

					});
							}}
							 );}
	
	
	/**
	 * @author Amar Svraka 
	 * JavaSE-1.6 
	 * @param okvirC   defines the frame, title, size and location of a frame (same for other Calculation methods in this class).
	 * @param panelC   defines the panel, and the color of the panel
	 * @param volumesFR  the list for "from" values (same for other Calculation methods in this class).
	 * @param volumesTO  the list for "to" values (same for other Calculation methods in this class).
	 
	 * */
	
	
	
	
	public void CalculationVolume()
	{

		calcPanel();
		okvirC.setSize(500,310);
		okvirC.setLocation(600, 180);
		panelC.setBackground(Color.GRAY);
		
		String[] volumeFrom = {"m³","dm³","cm³"};
		final JList volumesFR = new JList(volumeFrom);
		String[] volumeTO = {"m³","dm³","cm³"};
		final JList volumesTO = new JList(volumeFrom);

		volumesFR.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		volumesFR.setFont(new Font("Century Gothic", 1, 19));
		volumesFR.setForeground(Color.white);
		volumesFR.setBackground(Color.GRAY);
		panelC.add(volumesFR);
		volumesFR.setBounds(200, 50, 100, 180);

		volumesTO.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		panelC.add(volumesTO);
		volumesTO.setFont(new Font("Century Gothic", 1, 19));
		volumesTO.setForeground(Color.white);
		volumesTO.setBackground(Color.GRAY);
		volumesTO.setBounds(330, 50, 100, 180);


		final JTextField input = new JTextField();
		 panelC.add(input);
		 input.setBounds(20, 60, 120, 30);
		 input.setFont(new Font("Century Gothic", 1, 17));

		input.setText("1");

		volumesFR.addListSelectionListener(new ListSelectionListener()
		{
		public void valueChanged(ListSelectionEvent fr)
		{
		volumesTO.addListSelectionListener(new ListSelectionListener()
		{


		public void valueChanged(ListSelectionEvent to)
		{
		JTextArea resultText = new JTextArea();
		resultText.setText(" CONVERTED : ");
		resultText.setFont(new Font("Century Gothic", 1, 22));
		resultText.setForeground(Color.white);
		resultText.setBackground(Color.GRAY);

		panelC.add(resultText);
		resultText.setBounds(15, 240, 35000, 30);
		final String value = input.getText();
		final double fromAmount = Double.parseDouble(value);
		double result=0;
		final String rounder = round.getText();
		final double raunder2 = Double.parseDouble(rounder);
		String roundio = null;
		if (raunder2==0)
		{
			roundio="#.######";
		}
		else if (raunder2==1)
		{
			roundio="#.#";
		}
		else if (raunder2==2)
		{
			roundio="#.##";
		}
		else if (raunder2==3)
		{
			roundio="#.###";
		}
		else if (raunder2==4)
		{
			roundio="#.####";
		}
		else if (raunder2==5)
		{
			roundio="#.#####";
		}
		
		 else {
			roundio="#.######";
		}
		DecimalFormat decForm = new DecimalFormat(roundio);
		
		
		if (volumesFR.getSelectedIndex() == 0) 	{

			if (volumesTO.getSelectedIndex()== 0)
			{
			//m3 and m3 chosen
			double val = 1;
			result=fromAmount*val;
			double resultDec =  Double.valueOf(decForm.format(result));
			resultText.setText("CONVERTED : "+resultDec +" m³");
			}
			if (volumesTO.getSelectedIndex()== 1)
			{
			//m3 and dm3 chosen
			double val = 1000;
			result=fromAmount*val;
			double resultDec =  Double.valueOf(decForm.format(result));
			resultText.setText("CONVERTED : "+resultDec +" dm³");
			}
			if (volumesTO.getSelectedIndex()== 2)
			{
			//m3 and cm3 chosen
			double val = 100000;
			result=fromAmount*val;
			double resultDec =  Double.valueOf(decForm.format(result));
			resultText.setText("CONVERTED : "+resultDec +" cm³");
			}
	}
		if(volumesFR.getSelectedIndex() == 1){

			if (volumesTO.getSelectedIndex()== 0)
			{
			//dm3 and m3 chosen
			double val = 0.001;
			result=fromAmount*val;
			double resultDec =  Double.valueOf(decForm.format(result));
			resultText.setText("CONVERTED : "+resultDec +" m³");
			}
			if (volumesTO.getSelectedIndex()== 1)
			{
			//dm3 and dm3 chosen
			double val = 1;
			result=fromAmount*val;
			double resultDec =  Double.valueOf(decForm.format(result));
			resultText.setText("CONVERTED : "+resultDec +" dm³");
			}
			if (volumesTO.getSelectedIndex()== 2)
			{
			//dm3 and cm3 chosen
			double val = 1000;
			result=fromAmount*val;
			double resultDec =  Double.valueOf(decForm.format(result));
			resultText.setText("CONVERTED : "+resultDec +" cm³");
			}

		}

		if(volumesFR.getSelectedIndex()==2){

			if (volumesTO.getSelectedIndex()== 0)
			{
			//cm3 and m3 chosen
			double val = 0.000001;
			result=fromAmount*val;
			double resultDec =  Double.valueOf(decForm.format(result));
			resultText.setText("CONVERTED : "+resultDec +" m³");
			}
			if (volumesTO.getSelectedIndex()== 1)
			{
			//cm3 and dm3 chosen
			double val = 0.001;
			result=fromAmount*val;
			double resultDec =  Double.valueOf(decForm.format(result));
			resultText.setText("CONVERTED : "+resultDec +" dm³");
			}
			if (volumesTO.getSelectedIndex()== 2)
			{
			//cm3 and cm3 chosen
			double val = 1;
			result=fromAmount*val;
			double resultDec =  Double.valueOf(decForm.format(result));
			resultText.setText("CONVERTED : "+resultDec +" cm³");
			}
		}

		}

		});
				}}
				 );}



	/**
	 * @author Harun Djulic
	 * JavaSE-1.6 
	 * @param okvirC   defines the frame, location of a frame, .
	 * @param panelC   defines the panel, adds input to the panel.
	 * @param input    the field in which to input the value to be converted.
	 * @param round    the field in which to input the value to which the result will be rounded.
	 * @param roundtip the textArea with few lines of text
	 * */





	public   void calcPanel()
	{
		okvirC.setLocation(650, 180);
		 panelC.add(input);
		 input.setBounds(20, 60, 120, 30);
		 input.setFont(new Font("Century Gothic", 1, 17));
		 input.setText("1");
		 
		
		 panelC.add(round);
		 round.setBounds(100, 95, 40, 27);
		 round.setFont(new Font("Century Gothic", 1, 17));
		 round.setText("0");
		
		
	     panelC.setLayout(null);

	     panel.setVisible(false);
	     okvir2.setVisible(false);


		 okvirC.add(panelC);

		 okvirC.setVisible(true);
		 okvirC.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
		 okvirC.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Harun\\Desktop\\PROJECT.TEST\\Images\\icons\\logoIconSmall.jpg"));
		 okvirC.setResizable(false);

		 JLabel value = new JLabel();
		 value.setText("How much:"); 
		 value.setFont(new Font("Century Gothic", 1, 17));	 
		 value.setForeground(Color.white);
		 panelC.add(value);
		 value.setBounds(20, 10, 100, 50);

		 JLabel rounder1 = new JLabel();
		 rounder1.setText("Round to"); 
		 rounder1.setFont(new Font("Century Gothic", 1, 17));	 
		 rounder1.setForeground(Color.white);
		 panelC.add(rounder1);
		 rounder1.setBounds(20, 83, 100, 50);

		 JTextArea roundtip = new JTextArea();
		 roundtip.setText("If You input any \nnumber equal or\ngreater than 6, \nor equal to zero,\nprecision will be\nset to 6."); 
		 roundtip.setFont(new Font("Century Gothic", 1, 13));	 
		 roundtip.setForeground(Color.black);
		 panelC.add(roundtip);
		 roundtip.setEditable(false);
		 roundtip.setBounds(20, 130, 120 , 100);
		 
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