package Panel;


import ClassComponent.AccountData;
import ClassComponent.LoginAcc;
import ClassExtend.EmailTextField;
import ClassExtend.ImageBackGround;
import ClassExtend.PanelCustom;
import ClassExtend.PasswordTextField;
import ClassExtend.RoundedBorder1; 
import Interface.LoginListener;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Desktop;
import java.net.URI;
import java.io.IOException;


public class Dangnhap extends javax.swing.JPanel {
    
    private PanelLogin panelLogin;
    private JPanel panelBody,Acc;
    private HomeFrame home;
    private LoginAcc login = new LoginAcc();
    private static boolean isView = true;
    private AccountData account = new AccountData();
    private LoginListener loginListener;
    
    public Dangnhap() {
        initComponents();
    }
    
    public void setHome(HomeFrame home) {
        this.home = home;
    }

    public void setpanelLogin(PanelLogin panel) {
        this.panelLogin = panel;
    }

    public void setPanelBody(JPanel Body) {
        this.panelBody = Body;
    }

    public void setAcc(JPanel Acc) {
        this.Acc = Acc;
    }

    public void setLoginListener(LoginListener listener) {
        this.loginListener = listener;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jTextFieldemail = new EmailTextField("Email");
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPasswordFieldpass = new PasswordTextField("Mật khẩu");
        jPanel3 = new PanelCustom(0, null, 0, "C:\\Java\\FinalPresent\\src\\main\\java\\Icon\\hide.png",true);
        jPanel12 = new PanelCustom(20, null, 0, null,true);
        jLabeldangnhap1 = new javax.swing.JLabel();
        jPanel2 = new PanelCustom(20, null, 0, null,true);
        jLabelfb = new javax.swing.JLabel();
        jPanel9 = new ImageBackGround("C:\\Java\\FinalPresent\\src\\main\\java\\Icon\\facebook.png");
        jPanel8 = new PanelCustom(20, null, 0, null,true);
        jLabelgg = new javax.swing.JLabel();
        jPanel11 = new ImageBackGround("C:\\Java\\FinalPresent\\src\\main\\java\\Icon\\google.png");
        jLabeldangky = new javax.swing.JLabel();
        jLabeltk = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabeldangnhap = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabelquenmk = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnlEmailDebug = new javax.swing.JLabel();
        pnlPassDebug = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("Email");

        jPanel6.setBorder(new RoundedBorder1(Color.DARK_GRAY, 50, 1));
        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(64, 21));

        jTextFieldemail.setBorder(null);
        jTextFieldemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldemailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldemailFocusLost(evt);
            }
        });
        jTextFieldemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldemailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jTextFieldemail, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldemail, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("Password");

        jPanel7.setBorder(new RoundedBorder1(Color.DARK_GRAY, 50, 1));
        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(64, 21));

        jPasswordFieldpass.setBorder(null);
        jPasswordFieldpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldpassActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPasswordFieldpass, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordFieldpass, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(255, 0, 0));

        jLabeldangnhap1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabeldangnhap1.setForeground(new java.awt.Color(255, 255, 255));
        jLabeldangnhap1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeldangnhap1.setText("Đăng nhập");
        jLabeldangnhap1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabeldangnhap1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabeldangnhap1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabeldangnhap1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(59, 89, 152));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(73, 36));

        jLabelfb.setBackground(new java.awt.Color(0, 0, 204));
        jLabelfb.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelfb.setForeground(new java.awt.Color(255, 255, 255));
        jLabelfb.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelfb.setText("Đăng nhập với Facebook");
        jLabelfb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelfbMouseClicked(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(59, 89, 152));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelfb, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelfb, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(228, 224, 224));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(290, 36));

        jLabelgg.setBackground(new java.awt.Color(0, 0, 204));
        jLabelgg.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelgg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelgg.setText("Đăng nhập với Google");
        jLabelgg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelggMouseClicked(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(228, 224, 224));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelgg, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelgg, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabeldangky.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabeldangky.setForeground(new java.awt.Color(255, 51, 0));
        jLabeldangky.setText("Đăng ký");
        jLabeldangky.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabeldangkyMouseClicked(evt);
            }
        });

        jLabeltk.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabeltk.setText("Bạn chưa có tài khoản?");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabeldangnhap.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabeldangnhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeldangnhap.setText("Đăng nhập");

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

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabelquenmk.setBackground(new java.awt.Color(102, 102, 102));
        jLabelquenmk.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelquenmk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelquenmk.setText("Bạn quên mật khẩu?");
        jLabelquenmk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelquenmkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelquenmkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelquenmkMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelquenmk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelquenmk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Hoặc");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        pnlEmailDebug.setForeground(new java.awt.Color(255, 0, 0));

        pnlPassDebug.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(229, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabeltk)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabeldangky, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(pnlEmailDebug, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pnlPassDebug, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pnlEmailDebug))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pnlPassDebug))
                .addGap(10, 10, 10)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeltk)
                    .addComponent(jLabeldangky))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("870");
        getAccessibleContext().setAccessibleDescription("550");
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelquenmkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelquenmkMouseClicked
        CardLayout card = (CardLayout) panelLogin.getLayout();
        card.show(panelLogin,"QuenMK");
    }//GEN-LAST:event_jLabelquenmkMouseClicked

    private void jLabeldangkyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeldangkyMouseClicked
        CardLayout card = (CardLayout) panelLogin.getLayout();
        card.show(panelLogin,"Dangky");
        SetTxtNULL();
    }//GEN-LAST:event_jLabeldangkyMouseClicked

    private void jLabelggMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelggMouseClicked
        try {
            // URL đăng nhập Google
            String googleLoginUrl = "https://accounts.google.com/ServiceLogin";

            // Kiểm tra xem Desktop API có được hỗ trợ và hỗ trợ hành động BROWSE không
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(new java.net.URI(googleLoginUrl));
                } else {
                    JOptionPane.showMessageDialog(this, "Tính năng mở trình duyệt không được hỗ trợ.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Desktop API không được hỗ trợ trên hệ điều hành của bạn.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Không thể mở trang Google. Vui lòng thử lại sau.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabelggMouseClicked

    private void jLabelfbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelfbMouseClicked
        try {
            // URL đăng nhập Facebook
            String facebookLoginUrl = "https://www.facebook.com/login.php";

            // Kiểm tra xem Desktop API có được hỗ trợ và hỗ trợ hành động BROWSE không
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(new java.net.URI(facebookLoginUrl));
                } else {
                    JOptionPane.showMessageDialog(this, "Tính năng mở trình duyệt không được hỗ trợ.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Desktop API không được hỗ trợ trên hệ điều hành của bạn.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Không thể mở trang Facebook. Vui lòng thử lại sau.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabelfbMouseClicked

    private void jLabeldangnhap1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeldangnhap1MouseClicked
        // Lấy thông tin từ các trường nhập liệu
        String email = jTextFieldemail.getText();
        String password = new String(jPasswordFieldpass.getPassword());

        // Kiểm tra tính hợp lệ của dữ liệu
        if (email.isEmpty()) {
            pnlEmailDebug.setText("Vui lòng điền đầy đủ thông tin!");
            return;
        }
        
        if (password.isEmpty()) {
            pnlPassDebug.setText("Vui lòng điền đầy đủ thông tin!");
            return;
        }

        // Kiểm tra đăng nhập
        if (checkCredentials(email, password)) {
            JOptionPane.showMessageDialog(this, "Đăng nhập thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            //panelLogin.setUserID(email);
            SetTxtNULL();
            if(loginListener != null)
            {
                loginListener.onLoginSuccess(account.setAccount(login.getID(email)));
            }
            // Chuyển sang giao diện chính sau khi đăng nhập thành công
            SwitchCard();

        } else {
            JOptionPane.showMessageDialog(this, "Email hoặc mật khẩu không đúng!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jLabeldangnhap1MouseClicked

    public void SwitchCard()
    {
        home.callMain();
    }
    
    public void SetTxtNULL()
    {
        jPasswordFieldpass.setText("");
        jTextFieldemail.setText("");
        pnlEmailDebug.setText("");
        pnlPassDebug.setText("");
    }
    
    private void jPasswordFieldpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldpassActionPerformed
        // TODO add your handling code here:
        // Lấy thông tin từ các trường nhập liệu
        String email = jTextFieldemail.getText();
        String password = new String(jPasswordFieldpass.getPassword());

        // Kiểm tra tính hợp lệ của dữ liệu
        if (email.isEmpty()) {
            pnlEmailDebug.setText("Vui lòng điền đầy đủ thông tin!");
            return;
        }
        
        if (password.isEmpty()) {
            pnlPassDebug.setText("Vui lòng điền đầy đủ thông tin!");
            return;
        }
        // Kiểm tra đăng nhập
        if (checkCredentials(email, password)) {
            JOptionPane.showMessageDialog(this, "Đăng nhập thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            //panelLogin.setUserID(email);
            SetTxtNULL();
            if(loginListener != null)
            {
                loginListener.onLoginSuccess(account.setAccount(login.getID(email)));
            }
            // Chuyển sang giao diện chính sau khi đăng nhập thành công

            SwitchCard();

        } else {
            JOptionPane.showMessageDialog(this, "Email hoặc mật khẩu không đúng!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            pnlEmailDebug.setText("");
            pnlPassDebug.setText("");
        }
        
    }//GEN-LAST:event_jPasswordFieldpassActionPerformed

    private void jTextFieldemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldemailActionPerformed
        // TODO add your handling code here:
        jPasswordFieldpass.requestFocus();
    }//GEN-LAST:event_jTextFieldemailActionPerformed

    private void jLabelquenmkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelquenmkMouseEntered
        // TODO add your handling code here:
        jLabelquenmk.setForeground(Color.red);
    }//GEN-LAST:event_jLabelquenmkMouseEntered

    private void jLabelquenmkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelquenmkMouseExited
        // TODO add your handling code here:
        jLabelquenmk.setForeground(Color.black);
    }//GEN-LAST:event_jLabelquenmkMouseExited

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        if(isView == false)
        {
                ((PanelCustom) jPanel3).setBackgroundImage("C:\\Java\\FinalPresent\\src\\main\\java\\Icon\\hide.png");
                jPanel3.setBackground(Color.white);
                jPasswordFieldpass.setEchoChar('\u0000');
        }
        else
        {
                ((PanelCustom) jPanel3).setBackgroundImage("C:\\Java\\FinalPresent\\src\\main\\java\\Icon\\view.png");
                jPanel3.setBackground(Color.white);
                jPasswordFieldpass.setEchoChar('\u2022');
        }
        isView=!isView;
        jPanel3.repaint();
        jPanel3.revalidate();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jTextFieldemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldemailFocusLost
        // TODO add your handling code here:
        if (!validateEmail(jTextFieldemail.getText())) {
        pnlEmailDebug.setText("Email không hợp lệ!");
    }
    }//GEN-LAST:event_jTextFieldemailFocusLost

    private void jTextFieldemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldemailFocusGained
        // TODO add your handling code here:
        pnlEmailDebug.setText("");
        pnlPassDebug.setText("");
    }//GEN-LAST:event_jTextFieldemailFocusGained
    
    private boolean validateEmail(String email) {
        return email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }
    
    // Giả sử đây là phương thức kiểm tra thông tin đăng nhập    
    private boolean checkCredentials(String email, String password) {
        // Thực hiện kiểm tra thông tin trong cơ sở dữ liệu hoặc danh sách người dùng
        
        return login.LoginAccount(email, password);
        
        // Ví dụ: return Database.checkUser(email, password);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabeldangky;
    private javax.swing.JLabel jLabeldangnhap;
    private javax.swing.JLabel jLabeldangnhap1;
    private javax.swing.JLabel jLabelfb;
    private javax.swing.JLabel jLabelgg;
    private javax.swing.JLabel jLabelquenmk;
    private javax.swing.JLabel jLabeltk;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordFieldpass;
    private javax.swing.JTextField jTextFieldemail;
    private javax.swing.JLabel pnlEmailDebug;
    private javax.swing.JLabel pnlPassDebug;
    // End of variables declaration//GEN-END:variables
}
