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
			play.setPreferredSize(new Dimension(130, 40));
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
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADAFOREST1);
				}
			});
			panel.addButton(back);
			JButton next = new JButton("Next");
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
			back.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADAFOREST1);
				}
			});
			panel.addButton(back);
			JButton next = new JButton("Next");
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

			JButton toDownstairs = new JButton("Downstairs");
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

			JButton toOutside = new JButton("To Outside");
			toOutside.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADASHOUSEEXTERIOR);
				}
			});
			panel.addButton(toOutside);

			if (timeCheck == "") {
				JButton talkToMom = new JButton("Talk To Mom");
				talkToMom.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Driver.load(Place.MOMTALK1);
					}
				});
				panel.addButton(talkToMom);
			} else {

				JButton talkToMom = new JButton("Talk To Mom");
				talkToMom.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Driver.load(Place.MOMTALK0);
					}
				});
				panel.addButton(talkToMom);
			}
			JButton back = new JButton("Back To Room");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADASROOM);
				}
			});
			panel.addButton(back);

		} else if (place == Place.ADASHOUSEEXTERIOR) {
			try {
				BufferedImage adashouseexterior = ImageIO.read(new File("adashouseexterior.jpg"));
				panel.addImage(adashouseexterior);
			} catch (IOException e) {
				e.printStackTrace();
			}

			JButton toTown = new JButton("To Town");
			toTown.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.TOWN1);
				}
			});
			panel.addButton(toTown);

			JButton back = new JButton("Back Inside");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADASHOUSEINTERIOR);
				}
			});
			panel.addButton(back);

			JButton toForest = new JButton("To Forest");
			toForest.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADASFOREST);
				}
			});
			panel.addButton(toForest);
		}

		else if (place == Place.ADASFOREST) {
			try {
				BufferedImage adasforest = ImageIO.read(new File("adasforest.jpg"));
				panel.addImage(adasforest);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton back = new JButton("Back");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADASHOUSEEXTERIOR);
				}
			});
			panel.addButton(back);
			if (timeCheck.equals("")) {
				JButton explore = new JButton("Explore");
				explore.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Driver.load(Place.ADASTREE);
					}
				});
				panel.addButton(explore);
			}
			

			if (timeCheck.equals("told to find water source")) {
				JButton distance = new JButton("What is that place in the distance?");
				distance.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Driver.load(Place.DUMP);
					}
				});
				panel.addButton(distance);
			}
			if(timeCheck.equals("told to get idea")){
				JButton distance = new JButton("Dump");
				distance.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Driver.load(Place.DUMP);
					}
				});
				panel.addButton(distance);
			}
		}

		else if (place == Place.ADASTREE) {
			try {
				BufferedImage adastree = ImageIO.read(new File("adastree.jpg"));
				panel.addImage(adastree);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton back = new JButton("Back");
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
			goodbye.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADASHOUSEINTERIOR);
				}
			});
			panel.addButton(goodbye);

			if (timeCheck.equals("saw tree")) {
				JButton theTreesAreSick = new JButton("Tell Mom about sick trees");
				theTreesAreSick.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Driver.load(Place.MOMTALK2);
					}
				});
				panel.addButton(theTreesAreSick);
			}

			if (timeCheck.equals("told to get idea")) {
				JButton idk = new JButton("Ask for idea on runoff pollution prevention");
				idk.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Driver.load(Place.MOMTALK3);
					}
				});
				panel.addButton(idk);
			}
		}
		else if(place==Place.MOMTALK3){
			try {
				BufferedImage momTalk3 = ImageIO.read(new File("momTalk3.jpg"));
				panel.addImage(momTalk3);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton goodbye = new JButton("Goodbye");
			goodbye.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADASHOUSEINTERIOR);
				}
			});
			panel.addButton(goodbye);
		}

		else if (place == Place.MOMTALK1) {
			try {
				BufferedImage momTalk1 = ImageIO.read(new File("momTalk1.jpg"));
				panel.addImage(momTalk1);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton goodbye = new JButton("Goodbye");
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
/*			JButton back = new JButton("Back");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.MOMTALK0);
				}
			});
			panel.addButton(back);*/
			JButton thanks = new JButton("Goodbye");
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
			JButton toTown2 = new JButton("To West Town");
			toTown2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.TOWN2);
				}
			});
			panel.addButton(toTown2);

			JButton toSchool = new JButton("To School");
			toSchool.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.SCHOOL);
				}
			});
			panel.addButton(toSchool);

			JButton toTownHall = new JButton("To Town Hall");
			toTownHall.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.TOWNHALL);
				}
			});
			panel.addButton(toTownHall);

			JButton back = new JButton("Back to Home");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADASHOUSEEXTERIOR);
				}
			});
			panel.addButton(back);
		}

		else if (place == Place.TOWN2) {
			try {
				BufferedImage town2 = ImageIO.read(new File("town2.jpg"));
				panel.addImage(town2);
			} catch (IOException e) {
				e.printStackTrace();
			}

			JButton toGroceryStore = new JButton("To Grocery Store");
			toGroceryStore.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.GROCERY);
				}
			});
			panel.addButton(toGroceryStore);

			JButton toLibrary = new JButton("To Library");
			toLibrary.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.LIBRARY);
				}
			});
			panel.addButton(toLibrary);

			JButton toTown1 = new JButton("To East Town");
			toTown1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.TOWN1);
				}
			});
			panel.addButton(toTown1);

		} else if (place == Place.LIBRARY) {
			try {
				BufferedImage library = ImageIO.read(new File("library.jpg"));
				panel.addImage(library);
			} catch (IOException e) {
				e.printStackTrace();
			}

			JButton talkToLibrarian = new JButton("Talk to the Librarian, Ms. Church");
			talkToLibrarian.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.LIBRARIANTALK0);
				}
			});
			panel.addButton(talkToLibrarian);

			JButton back = new JButton("Back to Town");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.TOWN2);
				}
			});
			panel.addButton(back);

			if (timeCheck.equals("talked to librarian")) {
				JButton openBook = new JButton("Open Book");
				openBook.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Driver.load(Place.BOOK1);
					}
				});
				panel.addButton(openBook);
			}

		}

		else if (place == Place.LIBRARIANTALK0) {
			try {
				BufferedImage librarianTalk0 = ImageIO.read(new File("librarianTalk0.jpg"));
				panel.addImage(librarianTalk0);
			} catch (IOException e) {
				e.printStackTrace();
			}

			JButton goodbye = new JButton("Goodbye");
			goodbye.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.LIBRARY);
				}
			});
			panel.addButton(goodbye);

			if (timeCheck.equals("saw tree")) {
				JButton askForInfo = new JButton("Ask for information on trees");
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
				askForInfo.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Driver.load(Place.LIBRARIANTALK2);
					}
				});
				panel.addButton(askForInfo);
			}
			if (timeCheck.equals("told to get idea")) {
				JButton desole = new JButton("Ask for idea on runoff pollution prevention");
				desole.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Driver.load(Place.LIBRARIANTALK4);
					}
				});
				panel.addButton(desole);
			}
		}
		else if(place==Place.LIBRARIANTALK4){
			try {
				BufferedImage librarianTalk4 = ImageIO.read(new File("librarianTalk4.jpg"));
				panel.addImage(librarianTalk4);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton goodbye = new JButton("Goodbye");
			goodbye.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.LIBRARY);
				}
			});
			panel.addButton(goodbye);
		}

		else if (place == Place.LIBRARIANTALK1) {
			try {
				BufferedImage librarianTalk1 = ImageIO.read(new File("librarianTalk1.jpg"));
				panel.addImage(librarianTalk1);
			} catch (IOException e) {
				e.printStackTrace();
			}

			/*JButton back = new JButton("Back");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.LIBRARIANTALK0);
				}
			});
			panel.addButton(back);*/

			if (timeCheck.equals("saw tree")) {
				JButton goBackToOpenBook = new JButton("Go back to open book");
				goBackToOpenBook.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						timeCheck = "talked to librarian";
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

			JButton next = new JButton("Next Page");
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
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.BOOK1);
				}
			});
			panel.addButton(back);

			JButton next = new JButton("Next Page");
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

			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.BOOK2);
				}
			});
			panel.addButton(back);

			JButton next = new JButton("Next Page");
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
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.BOOK3);
				}
			});
			panel.addButton(back);

			JButton next = new JButton("Next Page");
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
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.BOOK4);
				}
			});
			panel.addButton(back);

			JButton exit = new JButton("Exit Book");
			exit.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					timeCheck = "read book";
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
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.BOOK4);
				}
			});
			panel.addButton(back);

			JButton exit = new JButton("Exit Book");
			exit.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					timeCheck = "read book";
					Driver.load(Place.LIBRARY);
				}
			});
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

			JButton recycle = new JButton("Remind Mrs. Church to recycle her receipt");
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
			toTown.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.TOWN1);
				}
			});
			panel.addButton(toTown);

			JButton talkToStudich = new JButton("Talk to Professor Studich");
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

			JButton goodbye = new JButton("Goodbye");
			goodbye.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.SCHOOL);
				}
			});
			panel.addButton(goodbye);

			if (timeCheck.equals("told about studich")) {
				JButton talkToStudich = new JButton("Ask why trees get sick from polluted water");
				talkToStudich.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Driver.load(Place.STUDICHTALK1);
					}
				});
				panel.addButton(talkToStudich);
			}
			if (timeCheck.equals("told to get idea")) {
				JButton idea = new JButton("Ask for idea on runoff pollution prevention");
				idea.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Driver.load(Place.STUDICHTALK4);
					}
				});
				panel.addButton(idea);
			}
		} else if (place == Place.STUDICHTALK4) {
			try {
				BufferedImage studichTalk4 = ImageIO.read(new File("studichTalk4.jpg"));
				panel.addImage(studichTalk4);
			} catch (IOException e) {
				e.printStackTrace();
			}

			/*JButton back = new JButton("Back");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.SCHOOL);
				}
			});
			panel.addButton(back);*/

			JButton yes = new JButton("Yes!");
			yes.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.STUDICHTALK5);
				}
			});
			panel.addButton(yes);
		} else if (place == Place.STUDICHTALK5) {
			try {
				BufferedImage studichTalk5 = ImageIO.read(new File("studichTalk5.jpg"));
				panel.addImage(studichTalk5);
			} catch (IOException e) {
				e.printStackTrace();
			}

			/*JButton back = new JButton("Back");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.STUDICHTALK4);
				}
			});
			panel.addButton(back);*/

			JButton thx = new JButton("Thank you!");
			thx.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.SCHOOL);
					timeCheck = "have idea";
				}
			});
			panel.addButton(thx);
		}

		else if (place == Place.STUDICHTALK1) {
			try {
				BufferedImage studichTalk1 = ImageIO.read(new File("studichTalk1.jpg"));
				panel.addImage(studichTalk1);
			} catch (IOException e) {
				e.printStackTrace();
			}

			/*JButton back = new JButton("Back");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.STUDICHTALK0);
				}
			});*/
/*			panel.addButton(back);*/
			JButton talkToStudich = new JButton("Ask where to get clean water");
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
			/*JButton back = new JButton("Back");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.STUDICHTALK1);
				}
			});*/
			/*panel.addButton(back);*/
			JButton suggestReuse = new JButton("Suggest that Professor Studich use a reusable coffee cup");
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

			/*JButton back = new JButton("Back");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.STUDICHTALK2);
				}
			});*/
			/*panel.addButton(back);*/
			JButton goodbye = new JButton("Goodbye");
			goodbye.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.SCHOOL);
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

			JButton talkToStiles = new JButton("Talk to Mr. Stiles");
			talkToStiles.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.GROCERTALK0);
				}
			});
			panel.addButton(talkToStiles);

			JButton toTown = new JButton("Back To Town");
			toTown.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.TOWN2);
				}
			});
			panel.addButton(toTown);

		}

		else if (place == Place.GROCERTALK0) {
			try {
				BufferedImage grocerTalk0 = ImageIO.read(new File("grocerTalk0.jpg"));
				panel.addImage(grocerTalk0);
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
			panel.addButton(goodbye);

			if (timeCheck.equals("told about stiles")) {
				JButton talkToStiles = new JButton("Ask where Mr. Stiles gets his clean water");

				talkToStiles.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Driver.load(Place.GROCERTALK1);
					}
				});
				panel.addButton(talkToStiles);
			}
			if(timeCheck.equals("told to get idea")){
				JButton ask=new JButton("Ask for idea on runoff pollution prevention");
				ask.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e){
						Driver.load(Place.GROCERTALK6);
					}
				});
				panel.addButton(ask);
			}

		} else if (place == Place.GROCERTALK1) {
			try {
				BufferedImage grocerTalk1 = ImageIO.read(new File("grocerTalk1.jpg"));
				panel.addImage(grocerTalk1);
			} catch (IOException e) {
				e.printStackTrace();
			}

			/*JButton back = new JButton("Back");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.GROCERTALK0);
				}
			});
			panel.addButton(back);*/
			JButton talkToStiles = new JButton("Ask where you could get clean water");
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

			/*JButton back = new JButton("Back");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.GROCERTALK1);
				}
			});
			panel.addButton(back);*/
			JButton talkToStiles = new JButton("Explain tree situation to Mr. Stiles");
			talkToStiles.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.GROCERTALK3);
				}
			});
			panel.addButton(talkToStiles);
		} else if (place == Place.GROCERTALK3) {
			try {
				BufferedImage grocerTalk3 = ImageIO.read(new File("grocerTalk3.jpg"));
				panel.addImage(grocerTalk3);
			} catch (IOException e) {
				e.printStackTrace();
			}

		/*	JButton back = new JButton("Back");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.GROCERTALK2);
				}
			});*/
			/*panel.addButton(back);*/
			JButton goodbye = new JButton("Okay");
			goodbye.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.APPLE);
				}
			});
			panel.addButton(goodbye);
			
		} else if (place == Place.GROCERTALK5) {
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
					timeCheck = "told about mayor";
					Driver.load(Place.GROCERY);
					

				}
			});
			panel.addButton(goodbye);
		}

		else if (place == Place.GROCERTALK6) {
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
			panel.addButton(goodbye);
		}

		else if (place == Place.APPLE) {
			try {
				BufferedImage apple = ImageIO.read(new File("apple.jpg"));
				panel.addImage(apple);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton back = new JButton("Back");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.GROCERTALK3);
				}
			});
			JButton next = new JButton("Tell Mr. Stiles that composting his apple would be better for the environment");
			next.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.GROCERTALK4);
				}
			});
			panel.addButton(back);
			panel.addButton(next);

		}

		else if (place == Place.GROCERTALK4) {
			try {
				BufferedImage grocerTalk4 = ImageIO.read(new File("grocerTalk4.jpg"));
				panel.addImage(grocerTalk4);
			} catch (IOException e) {
				e.printStackTrace();
			}
		/*	JButton back = new JButton("Back");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.APPLE);
				}
			});*/
			JButton next = new JButton("Suggest adding a store compost bin");
			next.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.GROCERTALK5);
				}
			});
			panel.addButton(next);

		}

		else if (place == Place.TOWNHALL) {
			try {
				BufferedImage townhall = ImageIO.read(new File("townhall.jpg"));
				panel.addImage(townhall);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton toTown = new JButton("Back to Town");
			toTown.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.TOWN1);
				}
			});
			panel.addButton(toTown);

			JButton talkToAkshath = new JButton("Talk to Mayor Akshath");
			talkToAkshath.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.MAYORTALK0);
				}
			});
			panel.addButton(talkToAkshath);
		}

		else if (place == Place.MAYORTALK0) {
			try {
				BufferedImage mayortalk0 = ImageIO.read(new File("mayortalk0.jpg"));
				panel.addImage(mayortalk0);

				if (timeCheck.equals("told about mayor")) {
					JButton inquire = new JButton("Inquire where to get clean water for trees");
					inquire.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							Driver.load(Place.MAYORTALK1);
						}
					});
					panel.addButton(inquire);
				}
				if (timeCheck.equals("know about dump runoff")) {
					JButton talkAboutRunoff = new JButton("Tell the mayor about the dump runoff");
					talkAboutRunoff.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							Driver.load(Place.MAYORTALK5);
						}
					});
					panel.addButton(talkAboutRunoff);
				}
				if (timeCheck.equals("have idea")) {
					JButton idea = new JButton("Tell the mayor you have an idea");
					idea.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							Driver.load(Place.MAYORTALK7);
						}
					});
					panel.addButton(idea);

				}

				//System.out.println("goodbye");
				JButton goodbye = new JButton("Goodbye");
				goodbye.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Driver.load(Place.TOWNHALL);
					}
				});

				panel.addButton(goodbye);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		else if (place == Place.MAYORTALK1) {
			try {
				BufferedImage mayortalk1 = ImageIO.read(new File("mayortalk1.jpg"));
				panel.addImage(mayortalk1);
			} catch (IOException e) {
				e.printStackTrace();
			}
			/*JButton back = new JButton("Back");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.MAYORTALK0);
				}
			});
			panel.addButton(back);
*/
			JButton thank = new JButton("Thank the arrogant mayor");
			thank.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.MAYORTALK2);
				}
			});
			panel.addButton(thank);

		}

		else if (place == Place.MAYORTALK2) {
			try {
				BufferedImage mayortalk2 = ImageIO.read(new File("mayortalk2.jpg"));
				panel.addImage(mayortalk2);
			} catch (IOException e) {
				e.printStackTrace();
			}
			/*JButton back = new JButton("Back");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.MAYORTALK1);
				}
			});*/
			/*panel.addButton(back);*/
			JButton suggest = new JButton("Mention the bike you saw outside & suggest that the town build a bike lane");
			suggest.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.MAYORTALK3);
				}
			});
			panel.addButton(suggest);
		}

		else if (place == Place.MAYORTALK3) {
			try {
				BufferedImage mayortalk3 = ImageIO.read(new File("mayortalk3.jpg"));
				panel.addImage(mayortalk3);
			} catch (IOException e) {
				e.printStackTrace();
			}
			/*JButton back = new JButton("Back");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.MAYORTALK2);
				}
			});
			panel.addButton(back);*/

			JButton glad = new JButton("Express that you are happy he likes the idea");
			glad.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.MAYORTALK4);
				}
			});
			panel.addButton(glad);

		}

		else if (place == Place.MAYORTALK4) {
			try {
				BufferedImage mayortalk3 = ImageIO.read(new File("mayorTalk4.jpg"));
				panel.addImage(mayortalk3);
			} catch (IOException e) {
				e.printStackTrace();
			}
			/*JButton back = new JButton("Back");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.MAYORTALK3);
				}
			});
			panel.addButton(back);*/

			JButton goodbye = new JButton("Goodbye");
			goodbye.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.TOWNHALL);
					timeCheck = "told to find water source";
				}
			});
			panel.addButton(goodbye);

		}

		else if (place == Place.MAYORTALK5) {
			try {
				BufferedImage mayortalk5 = ImageIO.read(new File("mayortalk5.jpg"));
				panel.addImage(mayortalk5);
			} catch (IOException e) {
				e.printStackTrace();
			}
			/*JButton back = new JButton("Back");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.TOWNHALL);
				}
			});
			panel.add(back);*/

			JButton idk = new JButton("Admit you do not have an idea");
			idk.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.MAYORTALK6);
				}
			});
			panel.addButton(idk);

		}

		else if (place == Place.MAYORTALK6) {
			try {
				BufferedImage mayortalk6 = ImageIO.read(new File("mayortalk6.jpg"));
				panel.addImage(mayortalk6);
			} catch (IOException e) {
				e.printStackTrace();
			}

			/*JButton back = new JButton("Back");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.MAYORTALK5);
				}
			});
			panel.add(back);
*/
			JButton goodbye = new JButton("Goodbye");
			goodbye.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.TOWNHALL);
					timeCheck = "told to get idea";
				}
			});
			panel.addButton(goodbye);

		}

		else if (place == Place.MAYORTALK7) {
			try {
				BufferedImage mayortalk7 = ImageIO.read(new File("mayortalk7.jpg"));
				panel.addImage(mayortalk7);
			} catch (IOException e) {
				e.printStackTrace();
			}
			/*JButton back = new JButton("Back");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.MAYORTALK0);
				}
			});
			panel.addButton(back);*/

			JButton barrier = new JButton("Suggest building a barrier");
			barrier.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.MAYORTALK8);
				}
			});
			panel.addButton(barrier);

		}

		else if (place == Place.MAYORTALK8) {
			try {
				BufferedImage mayortalk8 = ImageIO.read(new File("mayortalk8.jpg"));
				panel.addImage(mayortalk8);
			} catch (IOException e) {
				e.printStackTrace();
			}
			/*JButton back = new JButton("Back");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.MAYORTALK7);
				}
			});
			panel.addButton(back);*/

			JButton epa = new JButton("Suggest getting funding from the EPA");
			epa.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.MAYORTALK9);
				}
			});
			panel.addButton(epa);

		}

		else if (place == Place.MAYORTALK9) {
			try {
				BufferedImage mayortalk9 = ImageIO.read(new File("mayortalk9.jpg"));
				panel.addImage(mayortalk9);
			} catch (IOException e) {
				e.printStackTrace();
			}
			/*JButton back = new JButton("Back");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.BUILDTHATWALL);
				}
			});
			panel.addButton(back);
*/
			JButton next = new JButton("Next");
			next.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.LATER);
				}
			});
			panel.addButton(next);

		}

		else if (place == Place.DUMP) {
			try {
				BufferedImage dump = ImageIO.read(new File("dump.jpg"));
				panel.addImage(dump);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton back = new JButton("Back to Forest");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.ADASFOREST);
				}
			});

			JButton talkToJohn = new JButton("Talk to the dump manager");
			talkToJohn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.DUMPTALK0);
				}
			});
			panel.addButton(back);
			panel.addButton(talkToJohn);

		}

		else if (place == Place.DUMPTALK0) {
			try {
				BufferedImage dumptalk0 = ImageIO.read(new File("dumpTalk0.jpg"));
				panel.addImage(dumptalk0);
			} catch (IOException e) {
				e.printStackTrace();
			}

			/*JButton back = new JButton("Back");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.DUMP);
				}
			});
			panel.addButton(back);*/

			if (timeCheck.equals("told to find water source")) {
				JButton idea = new JButton("Ask if the dump is polluting the forest water");
				idea.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Driver.load(Place.DUMPTALK1);
					}
				});
				panel.addButton(idea);
			}
			if (timeCheck.equals("told to get idea")) {
				JButton idea = new JButton("Ask for idea on runoff pollution prevention");
				idea.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Driver.load(Place.DUMPTALK2);
					}
				});
				panel.addButton(idea);
			}
			JButton goodbye = new JButton("Goodbye");
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

			/*JButton back = new JButton("Back");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.DUMPTALK0);
					timeCheck = "know about dump runoff";
				}
			});
			// panel.addButton(goodbye);
			panel.addButton(back);*/

			JButton idea = new JButton("Goodbye");
			idea.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.DUMP);
					timeCheck = "know about dump runoff";
				}
			});
			// panel.addButton(goodbye);
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
			goodbye.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.DUMP);
				}
			});
			panel.addButton(goodbye);
		}

		else if (place == Place.LATER) {
			try {
				BufferedImage later = ImageIO.read(new File("later.jpg"));
				panel.addImage(later);
			} catch (IOException e) {
				e.printStackTrace();
			}

			JButton next = new JButton("Next");
			next.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.BUILDTHATWALL);
				}
			});
			panel.addButton(next);
		}

		else if (place == Place.BUILDTHATWALL) {
			try {
				BufferedImage buildthatwall = ImageIO.read(new File("buildthatwall.jpg"));
				panel.addImage(buildthatwall);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton next = new JButton("Next");
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
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.END1);
				}
			});
			JButton next = new JButton("Next");
			next.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.END3);
				}
			});
			panel.addButton(back);
			panel.addButton(next);
			
		}

		else if (place == Place.END3) {
			try {
				BufferedImage end3 = ImageIO.read(new File("end3.jpg"));
				panel.addImage(end3);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton back = new JButton("Back");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.END2);
				}
			});
			JButton next = new JButton("Next");
			next.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.END4);
				}
			});
			
			panel.addButton(back);
			panel.addButton(next);
		}

		else if (place == Place.END4) {
			try {
				BufferedImage end4 = ImageIO.read(new File("end4.jpg"));
				panel.addImage(end4);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton back = new JButton("Back");
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.END3);
				}
			});
			JButton next = new JButton("Next");
			next.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Driver.load(Place.LARGEBAGUETTEGAMES);
				}
			});
			
			panel.addButton(back);
			panel.addButton(next);
		}

		else if (place == Place.LARGEBAGUETTEGAMES) {
			try {
				BufferedImage largebaguettegames = ImageIO.read(new File("largebaguettegames.jpg"));
				panel.addImage(largebaguettegames);
			} catch (IOException e) {
				e.printStackTrace();
			}
			JButton next = new JButton("Next");
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
				JButton returnHome = new JButton("Return Home");
				returnHome.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						timeCheck="";
						Driver.load(Place.HOMESCREEN);
					}
				});
				panel.addButton(returnHome);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}
}