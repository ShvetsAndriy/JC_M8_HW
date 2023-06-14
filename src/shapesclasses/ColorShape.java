package shapesclasses;

import interfaces.Paintable;

import java.awt.*;

public abstract class ColorShape extends Shape implements Paintable {
    private Color fillColor;
    private int fillTransparency;

    public Color getFillColor() {
        return fillColor;
    }

    public int getFillTransparency() {
        return fillTransparency;
    }

    public void setFillColor(Color color) {
        this.fillColor = color;
    }

    public void setFillTransparency(int fillTransparency) {
        this.fillTransparency = fillTransparency;
    }
}
