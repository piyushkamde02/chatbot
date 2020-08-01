package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Bot extends JFrame {

	//typing area
	private JTextField txtEnter=new JTextField();
	//chat area
	private JTextArea txtChat=new JTextArea();
	//frame attributes
	public Bot(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,600);
		this.setVisible(true);
		this.setLayout(null);
		this.setResizable(false);
		this.setTitle("AI CHATBOT");
	
		//txtEnter Attributes
		txtEnter.setLocation(2,540);
		txtEnter.setSize(590,30);
		
		//txtChat attributes
		txtChat.setLocation(15,5);
		txtChat.setSize(560,510);
		txtChat.setEditable(false);
		
		//txtEnter Action Event
		txtEnter.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String uText = txtEnter.getText();
				txtChat.append("you : " + uText + "\n");				
				if(uText.contains("hi") || uText.contains("hello")|| uText.contains("hii")|| uText.contains("hey")) {
					botSay("hello there");
				}
				//how are you
	
                                else if(uText.contains("How are you")||uText.contains("How r u")||uText.contains("How r you")){
						int decider=(int) (Math.random()*1+1);
						if(decider==1) {
							botSay("SVP is always Fine");
						}															
				}
				//principal
				else if(uText.contains("who is the principal of svp")||uText.contains("principal")||uText.contains("principal of svp")||uText.contains("who is principal of svp")
						||uText.contains("principal of sv")){
					int decider=(int) (Math.random()*2+1);
					if(decider==1) {
						botSay("Dr. Ashish Dongre");
					}if(decider==2) {
						botSay("principal of svp is Dr. Ashish Dongre");
					}
			    }
				//departments
				else if(uText.contains("How many departments in svp")||uText.contains("departments in svp")||uText.contains("departments of sv")){
					int decider=(int) (Math.random()*1+1);
					if(decider==1) {
						botSay("There are 12 departments in svp are :- \n 1. INFORMATION TECHNOLOGY \n 2. COMPUTER SCIENCE \n 3. MODERN OFFICE MANAGEMENT \n 4. VIDEOGRAPHY"
								+ "5. PHARMACY \n 6. MECHANICAL \n 7. PRODUCTION 8. CIVIL\n 9. CTM\n"
								+ "10. ELECTRONICS \n 11. ELECTRICAL \n 12. ARCHITECTURE");	
					}
			    }
				//IT Branch
				else if(uText.contains("Who is the hod of IT department")||uText.contains("hod of IT department")||uText.contains("HOD of IT departmnet")){
					int decider=(int) (Math.random()*1+1);
					if(decider==1) {
						botSay("Mr. S.K. Vatke");	
					}
			    }
                                else if(uText.contains("Faculties in IT branch")||uText.contains("hod of IT department")||uText.contains("HOD of IT departmnet")){
					int decider=(int) (Math.random()*1+1);
					if(decider==1) {
						botSay("Mr. S.K. Vatke");	
					}
			    }
				else {
				int decider=(int) (Math.random()*4+1);
				if(decider==1) {
					botSay("svp didn't get that");
				}
				else if(decider==2) {
					botSay("please repeat your query");
				}
				else if(decider==3) {
					botSay("SVP is unavailable");
				}
				else if(decider==4) {
					botSay("what");
				}
					
				}
				txtEnter.setText("");
				
			}
			
		});
		this.add(txtChat);
		this.add(txtEnter);
	}
	public void botSay(String s) {
		String a;
		txtChat.append("AI : " + s + "\n");
		
	}
		public static void main(String args[])
	{
			new Bot();		
	}
}
