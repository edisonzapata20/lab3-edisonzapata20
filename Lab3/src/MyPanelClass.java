import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
public class MyPanelClass extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		//Compute interior coordinates
		Insets myInsets = this.getInsets();
		int x1 = myInsets.left;
		int y1 = myInsets.top;
		int x2 = getWidth() - myInsets.right - 1;
		int y2 = getHeight() - myInsets.bottom - 1;
		int width = x2 - x1;
		int height = y2 - y1;

		//Paint the background
		g.setColor(Color.RED);
		g.fillRect(x1, y1, width+1, height+1);

		//Draw a border
		//g.setColor(Color.YELLOW);
		//g.drawRect(x1, y1, width, height);


		//Draw a border
		//g.setColor(Color.GREEN);
		//g.drawRect(x1+4, y1+3, width-7, height-7);

		//g.setColor(Color.WHITE);
		// g.drawLine(x1, y1, x2, y2);

		//g.setColor(Color.BLUE);
		//g.drawLine(x2, y1, x1, y2);

		//g.setColor(Color.BLACK);
		//g.fillOval((getWidth()-55)/2,(getHeight()-55)/2, 55, 55);

		//Polygon p = new Polygon();
		//p.addPoint(x1 + 5, y1 + 25);
		//p.addPoint(x1 + 20, y1 + 10);
		//p.addPoint(x1 + 35, y1 + 25);
		//p.addPoint(x1 + 25, y1 + 25);
		//p.addPoint(x1 + 25, y1 + 45);
		// p.addPoint(x1 + 15, y1 + 45);
		//p.addPoint(x1 + 15, y1 + 25);
		// g.setColor(Color.YELLOW);
		// g.fillPolygon(p);

		//White lines and middle red one

		g.setColor(Color.WHITE);
		g.fillRect(60,47,350,40);

		g.setColor(Color.RED);
		g.fillRect(70,90,350,40); 

		g.setColor(Color.WHITE);
		g.fillRect(40,135,350,40);

		// Triangle polygon

		Polygon tri = new Polygon();
		tri.addPoint(0,0); 
		tri.addPoint(150,110);
		tri.addPoint(0,210);
		g.setColor(Color.BLUE);
		g.fillPolygon(tri);
		g.drawPolygon(tri);

		//Star polygon

		Polygon p2 = new Polygon();
		p2.addPoint(x1 + 35, y1 + 103);
		p2.addPoint(x1 + 51, y1 + 103);
		p2.addPoint(x1 + 57, y1 + 88);
		p2.addPoint(x1 + 63, y1 + 103);
		p2.addPoint(x1 + 79, y1 + 103);
		p2.addPoint(x1 + 66, y1 + 113);
		p2.addPoint(x1 + 71, y1 + 128);
		p2.addPoint(x1 + 57, y1 + 118);
		p2.addPoint(x1 + 44, y1 + 128);
		p2.addPoint(x1 + 48, y1 + 113);
		g.setColor(Color.WHITE);
		g.fillPolygon(p2);


	}
}
