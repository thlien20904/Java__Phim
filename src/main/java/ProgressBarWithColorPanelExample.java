import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgressBarWithColorPanelExample extends JFrame {
    private JProgressBar progressBar;
    private JButton incrementButton;
    private JPanel colorPanel;
    private int progress = 0;

    public ProgressBarWithColorPanelExample() {
        // Thiết lập JFrame
        setTitle("Progress Bar with Color Panel Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Tạo JProgressBar
        progressBar = new JProgressBar();
        progressBar.setMinimum(0);
        progressBar.setMaximum(100);
        progressBar.setStringPainted(true); // Hiển thị phần trăm tiến độ

        // Tạo JButton
        incrementButton = new JButton("Increment Progress");
        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (progress < 100) {
                    progress++;
                    progressBar.setValue(progress);

                    // Đổi màu panel ở các mốc chia hết cho 5
                    if (progress % 5 == 0) {
                        colorPanel.setBackground(new Color((int)(Math.random() * 0x1000000)));
                    }
                } else {
                    JOptionPane.showMessageDialog(ProgressBarWithColorPanelExample.this, "Progress is complete!");
                }
            }
        });

        // Tạo JPanel và thiết lập màu mặc định
        colorPanel = new JPanel();
        colorPanel.setPreferredSize(new Dimension(100, 100));
        colorPanel.setBackground(Color.LIGHT_GRAY);

        // Thêm các component vào JFrame
        add(progressBar, BorderLayout.NORTH);
        add(incrementButton, BorderLayout.CENTER);
        add(colorPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ProgressBarWithColorPanelExample example = new ProgressBarWithColorPanelExample();
            example.setVisible(true);
        });
    }
}
