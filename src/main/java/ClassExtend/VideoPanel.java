package ClassExtend;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

public class VideoPanel extends JPanel {

    private EmbeddedMediaPlayerComponent mediaPlayerComponent;
    private boolean isFullscreen;
    private Dimension originalSize;

    public VideoPanel() {
        // Đặt đường dẫn thư viện VLC trước khi khởi tạo bất kỳ thành phần VLCJ nào
        System.setProperty("jna.library.path", "C:\\Program Files\\VideoLAN\\VLC");

        // Khởi tạo thành phần mediaPlayerComponent
        mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
        
        // Thiết lập layout cho VideoPanel và thêm mediaPlayerComponent vào
        setLayout(new BorderLayout());
        add(mediaPlayerComponent, BorderLayout.CENTER);
        
        // Đảm bảo rằng VideoPanel được cập nhật đúng cách
        revalidate();
        repaint();
    }

    private void toggleFullscreen() 
{ 
	if (isFullscreen) 
	{ 
		setPreferredSize(originalSize); 
		getParent().revalidate(); 
		isFullscreen = false; 
	} 
	else 
	{ 
		originalSize = getSize(); 
		setPreferredSize(getToolkit().getScreenSize()); 
		getParent().revalidate(); 
		isFullscreen = true; 
	} 
}
    
    // Phương thức để bắt đầu phát video
    public void startMedia(String mediaPath) {
        mediaPlayerComponent.mediaPlayer().media().play(mediaPath);
    }

    // Phương thức để dừng phát video
    public void stopMedia() {
        mediaPlayerComponent.mediaPlayer().controls().stop();
    }

    // Phương thức để đóng và giải phóng tài nguyên
    public void release() {
        mediaPlayerComponent.release();
    }
}
