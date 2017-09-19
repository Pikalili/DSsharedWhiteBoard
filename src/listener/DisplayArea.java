package listener;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import clientGui.ClientManager;
import shape.*;

public class DisplayArea extends JPanel implements MouseMotionListener, MouseListener{
	Point start = new Point();
	Point end = new Point();
	
	public DisplayArea() {
		start = new Point();
		end = new Point();
		this.setPreferredSize(new Dimension(600, 600));
		Border border = new LineBorder(Color.black);
		this.setBorder(border);
		this.setBackground(Color.white);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(Shape shape: ClientManager.shapes) {
			shape.draw(g);
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		start.setLocation(e.getX(), e.getY());
		System.out.println("Start Point : (" + start.x + ", " + start.y + ")");
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		end.setLocation(e.getX(), e.getY());
		if(ClientManager.type == ClientManager.CIRCLE) {
			ClientManager.shapes.add(new Circle(start.x, start.y, end.x, end.y, Color.BLACK));
		}
		this.repaint();
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
