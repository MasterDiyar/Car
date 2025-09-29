package Bridge;

import java.util.List;

public abstract class WebSite {
    protected List<UITool> siteUI;

    public void addUI(UITool UIThing){
        siteUI.add(UIThing);
    }

    public void DrawSite(){
        for(UITool ui : siteUI){
            ui.draw();
        }
    }
}
