package models;

import helpers.Koviryalka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Shape {
    private ArrayList<Point> points = new ArrayList<>();

    public void addPoint(Point point){
        points.add(point);
    }

    public double getAverageSide() {
        return Koviryalka.getAvg(getSides());
    }

    public double getPerimeter() {
        return Koviryalka.getSum(getSides());
    }

    public double getLongestSide() {
        return Koviryalka.getMax(getSides());
    }

    private double[] getSides() {
        int n = points.size();
        double[] sides = new double[n];
        for (int i = 0; i < n; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % n);
            sides[i] = currentPoint.distance(nextPoint);
        }

        return sides;
    }
}
