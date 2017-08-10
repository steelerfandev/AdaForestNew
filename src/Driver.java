import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Driver {
	private static JFrame frame = new JFrame("Ada's Forest");
	private static Custom panel = new Custom();
	private static String timeCheck = "";
	// STRING TIME?

	public static void main(String[] args) {

		try {
			BufferedImage bufferedImage = ImageIO.read(new File("icon.gif"));
			frame.setIconImage(bufferedImage);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // this closes the
																// panel when I
																// click the x
		frame.setSize(800, 600); // sets the size of window
		frame.setResizable(false);
		frame.setVisible(true); // sets window visible

		Driver.load(Place.HOMESCREEN);
		frame.add(panel);
		frame.setVisible(true);

	}

	static void load(Place place) {
		panel.clear();
		panel.addMouseListener(panel);

		if (place == Place.HOMESCREEN) {
			try {
				BufferedImage homescreen = ImageIO.read(new File("homescreen.jpg"));
				panel.addImage(homescreen);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton play = new JButton("Play");
			play.setPreferredSize(new Dimension(90, 40));
			play.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADAFOREST1);
				}
			});
			panel.addButton(play);
		} else if (place == Place.ADAFOREST1) {
			try {
				BufferedImage adaforest1 = ImageIO.read(new File("adaforest1.jpg"));
				panel.addImage(adaforest1);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton next = new JButton("Next");
			next.setPreferredSize(new Dimension(90, 40));
			next.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADAFOREST2);
				}
			});
			panel.addButton(next);
		} else if (place == Place.ADAFOREST2) {
			try {
				BufferedImage adaforest2 = ImageIO.read(new File("adaforest2.jpg"));
				panel.addImage(adaforest2);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton back = new JButton("Back");
			back.setPreferredSize(new Dimension(90, 40));
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADAFOREST1);
				}
			});
			panel.addButton(back);
			JButton next = new JButton("Next");
			next.setPreferredSize(new Dimension(90, 40));
			next.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADAFOREST3);
				}
			});
			panel.addButton(next);
		} else if (place == Place.ADAFOREST3) {
			try {
				BufferedImage adaforest2 = ImageIO.read(new File("adaforest3.jpg"));
				panel.addImage(adaforest2);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton back = new JButton("Back");
			back.setPreferredSize(new Dimension(90, 40));
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADAFOREST1);
				}
			});
			panel.addButton(back);
			JButton next = new JButton("Next");
			next.setPreferredSize(new Dimension(90, 40));
			next.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADASROOM);
				}
			});
			panel.addButton(next);
		} else if (place == Place.ADASROOM) {
			try {
				BufferedImage adasroom = ImageIO.read(new File("adasroom.jpg"));
				panel.addImage(adasroom);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton back = new JButton("Back");
			back.setPreferredSize(new Dimension(90, 40));
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADAFOREST3);
				}
			});
			panel.addButton(back);
			/*
			 * System.out.println("Click on the door to leave the room.");
			 * MouseCoords door = new MouseCoords(249, 221, 249 + 187, 600,
			 * Place.ADASHOUSEINTERIOR); panel.addMouseCoords(door);
			 */
			JButton toDownstairs = new JButton("Downstairs");
			toDownstairs.setPreferredSize(new Dimension(90, 40));
			toDownstairs.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADASHOUSEINTERIOR);
				}
			});
			panel.addButton(toDownstairs);
		} else if (place == Place.ADASHOUSEINTERIOR) {
			try {
				BufferedImage adashouseinterior = ImageIO.read(new File("adashouseinterior.jpg"));
				panel.addImage(adashouseinterior);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton back = new JButton("Back To Room");
			back.setPreferredSize(new Dimension(120, 40));
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADASROOM);
				}
			});
			panel.addButton(back);
			if (timeCheck == "") {
				JButton talkToMom = new JButton("Talk To Mom");
				talkToMom.setPreferredSize(new Dimension(120, 40));
				talkToMom.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Driver.load(Place.MOMTALK1);
					}
				});
				panel.addButton(talkToMom);
			}

			else if (timeCheck.equals("saw tree")) {
				JButton talkToMom = new JButton("Talk To Mom");
				talkToMom.setPreferredSize(new Dimension(120, 40));
				talkToMom.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Driver.load(Place.MOMTALK0);
					}
				});
				panel.addButton(talkToMom);
			}
			/*
			 * System.out.println("Click on the left door to go outside.");
			 * MouseCoords leftDoor = new MouseCoords(249, 221, 249 + 187, 600,
			 * Place.ADASHOUSEEXTERIOR); panel.addMouseCoords(leftDoor);
			 */
			JButton toOutside = new JButton("To Outside");
			toOutside.setPreferredSize(new Dimension(90, 40));
			toOutside.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADASHOUSEEXTERIOR);
				}
			});
			panel.addButton(toOutside);

		} else if (place == Place.ADASHOUSEEXTERIOR) {
			try {
				BufferedImage adashouseexterior = ImageIO.read(new File("adashouseexterior.jpg"));
				panel.addImage(adashouseexterior);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton back = new JButton("Back Inside");
			back.setPreferredSize(new Dimension(90, 40));
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADASHOUSEINTERIOR);
				}
			});
			panel.addButton(back);
			JButton toForest = new JButton("To Forest");
			toForest.setPreferredSize(new Dimension(120, 40));
			toForest.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADASFOREST);
				}
			});
			panel.addButton(toForest);
			JButton toTown = new JButton("To Town");
			toTown.setPreferredSize(new Dimension(100, 40));
			toTown.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.TOWN1);
				}
			});
			panel.addButton(toTown);
		}

		else if (place == Place.ADASFOREST) {
			try {
				BufferedImage adasforest = ImageIO.read(new File("adasforest.jpg"));
				panel.addImage(adasforest);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton back = new JButton("Back");
			back.setPreferredSize(new Dimension(90, 40));
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADASHOUSEEXTERIOR);
				}
			});
			panel.addButton(back);
			JButton explore = new JButton("Explore");
			explore.setPreferredSize(new Dimension(120, 40));
			explore.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADASTREE);
				}
			});
			panel.addButton(explore);
		}

		else if (place == Place.ADASTREE) {
			try {
				BufferedImage adastree = ImageIO.read(new File("adastree.jpg"));
				panel.addImage(adastree);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton back = new JButton("Back");
			back.setPreferredSize(new Dimension(90, 40));
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADASFOREST);
				}
			});
			panel.addButton(back);
			System.out.println("What? A sick tree? Ask Mom about it!");
			timeCheck = "saw tree";
		}

		else if (place == Place.MOMTALK0) {
			try {
				BufferedImage momTalk0 = ImageIO.read(new File("momTalk0.jpg"));
				panel.addImage(momTalk0);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton goodbye = new JButton("Goodbye");
			goodbye.setPreferredSize(new Dimension(90, 40));
			goodbye.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADASHOUSEINTERIOR);
				}
			});
			panel.addButton(goodbye);
			JButton theTreesAreSick = new JButton("Tell Mom about sick trees");
			theTreesAreSick.setPreferredSize(new Dimension(160, 40));
			theTreesAreSick.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.MOMTALK2);
				}
			});
			panel.addButton(theTreesAreSick);
		}

		else if (place == Place.MOMTALK1) {
			try {
				BufferedImage momTalk1 = ImageIO.read(new File("momTalk1.jpg"));
				panel.addImage(momTalk1);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton goodbye = new JButton("Goodbye");
			goodbye.setPreferredSize(new Dimension(90, 40));
			goodbye.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADASHOUSEINTERIOR);
				}
			});
			panel.addButton(goodbye);
		}

		else if (place == Place.MOMTALK2) {
			try {
				BufferedImage momTalk2 = ImageIO.read(new File("momTalk2.jpg"));
				panel.addImage(momTalk2);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton back = new JButton("Back");
			back.setPreferredSize(new Dimension(90, 40));
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.MOMTALK0);
				}
			});
			panel.addButton(back);
			JButton thanks = new JButton("Goodbye");
			thanks.setPreferredSize(new Dimension(110, 40));
			thanks.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADASHOUSEINTERIOR);
				}
			});
			panel.addButton(thanks);
		}

		else if (place == Place.TOWN1) {
			try {
				BufferedImage town1 = ImageIO.read(new File("town1.jpg"));
				panel.addImage(town1);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton back = new JButton("Back to Home");
			back.setPreferredSize(new Dimension(130, 40));
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADASHOUSEEXTERIOR);
				}
			});
			panel.addButton(back);
			JButton toTown2 = new JButton("To West Town");
			toTown2.setPreferredSize(new Dimension(140, 40));
			toTown2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.TOWN2);
				}
			});
			panel.addButton(toTown2);

			JButton toTownHall = new JButton("To Town Hall");
			toTownHall.setPreferredSize(new Dimension(140, 40));
			toTownHall.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.TOWNHALL);
				}
			});
			panel.addButton(toTownHall);

			JButton toSchool = new JButton("To School");
			toSchool.setPreferredSize(new Dimension(140, 40));
			toSchool.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.SCHOOL);
				}
			});
			panel.addButton(toSchool);
		}

		else if (place == Place.TOWN2) {
			try {
				BufferedImage town2 = ImageIO.read(new File("town2.jpg"));
				panel.addImage(town2);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton back = new JButton("Back to Home");
			back.setPreferredSize(new Dimension(130, 40));
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADASHOUSEEXTERIOR);
				}
			});
			panel.addButton(back);
			JButton toTown1 = new JButton("To East Town");
			toTown1.setPreferredSize(new Dimension(140, 40));
			toTown1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.TOWN1);
				}
			});
			panel.addButton(toTown1);

			JButton toGroceryStore = new JButton("To Grocery Store");
			toGroceryStore.setPreferredSize(new Dimension(160, 40));
			toGroceryStore.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.GROCERY);
				}
			});
			panel.addButton(toGroceryStore);

			JButton toLibrary = new JButton("To Library");
			toLibrary.setPreferredSize(new Dimension(140, 40));
			toLibrary.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.LIBRARY);
				}
			});
			panel.addButton(toLibrary);
		} else if (place == Place.LIBRARY) {
			try {
				BufferedImage library = ImageIO.read(new File("library.jpg"));
				panel.addImage(library);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton back = new JButton("Back to Town");
			back.setPreferredSize(new Dimension(130, 40));
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.TOWN2);
				}
			});
			panel.addButton(back);

			JButton talkToLibrarian = new JButton("Talk to the Librarian, Ms. Church");
			talkToLibrarian.setPreferredSize(new Dimension(200, 40));
			talkToLibrarian.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.LIBRARIANTALK0);
				}
			});
			panel.addButton(talkToLibrarian);
		}

		else if (place == Place.LIBRARIANTALK0) {
			try {
				BufferedImage librarianTalk0 = ImageIO.read(new File("librarianTalk0.jpg"));
				panel.addImage(librarianTalk0);
			} catch (IOException e) {
				e.printStackTrace();
			}

			JButton goodbye = new JButton("Goodbye");
			goodbye.setPreferredSize(new Dimension(130, 40));
			goodbye.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.LIBRARY);
				}
			});
			panel.addButton(goodbye);

			if (timeCheck.equals("saw tree")) {
				JButton askForInfo = new JButton("Ask for information on trees");
				askForInfo.setPreferredSize(new Dimension(130, 40));
				askForInfo.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Driver.load(Place.LIBRARIANTALK0);
					}
				});
				panel.addButton(askForInfo);
			}
		}

		else if (place == Place.LIBRARIANTALK0) {
			try {
				BufferedImage librarianTalk0 = ImageIO.read(new File("librarianTalk0.jpg"));
				panel.addImage(librarianTalk0);
			} catch (IOException e) {
				e.printStackTrace();
			}

			JButton back = new JButton("Back");
			back.setPreferredSize(new Dimension(130, 40));
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.LIBRARIANTALK0);
				}
			});
			panel.addButton(back);

			JButton goodbye = new JButton("Goodbye");
			back.setPreferredSize(new Dimension(130, 40));
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.LIBRARIANTALK0);
				}
			});
			panel.addButton(back);

		}
		/*else if(place==Place.MAYORTALK0){
	try{
	BufferedImage mayortalk0=ImageIO.read(new File("mayortalk0.jpg"));
	panel.addImage(mayortalk0);
	}
	catch(IOException e){
		e.printStackTrace();
	}
if(timeCheck.equals("told about mayor")){
JButton inquire = new JButton ("Inquire where to get clean water for trees");
	inquire.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
		Driver.load(Place.MAYORTALK1);
	}
}};
}else if(timeCheck.equals("know about dump runoff")){
JButton talkAboutRunoff = new JButton("Tell the mayor about the dump runoff");
talkAboutRunoff.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
		Driver.load(Place.MAYORTALK5);
	}
}};
}else if(timeCheck.equals("have idea")){
JButton idea = new JButton ("Tell the mayor you have an idea");
	idea.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
		Driver.load(Place.MAYORTALK7);
	}
}};

}

else if(place==Place.MAYORTALK1){
	try{
	BufferedImage mayortalk1=ImageIO.read(new File("mayortalk1.jpg"));
	panel.addImage(mayortalk1);
	}
	catch(IOException e){
		e.printStackTrace();
	}
JButton thank = new JButton ("Thank the arrogant mayor");
			//glad.setPreferredSize(newDimension(90,40));
			thank.addActionListener(new ActionListener(){
				@Override
			public void actionPerformed(ActionEvent e){
				Driver.load(Place.MAYORTALK2);
		}
	}};


}

else if(place==Place.MAYORTALK2){
	try{
	BufferedImage mayortalk2=ImageIO.read(new File("mayortalk2.jpg"));
	panel.addImage(mayortalk2);
	}
	catch(IOException e){
		e.printStackTrace();
	}
JButton suggest = new JButton ("Mention the bike you saw outside and suggest a bike lane to encourage more bikes");
			//glad.setPreferredSize(newDimension(90,40));
			suggest.addActionListener(new ActionListener(){
				@Override
			public void actionPerformed(ActionEvent e){
				Driver.load(Place.MAYORTALK3);
		}
	}};


}

else if(place==Place.MAYORTALK3){
	try{
	BufferedImage mayortalk3=ImageIO.read(new File("mayortalk3.jpg"));
	panel.addImage(mayortalk3);
	}
	catch(IOException e){
		e.printStackTrace();
	}
JButton glad = new JButton ("Express that you are happy he likes the idea");
			glad.setPreferredSize(newDimension(90,40));
			glad.addActionListener(new ActionListener(){
				@Override
			public void actionPerformed(ActionEvent e){
				Driver.load(Place.MAYORTALK4);
		}
	}};


}

else if(place==Place.MAYORTALK4){
	try{
	BufferedImage mayortalk4=ImageIO.read(new File("mayortalk4.jpg"));
	panel.addImage(mayortalk4);
	}
	catch(IOException e){
		e.printStackTrace();
	}
JButton goodbye = new JButton ("Goodbye");
			goodbye.setPreferredSize(newDimension(90,40));
			goodbye.addActionListener(new ActionListener(){
				@Override
			public void actionPerformed(ActionEvent e){
				Driver.load(Place.TOWNHALL);
		}
	}};


}

else if(place==Place.MAYORTALK5){
	try{
	BufferedImage mayortalk5=ImageIO.read(new File("mayortalk5.jpg"));
	panel.addImage(mayortalk5);
	}
	catch(IOException e){
		e.printStackTrace();
	}
JButton idk = new JButton ("Admit you do not have an idea");
			idk.setPreferredSize(newDimension(90,40));
			idk.addActionListener(new ActionListener(){
				@Override
			public void actionPerformed(ActionEvent e){
				Driver.load(Place.MAYORTALK6);
		}
	}};


}

else if(place==Place.MAYORTALK6){
	try{
	BufferedImage mayortalk6=ImageIO.read(new File("mayortalk6.jpg"));
	panel.addImage(mayortalk6);
	}
	catch(IOException e){
		e.printStackTrace();
	}
JButton goodbye = new JButton ("Goodbye");
			goodbye.setPreferredSize(newDimension(90,40));
			goodbye.addActionListener(new ActionListener(){
				@Override
			public void actionPerformed(ActionEvent e){
				Driver.load(Place.TOWNHALL);
		}
	}};


}

else if(place==Place.MAYORTALK7){
	try{
	BufferedImage mayortalk7=ImageIO.read(new File("mayortalk7.jpg"));
	panel.addImage(mayortalk7);
	}
	catch(IOException e){
		e.printStackTrace();
	}
JButton barrier = new JButton ("Suggest building a barrier");
			epa.setPreferredSize(newDimension(90,40));
			epa.addActionListener(new ActionListener(){
				@Override
			public void actionPerformed(ActionEvent e){
				Driver.load(Place.MAYORTALKS8);
		}
	}};


}

else if(place==Place.MAYORTALK8){
	try{
	BufferedImage mayortalk8=ImageIO.read(new File("mayortalk8.jpg"));
	panel.addImage(mayortalk8);
	}
	catch(IOException e){
		e.printStackTrace();
	}
JButton epa = new JButton ("Suggest getting funding from the EPA");
			epa.setPreferredSize(newDimension(90,40));
			epa.addActionListener(new ActionListener(){
				@Override
			public void actionPerformed(ActionEvent e){
				Driver.load(Place.MAYORTALKS9);
		}
	}};


}

else if(place==Place.MAYORTALK9){
	try{
	BufferedImage mayortalk9=ImageIO.read(new File("mayortalk9.jpg"));
	panel.addImage(mayortalk9);
	}
	catch(IOException e){
		e.printStackTrace();
	}
JButton next = new JButton ("Next");
			next.setPreferredSize(newDimension(90,40));
			next.addActionListener(new ActionListener(){
				@Override
			public void actionPerformed(ActionEvent e){
				Driver.load(Place.BUILDTHATWALL);
		}
	}};


}

else if(place==Place.DUMP){
	try{
	BufferedImage dump=ImageIO.read(new File("dump.jpg"));
	panel.addImage(dump);
	}
	catch(IOException e){
		e.printStackTrace();
	}
	JButton back = new JButton ("Back");
	back.setPreferredSize(newDimension(90,40));
	back.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e){
			Driver.load(Place.ADASFOREST);
		}
	}};
	JButton dumpman= new JButton("Talk to man");
	dumpman.setPreferredSize(newDimension(90,40));
	dumpman.addActionListener(newActionListener(){
		@Override
		public void actionPerformed(ActionEvent e){
			Driver.load(Place.DUMPTALK0);
		}
	}};
}


else if(place==Place.DUMPTALK0){
	try{
	BufferedImage dumptalk0= ImageIO.read(new File("dumpTalk0.jpg"));
	panel.addImage(dumptalk0);
	}
	catch(IOException e){
		e.printStackTrace();
	}

	if(timeCheck.equals("told to find water source")){
		
		JButton idea = new JButton ("Ask about polluted water");
				idea.setPreferredSize(newDimension(90,40));
				idea.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e){
					Driver.load(Place.DUMPTALK1);
			}
		}};
	}else if(timeCheck.equals("told to get idea")){
		JButton idea = new JButton ("Ask for idea on runoff pollution prevention");
				idea.setPreferredSize(newDimension(90,40));
				idea.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e){
					Driver.load(Place.DUMPTALK2);
			}
		}};
	}
	JButton goodbye = new JButton ("Goodbye");
			goodbye.setPreferredSize(newDimension(90,40));
			goodbye.addActionListener(new ActionListener(){
				@Override
			public void actionPerformed(ActionEvent e){
				Driver.load(Place.DUMP);
		}
	}};
	
	
	panel.addButton(goodbye);
	panel.addButton(idea);
}

else if(place==Place.DUMPTALK1){
	try{
	BufferedImage dumptalk1= ImageIO.read(new File("dumpTalk1.jpg"));
	panel.addImage(dumptalk1);
	}
	catch(IOException e){
		e.printStackTrace();
	}
	JButton goodbye = new JButton ("Goodbye");
		goodbye.setPreferredSize(newDimension(90,40));
		goodbye.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				Driver.load(Place.DUMP);
		}
	}};
	JButton idea = new JButton ("Ask about polluted water");
			idea.setPreferredSize(newDimension(90,40));
			idea.addActionListener(new ActionListener(){
				@Override
			public void actionPerformed(ActionEvent e){
				Driver.load(Place.DUMPTALK2);
		}
	}};
	panel.addButton(goodbye);
	panel.addButton(idea);
}


else if(place==Place.DUMPTALK1){
	try{
	BufferedImage dumptalk2= ImageIO.read(new File("dumpTalk2.jpg"));
	panel.addImage(dumptalk2);
	}
	catch(IOException e){
		e.printStackTrace();
	}
	JButton idea = new JButton ("Ask how to prevent");
			idea.setPreferredSize(newDimension(90,40));
			idea.addActionListener(new ActionListener(){
				@Override
			public void actionPerformed(ActionEvent e){
				Driver.load(Place.DUMPTALK2);
		}
	}};
	panel.addButton(idea);
}


else if(place==Place.DUMPTALK2){
	try{
	BufferedImage dumptalk2= ImageIO.read(new File("dumpTalk2.jpg"));
	panel.addImage(dumptalk2);
	}
	catch(IOException e){
		e.printStackTrace();
	}
	JButton goodbye = new JButton ("Goodbye");
		goodbye.setPreferredSize(newDimension(90,40));
		goodbye.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				Driver.load(Place.DUMP);
		}
	}};
	panel.addButton(goodbye);
}


else if(place==Place.BUILDTHATWALL){
	try{
	BufferedImage buildthatwall= ImageIO.read(new File("buildthatwall.jpg"));
	panel.addImage(buildthatwall);
	}
	catch(IOException e){
		e.printStackTrace();
	}
	JButton next = new JButton ("Next");
		next.setPreferredSize(newDimension(90,40));
		next.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				Driver.load(Place.END1);
		}
	}};
	panel.addButton(next);
}



else if(place==Place.END1){
	try{
	BufferedImage end3= ImageIO.read(new File("end1.jpg"));
	panel.addImage(end1);
	}
	catch(IOException e){
		e.printStackTrace();
	}
	JButton next = new JButton ("Next");
		next.setPreferredSize(newDimension(90,40));
		next.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				Driver.load(Place.END2);
		}
	}};
	panel.addButton(next);
}



else if(place==Place.END2){
	try{
	BufferedImage end3= ImageIO.read(new File("end2.jpg"));
	panel.addImage(end2);
	}
	catch(IOException e){
		e.printStackTrace();
	}
	JButton back= new JButton ("Back");
	back.setPreferredSize(newDimension(90,40));
	back.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e){
			Driver.load(Place.END1);
		}
	}};
	JButton next = new JButton ("Next");
		next.setPreferredSize(newDimension(90,40));
		next.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				Driver.load(Place.END3);
		}
	}};
	panel.addButton(next);
	panel.addButton(back);
}



else if(place==Place.END3){
	try{
	BufferedImage end3= ImageIO.read(new File("end3.jpg"));
	panel.addImage(end3);
	}
	catch(IOException e){
		e.printStackTrace();
	}
	JButton back= new JButton ("Back");
	back.setPreferredSize(newDimension(90,40));
	back.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e){
			Driver.load(Place.END2);
		}
	}};
	JButton next = new JButton ("Next");
		next.setPreferredSize(newDimension(90,40));
		next.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				Driver.load(Place.END4);
		}
	}};
	panel.addButton(next);
	panel.addButton(back);
}



else if(place==Place.END4){
	try{
	BufferedImage end4= ImageIO.read(new File("end4.jpg"));
	panel.addImage(end4);
	}
	catch(IOException e){
		e.printStackTrace();
	}
	JButton back= new JButton ("Back");
	back.setPreferredSize(newDimension(90,40));
	back.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e){
			Driver.load(Place.END3);
		}
	}};
	JButton next = new JButton ("Next");
		next.setPreferredSize(newDimension(90,40));
		next.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				Driver.load(Place.LARGEBAGUETTEGAMES);
		}
	}};
	panel.addButton(next);
	panel.addButton(back);
}




else if(place==Place.LARGEBAGUETTEGAMES){
	try{
	BufferedImage largebaguettegames = ImageIO.read(new File("largebaguettegames.png"));
	panel.addImage(largebaguettegames);
	}
	catch(IOException e){
		e.printStackTrace();
	}
	JButton next = new JButton ("Next");
	next.setPreferredSize(newDimension(90,40));
	next.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e){
			Driver.load(Place.YOUWIN);
		}
	}};
	panel.addButton(next);
}


else if(place==Place.YOUWIN){
	try{
	BufferedImage youwin = ImageIO.read(new File("youwin.jpg"));
	panel.addImage(youwin);
	}
	catch(IOException e){
		e.printStackTrace();
	}
	JButton returnHome = new JButton ("Return Home");
	play.setPreferredSize(newDimension(90,40));
	next.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e){
			Driver.load(Place.HOMESCREEN);
		}
	}};
	panel.addButton(returnHome);
}*/
		

	}

}