package com.oop.lab;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ShapesGenerator {

    public static final ShapesGenerator INSTANCE = new ShapesGenerator();
    private final float SHAPE_MAX_SIZE = 100f;

    private float makeRandomFloat(float min, float max) {
        Random r = new Random();
        return min + r.nextFloat() * (max - min);
    }

    private Paint makeRandomColor() {
        Random r = new Random();
        return Color.rgb(
                ThreadLocalRandom.current().nextInt(0, 255),
                ThreadLocalRandom.current().nextInt(0, 255),
                ThreadLocalRandom.current().nextInt(0, 255)
        );
    }

    private Shape makeSingleShape(float areaWidth, float areaHeight) {
        final float X_PART = makeRandomFloat(0, areaWidth);
        final float Y_PART = makeRandomFloat(0, areaHeight);

        Shape result = null;
        int strategy = ThreadLocalRandom.current().nextInt(0, 4);
        switch (strategy) {
            case 0:
                result = new Circle(X_PART, Y_PART, makeRandomFloat(0, SHAPE_MAX_SIZE / 2));
                result.setFill(makeRandomColor());
                break;
            case 1:
                result = new Rectangle(X_PART, Y_PART,
                        makeRandomFloat(0, SHAPE_MAX_SIZE),
                        makeRandomFloat(0, SHAPE_MAX_SIZE)
                );
                result.setFill(makeRandomColor());
                break;
            case 2:
                Arc arc = new Arc();
                arc.setCenterX(X_PART);
                arc.setCenterY(Y_PART);
                arc.setRadiusX(X_PART / 2);
                arc.setRadiusY(Y_PART / 2);
                arc.setStartAngle(makeRandomFloat(1, 359));
                arc.setLength(makeRandomFloat(1, 359));
                arc.setType(ArcType.ROUND);
                result = arc;
                result.setFill(makeRandomColor());
                break;
            case 3:
                result = new Line(X_PART, Y_PART,
                        X_PART + makeRandomFloat(0, SHAPE_MAX_SIZE),
                        Y_PART + makeRandomFloat(0, SHAPE_MAX_SIZE)
                );
                result.setStroke(makeRandomColor());
                break;
        }
        result.setSmooth(true);
        return result;
    }

    public List<Shape> makeShapes(int count, float areaWidth, float areaHeight) {
        ArrayList<Shape> result = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            result.add(makeSingleShape(areaWidth, areaHeight));
        }
        return result;
    }

    private ShapesGenerator() {
    }
}
