import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommentFrame extends JFrame {
    private JTextArea commentTextArea;
    private JPanel commentsPanel;
    private JScrollPane commentsScrollPane;

    public CommentFrame() {
        this.setTitle("Comment Frame");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        // Tạo JTextArea để nhập bình luận
        commentTextArea = new JTextArea(3, 30);
        JScrollPane inputScrollPane = new JScrollPane(commentTextArea);

        // Tạo nút để thêm bình luận
        JButton addCommentButton = new JButton("Add Comment");
        addCommentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addComment();
            }
        });

        // Tạo JPanel để chứa các bình luận
        commentsPanel = new JPanel();
        commentsPanel.setLayout(new BoxLayout(commentsPanel, BoxLayout.Y_AXIS));
        commentsScrollPane = new JScrollPane(commentsPanel);

        // Thêm JTextArea và nút vào JPanel phía dưới
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(inputScrollPane, BorderLayout.CENTER);
        inputPanel.add(addCommentButton, BorderLayout.EAST);

        // Thêm các thành phần vào JFrame
        this.add(commentsScrollPane, BorderLayout.CENTER);
        this.add(inputPanel, BorderLayout.SOUTH);
    }

    private void addComment() {
        String commentText = commentTextArea.getText();
        if (!commentText.isEmpty()) {
            JLabel commentLabel = new JLabel(commentText);
            commentsPanel.add(commentLabel);
            commentsPanel.revalidate();
            commentsPanel.repaint();
            commentTextArea.setText(""); // Xóa nội dung JTextArea sau khi thêm bình luận
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CommentFrame frame = new CommentFrame();
            frame.setVisible(true);
        });
    }
}
