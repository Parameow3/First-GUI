package view;

import javax.swing.*;
import java.awt.*;

public class InfoPanel extends JPanel {

        public InfoPanel() {
            setSize(300, 450);
            setLocation(235, 175);
            setBorder(BorderFactory.createLineBorder(Color.GREEN.darker(), 3));
            setLayout(null);

            ImageIcon radio = new ImageIcon("src/image/radioButton.png");
            ImageIcon radioChecked = new ImageIcon("src/image/radio-button-checked.png");

            JRadioButton maleRB = new JRadioButton("Male");
            maleRB.setIcon(radio);
            maleRB.setSelectedIcon(radioChecked);
            maleRB.setFont(maleRB.getFont().deriveFont(32.0f));
            maleRB.setSize(140, 80);
            maleRB.setLocation(10, 5);
            maleRB.setFocusable(false);

            JRadioButton femaleRB = new JRadioButton("Female");
            femaleRB.setIcon(radio);
            femaleRB.setSelectedIcon(radioChecked);
            femaleRB.setFont(femaleRB.getFont().deriveFont(32.0f));
            femaleRB.setSize(280, 80);
            femaleRB.setLocation(10, 85);
            femaleRB.setFocusable(false);

            JRadioButton bedRB = new JRadioButton("BED");
            bedRB.setIcon(radio);
            bedRB.setSelectedIcon(radioChecked);
            bedRB.setFont(bedRB.getFont().deriveFont(32.0f));
            bedRB.setSize(280, 80);
            bedRB.setLocation(10, 170);
            bedRB.setFocusable(false);

            JRadioButton iteRB = new JRadioButton("ITE");
            iteRB.setIcon(radio);
            iteRB.setSelectedIcon(radioChecked);
            iteRB.setFont(iteRB.getFont().deriveFont(32.0f));
            iteRB.setSize(280, 80);
            iteRB.setLocation(10, 255);
            iteRB.setFocusable(false);

            JRadioButton teedRB = new JRadioButton("TEED");
            teedRB.setIcon(radio);
            teedRB.setSelectedIcon(radioChecked);
            teedRB.setFont(teedRB.getFont().deriveFont(32.0f));
            teedRB.setSize(280, 80);
            teedRB.setLocation(10, 340);
            teedRB.setFocusable(false);

            ButtonGroup genderGroup = new ButtonGroup();
            genderGroup.add(maleRB);
            genderGroup.add(femaleRB);

            ButtonGroup departmentGroup = new ButtonGroup();
            departmentGroup.add(bedRB);
            departmentGroup.add(iteRB);
            departmentGroup.add(teedRB);

            add(maleRB);
            add(femaleRB);
            add(bedRB);
            add(iteRB);
            add(teedRB);
        }
}
