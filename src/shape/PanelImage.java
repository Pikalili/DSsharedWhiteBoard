package shape;

import java.awt.*;

/**
 * Created by hasee on 2017/9/16.
 */
public class PanelImage implements Shape  {
    private Image image;


    public PanelImage(Image image, Graphics g) {
        this.image = image;
    }

    @Override
    public void draw(Graphics g) {

       g.drawImage(image,0,0,null);
    }

}
