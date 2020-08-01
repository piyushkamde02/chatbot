package src;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
public class ChatClient extends JFrame 
        implements WindowListener, MouseListener, KeyListener{

	private TextArea message_area =null;
	private TextField send_area =null;
	private String user_name = null;
	ChatClient(String s){
		
		super(s);
		this.addWindowListener(this);
		this.setSize(800,600);
		this.setResizable(true);
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		message_area = new TextArea();
		message_area.setEditable(false);
		this.add(message_area,"Center");
		message_area.setFont(new Font("Arial", Font.PLAIN, 16));
		
		Panel p = new Panel();
	    p.setLayout(new FlowLayout());
	    send_area = new TextField(30);
	    send_area.addKeyListener(this);
	    send_area.setFont(new Font("Arial", Font.PLAIN,16));
	    p.add(send_area);
	    p.setBackground(new Color(221,221,221));
	    Button send = new Button("send");
	    send.addMouseListener(this);
	    p.add(send);
	    Button clear = new Button("clear");
	    clear.addMouseListener(this);
	    p.add(clear);
	    this.add(p,"South");
	    this.setVisible(true);
	    send_area.requestFocus();
	
	}
	
    public static void main(String args[]) {
    	ChatClient c= new ChatClient("Chat Client v1.0");
    }

	private void addWindowListener(ChatClient chatClient) {
		// TODO Auto-generated method stub
		
	}

	public void windowActivated(WindowEvent arg0) {
		
		
	}

	
	public void windowClosed(WindowEvent arg0) {
		
		
	}

	
	public void windowClosing(WindowEvent arg0) {
		
		
	}

	
	public void windowDeactivated(WindowEvent arg0) {
		
		
	}

	
	public void windowDeiconified(WindowEvent arg0) {
		
		
	}

	
	public void windowIconified(WindowEvent arg0) {
		
		
	}

	
	public void windowOpened(WindowEvent arg0) {
		
		
	}

	
	public void keyPressed(KeyEvent arg0) {
		
		
	}

	
	public void keyReleased(KeyEvent arg0) {
		
		
	}

	
	public void keyTyped(KeyEvent arg0) {
		
		
	}

	
	public void mouseClicked(MouseEvent arg0) {
		
	}

	
	public void mouseEntered(MouseEvent arg0) {
		
		
	}

	
	public void mouseExited(MouseEvent arg0) {
		
		
	}

	
	public void mousePressed(MouseEvent arg0) {
		
		
	}

	
	public void mouseReleased(MouseEvent arg0) {
		
		
	}
        	
        	
        }

