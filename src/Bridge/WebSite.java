package Bridge;

import java.util.ArrayList;
import java.util.List;

public abstract class WebSite {
    protected List<UITool> siteUI;

    public WebSite() {
        this.siteUI = new ArrayList<UITool>();
    }


    public void addUI(UITool UIThing){
        siteUI.add(UIThing);
    }

    public void DrawSite(){
        for(UITool ui : siteUI){
            ui.draw();
        }
    }
}
