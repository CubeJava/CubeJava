package com.cubejava.tools;

import javax.swing.JFrame;

public class Interface {
	public static void createI(String title, int sizeX, int sizeY, boolean bypass) {
		JFrame frame = new JFrame(title);
		frame.setSize(sizeX, sizeY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		if (sizeX < 3000 || sizeX == 3000) {
			if (bypass == false) {
				System.out.print("please do not try to make your window over 3000 pixels wide.");
				frame.setVisible(false);
			} else {
				frame.setVisible(true);
				System.out.print("bypass enabled. your window can be over 300 pixels wide.");
			}
		}
		if (sizeY < 3000 || sizeY == 3000) {
			if (bypass == false) {
				System.out.print("please do not try to make your window over 3000 pixels tall.");
				frame.setVisible(false);
			} else {
				frame.setVisible(true);
				System.out.print("bypass enabled. your window can be over 3000 pixels tall.");
			}
		}
	}
}
