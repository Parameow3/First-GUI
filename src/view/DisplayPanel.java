package view;

import javax.swing.*;
import java.awt.*;

public class DisplayPanel extends JPanel{

    public DisplayPanel() {

        setSize(610, 120);
        setLocation(235, 10);
        setBorder(BorderFactory.createLineBorder(Color.MAGENTA, 3));

        JLabel animeLabel = new JLabel();
        animeLabel.setText("Welcome to My First GUI!");
        animeLabel.setFont(animeLabel.getFont().deriveFont(45.f));
        
        // for anime
        Thread animation = new Thread(() -> {

            int x = -25; // label start position

            while (true){
                animeLabel.setLocation(x, (int)(25+ (Math.random() * -10)));
                x += 10;

                if (x > 611) {
                    x = -475;
                }

                try {
                    Thread.sleep(160);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        animation.start();

        add(animeLabel);
    }
}
