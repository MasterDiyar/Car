package Bridge;

import java.util.Arrays;
import java.util.Scanner;

public class CheckMark implements UITool{
    boolean Marked = false;
    int[] DefColor, HovColor, Color = {0, 0, 0};
    String Text;
    public void press() {
        Color = HovColor;
        Marked = true;
    }
    public void release() {
        Color = DefColor;
        Marked = false;
    }

    public CheckMark defaultColor(int r, int g, int b) {DefColor = new int[]{r, g, b}; return this;}
    public CheckMark hoverColor(int r, int g, int b) {HovColor = new int[]{r, g, b}; return this;}

    public CheckMark text(String text) {
        Text = text;
        return this;
    }
    public boolean isPressed() {return isMarked();}
    public boolean isMarked() {return Marked;}

    public void draw(){
        System.out.print(Text+" *" + (isMarked() ? "[x]": "[_]") +"* Imagine that this is check box colored to "+ Arrays.toString(Color));
        Scanner sc = new Scanner(System.in);
        if (sc.next().equals("x")) {press(); draw();}
        else if (sc.next().equals("_")) {release(); draw();}

    }
}
