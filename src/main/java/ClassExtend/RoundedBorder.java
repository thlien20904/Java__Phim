package ClassExtend;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JComponent;
import javax.swing.border.AbstractBorder;

public class RoundedBorder extends AbstractBorder {
    private Color borderColor;
    private int borderRadius;
    private float borderWidth;

    public RoundedBorder(Color borderColor, int borderRadius, float borderWidth) {
        this.borderColor = borderColor;
        this.borderRadius = borderRadius;
        this.borderWidth = borderWidth;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Vẽ viền bo góc
        g2d.setColor(borderColor);
        g2d.setStroke(new BasicStroke(borderWidth));
        RoundRectangle2D round = new RoundRectangle2D.Float(x, y, width - 1, height - 1, borderRadius, borderRadius);
        g2d.draw(round);

        g2d.dispose();
    }
}
