package com.oop.lab.models;

public class CupboardFurniture extends Furniture {

    private final int SHELF_PADDING = 2;
    private int width = 1;

    private int getWidth() {
        return width;
    }

    private void setWidth(int width) {
        this.width = width;
    }

    private String makeShelf(int width) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < width + SHELF_PADDING * 2; i++) {
            stringBuilder.append("-");
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    @Override
    public String showStuff() {
        if (stuff.size() == 0) return "";

        stuff.forEach(thing -> {
            setWidth(Math.max(thing.length(), getWidth()));
        });
        final String SHELF = makeShelf(width);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SHELF);
        for (String s : stuff) {
            stringBuilder.append("| " + s + " |\n");
            stringBuilder.append(SHELF);
        }
        return stringBuilder.toString();
    }
}
