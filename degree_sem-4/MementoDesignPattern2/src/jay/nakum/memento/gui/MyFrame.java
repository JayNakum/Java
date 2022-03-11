package jay.nakum.memento.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class MyFrame extends JFrame implements ActionListener {

  private JTextArea textArea;
  private JPanel panelBottom;
  private JButton save, undo, redo;

  class HintTextField extends JTextField {

    HintTextField(final String hint) {

      setText(hint);
      setForeground(Color.GRAY);

      this.addFocusListener(new FocusAdapter() {

        @Override
        public void focusGained(FocusEvent e) {
          if (getText().equals(hint)) {
            setText("");
          } else {
            setText(getText());
          }
        }

        @Override
        public void focusLost(FocusEvent e) {
          if (getText().equals(hint) || getText().length() == 0) {
            setText(hint);
            setForeground(Color.GRAY);
          } else {
            setText(getText());
            setForeground(Color.BLACK);
          }
        }
      });
    }
  }

  private void initPanel() {    
    panelBottom = new JPanel();

    save = new JButton("Save");
    save.addActionListener(this);
    undo = new JButton("Undo");
    undo.addActionListener(this);
    redo = new JButton("Redo");
    redo.addActionListener(this);

    panelBottom.add(save);
    panelBottom.add(undo);
    panelBottom.add(redo);
  }

  public MyFrame(String title) {
    
    this.setTitle(title);
    this.setSize(600, 400);
    this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    this.setLayout(new BorderLayout());

    initPanel();

    textArea = new JTextArea();

    textArea.setBorder(new EmptyBorder(10, 10, 10, 10));
    this.add(textArea, BorderLayout.CENTER);
    this.add(panelBottom, BorderLayout.SOUTH);    

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == "Save") {

    }
    if(e.getSource() == "Undo") {

    }
    if(e.getSource() == "Redo") {
      
    }
  }

}
