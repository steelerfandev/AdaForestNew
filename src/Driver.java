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
						Driver.load(Place.LIBRARIANTALK1);
					}
				});
				panel.addButton(askForInfo);
			}
			if (timeCheck.equals("readBook")) {
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

		else if (place == Place.LIBRARIANTALK1) {
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

		else if (place == Place.BOOK1) {
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
		} else if (place == Place.BOOK2) {
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

		else if (place == Place.BOOK3) {
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

		else if (place == Place.BOOK4) {
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
		} else if (place == Place.BOOK5) {
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

		else if (place == Place.BOOK5) {
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
			timeCheck = "read book";
			panel.addButton(exit);
		}

		else if (place == Place.LIBRARIANTALK2) {
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

		else if (place == Place.RECEIPT) {
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

		else if (place == Place.LIBRARIANTALK3) {
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

		else if (place == Place.SCHOOL) {
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

		else if (place == Place.STUDICHTALK0) {
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
		} else if (place == Place.STUDICHTALK0) {
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
		} else if (place == Place.STUDICHTALK1) {
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

		else if (place == Place.STUDICHTALK2) {
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

		else if (place == Place.STUDICHTALK3) {
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

		else if (place == Place.GROCERY) {
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

		else if (place == Place.GROCERTALK0) {
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

		} else if (place == Place.GROCERTALK1) {
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

		} else if (place == Place.GROCERTALK2) {
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
		}
		else if (place == Place.GROCERTALK3) {
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
		}
	}
}