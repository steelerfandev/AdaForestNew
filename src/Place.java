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
			ii.setOptions(buttons);
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
