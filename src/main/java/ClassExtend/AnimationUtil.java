package ClassExtend;

import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationUtil {
    public static void animateFullScreen(JFrame frame, boolean toFullScreen) {
        Timer timer = new Timer(10, new ActionListener() {
            int width = toFullScreen ? frame.getWidth() : 0;
            int height = toFullScreen ? frame.getHeight() : 0;
            int targetWidth = toFullScreen ? frame.getGraphicsConfiguration().getBounds().width : 800;
            int targetHeight = toFullScreen ? frame.getGraphicsConfiguration().getBounds().height : 600;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (toFullScreen) {
                    if (width < targetWidth && height < targetHeight) {
                        width += 20;
                        height += 15;
                        frame.setSize(width, height);
                    } else {
                        frame.dispose();
                        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                        frame.setVisible(true);
                        ((Timer) e.getSource()).stop();
                    }
                } else {
                    if (width > targetWidth && height > targetHeight) {
                        width -= 20;
                        height -= 15;
                        frame.setSize(width, height);
                    } else {
                        frame.dispose();
                        frame.setSize(800, 600);
                        frame.setVisible(true);
                        ((Timer) e.getSource()).stop();
                    }
                }
            }
        });
        timer.start();
    }
}
