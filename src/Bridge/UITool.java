package Bridge;

public interface UITool {
    void press();
    void release();
    void defaultColor(int r, int g, int b);
    void hoverColor(int r, int g, int b);
    void draw();
    String text(String text);
    boolean isPressed();

}
