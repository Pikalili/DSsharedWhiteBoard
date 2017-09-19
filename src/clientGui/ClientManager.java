package clientGui;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.border.Border;
import shape.*;

import listener.*;

public class ClientManager extends JFrame{
	public static List<Shape> shapes;
	
	//DisplayArea
	JPanel displayArea;
	
	//commandArea
	JPanel commandArea;
	
	//ManagerArea
	JPanel pnlFile;
	
	/*Define shape types*/
	public final static int LINE = 0;
	public final static int CIRCLE = 1;
	public final static int RECT = 2;
	public final static int OVAL = 3;
	public final static int FREE = 4;
	public final static int TEXT = 5;
	public static int type = LINE;
	
	public ClientManager() {
		shapes = new ArrayList<Shape>();
		this.setLayout(new FlowLayout());
		this.setTitle("MyWriteBoard");
		this.setSize(900, 680);
		displayArea = new DisplayArea();//initialize our canvas
		commandArea = new CommandArea();//initialize out command area
		
		this.add(commandArea);
		this.add(displayArea);
		this.setVisible(true);//show the Window
	}
	
	public static void main(String[] args) {
		new ClientManager();
	}
}
