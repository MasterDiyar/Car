package Bridge;

public interface UITool {
    void press();
    void release();
    UITool defaultColor(int r, int g, int b);
    UITool hoverColor(int r, int g, int b);
    void draw();
    UITool text(String text);
    boolean isPressed();

}
