package interfaces;

import java.awt.*;

public interface Borderable {
    double getBorderWidth();
    Color getBorderColor();
    int getBorderTransparency();
    void setBorderWidth(double borderWidth);
    void setBorderColor(Color color);
    void setBorderTransparency(int borderTransparency);
}
