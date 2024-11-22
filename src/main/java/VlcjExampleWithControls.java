import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import uk.co.caprica.vlcj.factory.discovery.NativeDiscovery;

public class VlcjExampleWithControls {
    public static void main(String[] args) {
        // Thiết lập đường dẫn thư viện VLC nếu cần
        System.setProperty("jna.library.path", "C:\\Program Files\\VideoLAN\\VLC");
        
        // Kiểm tra việc khám phá thư viện VLC
        boolean found = new NativeDiscovery().discover();
        if (!found) {
            System.err.println("LibVLC not found");
            return;
        }

        // Tạo JFrame
        JFrame frame = new JFrame("VLCJ Media Player Example with Controls");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        
        // Tạo EmbeddedMediaPlayerComponent
        EmbeddedMediaPlayerComponent mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
        
        // Thêm mediaPlayerComponent vào JFrame
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(mediaPlayerComponent, BorderLayout.CENTER);
        
        // Tạo panel điều khiển
        JPanel controlsPanel = new JPanel();
        
        // Nút Play
        JButton playButton = new JButton("Play");
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mediaPlayerComponent.mediaPlayer().controls().play();
            }
        });
        controlsPanel.add(playButton);
        
        // Nút Pause
        JButton pauseButton = new JButton("Pause");
        pauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mediaPlayerComponent.mediaPlayer().controls().pause();
            }
        });
        controlsPanel.add(pauseButton);
        
        // Nút Stop
        JButton stopButton = new JButton("Stop");
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mediaPlayerComponent.mediaPlayer().controls().stop();
            }
        });
        controlsPanel.add(stopButton);
        
        // Thêm panel điều khiển vào JFrame
        panel.add(controlsPanel, BorderLayout.SOUTH);
        frame.setContentPane(panel);
        
        // Hiển thị JFrame
        frame.setVisible(true);
        
        // Phát video
        mediaPlayerComponent.mediaPlayer().media().startPaused("C:\\Java\\FinalPresent\\src\\main\\java\\Video\\BEASTARS Final Season Part 1 - Official Trailer - Netflix.mp4"); // Đảm bảo rằng đường dẫn đến tệp video là chính xác
    }
}
