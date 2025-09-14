package Builder;

import java.util.List;

public class Window{
    public List<BMath.Vector2> Points;
    public float Density;
    public String Material = "";
    private int Raised = 0;

    public void OpenWindow(){
        Raised = 100;
    }

    public void CloseWindow(){
        Raised = 0;
    }

    public void ChangeWindow(int percent){
        Raised += (percent > 0) ?(Raised + percent < 0) ? 0 : percent : (Raised + percent > 100) ? 100 : percent;
    }

    public int GetRaised(){return Raised;}

    @Override public String toString(){

        return switch(Material){
            case "toned" -> "toned";
            case "quartz" -> "quartz";
            default -> "default";
        };
    }
}

