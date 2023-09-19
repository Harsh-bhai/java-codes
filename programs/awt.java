import java.awt.Color;
import java.awt.*;
public class awt {
    public static void main(String[] args) {
        Frame frame=new Frame("my first frame");
        Panel panel=new Panel();
        frame.resize(500, 500);
        frame.setBackground(Color.blue);
        panel.resize(100, 100);
        panel.setBackground(Color.yellow);
        frame.add(panel);
        frame.show();
    }
}
