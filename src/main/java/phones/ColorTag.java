package phones;

import java.awt.*;

public class ColorTag extends Tag{
    private Color color;

    public ColorTag(Color color){
        this.color=color;
    }

    @Override
    public boolean find(Phone phone) {
        return phone.getColor().equals(color);
    }
}
