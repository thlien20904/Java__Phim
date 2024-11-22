package ClassExtend;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class RoundedPanel extends JPanel {
    private Color borderColor;
    private int cornerRadius;
    private int borderWidth;

    public RoundedPanel(int radius, Color borderColor, int borderWidth) {
        this.cornerRadius = radius;
        this.borderColor = borderColor;
        this.borderWidth = borderWidth;
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension arcs = new Dimension(cornerRadius, cornerRadius);
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draws the rounded panel with borders
        graphics.setColor(getBackground());
        graphics.fillRoundRect(borderWidth / 2, borderWidth / 2, width - borderWidth, height - borderWidth, arcs.width, arcs.height);
        graphics.setColor(borderColor);
        graphics.setStroke(new BasicStroke(borderWidth));
        graphics.drawRoundRect(borderWidth / 2, borderWidth / 2, width - borderWidth, height - borderWidth, arcs.width, arcs.height);
    }
}
