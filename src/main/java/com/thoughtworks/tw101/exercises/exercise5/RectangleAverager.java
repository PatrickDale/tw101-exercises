package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        float sumAreas = 0;
        for (Rectangle rect : rectangles) {
            sumAreas += rect.area();
        }
        return sumAreas / rectangles.length;
    }
}
