import javax.swing.*;
import java.awt.event.*;

public class Stopwatch {
    static int elapsedTime = 0;
    static Timer timer;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Stopwatch");
        JLabel timeLabel = new JLabel("0 s");
        JButton startBtn = new JButton("Start");
        JButton stopBtn = new JButton("Stop");
        JButton resetBtn = new JButton("Reset");

        timeLabel.setBounds(130, 50, 100, 30);
        startBtn.setBounds(40, 100, 80, 30);
        stopBtn.setBounds(140, 100, 80, 30);
        resetBtn.setBounds(240, 100, 80, 30);

        timer = new Timer(1000, e -> {
            elapsedTime++;
            timeLabel.setText(elapsedTime + " s");
        });

        startBtn.addActionListener(e -> timer.start());
        stopBtn.addActionListener(e -> timer.stop());
        resetBtn.addActionListener(e -> {
            timer.stop();
            elapsedTime = 0;
            timeLabel.setText("0 s");
        });

        frame.add(timeLabel);
        frame.add(startBtn);
        frame.add(stopBtn);
        frame.add(resetBtn);

        frame.setSize(360, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

