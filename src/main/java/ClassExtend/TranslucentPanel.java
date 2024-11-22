package ClassExtend;

import javax.swing.*;
import java.awt.*;

public class TranslucentPanel extends JPanel {
    private float alpha;

    public TranslucentPanel(float alpha) {
        this.alpha = alpha;
        setOpaque(false); // Ensure the background is not painted
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
        g2d.setColor(getBackground());
        g2d.fillRect(0, 0, getWidth(), getHeight());
        g2d.dispose();
        super.paintComponent(g);
    }

}
