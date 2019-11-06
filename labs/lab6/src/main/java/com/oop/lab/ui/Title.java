package com.oop.lab.ui;

import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class Title extends Label {
    public Title(String s) {
        super(s);
        setTextFill(Palette.CONTRAST_TEXT);
        setFont(Font.font(20));
    }
}
