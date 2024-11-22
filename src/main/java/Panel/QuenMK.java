package Panel;

import ClassExtend.EmailTextField;
import ClassExtend.TranslucentPanel;
import java.awt.AlphaComposite;
import java.awt.CardLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class QuenMK extends javax.swing.JPanel {
    private JPanel panel;
    private static CardLayout card = new CardLayout();
    public QuenMK() {
        this.panel = panel;
        initComponents();

    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonemail = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPanegui = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jRadioButtonsdt = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldemailhople = new EmailTextField("name@example.com");
        jPanel3 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new EmailTextField("123456789");
        jLabel3 = new javax.swing.JLabel();
        jButtonguimail = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabelkhongnho = new javax.swing.JLabel();
        jLabelFocus = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jRadioButtonemail.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButtonemail.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButtonemail.setSelected(true);
        jRadioButtonemail.setText("Email");
        jRadioButtonemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonemailActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Đã có tài khoản ?");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextPanegui.setEditable(false);
        jTextPanegui.setBackground(new java.awt.Color(255, 255, 255));
        jTextPanegui.setBorder(null);
        jTextPanegui.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTextPanegui.setText("Chúng tôi sẽ gửi email kèm theo hướng dẫn đặt lại mật khẩu.");
        jScrollPane1.setViewportView(jTextPanegui);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setText("Bạn muốn đặt lại mật khẩu bằng cách nào?");

        jRadioButtonsdt.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButtonsdt.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButtonsdt.setText("Tin nhắn văn bản (SMS)");
        jRadioButtonsdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonsdtActionPerformed(evt);
            }
        });

        jPanel2.setLayout(new java.awt.CardLayout());

        jTextFieldemailhople.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldemailhople.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldemailhopleActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldemailhople, "email");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ 84", "+ 94", "+ 900", "+ 46", "" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 40));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 0, 230, 40));

        jPanel2.add(jPanel3, "sdt");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));

        jButtonguimail.setBackground(new java.awt.Color(51, 153, 255));
        jButtonguimail.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jButtonguimail.setForeground(new java.awt.Color(255, 255, 255));
        jButtonguimail.setText("Gửi Email cho tôi");
        jButtonguimail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonguimailActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextPane2.setEditable(false);
        jTextPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane2.setBorder(null);
        jTextPane2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextPane2.setText("Cập nhật mật khẩu, email hoặc số điện thoại");
        jScrollPane2.setViewportView(jTextPane2);

        jLabelkhongnho.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelkhongnho.setForeground(new java.awt.Color(0, 153, 255));
        jLabelkhongnho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelkhongnho.setText("Tôi không nhớ email hoặc số điện thoại của mình.");
        jLabelkhongnho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelkhongnhoMouseClicked(evt);
            }
        });

        jLabelFocus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelFocus.setForeground(new java.awt.Color(255, 0, 0));
        jLabelFocus.setText(" Đăng Nhập.");
        jLabelFocus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFocusMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelkhongnho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jRadioButtonsdt)
                        .addComponent(jRadioButtonemail, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jButtonguimail, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabelFocus)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonemail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonsdt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonguimail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabelkhongnho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelFocus))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.7f));
        g2d.setColor(getBackground());
        g2d.fillRect(0, 0, getWidth(), getHeight());
        g2d.dispose();
        super.paintComponent(g);
    }
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextFieldemailhopleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldemailhopleActionPerformed
        // TODO add your handling code here:
        String email = jTextFieldemailhople.getText();
        // Kiểm tra nếu email hợp lệ
        if (!email.contains("@") || !email.contains(".")) {
            jLabel3.setText("Vui lòng nhập email hợp lệ");
        } else {
            jLabel3.setText("");
        }
        String phone = jTextFieldemailhople.getText();
        // Kiểm tra nếu số điện thoại hợp lệ (chỉ chứa các chữ số và có độ dài hợp lý, ví dụ: 10-11 số)
        if (!phone.matches("\\d{9,11}")) {
            jLabel3.setText("Vui lòng nhập một số điện thoại hợp lệ");
        } else {
            jLabel3.setText(""); // Xóa thông báo lỗi khi số điện thoại hợp lệ
        }
    }//GEN-LAST:event_jTextFieldemailhopleActionPerformed

    private void jLabelkhongnhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelkhongnhoMouseClicked
        // TODO add your handling code here:
        // Mở ra cửa sổ mới để người dùng có thể khôi phục tài khoản qua các phương thức khác
        JOptionPane.showMessageDialog(this, "Vui lòng liên hệ với bộ phận hỗ trợ để khôi phục tài khoản.");
    }//GEN-LAST:event_jLabelkhongnhoMouseClicked

    private void jButtonguimailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonguimailActionPerformed
        String input = jTextFieldemailhople.getText();
        if (input.isEmpty()) {
            jLabel3.setText("Vui lòng nhập thông tin");
            return;
        }

        if (jRadioButtonemail.isSelected()) {
            if (!isValidEmail(input)) {
                jLabel3.setText("Vui lòng nhập email hợp lệ");
            } else {
                jLabel3.setText("");
                JOptionPane.showMessageDialog(this, "Email đã được gửi để bạn có thể đặt lại mật khẩu.");
            }
        } else if (jRadioButtonsdt.isSelected()) {
            if (!isValidPhoneNumber(input)) {
                jLabel3.setText("Vui lòng nhập một số điện thoại hợp lệ");
            } else {
                jLabel3.setText("");
                JOptionPane.showMessageDialog(this, "Tin nhắn đã được gửi để bạn có thể đặt lại mật khẩu.");
            }
        } else {
            jLabel3.setText("Vui lòng chọn phương thức phục hồi.");
        }
    }//GEN-LAST:event_jButtonguimailActionPerformed

    private void jRadioButtonsdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonsdtActionPerformed
        jTextFieldemailhople.setEnabled(true); // Kích hoạt trường nhập số điện thoại
        jTextPanegui.setText("Chúng tôi sẽ gửi cho bạn mã xác thực qua tin nhắn để đặt lại mật khẩu của bạn. Bạn có thể phải trả phí tin nhắn hoặc dữ liệu.");
        jButtonguimail.setText("Gửi tin nhắn cho tôi");
        jRadioButtonemail.setSelected(false);
        card = (CardLayout) jPanel2.getLayout();
        card.show(jPanel2,"sdt");
    }//GEN-LAST:event_jRadioButtonsdtActionPerformed

    private void jRadioButtonemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonemailActionPerformed
        jTextFieldemailhople.setEnabled(true); // Kích hoạt trường nhập email
        jTextPanegui.setText("Chúng tôi sẽ gửi email kèm theo hướng dẫn đặt lại mật khẩu.");
        jButtonguimail.setText("Gửi Email cho tôi");
        jRadioButtonsdt.setSelected(false);
        card = (CardLayout) jPanel2.getLayout();
        card.show(jPanel2,"email");
    }//GEN-LAST:event_jRadioButtonemailActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        CardLayout card = (CardLayout) panel.getLayout();
        card.show(panel,"Dangnhap");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabelFocusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFocusMouseClicked
        // TODO add your handling code here:
        CardLayout card = (CardLayout) panel.getLayout();
        card.show(panel,"Dangnhap");
    }//GEN-LAST:event_jLabelFocusMouseClicked
    private boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    private boolean isValidPhoneNumber(String phone) {
        return phone.matches("\\d{10,11}");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonguimail;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFocus;
    private javax.swing.JLabel jLabelkhongnho;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonemail;
    private javax.swing.JRadioButton jRadioButtonsdt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldemailhople;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPanegui;
    // End of variables declaration//GEN-END:variables

}
