package com.sist.commons;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

public class ImageChange {
	public static Image getImage(ImageIcon icon, int w, int h) {
		return icon.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
	}
}
