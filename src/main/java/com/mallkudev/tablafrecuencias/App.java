package com.mallkudev.tablafrecuencias;

import org.jfree.ui.RefineryUtilities;

import com.mallkudev.tablafrecuencias.gui.MainFrm;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				MainFrm frm = new MainFrm();
				RefineryUtilities.centerFrameOnScreen(frm);
				frm.setVisible(true);
			}
		});
	}
}
