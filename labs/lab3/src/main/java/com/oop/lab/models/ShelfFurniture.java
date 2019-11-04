package com.oop.lab.models;

public class ShelfFurniture extends Furniture {

    private final int THING_MARGIN = 1;
    private final int BORDER_WIDTH = 1;

    private int shelfWidth = 1;

    private int getShelfWidth() {
        return shelfWidth;
    }

    private void setShelfWidth(int shelfWidth) {
        this.shelfWidth = shelfWidth;
    }

    private String makeShelf(int width) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < width; i++) {
            stringBuilder.append("-");
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    @Override
    public String showStuff() {
        if (stuff.size() == 0) return "";

        stuff.forEach(thing -> setShelfWidth(getShelfWidth() + thing.length() + 2 * THING_MARGIN + BORDER_WIDTH));

        final String SHELF = makeShelf(shelfWidth);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SHELF);
        for (String s : stuff) {
            stringBuilder.append("| " + s + " ");
        }
        stringBuilder.append("|\n");
        stringBuilder.append(SHELF);
        return stringBuilder.toString();
    }
}
