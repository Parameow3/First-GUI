import javax.swing.*;
import java.awt.*;

public class FavouritePanel extends JPanel {

    public FavouritePanel() {

        setSize(300, 450);
        setLocation(545, 175);
        setBorder(BorderFactory.createLineBorder(Color.GREEN.darker(), 3));
        setLayout(null);

        ImageIcon box = new ImageIcon("src/image/box.png");
        ImageIcon checkedBox = new ImageIcon("src/image/checked-box.png");

        JCheckBox sportCB = new JCheckBox("Sport");
        sportCB.setIcon(box);
        sportCB.setSelectedIcon(checkedBox);
        sportCB.setFont(sportCB.getFont().deriveFont(32.0f));
        sportCB.setSize(280, 80);
        sportCB.setLocation(10, 5);
        sportCB.setFocusable(false);

        JCheckBox entertainmentCB = new JCheckBox("Entertainment");
        entertainmentCB.setIcon(box);
        entertainmentCB.setSelectedIcon(checkedBox);
        entertainmentCB.setFont(entertainmentCB.getFont().deriveFont(30.0f));
        entertainmentCB.setSize(280, 80);
        entertainmentCB.setLocation(10, 85);
        entertainmentCB.setFocusable(false);

        JCheckBox movieCB = new JCheckBox("Movie");
        movieCB.setIcon(box);
        movieCB.setSelectedIcon(checkedBox);
        movieCB.setFont(movieCB.getFont().deriveFont(32.0f));
        movieCB.setSize(280, 80);
        movieCB.setLocation(10, 170);
        movieCB.setFocusable(false);

        JCheckBox readingBookCB = new JCheckBox("Reading book");
        readingBookCB.setIcon(box);
        readingBookCB.setSelectedIcon(checkedBox);
        readingBookCB.setFont(readingBookCB.getFont().deriveFont(32.0f));
        readingBookCB.setSize(280, 80);
        readingBookCB.setLocation(10, 255);
        readingBookCB.setFocusable(false);

        JCheckBox partyCB = new JCheckBox("Party");
        partyCB.setIcon(box);
        partyCB.setSelectedIcon(checkedBox);
        partyCB.setFont(partyCB.getFont().deriveFont(32.0f));
        partyCB.setSize(280, 80);
        partyCB.setLocation(10, 340);
        partyCB.setFocusable(false);

        add(sportCB);
        add(entertainmentCB);
        add(movieCB);
        add(readingBookCB);
        add(partyCB);
    }
}
