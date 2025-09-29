package Bridge;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class InputLabel implements UITool{
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

    public void defaultColor(int r, int g, int b) {DefColor = new int[]{r, g, b};}
    public void hoverColor(int r, int g, int b) {HovColor = new int[]{r, g, b};}

    public String text(String text) {
        Text = text;
        return text;
    }

    public boolean isPressed() {return Pressed;}

    public void draw(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Text color is: "+ Arrays.toString(Color)+((Text.isEmpty()) ? "Enter text:" : Text));
        var nText = sc.nextLine();
        if (!Objects.equals(nText, "")){
            text(nText);draw();
        }

    }
}
