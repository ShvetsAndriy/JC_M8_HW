package shapesclasses;

import interfaces.Borderable;
import interfaces.Drawable;

import java.awt.*;

public abstract class Shape implements Drawable, Borderable {
    private double borderWidth;
    private Color borderColor;
    private int borderTransparency;
    private double x;
    private double y;
    private double rotation;
    private String nameOfShape;

    public String getNameOfShape() {
        return nameOfShape;
    }

    public void setNameOfShape(String nameOfShape) {
        this.nameOfShape = nameOfShape;
    }

    public double getBorderWidth()
    {
        return borderWidth;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public int getBorderTransparency() {
        return borderTransparency;
    }

    public void setBorderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
    }

    public void setBorderColor(Color color) {
        this.borderColor = color;
    }

    public void setBorderTransparency(int borderTransparency) {
        this.borderTransparency = borderTransparency;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRotation() {
        return rotation;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRotation(double rotation) {
        this.rotation = rotation;
    }
}
