import javax.swing.*;
import java.awt.*;

public class MainWindow {
    public static void main(String[ ] args) {

        // create JFrame to hold GUI
        JFrame mainFrame = new JFrame("First GUI ");
        mainFrame.setSize(1080, 768);
        mainFrame.setIconImage(new ImageIcon("src/image/menghun-bored-01.jpg").getImage());
        mainFrame.setLocationRelativeTo(null);

        // create GUI controls to add to JFrame

        JLabel infoLabel = new JLabel("Info");
        infoLabel.setFont(infoLabel.getFont().deriveFont(30.0f));
        infoLabel.setSize(280, 80);
        infoLabel.setLocation(400, 175);

        JLabel favLabel = new JLabel("Favourite");
        favLabel.setFont(favLabel.getFont().deriveFont(30.0f));

        JButton addButton = new JButton("Add");
        addButton.setBackground(Color.CYAN.darker());
        addButton.setBorder(BorderFactory.createLineBorder(Color.MAGENTA, 1));
        addButton.setFocusable(false);
        addButton.setSize(100, 50);
        addButton.setLocation(490, 640);

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
