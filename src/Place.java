import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Place extends JPanel implements MouseListener{
	
	private int mouseX, mouseY;
	private String imageName;
	private BufferedImage image;
	private int position;
	
	
	public Place(ImageInfo ii, int pos, int TLx, int TLy, int TRx, int TRy, int BLx, int BLy, int BRx, int BRy, JButton... buttons){
		
		super();
		
		imageName = ii.getImageName();
		position = pos;
		
		try {
			image = ImageIO.read(new File("" + imageName + ".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		repaint();
		
		if(buttons != null){
			for(int i = 0; i < buttons.length; i ++){
				
				buttons[i].addActionListener(new ActionListener() {
					@Override // following method is in the original superclass and you
								// are overriding it
					public void actionPerformed(ActionEvent e) {
						switch(position){
						//scrolling through the buttons is "i"
						case 0: 
							if(i == 0){ //next
								Driver.removeAndAdd();
							}
						case 1: return;
						case 2: return;
						case 7: return;
						case 9: return;
						case 10: return;
						case 12: return;
						case 13: return;
						case 14: return;
						case 15: return;
						case 16: return;
						case 17: return;
						case 18: return;
						case 19: return;
						case 21: return;
						case 22: return;
						case 23: return;
						case 24: return;
						case 25: return;
						case 26: return;
						case 27: return;
						case 28: return;
						case 29: return;
						case 30: return;
						case 32: return;
						case 33: return;
						case 34: return;
						case 35: return;
						case 36: return;
						case 37: return;
						case 38: return;
						case 40: return;
						case 41: return;
						case 42: return;
						case 43: return;
						case 44: return;
						case 46: return;
						case 47: return;
						case 49: return;
						case 50: return;
						case 51: return;
						case 52: return;
						case 53: return;
						case 55: return;
						case 56: return;
						case 58: return;
						
						}
					}

				});
				super.add(buttons[i]);
				buttons[i].setVisible(true);
				
			}
		}
		
		ii.setCoordinates(TLx, TLy, TRx, TRy, BLx, BLy, BRx, BRy);
		
		
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.drawImage(image, 0, 0, null);
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseX = e.getX();
		mouseY = e.getY();
		if (mouseX > 245 && mouseX < 245 + 191 && mouseY > 216 && mouseY < 600) {
			System.out.println("O SHIT WADDUP");
			Driver.removeAndAdd();
			repaint();
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
