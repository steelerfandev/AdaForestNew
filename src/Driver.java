import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class Driver {
	
	public static JFrame frame;
	public static int count = 0;
	private static BufferedImage iconImage;
	private static HomeScreen homescreen;
	private static Place place0, place1, place2, place3, place4, place5, place6, place7, place8, place9, place10, place11, place12, place13, place14, place15, place16, place17, place18, place19, place20, place21, place22, place23, place24, place25, place26, place27, place28, place29, place30, place31, place32, place33, place34, place35, place36, place37, place38, place39, place40, place41, place42, place43, place44, place45, place46, place47, place48, place49, place50, place51, place52, place53, place54, place55, place56, place57, place58;
	private static ImageInfo ii;
	
	public static void main(String[] args){
		slides = new Place[60];
		
		try{
			iconImage = ImageIO.read(new File("icon.gif"));
		}
		 catch (Exception e) { // catch dat exception
				e.printStackTrace(); // idk what this does rly but just keep it
										// there
		}
		
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e){
			
		}
		
		frame = new JFrame("Ada's Forest"); //TITLE
		frame.setIconImage(iconImage);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //this closes the panel when I click the x
		frame.setSize(800, 600); //sets the size of window
		
		homescreen = new HomeScreen();
		
		frame.add(homescreen);
		frame.setVisible(true);
		
		
		ii = new ImageInfo();
		
		//playing in room
		ii.setImageName("adaForest1");
		JButton next = new JButton("Next");
		place0 = new Place(ii, 0, 0, 0, 0, 0, 0, 0, 0, 0, next);
		slides[0] = place0;
		//ada!
		ii.setImageName("adaForest2");
		JButton back = new JButton("Back");
		place1 = new Place(ii, 1, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[1] = place1;
		//talks to mom
		ii.setImageName("adaForest3");
		place2 = new Place(ii, 2, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[2] = place2;
		//leaves room
		ii.setImageName("adasroom(noarrow)");
		place3 = new Place(ii, 3, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[3] = place3;
		//inside of house
		ii.setImageName("adashouseinterior");
		place4 = new Place(ii, 4, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[4] = place4;
		//outside of house
		ii.setImageName("adashouseexterior");
		place5 = new Place(ii, 5, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[5] = place5;
		//forest
		ii.setImageName("adasforest");
		place6 = new Place(ii, 6, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[6] = place6;
		//sick tree
		ii.setImageName("adastree");
		place7 = new Place(ii, 7, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[7] = place7;
		//inside of house
		ii.setImageName("adashouseinterior");
		place8 = new Place(ii, 8, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[8] = place8;
		//town 2
		ii.setImageName("town2");
		place9 = new Place(ii, 9, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[9] = place9;
		//inside of lib
		ii.setImageName("librarianTalk0");
		place10 = new Place(ii, 10, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[10] = place10;
		//inside of lib
		ii.setImageName("librarianTalk1");
		place11 = new Place(ii, 11, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[11] = place11;
		//book
		ii.setImageName("book1");
		place12 = new Place(ii, 12, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[12] = place12;
		//book
		ii.setImageName("book2");
		place13 = new Place(ii, 13, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[13] = place13;
		//book
		ii.setImageName("book3");
		place14 = new Place(ii, 14, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[14] = place14;
		//book
		ii.setImageName("book4");
		place15 = new Place(ii, 15, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[15] = place15;
		//book
		ii.setImageName("book5");
		place16 = new Place(ii, 16, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[16] = place16;
		//library
		ii.setImageName("librarianTalk0");
		place17 = new Place(ii, 17, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[17] = place17;
		//library
		ii.setImageName("librarianTalk2");
		place18 = new Place(ii, 18, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[18] = place18;
		//library
		ii.setImageName("adaForest2");
		place19 = new Place(ii, 19, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[19] = place19;
		//library
		ii.setImageName("adaForest2");
		place20 = new Place(ii, 20, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[20] = place20;
		//town1
		ii.setImageName("town1");
		place21 = new Place(ii, 21, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[21] = place21;
		//school
		ii.setImageName("studichTalk0");
		place22 = new Place(ii, 22, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[22] = place22;
		//school
		ii.setImageName("studichTalk1");
		place23 = new Place(ii, 23, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[23] = place23;
		//school
		ii.setImageName("studichTalk2");
		place24 = new Place(ii, 24, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[24] = place24;
		//school
		ii.setImageName("adaForest2");
		place25 = new Place(ii, 25, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[25] = place25;
		//school
		ii.setImageName("adaForest2");
		place26 = new Place(ii, 26, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[26] = place26;
		//town2
		ii.setImageName("town2");
		place27 = new Place(ii, 27, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[27] = place27;
		//grocery
		ii.setImageName("grocery");
		place28 = new Place(ii, 28, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[28] = place28;
		//grocery
		ii.setImageName("grocery");
		place29 = new Place(ii, 29, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[29] = place29;
		//grocery
		ii.setImageName("grocery");
		place30 = new Place(ii, 30, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[30] = place30;
		//grocery
		ii.setImageName("grocery");
		place31 = new Place(ii, 31, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[31] = place31;
		//grocery
		ii.setImageName("grocery");
		place32 = new Place(ii, 32, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[32] = place32;
		//grocery
		ii.setImageName("grocery");
		place33 = new Place(ii, 33, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[33] = place33;
		//grocery
		ii.setImageName("grocery");
		place34 = new Place(ii, 34, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[34] = place34;
		//town 1
		ii.setImageName("town1");
		place35 = new Place(ii, 35, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[35] = place35;
		//town hall
		ii.setImageName("mayorTalk0");
		place36 = new Place(ii, 36, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[36] = place36;
		//town hall
		ii.setImageName("mayorTalk1");
		place37 = new Place(ii, 37, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[37] = place37;
		//town hall
		ii.setImageName("mayorTalk2");
		place38 = new Place(ii, 38, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[38] = place38;
		//town hall
		ii.setImageName("mayorTalk3");
		place39 = new Place(ii, 39, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[39] = place39;
		//town hall
		ii.setImageName("");
		place40 = new Place(ii, 40, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[40] = place40;
		//town 1
		ii.setImageName("town1");
		place41 = new Place(ii, 41, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[41] = place41;
		//adasforest
		ii.setImageName("adasforest");
		place42 = new Place(ii, 42, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[42] = place42;
		//adasforest
		ii.setImageName("adasforest");
		place43 = new Place(ii, 43, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[43] = place43;
		//dump
		ii.setImageName("dump");
		place44 = new Place(ii, 44, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[44] = place44;
		//dump
		ii.setImageName("dump");
		place45 = new Place(ii, 45, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[45] = place45;
		//dump
		ii.setImageName("dump");
		place46 = new Place(ii, 46, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[46] = place46;
		//town1
		ii.setImageName("town1");
		place47 = new Place(ii, 47, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[47] = place47;
		//school
		ii.setImageName("school");
		place48 = new Place(ii, 48, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[48] = place48;
		//school
		place49 = new Place(ii, 49, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[49] = place49;
		//town1
		ii.setImageName("town1");
		place50 = new Place(ii, 50, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[50] = place50;
		//town hall
		ii.setImageName("town hall");
		place51 = new Place(ii, 51, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[51] = place51;
		//town hall
		ii.setImageName("town hall");
		place52 = new Place(ii, 52, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[52] = place52;
		//build that wall
		ii.setImageName("buildthatwall");
		place53 = new Place(ii, 53, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[53] = place53;
		//come see
		ii.setImageName("comesee");
		place54 = new Place(ii, 54, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[54] = place54;
		//standing at wall
		ii.setImageName("standingatwall");
		place55 = new Place(ii, 55, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[55] = place55;
		//adastree
		ii.setImageName("adastree");
		place56 = new Place(ii, 56, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[56] = place56;
		//youwin
		ii.setImageName("youwin");
		place57 = new Place(ii, 57, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[57] = place57;
		//youwin
		ii.setImageName("youwin");
		place58 = new Place(ii, 58, 0, 0, 0, 0, 0, 0, 0, 0, next, back);
		slides[58] = place58;
	}
	
	public static void removeAndAdd(){
		slides[count].setVisible(false);
		count ++;
		frame.add(slides[count]);
		slides[count].setVisible(true);
	}
	
	public static void removeAndGoBack(){
		slides[count].setVisible(false);
		count --;
		frame.add(slides[count]);
		slides[count].setVisible(true);
	}
	
	
}
	
