import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Custom extends JPanel implements MouseListener {
	private ArrayList<JButton> buttonList;
	private BufferedImage image;
	private ArrayList<MouseCoords> rect;

	public Custom() {
		super();
	}

	public void clear() {
		for (JButton button : buttonList) {
			button = null;
		}
		image = null;
		for (MouseCoords coord : rect) {
			coord = null;
		}
	}

	public void addButton(JButton b) {
		buttonList.add(b);
		super.add(b);
		// do we have to set the buttons visible
	}

	public void addImage(BufferedImage i) {
		image = i;
		repaint();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int mousex = e.getX();
		int mousey = e.getY();
		for(MouseCoords c: rect){
			//FIND ME if there's a problem fix it
			if(mousex >= c.getX1() && mousex <= c.getX2() && mousey >= c.getY1() && mousey <= c.getY2()){
				Driver.load(c.getPlace());
			}
		}
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
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
