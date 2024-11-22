package ClassExtend;



import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JPanel;
import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

public class WatchPanel extends javax.swing.JPanel {

    private static EmbeddedMediaPlayerComponent mediaPlayerComponent;
    private CardLayout cardLayout;

    public WatchPanel() {
        // Đặt đường dẫn thư viện VLC trước khi khởi tạo bất kỳ thành phần VLCJ nào
        System.setProperty("jna.library.path", "C:\\Program Files\\VideoLAN\\VLC");

        initComponents();
        initializeMediaPlayer();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        cardLayout = new CardLayout();
        setLayout(cardLayout);

        // Panel ban đầu
        JPanel initialPanel = new JPanel();
        initialPanel.setBackground(new java.awt.Color(0, 153, 153));
        initialPanel.setMinimumSize(new java.awt.Dimension(1293, 0));
        initialPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                initialPanelMouseClicked(evt);
            }
        });

        // Panel chứa video
        JPanel videoPanel = new JPanel(new BorderLayout());
        mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
        videoPanel.add(mediaPlayerComponent, BorderLayout.CENTER);

        // Thêm các panel vào CardLayout
        add(initialPanel, "InitialPanel");
        add(videoPanel, "VideoPanel");
    }

    private void initializeMediaPlayer() {
        // Đảm bảo videoPanel đã được thêm và thiết lập đúng cách
        revalidate();
        repaint();
    }

    private void initialPanelMouseClicked(java.awt.event.MouseEvent evt) {
        // Chuyển đổi sang panel chứa video
        cardLayout.show(this, "VideoPanel");
        startMedia();
    }

    private void startMedia() {
        mediaPlayerComponent.mediaPlayer().media().play("C:\\Java\\FinalPresent\\src\\main\\java\\Video\\BEASTARS Final Season Part 1 - Official Trailer - Netflix.mp4");
    }
}
