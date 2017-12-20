package service;

import com.codecool.krk.model.Rectangle;

public class RectangleTransformationService {

    public void stretchPreservingArea(Rectangle r, float ratio){
        float newWidth = r.getWidth() * ratio;
        float newHeight = r.getHeight() / ratio;
        r.setWidth(newWidth);
        r.setHeight(newHeight);
    }
}
