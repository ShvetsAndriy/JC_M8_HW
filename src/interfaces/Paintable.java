package interfaces;

import java.awt.*;

public interface Paintable {
    Color getFillColor();
    int getFillTransparency();
    void setFillColor(Color color);
    void setFillTransparency(int fillTransparency);
}
