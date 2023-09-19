import java.awt.*;
public class button extends Component {
    public static void main(String[] args) {
        Frame f=new Frame("myframe");
        Button b=new Button("here");
        b.setBounds(100, 100, 100, 100);
        f.add(b);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
