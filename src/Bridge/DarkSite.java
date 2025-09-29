package Bridge;

public class DarkSite extends WebSite{

    public DarkSite(){
        Button EnterButton = new Button()
                .defaultColor(140,140,140)
                .hoverColor(130,130,130)
                .text("Enter");
            EnterButton.release();
        addUI(EnterButton);

        CheckMark CheckMark = new CheckMark()
                .defaultColor(140,140,140)
                .hoverColor(130,130,130)
                .text("Dark test:");
            CheckMark.release();
        addUI(CheckMark);

        InputLabel InputLabel = new InputLabel()
                .defaultColor(140,140,140)
                .hoverColor(130,130,130)
                .text("Input something:");
            InputLabel.release();
        addUI(InputLabel);

        DrawSite();
    }
}
