// package unit4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class frame extends JFrame implements ActionListener {
    JButton button = new JButton("click here");
    JLabel label = new JLabel("");
    JLabel label1 = new JLabel("");

    frame() {
        button.addActionListener(this);
        setTitle("frame");
        setLayout(null);
        setSize(500, 500);
        button.setBounds(200, 200, 100, 20);
        add(button);
        label.setBounds(100, 100, 300, 20);
        add(label);
        label1.setBounds(100, 120, 400, 20);
        add(label1);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e){
        label.setText("AJAO VALO ");
        label1.setText("vaise bhi padhai likhai to kr nhi rahe ho");
        label.setFont(label.getFont().deriveFont(24f));
        label1.setFont(label.getFont().deriveFont(20f));
        label.setBackground(Color.PINK);
        // label.setForeground(Color.yellow);
        button.setBackground(Color.cyan);
    }
    

    public static void main(String[] args) {
        frame f = new frame();
    }
    
}
