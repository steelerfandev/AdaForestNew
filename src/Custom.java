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
		super.addMouseListener(this);
		buttonList = new ArrayList<JButton>();
		rect = new ArrayList<MouseCoords>();
	}

	public void clear() {
		if (buttonList != null) {
			for (JButton button : buttonList) {
				button.setVisible(false);
			}
			buttonList=new ArrayList<>();
		}
		if (image != null) {
			image = null;
		}
		if (rect != null) {
			rect = new ArrayList<>();
		}
		System.out.println("cleared");
	}

	public void addButton(JButton b) {
		buttonList.add(b);
		super.add(b);
		b.setVisible(true);
		System.out.println("adf");
		// do we have to set the buttons visible
	}

	public void addImage(BufferedImage i) {
		image = i;
		repaint();
	}

	public void addMouseCoords(MouseCoords... m) {
		for (MouseCoords mouseCoord : m) {
			rect.add(mouseCoord);
		}
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
		for (int i = 0; i < rect.size(); i++) {
			// FIND ME if there's a problem fix it
			if (mousex >= rect.get(i).getX1() && mousex <= rect.get(i).getX2() && mousey >= rect.get(i).getY1()
					&& mousey <= rect.get(i).getY2()) {
				Driver.load(rect.get(i).getPlace());
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
