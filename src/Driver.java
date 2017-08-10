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
		}else if(place==Place.ADASROOM)
	{
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

		System.out.println("Click on the door to leave the room.");
		MouseCoords door = new MouseCoords(249, 221, 249 + 187, 600, Place.ADASHOUSEINTERIOR);
		panel.addMouseCoords(door);

		/*
		 * JButton toDownstairs = new JButton("Downstairs");
		 * toDownstairs.setPreferredSize(new Dimension(90, 40));
		 * toDownstairs.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * Driver.load(Place.ADASHOUSEINTERIOR); } });
		 */
		// panel.addButton(toDownstairs);
	}else if(place==Place.ADASHOUSEINTERIOR)
	{
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

	}else if(place==Place.ADASHOUSEEXTERIOR)
	{
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

	else if(place==Place.ADASFOREST)
	{
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

	else if(place==Place.ADASTREE)
	{
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

	else if(place==Place.MOMTALK0)
	{
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

	else if(place==Place.MOMTALK1)
	{
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

	else if(place==Place.MOMTALK2)
	{
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

	else if(place==Place.TOWN1)
	{
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

	else if(place==Place.TOWN2)
	{
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
	}else if(place==Place.LIBRARY)
	{
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

		JButton openBook = new JButton("Open Book");
		openBook.setPreferredSize(new Dimension(130, 40));
		openBook.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.BOOK1);
			}
		});
		panel.addButton(openBook);

	}

	else if(place==Place.LIBRARIANTALK0)
	{
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
					Driver.load(Place.LIBRARIANTALK1);
				}
			});
			panel.addButton(askForInfo);
		}
		if (timeCheck.equals("read book")) {
			timeCheck = "told about studich";
			JButton askForInfo = new JButton("Ask where to find out about clean water");
			askForInfo.setPreferredSize(new Dimension(160, 40));
			askForInfo.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.LIBRARIANTALK2);
				}
			});
			panel.addButton(askForInfo);
		}
	}

	else if(place==Place.LIBRARIANTALK1)
	{
		try {
			BufferedImage librarianTalk1 = ImageIO.read(new File("librarianTalk1.jpg"));
			panel.addImage(librarianTalk1);
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

		if (timeCheck.equals("saw tree")) {
			JButton goBackToOpenBook = new JButton("Go back to open book");
			goBackToOpenBook.setPreferredSize(new Dimension(150, 40));
			goBackToOpenBook.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.LIBRARY);
				}
			});
			panel.addButton(goBackToOpenBook);
		}
	}

	else if(place==Place.BOOK1)
	{
		try {
			BufferedImage book1 = ImageIO.read(new File("book1.jpg"));
			panel.addImage(book1);
		} catch (IOException e) {
			e.printStackTrace();
		}

		JButton back = new JButton("Back");
		back.setPreferredSize(new Dimension(130, 40));
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.LIBRARY);
			}
		});
		panel.addButton(back);

		JButton next = new JButton("Next Page");
		next.setPreferredSize(new Dimension(150, 40));
		next.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.BOOK2);
			}
		});
		panel.addButton(next);
	}else if(place==Place.BOOK2)
	{
		try {
			BufferedImage book2 = ImageIO.read(new File("book2.jpg"));
			panel.addImage(book2);
		} catch (IOException e) {
			e.printStackTrace();
		}

		JButton back = new JButton("Back");
		back.setPreferredSize(new Dimension(130, 40));
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.BOOK1);
			}
		});
		panel.addButton(back);

		JButton next = new JButton("Next Page");
		next.setPreferredSize(new Dimension(150, 40));
		next.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.BOOK3);
			}
		});
		panel.addButton(next);
	}

	else if(place==Place.BOOK3)
	{
		try {
			BufferedImage book3 = ImageIO.read(new File("book3.jpg"));
			panel.addImage(book3);
		} catch (IOException e) {
			e.printStackTrace();
		}

		JButton back = new JButton("Back");
		back.setPreferredSize(new Dimension(130, 40));
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.BOOK2);
			}
		});
		panel.addButton(back);

		JButton next = new JButton("Next Page");
		next.setPreferredSize(new Dimension(150, 40));
		next.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.BOOK4);
			}
		});
		panel.addButton(next);
	}

	else if(place==Place.BOOK4)
	{
		try {
			BufferedImage book4 = ImageIO.read(new File("book4.jpg"));
			panel.addImage(book4);
		} catch (IOException e) {
			e.printStackTrace();
		}

		JButton back = new JButton("Back");
		back.setPreferredSize(new Dimension(130, 40));
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.BOOK3);
			}
		});
		panel.addButton(back);

		JButton next = new JButton("Next Page");
		next.setPreferredSize(new Dimension(150, 40));
		next.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.BOOK5);
			}
		});
		panel.addButton(next);
	}else if(place==Place.BOOK5)
	{
		try {
			BufferedImage book5 = ImageIO.read(new File("book5.jpg"));
			panel.addImage(book5);
		} catch (IOException e) {
			e.printStackTrace();
		}

		JButton back = new JButton("Back");
		back.setPreferredSize(new Dimension(130, 40));
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.BOOK4);
			}
		});
		panel.addButton(back);

		JButton exit = new JButton("Exit Book");
		exit.setPreferredSize(new Dimension(150, 40));
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.LIBRARY);
			}
		});
		panel.addButton(exit);
	}

	else if(place==Place.BOOK5)
	{
		try {
			BufferedImage book5 = ImageIO.read(new File("book5.jpg"));
			panel.addImage(book5);
		} catch (IOException e) {
			e.printStackTrace();
		}

		JButton back = new JButton("Back");
		back.setPreferredSize(new Dimension(130, 40));
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.BOOK4);
			}
		});
		panel.addButton(back);

		JButton exit = new JButton("Exit Book");
		exit.setPreferredSize(new Dimension(150, 40));
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				timeCheck = "read book";
				Driver.load(Place.LIBRARY);
			}
		});
		panel.addButton(exit);
	}

	else if(place==Place.LIBRARIANTALK2)
	{
		try {
			BufferedImage librarianTalk2 = ImageIO.read(new File("librarianTalk2.jpg"));
			panel.addImage(librarianTalk2);
		} catch (IOException e) {
			e.printStackTrace();
		}

		JButton goodbye = new JButton("Goodbye");
		goodbye.setPreferredSize(new Dimension(150, 40));
		goodbye.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.RECEIPT);
			}
		});
		panel.addButton(goodbye);
	}

	else if(place==Place.RECEIPT)
	{
		try {
			BufferedImage receipt = ImageIO.read(new File("receipt.jpg"));
			panel.addImage(receipt);
		} catch (IOException e) {
			e.printStackTrace();
		}

		JButton recycle = new JButton("Remind Mrs. Church to recycle your receipt");
		recycle.setPreferredSize(new Dimension(250, 40));
		recycle.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.LIBRARIANTALK3);
			}
		});
		panel.addButton(recycle);
	}

	else if(place==Place.LIBRARIANTALK3)
	{
		try {
			BufferedImage librarianTalk3 = ImageIO.read(new File("librarianTalk3.jpg"));
			panel.addImage(librarianTalk3);
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
	}

	else if(place==Place.SCHOOL)
	{
		try {
			BufferedImage school = ImageIO.read(new File("school.jpg"));
			panel.addImage(school);
		} catch (IOException e) {
			e.printStackTrace();
		}

		JButton toTown = new JButton("Back to Town");
		toTown.setPreferredSize(new Dimension(170, 40));
		toTown.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.TOWN2);
			}
		});
		panel.addButton(toTown);

		JButton talkToStudich = new JButton("Talk to Professor Studich");
		talkToStudich.setPreferredSize(new Dimension(170, 40));
		talkToStudich.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.STUDICHTALK0);
			}
		});
		panel.addButton(talkToStudich);
	}

	else if(place==Place.STUDICHTALK0)
	{
		try {
			BufferedImage studichTalk0 = ImageIO.read(new File("studichTalk0.jpg"));
			panel.addImage(studichTalk0);
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (timeCheck.equals("") || timeCheck.equals("saw tree") || timeCheck.equals("read book")) {
			JButton goodbye = new JButton("Goodbye");
			goodbye.setPreferredSize(new Dimension(170, 40));
			goodbye.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.SCHOOL);
				}
			});
			panel.addButton(goodbye);
		}
		if (timeCheck.equals("told about studich")) {
			JButton talkToStudich = new JButton("Ask why trees get sick from polluted water");
			talkToStudich.setPreferredSize(new Dimension(250, 40));
			talkToStudich.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.STUDICHTALK1);
				}
			});
			panel.addButton(talkToStudich);
		}
	}else if(place==Place.STUDICHTALK0)
	{
		try {
			BufferedImage studichTalk0 = ImageIO.read(new File("studichTalk0.jpg"));
			panel.addImage(studichTalk0);
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (timeCheck.equals("") || timeCheck.equals("saw tree") || timeCheck.equals("read book")) {
			JButton goodbye = new JButton("Goodbye");
			goodbye.setPreferredSize(new Dimension(170, 40));
			goodbye.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.SCHOOL);
				}
			});
			panel.addButton(goodbye);
		}
		if (timeCheck.equals("told about studich")) {
			JButton talkToStudich = new JButton("Ask why trees get sick from polluted water");
			talkToStudich.setPreferredSize(new Dimension(250, 40));
			talkToStudich.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.STUDICHTALK1);
				}
			});
			panel.addButton(talkToStudich);
		}
	}else if(place==Place.STUDICHTALK1)
	{
		try {
			BufferedImage studichTalk1 = ImageIO.read(new File("studichTalk1.jpg"));
			panel.addImage(studichTalk1);
		} catch (IOException e) {
			e.printStackTrace();
		}

		JButton back = new JButton("Back");
		back.setPreferredSize(new Dimension(90, 40));
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.STUDICHTALK0);
			}
		});
		panel.addButton(back);
		JButton talkToStudich = new JButton("Ask where to get clean water");
		talkToStudich.setPreferredSize(new Dimension(250, 40));
		talkToStudich.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.STUDICHTALK2);
				timeCheck = "told about stiles";
			}
		});
		panel.addButton(talkToStudich);
	}

	else if(place==Place.STUDICHTALK2)
	{
		try {
			BufferedImage studichTalk2 = ImageIO.read(new File("studichTalk2.jpg"));
			panel.addImage(studichTalk2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		JButton back = new JButton("Back");
		back.setPreferredSize(new Dimension(90, 40));
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.STUDICHTALK1);
			}
		});
		panel.addButton(back);
		JButton suggestReuse = new JButton("Suggest that Professor Studich use a reusable coffee cup");
		suggestReuse.setPreferredSize(new Dimension(250, 40));
		suggestReuse.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.STUDICHTALK3);
			}
		});
		panel.addButton(suggestReuse);
	}

	else if(place==Place.STUDICHTALK3)
	{
		try {
			BufferedImage studichTalk3 = ImageIO.read(new File("studichTalk3.jpg"));
			panel.addImage(studichTalk3);
		} catch (IOException e) {
			e.printStackTrace();
		}

		JButton back = new JButton("Back");
		back.setPreferredSize(new Dimension(90, 40));
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.STUDICHTALK2);
			}
		});
		panel.addButton(back);
		JButton goodbye = new JButton("Goodbye");
		goodbye.setPreferredSize(new Dimension(250, 40));
		goodbye.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.STUDICHTALK3);
			}
		});
		panel.addButton(goodbye);
	}

	else if(place==Place.GROCERY)
	{
		try {
			BufferedImage grocery = ImageIO.read(new File("grocery.jpg"));
			panel.addImage(grocery);
		} catch (IOException e) {
			e.printStackTrace();
		}

		JButton toTown = new JButton("Back To Town");
		toTown.setPreferredSize(new Dimension(90, 40));
		toTown.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.TOWN2);
			}
		});
		panel.addButton(toTown);

		JButton talkToStiles = new JButton("Talk to Mr. Stiles");
		talkToStiles.setPreferredSize(new Dimension(160, 40));
		talkToStiles.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.GROCERTALK0);
			}
		});
		panel.addButton(talkToStiles);

	}

	else if(place==Place.GROCERTALK0)
	{
		try {
			BufferedImage grocerTalk0 = ImageIO.read(new File("grocerTalk0.jpg"));
			panel.addImage(grocerTalk0);
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (timeCheck.equals("") || timeCheck.equals("saw tree") || timeCheck.equals("read book")
				|| timeCheck.equals("told about studich")) {
			JButton goodbye = new JButton("Goodbye");
			goodbye.setPreferredSize(new Dimension(140, 40));
			goodbye.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.SCHOOL);
				}
			});
			panel.addButton(goodbye);
		}
		if (timeCheck.equals("told about stiles")) {
			JButton talkToStiles = new JButton("Ask where Mr. Stiles gets his clean water");
			talkToStiles.setPreferredSize(new Dimension(250, 40));
			talkToStiles.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.GROCERTALK1);
				}
			});
			panel.addButton(talkToStiles);
		}

	}else if(place==Place.GROCERTALK1)
	{
		try {
			BufferedImage grocerTalk1 = ImageIO.read(new File("grocerTalk1.jpg"));
			panel.addImage(grocerTalk1);
		} catch (IOException e) {
			e.printStackTrace();
		}

		JButton back = new JButton("Back");
		back.setPreferredSize(new Dimension(90, 40));
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.GROCERTALK0);
			}
		});
		panel.addButton(back);
		JButton talkToStiles = new JButton("Ask where you could get clean water");
		talkToStiles.setPreferredSize(new Dimension(230, 40));
		talkToStiles.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.GROCERTALK2);
			}
		});
		panel.addButton(talkToStiles);

	}else if(place==Place.GROCERTALK2)
	{
		try {
			BufferedImage grocerTalk2 = ImageIO.read(new File("grocerTalk2.jpg"));
			panel.addImage(grocerTalk2);
		} catch (IOException e) {
			e.printStackTrace();
		}

		JButton back = new JButton("Back");
		back.setPreferredSize(new Dimension(90, 40));
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.GROCERTALK1);
			}
		});
		panel.addButton(back);
		JButton talkToStiles = new JButton("Explain tree situation to Mr. Stiles");
		talkToStiles.setPreferredSize(new Dimension(230, 40));
		talkToStiles.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.GROCERTALK3);
			}
		});
		panel.addButton(talkToStiles);
	}else if(place==Place.GROCERTALK3)
	{
		try {
			BufferedImage grocerTalk3 = ImageIO.read(new File("grocerTalk3.jpg"));
			panel.addImage(grocerTalk3);
		} catch (IOException e) {
			e.printStackTrace();
		}

		JButton back = new JButton("Back");
		back.setPreferredSize(new Dimension(90, 40));
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.GROCERTALK2);
			}
		});
		panel.addButton(back);
		JButton goodbye = new JButton("Goodbye");
		goodbye.setPreferredSize(new Dimension(230, 40));
		goodbye.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.GROCERY);
			}
		});
		panel.addButton(goodbye);
	}else if(place==Place.GROCERTALK5)
	{
		try {
			BufferedImage grocerTalk5 = ImageIO.read(new File("grocerTalk5.jpg"));
			panel.addImage(grocerTalk5);
		} catch (IOException e) {
			e.printStackTrace();
		}
		JButton goodbye = new JButton("Goodbye");
		goodbye.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.GROCERY);

			}
		});
	}

	else if(place==Place.GROCERTALK6)
	{
		try {
			BufferedImage grocerTalk6 = ImageIO.read(new File("grocerTalk6.jpg"));
			panel.addImage(grocerTalk6);
		} catch (IOException e) {
			e.printStackTrace();
		}
		JButton goodbye = new JButton("Goodbye");
		goodbye.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.GROCERY);
			}
		});
	}

	else if(place==Place.APPLE)
	{
		try {
			BufferedImage apple = ImageIO.read(new File("apple.jpg"));
			panel.addImage(apple);
		} catch (IOException e) {
			e.printStackTrace();
		}
		JButton next = new JButton("Next");
		next.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Driver.load(Place.GROCERTALK4);
			}
		});

	}

	else if(place==Place.TOWNHALL)
	{
		try {
			BufferedImage townhall = ImageIO.read(new File("townhall.jpg"));
			panel.addImage(townhall);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Click on the person to talk to them.");
		MouseCoords talkToMayor = new MouseCoords(559, 161, 559 + 145, 161 + 199, Place.MAYORTALK0);
		panel.addMouseCoords(talkToMayor);
		System.out.println("Click on the door to leave.");
		MouseCoords leaveTownHall = new MouseCoords(0, 131, 180, 600, Place.TOWN1);
		panel.addMouseCoords(leaveTownHall);
	}

	else if(place==Place.MAYORTALK0)
	{
		try {
			BufferedImage mayortalk0 = ImageIO.read(new File("mayortalk0.jpg"));
			panel.addImage(mayortalk0);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (timeCheck.equals("told about mayor")) {
			JButton inquire = new JButton("Inquire where to get clean water for trees");
			inquire.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.MAYORTALK1);
				}
			});
		} else if (timeCheck.equals("know about dump runoff")) {
			JButton talkAboutRunoff = new JButton("Tell the mayor about the dump runoff");
			talkAboutRunoff.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.MAYORTALK5);
				}
			});
		} else if (timeCheck.equals("have idea")) {
			JButton idea = new JButton("Tell the mayor you have an idea");
			idea.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.MAYORTALK7);
				}
			});

		}
	}

		else if (place == Place.MAYORTALK1) {
			try {
				BufferedImage mayortalk1 = ImageIO.read(new File("mayortalk1.jpg"));
				panel.addImage(mayortalk1);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton thank = new JButton("Thank the arrogant mayor");
			// glad.setPreferredSize(newDimension(90,40));
			thank.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.MAYORTALK2);
				}
			});

		}

		else if (place == Place.MAYORTALK2) {
			try {
				BufferedImage mayortalk2 = ImageIO.read(new File("mayortalk2.jpg"));
				panel.addImage(mayortalk2);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton suggest = new JButton(
					"Mention the bike you saw outside and suggest a bike lane to encourage more bikes");
			// glad.setPreferredSize(newDimension(90,40));
			suggest.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.MAYORTALK3);
				}
			});

		}

		else if (place == Place.MAYORTALK3) {
			try {
				BufferedImage mayortalk3 = ImageIO.read(new File("mayortalk3.jpg"));
				panel.addImage(mayortalk3);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton glad = new JButton("Express that you are happy he likes the idea");
			//glad.setPreferredSize(newDimension(90, 40));
			glad.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.MAYORTALK4);
				}
			});

		}

		else if (place == Place.MAYORTALK4) {
			try {
				BufferedImage mayortalk4 = ImageIO.read(new File("mayortalk4.jpg"));
				panel.addImage(mayortalk4);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton goodbye = new JButton("Goodbye");
			//goodbye.setPreferredSize(newDimension(90, 40));
			goodbye.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.TOWNHALL);
				}
			});

		}

		else if (place == Place.MAYORTALK5) {
			try {
				BufferedImage mayortalk5 = ImageIO.read(new File("mayortalk5.jpg"));
				panel.addImage(mayortalk5);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton idk = new JButton("Admit you do not have an idea");
			//idk.setPreferredSize(newDimension(90, 40));
			idk.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.MAYORTALK6);
				}
			});

		}

		else if (place == Place.MAYORTALK6) {
			try {
				BufferedImage mayortalk6 = ImageIO.read(new File("mayortalk6.jpg"));
				panel.addImage(mayortalk6);
			} catch (IOException e) {
				e.printStackTrace();
			}
			timeCheck = "told to get idea";
			JButton goodbye = new JButton("Goodbye");
			//goodbye.setPreferredSize(newDimension(90, 40));
			goodbye.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.TOWNHALL);
				}
			});

		}

		else if (place == Place.MAYORTALK7) {
			try {
				BufferedImage mayortalk7 = ImageIO.read(new File("mayortalk7.jpg"));
				panel.addImage(mayortalk7);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton barrier = new JButton("Suggest building a barrier");
		//	barrier.setPreferredSize(newDimension(90, 40));
			barrier.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.MAYORTALK8);
				}
			});

		}

		else if (place == Place.MAYORTALK8) {
			try {
				BufferedImage mayortalk8 = ImageIO.read(new File("mayortalk8.jpg"));
				panel.addImage(mayortalk8);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton epa = new JButton("Suggest getting funding from the EPA");
		//	epa.setPreferredSize(newDimension(90, 40));
			epa.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.MAYORTALK9);
				}
			});

		}

		else if (place == Place.MAYORTALK9) {
			try {
				BufferedImage mayortalk9 = ImageIO.read(new File("mayortalk9.jpg"));
				panel.addImage(mayortalk9);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton next = new JButton("Next");
			//next.setPreferredSize(newDimension(90, 40));
			next.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.BUILDTHATWALL);
				}
			});

		}

		else if (place == Place.DUMP) {
			try {
				BufferedImage dump = ImageIO.read(new File("dump.jpg"));
				panel.addImage(dump);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton back = new JButton("Back");
			//back.setPreferredSize(newDimension(90, 40));
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADASFOREST);
				}
			});

			System.out.println("Click on the person to talk to them.");
			MouseCoords dumpMan = new MouseCoords(84, 306, 84 + 144, 600, Place.DUMPTALK0);
			panel.addMouseCoords(dumpMan);

		}

		else if (place == Place.DUMPTALK0) {
			try {
				BufferedImage dumptalk0 = ImageIO.read(new File("dumpTalk0.jpg"));
				panel.addImage(dumptalk0);
			} catch (IOException e) {
				e.printStackTrace();
			}

			if (timeCheck.equals("told to find water source")) {

				JButton idea = new JButton("Ask about polluted water");
				//idea.setPreferredSize(newDimension(90, 40));
				idea.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Driver.load(Place.DUMPTALK1);
					}
				});
				panel.addButton(idea);
			} else if (timeCheck.equals("told to get idea")) {
				JButton idea = new JButton("Ask for idea on runoff pollution prevention");
				//idea.setPreferredSize(newDimension(90, 40));
				idea.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Driver.load(Place.DUMPTALK2);
					}
				});
				panel.addButton(idea);
			}
			JButton goodbye = new JButton("Goodbye");
			//goodbye.setPreferredSize(newDimension(90, 40));
			goodbye.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.DUMP);
				}
			});

			panel.addButton(goodbye);

		}

		else if (place == Place.DUMPTALK1) {
			try {
				BufferedImage dumptalk1 = ImageIO.read(new File("dumpTalk1.jpg"));
				panel.addImage(dumptalk1);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton idea = new JButton("Ask about polluted water");
		//	idea.setPreferredSize(newDimension(90, 40));
			idea.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.DUMPTALK2);
					timeCheck = "know about dump runoff";
				}
			});
			//panel.addButton(goodbye);
			panel.addButton(idea);
		}

		else if (place == Place.DUMPTALK1) {
			try {
				BufferedImage dumptalk2 = ImageIO.read(new File("dumpTalk2.jpg"));
				panel.addImage(dumptalk2);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton idea = new JButton("Ask how to prevent");
			//idea.setPreferredSize(newDimension(90, 40));
			idea.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.DUMPTALK2);
				}
			});
			panel.addButton(idea);
		}

		else if (place == Place.DUMPTALK2) {
			try {
				BufferedImage dumptalk2 = ImageIO.read(new File("dumpTalk2.jpg"));
				panel.addImage(dumptalk2);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton goodbye = new JButton("Goodbye");
	//		goodbye.setPreferredSize(newDimension(90, 40));
			goodbye.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.DUMP);
				}
			});
			panel.addButton(goodbye);
		}

		else if (place == Place.BUILDTHATWALL) {
			try {
				BufferedImage buildthatwall = ImageIO.read(new File("buildthatwall.jpg"));
				panel.addImage(buildthatwall);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton next = new JButton("Next");
			//next.setPreferredSize(newDimension(90, 40));
			next.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.END1);
				}
			});
			panel.addButton(next);
		}

		else if (place == Place.END1) {
			try {
				BufferedImage end1 = ImageIO.read(new File("end1.jpg"));
				panel.addImage(end1);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton next = new JButton("Next");
			//next.setPreferredSize(newDimension(90, 40));
			next.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.END2);
				}
			});
			panel.addButton(next);
		}

		else if (place == Place.END2) {
			try {
				BufferedImage end2 = ImageIO.read(new File("end2.jpg"));
				panel.addImage(end2);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton back = new JButton("Back");
			//back.setPreferredSize(newDimension(90, 40));
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.END1);
				}
			});
			JButton next = new JButton("Next");
			//next.setPreferredSize(newDimension(90, 40));
			next.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.END3);
				}
			});
			panel.addButton(next);
			panel.addButton(back);
		}

		else if (place == Place.END3) {
			try {
				BufferedImage end3 = ImageIO.read(new File("end3.jpg"));
				panel.addImage(end3);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton back = new JButton("Back");
			//back.setPreferredSize(newDimension(90, 40));
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.END2);
				}
			});
			JButton next = new JButton("Next");
			//next.setPreferredSize(newDimension(90, 40));
			next.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.END4);
				}
			});
			panel.addButton(next);
			panel.addButton(back);
		}

		else if (place == Place.END4) {
			try {
				BufferedImage end4 = ImageIO.read(new File("end4.jpg"));
				panel.addImage(end4);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton back = new JButton("Back");
			//back.setPreferredSize(newDimension(90, 40));
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.END3);
				}
			});
			JButton next = new JButton("Next");
			//next.setPreferredSize(newDimension(90, 40));
			next.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.LARGEBAGUETTEGAMES);
				}
			});
			panel.addButton(next);
			panel.addButton(back);
		}

		else if (place == Place.LARGEBAGUETTEGAMES) {
			try {
				BufferedImage largebaguettegames = ImageIO.read(new File("largebaguettegames.png"));
				panel.addImage(largebaguettegames);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton next = new JButton("Next");
			//next.setPreferredSize(newDimension(90, 40));
			next.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.YOUWIN);
				}
			});
			panel.addButton(next);
		}

		else if (place == Place.YOUWIN) {
			try {
				BufferedImage youwin = ImageIO.read(new File("youwin.jpg"));
				panel.addImage(youwin);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton returnHome = new JButton("Return Home");
			//play.setPreferredSize(newDimension(90, 40));
			returnHome.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.HOMESCREEN);
				}
			});
			panel.addButton(returnHome);
		}

	}
}