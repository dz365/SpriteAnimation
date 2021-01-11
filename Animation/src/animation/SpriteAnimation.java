package animation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SpriteAnimation {
    
    private static JPanel animationPanel = new JPanel();
    private static JLabel displayImage;
    private static int i = 0;
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Animation");
        animationPanel = new JPanel();
        displayImage = new JLabel("");
        Timer timer = new Timer(100, new Animate());
        
        animationPanel.add(displayImage);
        timer.start();
        
        frame.setSize(750, 750);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(animationPanel);
    }
    
    private static class Animate implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {
            displayImage.setIcon(new ImageIcon(getClass().getResource(i + ".png")));

            if (i == 7) {
                i = 0;
            }
            
            i++;
            
            animationPanel.repaint();
        }
    }
}