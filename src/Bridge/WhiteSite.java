package Bridge;

public class WhiteSite extends WebSite {

    public WhiteSite(){
        Button EnterButton = new Button()
                .defaultColor(240,240,240)
                .hoverColor(230,230,230)
                .text("Enter");
        EnterButton.release();
        addUI(EnterButton);

        CheckMark CheckMark = new CheckMark()
                .defaultColor(240,240,240)
                .hoverColor(230,230,230)
                .text("White test:");
        CheckMark.release();
        addUI(CheckMark);

        InputLabel InputLabel = new InputLabel()
                .defaultColor(240,240,240)
                .hoverColor(230,230,230)
                .text("Input something:");
        InputLabel.release();
        addUI(InputLabel);

        DrawSite();
    }

}
