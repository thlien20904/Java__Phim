package ClassExtend;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class MyImagePanel extends JPanel {
    private BufferedImage image;

    public MyImagePanel(String imagePath) {
        try {
            image = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            // Lấy kích thước của JPanel
            int panelWidth = getWidth();
            int panelHeight = getHeight();
            
            // Lấy tỉ lệ của hình ảnh
            double imageWidth = image.getWidth();
            double imageHeight = image.getHeight();
            double imageRatio = imageWidth / imageHeight;
            
            // Tính toán kích thước mới cho hình ảnh dựa trên tỉ lệ và kích thước của JPanel
            int newWidth = panelWidth;
            int newHeight = (int) (panelWidth / imageRatio);
            
            if (newHeight > panelHeight) {
                newHeight = panelHeight;
                newWidth = (int) (panelHeight * imageRatio);
            }
            
            // Vẽ hình ảnh thay đổi kích thước
            g.drawImage(image, 0, 0, newWidth, newHeight, this);
        }
    }
}