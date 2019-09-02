package com.demo.sanjay.converter;

import java.awt.Color;

import javax.swing.text.html.StyleSheet;

public class ColourConverter {
	public static String getHexaVal(String colourName) {
		StyleSheet s = new StyleSheet();
		Color clr = s.stringToColor(colourName);
		if (clr != null) {
			int r = clr.getRed();
			int g = clr.getGreen();
			int b = clr.getBlue();
			return String.format("%02x%02x%02x", r, g, b);
		} else {
			return "NA";
		}
	}
}