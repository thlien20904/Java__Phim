package ClassExtend;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

public class vidPanel extends JPanel {

    private final EmbeddedMediaPlayerComponent mediaPlayerComponent;

    public vidPanel() {
        System.setProperty("jna.library.path", "C:\\Program Files\\VideoLAN\\VLC");
        mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
        setLayout(new BorderLayout());
        add(mediaPlayerComponent, BorderLayout.CENTER);

        // Lắng nghe sự kiện khi panel được hiển thị
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent e) {
                startMedia("C:\\Java\\FinalPresent\\src\\main\\java\\Video\\BEASTARS Final Season Part 1 - Official Trailer - Netflix.mp4");
            }
        });

        revalidate();
        repaint();
    }

    public void startMedia(String mediaPath) {
        mediaPlayerComponent.mediaPlayer().media().play(mediaPath);
    }

    public void stopMedia() {
        mediaPlayerComponent.mediaPlayer().controls().stop();
    }
}
