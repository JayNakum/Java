package jay.nakum.controlPanel.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import jay.nakum.controlPanel.designPattern.Context;
import jay.nakum.controlPanel.designPattern.DecreaseVolume;
import jay.nakum.controlPanel.designPattern.IncreaseVolume;
import jay.nakum.controlPanel.designPattern.MuteState;
import jay.nakum.controlPanel.designPattern.UnmuteState;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame implements ActionListener {

    boolean isUnmute;
    JPanel contentPanel;
    JButton mute, increaseVolume, decreaseVolume;

    Context ctx;

    private void initComponents() {
        contentPanel = new JPanel();
        Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        contentPanel.setBorder(padding);

        increaseVolume = new JButton();
        increaseVolume.setText("Volume +");
        increaseVolume.addActionListener(this);
        increaseVolume.setBackground(Color.WHITE);
        
        decreaseVolume = new JButton();
        decreaseVolume.setText("Volume -");
        decreaseVolume.addActionListener(this);
        decreaseVolume.setBackground(Color.WHITE);
        
        mute = new JButton();
        mute.setText("Mute");
        mute.addActionListener(this);
        mute.setBackground(Color.WHITE);

    }

    private void addComponents() {
        // this.add(contentPanel);
        contentPanel.add(increaseVolume);
        contentPanel.add(decreaseVolume);
        contentPanel.add(mute);
    }

    public MainWindow() {
        ctx = new Context();
        this.setTitle("Control Panel");
        this.setSize(500, 100);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.requestFocus();

        initComponents();
        this.setContentPane(contentPanel);
        addComponents();

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mute) {
            isUnmute = !isUnmute;
            if (isUnmute) {
                mute.setText("Unmute");
                ctx.setState(new UnmuteState());
            } else {
                mute.setText("Mute");
                ctx.setState(new MuteState());
            }
        }
        if (e.getSource() == increaseVolume) {
            ctx.setState(new IncreaseVolume());
        }
        if (e.getSource() == decreaseVolume) {
            ctx.setState(new DecreaseVolume());
        }
    }
}
