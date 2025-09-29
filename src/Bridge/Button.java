package Bridge;

import java.util.Arrays;

public class Button implements UITool{
    boolean Pressed = false;
    int[] DefColor, HovColor, Color = {0, 0, 0};
    String Text;
    public void press() {
        Color = HovColor;
        Pressed = true;
    }
    public void release() {
        Color = DefColor;
        Pressed = false;
    }

    public Button defaultColor(int r, int g, int b) {DefColor = new int[]{r, g, b}; return this;}
    public Button hoverColor(int r, int g, int b) {HovColor = new int[]{r, g, b}; return this;}

    public Button text(String text) {
        Text = text;
        return this;
    }

    public boolean isPressed() {return Pressed;}

    public void draw(){
        System.out.println("***"+Text+"*** Imagine that this is button colored to "+ Arrays.toString(Color));

    }
}
