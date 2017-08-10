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
		buttonList = new ArrayList<JButton>();
		rect = new ArrayList<MouseCoords>();
	}

	public void clear() {
		if(buttonList != null){
			for (JButton button : buttonList) {
				button.hide();
			}
		}
		if(image != null){
			image = null;
		}
		if(rect != null){
			for (MouseCoords coord : rect) {
				coord = null;
			}
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
	
	public void addMouseCoords(MouseCoords... m){
		for(MouseCoords mouseCoord : m){
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
		if(rect.size() == 1){
			for(int i = 0; i < 1; i++){
				//FIND ME if there's a problem fix it
				if(mousex >= rect.get(i).getX1() && mousex <= rect.get(i).getX2() && mousey >= rect.get(i).getY1() && mousey <= rect.get(i).getY2()){
					Driver.load(rect.get(i).getPlace());
				}
			}
		}
		//FIND ME RECTANGLE
		/*else if (rect.size() == 2) {
			System.out.println(rect);
			if (mousex >= rect.get(0).getX1() && mousex <= rect.get(0).getX2() && mousey >= rect.get(0).getY1()
					&& mousey <= rect.get(0).getY2()) {
				Driver.load(rect.get(0).getPlace());
			}
			if (mousex >= rect.get(1).getX1() && mousex <= rect.get(1).getX2() && mousey >= rect.get(1).getY1()
					&& mousey <= rect.get(1).getY2()) {
				Driver.load(rect.get(1).getPlace());
			}
		}*/
		
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
