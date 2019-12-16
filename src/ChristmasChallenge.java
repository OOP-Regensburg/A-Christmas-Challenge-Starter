import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Colors;

public class ChristmasChallenge extends GraphicsApp {

    private static final int SCREEN_WIDTH = 640;
    private static final int SCREEN_HEIGHT = 480;

    @Override
    public void initialize() {
        setCanvasSize(SCREEN_WIDTH, SCREEN_HEIGHT);
    }

    @Override
    public void draw() {
        drawBackground(Colors.WHITE);
    }
}
