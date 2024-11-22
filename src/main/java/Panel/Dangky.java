package Panel;


import ClassComponent.LoginAcc;
import ClassExtend.EmailTextField;
import ClassExtend.ImageBackGround;
import ClassExtend.PanelCustom;
import ClassExtend.PasswordTextField;
import ClassExtend.RoundedBorder1;
import javax.swing.JOptionPane;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

public class Dangky extends javax.swing.JPanel {
    private JPanel panel;
    private LoginAcc login = new LoginAcc();
    public Dangky() {
        this.panel = panel;
        initComponents();
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Left = new javax.swing.JPanel();
        jPanel12 = new PanelCustom(20, null, 0, null,true);
        jLabeldangki1 = new javax.swing.JLabel();
        jLabeldangnhap1 = new javax.swing.JLabel();
        jLabeltk = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabeldangnhap = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jTextFieldemail = new EmailTextField("Email");
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPasswordFieldpass = new PasswordTextField("Mật khẩu");
        jLabel5 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPasswordFieldpass1 = new PasswordTextField("Mật khẩu");
        jLabelDebug = new javax.swing.JLabel();

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setPreferredSize(new java.awt.Dimension(390, 600));

        jPanel12.setBackground(new java.awt.Color(255, 0, 0));
        jPanel12.setPreferredSize(new java.awt.Dimension(73, 36));

        jLabeldangki1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabeldangki1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeldangki1.setText("Đăng ký");
        jLabeldangki1.setPreferredSize(new java.awt.Dimension(61, 17));
        jLabeldangki1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabeldangki1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabeldangki1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabeldangki1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jLabeldangnhap1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabeldangnhap1.setForeground(new java.awt.Color(255, 51, 0));
        jLabeldangnhap1.setText("Đăng nhập");
        jLabeldangnhap1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabeldangnhap1MouseClicked(evt);
            }
        });

        jLabeltk.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabeltk.setText("Bạn đã có tài khoản?");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabeldangnhap.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabeldangnhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeldangnhap.setText("Đăng ký");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabeldangnhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabeldangnhap, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("Email");

        jPanel8.setBorder(new RoundedBorder1(Color.DARK_GRAY, 50, 1));
        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(64, 21));

        jTextFieldemail.setBorder(null);
        jTextFieldemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldemailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jTextFieldemail, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldemail, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("Password");

        jPanel9.setBorder(new RoundedBorder1(Color.DARK_GRAY, 50, 1));
        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(64, 21));

        jPasswordFieldpass.setBorder(null);
        jPasswordFieldpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldpassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPasswordFieldpass, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPasswordFieldpass, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("Nhập lại password");

        jPanel10.setBorder(new RoundedBorder1(Color.DARK_GRAY, 50, 1));
        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(64, 21));

        jPasswordFieldpass1.setBorder(null);
        jPasswordFieldpass1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldpass1FocusLost(evt);
            }
        });
        jPasswordFieldpass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldpass1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPasswordFieldpass1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPasswordFieldpass1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabelDebug.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LeftLayout.createSequentialGroup()
                                .addComponent(jLabeltk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabeldangnhap1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LeftLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(LeftLayout.createSequentialGroup()
                                            .addGap(19, 19, 19)
                                            .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabelDebug, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(14, 14, 14)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(14, 14, 14)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDebug)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeltk)
                    .addComponent(jLabeldangnhap1))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Left, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Left, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabeldangki1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeldangki1MouseClicked
    // TODO add your handling code here:
     // Lấy thông tin từ các trường nhập liệu
    String email = jTextFieldemail.getText();
    String password = new String(jPasswordFieldpass.getPassword());
    String repass = new String(jPasswordFieldpass1.getPassword());

    // Kiểm tra tính hợp lệ của dữ liệu
    if ((email.isEmpty() || password.isEmpty()|| repass.isEmpty()) && !repass.equals(password)) {
        JOptionPane.showMessageDialog(this, "Vui lòng điền đúng thông tin!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Giả sử có phương thức validateEmail để kiểm tra định dạng email
    if (!validateEmail(email)) {
        JOptionPane.showMessageDialog(this, "Email không hợp lệ!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Lưu thông tin đăng ký (giả sử có phương thức saveUser để lưu người dùng)
    boolean isRegistered = saveUser(repass, email, password);
    if (isRegistered) {
        JOptionPane.showMessageDialog(this, "Đăng ký thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        // Sau khi đăng ký thành công, chuyển sang giao diện đăng nhập
        CardLayout card = (CardLayout) panel.getLayout();
        card.show(panel, "Dangnhap");
    } else {
        JOptionPane.showMessageDialog(this, "Email đã được sử dụng!", "Thông báo", JOptionPane.ERROR_MESSAGE);
    }
    
    SetTxtNULL();
    }//GEN-LAST:event_jLabeldangki1MouseClicked

    public void SetTxtNULL()
    {
        jPasswordFieldpass.setText("");
        jPasswordFieldpass1.setText("");
        jTextFieldemail.setText("");
    }
    
    private void jLabeldangnhap1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeldangnhap1MouseClicked
        // TODO add your handling code here:
        CardLayout card = (CardLayout) panel.getLayout();
        card.show(panel,"Dangnhap");
    }//GEN-LAST:event_jLabeldangnhap1MouseClicked

    private void jPasswordFieldpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldpassActionPerformed

    private void jTextFieldemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldemailActionPerformed

    private void jPasswordFieldpass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldpass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldpass1ActionPerformed

    private void jPasswordFieldpass1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldpass1FocusLost
        // TODO add your handling code here:
        String password = new String(jPasswordFieldpass.getPassword());
        String repass = new String(jPasswordFieldpass1.getPassword());
        if(!repass.equals(password))
        {
            jLabelDebug.setText("Hãy nhập lại đúng mật khẩu!!!");
        }
        else jLabelDebug.setText(null);
    }//GEN-LAST:event_jPasswordFieldpass1FocusLost
    // Giả sử đây là phương thức để kiểm tra định dạng email
    private boolean validateEmail(String email) {
        return email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }

    // Giả sử đây là phương thức để lưu người dùng vào cơ sở dữ liệu
    private boolean saveUser(String repass, String email, String password) {
        // Thực hiện lưu thông tin vào cơ sở dữ liệu hoặc danh sách người dùng
        // Ví dụ: return Database.save(hoVaTen, email, password);
        try
        {
            login.CreateAccount(email, password);
            return true;
        }
        catch(Exception ex)
        {
            return false; // Giả sử lưu thành công
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDebug;
    private javax.swing.JLabel jLabeldangki1;
    private javax.swing.JLabel jLabeldangnhap;
    private javax.swing.JLabel jLabeldangnhap1;
    private javax.swing.JLabel jLabeltk;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordFieldpass;
    private javax.swing.JPasswordField jPasswordFieldpass1;
    private javax.swing.JTextField jTextFieldemail;
    // End of variables declaration//GEN-END:variables
}
