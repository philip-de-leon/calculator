import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BorderFactory;

import java.awt.GridLayout;
import java.awt.BorderLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Calculator implements ActionListener {
  private int number = 0;
  private JLabel label;
  private JPanel panel;
  private JFrame frame;
  public Calculator() {
    frame = new JFrame();
    // Initializing Buttons
    JButton oneButton = new JButton("1");
    JButton twoButton = new JButton("2");
    JButton threeButton = new JButton("3");
    JButton fourButton = new JButton("4");
    JButton fiveButton = new JButton("5");
    JButton sixButton = new JButton("6");
    JButton sevenButton = new JButton("7");
    JButton eightButton = new JButton("8");
    JButton nineButton = new JButton("9");

    // Initializing ActionListeners for each button
    oneButton.addActionListener(this);
    twoButton.addActionListener(this);
    threeButton.addActionListener(this);
    fourButton.addActionListener(this);
    fiveButton.addActionListener(this);
    sixButton.addActionListener(this);
    sevenButton.addActionListener(this);
    eightButton.addActionListener(this);
    nineButton.addActionListener(this);

    label = new JLabel("Button clicked: None");

    panel = new JPanel();
    panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
    panel.setLayout(new GridLayout(0, 3));
    panel.add(oneButton);
    panel.add(twoButton);
    panel.add(threeButton);
    panel.add(fourButton);
    panel.add(fiveButton);
    panel.add(sixButton);
    panel.add(sevenButton);
    panel.add(eightButton);
    panel.add(nineButton);
    panel.add(label);

    frame.add(panel, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Calculator");
    frame.pack();
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    new Calculator();
  }

  public void actionPerformed(ActionEvent e) {
    number = Integer.parseInt(e.getActionCommand());
    label.setText("Number selected: " + number);

  }
}
