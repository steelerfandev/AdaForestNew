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
			} 
			catch (IOException e) {
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
		} 
		else if (place == Place.LIBRARY) {
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


	}

}