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
        JPanel displayPanel = new JPanel(); // display Panel
        displayPanel.setSize(610, 150);
        displayPanel.setLocation(235, 10);
        displayPanel.setBorder(BorderFactory.createLineBorder(Color.MAGENTA, 3));





        JButton addButton = new JButton("Add");
        addButton.setFocusable(false);
        addButton.setSize(100, 50);
        addButton.setLocation(490, 640);

        // add controls to JFrame
        mainFrame.add(addButton);
        mainFrame.add(displayPanel);
        mainFrame.add(new InfoPanel());
        mainFrame.add(new FavouritePanel());

        // make JFrame appear on the screen
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
    }

}
