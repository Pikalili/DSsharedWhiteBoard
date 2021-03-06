package clientGui;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import listener.ListenForShapeRadio;

public class CommandArea extends JPanel{
	JPanel pnlShape, pnlColor, pnlEraser;
	//Shape chooser on pnlshape
	public static JRadioButton rdoCircle, rdoOval, rdoLine, rdoRect, rdoFree, rdoText;
	
	public CommandArea() {
		this.setBorder(new TitledBorder("Commend Area"));
		Dimension d = new Dimension(250, 600);
		this.setPreferredSize(d);
		this.setLayout(new GridLayout(4, 1));
		
		/*initialize shape chooser panel*/
		pnlShape = new JPanel(new GridLayout(3,2));
		pnlShape.setPreferredSize(new Dimension(240, 140));
		pnlShape.setBorder(new TitledBorder("Shape Types"));
		
		rdoCircle = new JRadioButton("Circle");
		rdoOval = new JRadioButton("Oval");
		rdoLine = new JRadioButton("Line", true);
		rdoRect = new JRadioButton("Rectangle");
		rdoFree = new JRadioButton("Freehand");
		rdoText = new JRadioButton("Text");
		
		ButtonGroup grpShape = new ButtonGroup();
		grpShape.add(rdoCircle);
		grpShape.add(rdoOval);
		grpShape.add(rdoLine);
		grpShape.add(rdoRect);
		grpShape.add(rdoFree);
		grpShape.add(rdoText);
		
//		pnlShape.add(rdoCircle, ClientManager.CIRCLE);
//		pnlShape.add(rdoOval, ClientManager.OVAL);
//		pnlShape.add(rdoLine, ClientManager.LINE);
//		pnlShape.add(rdoRect, ClientManager.RECT);
//		pnlShape.add(rdoFree, ClientManager.FREE);
//		pnlShape.add(rdoText, ClientManager.TEXT);
		
		pnlShape.add(rdoCircle);
		pnlShape.add(rdoOval);
		pnlShape.add(rdoLine);
		pnlShape.add(rdoRect);
		pnlShape.add(rdoFree);
		pnlShape.add(rdoText);
		
		ListenForShapeRadio shapeListener = new ListenForShapeRadio();
		rdoCircle.addItemListener(shapeListener);
		rdoOval.addItemListener(shapeListener);
		rdoLine.addItemListener(shapeListener);
		rdoRect.addItemListener(shapeListener);
		rdoFree.addItemListener(shapeListener);
		rdoText.addItemListener(shapeListener);
		
		this.add(pnlShape);
		
	}
}
