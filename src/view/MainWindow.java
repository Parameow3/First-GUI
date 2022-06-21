package view;

import view.DisplayPanel;
import view.FavouritePanel;
import view.InfoPanel;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class MainWindow {

    public MainWindow() {
        // create JFrame to hold GUI
        JFrame mainFrame = new JFrame("First GUI ");
        mainFrame.setSize(1080, 768);
        mainFrame.setIconImage(new ImageIcon("src/image/menghun-bored-01.jpg").getImage());
        mainFrame.setLocationRelativeTo(null);

        // create GUI controls to add to JFrame
        JLabel infoLabel = new JLabel("Info");
        infoLabel.setFont(infoLabel.getFont().deriveFont(35.0f));
        infoLabel.setSize(80, 40);
        infoLabel.setLocation(235, 140);
        infoLabel.setBorder(new MatteBorder(1, 2, 1, 9, Color.GREEN));

        JLabel favLabel = new JLabel("Favourite");
        favLabel.setFont(favLabel.getFont().deriveFont(35.0f));
        favLabel.setSize(175, 40);
        favLabel.setLocation(545, 140);
        favLabel.setBorder(new MatteBorder(1, 2, 1, 9, Color.GREEN));

        JButton addButton = new JButton("Add");
        addButton.setFont(addButton.getFont().deriveFont(30.f));
        addButton.setBackground(Color.CYAN.darker());
        addButton.setBorder(new MatteBorder(2, 4, 2, 4, Color.BLACK));
        addButton.setFocusable(false);
        addButton.setSize(200, 60);
        addButton.setLocation(440, 640);

        ImageIcon sakura = new ImageIcon("src/image/giphy.gif");
        JLabel sakuraLabel = new JLabel();
        sakuraLabel.setIcon(sakura);
        sakuraLabel.setSize(400, 480);
        sakuraLabel.setLocation(0,0);

        // add controls to JFrame
        mainFrame.add(addButton);
        mainFrame.add(new DisplayPanel());
        mainFrame.add(new InfoPanel());
        mainFrame.add(new FavouritePanel());
        mainFrame.add(infoLabel);
        mainFrame.add(favLabel);
        mainFrame.add(sakuraLabel);

        // make JFrame appear on the screen
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
    }
}
