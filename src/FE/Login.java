package FE;

import com.formdev.flatlaf.FlatLightLaf;
import BE.OTPGenerator;
import BE.TelegramSender;

public class Login extends javax.swing.JFrame {

    private String generatedOTP;
    public static String phoneNumber;

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_mail = new javax.swing.JButton();
        jTextField_NhapSpDienThoai = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        btn_continue = new javax.swing.JButton();
        btn_gg = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Welcome back!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 19, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("<html>Pleae enter your phone number. You will receive a text message<br>to verify your account. Message & data rates may apply. </html>");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 410, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Phone number");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        btn_mail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_mai.png"))); // NOI18N
        btn_mail.setContentAreaFilled(false);
        btn_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mailActionPerformed(evt);
            }
        });
        jPanel1.add(btn_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 470, 70));

        jTextField_NhapSpDienThoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NhapSpDienThoaiActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_NhapSpDienThoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 360, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VN +84", "USA +1", "JN +81", "ThaiLand +66", "Laos +856", "IN +91", "UK +44", "FR) +33" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 80, 40));

        btn_continue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_login_come.png"))); // NOI18N
        btn_continue.setContentAreaFilled(false);
        btn_continue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_continueActionPerformed(evt);
            }
        });
        jPanel1.add(btn_continue, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 460, 60));

        btn_gg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_login_gg.png"))); // NOI18N
        btn_gg.setContentAreaFilled(false);
        btn_gg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ggActionPerformed(evt);
            }
        });
        jPanel1.add(btn_gg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 70));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn_login_fb.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 510, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Background_login.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jTextField_NhapSpDienThoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NhapSpDienThoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NhapSpDienThoaiActionPerformed

    private void btn_continueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_continueActionPerformed
        // TODO add your handling code here:
        phoneNumber = jTextField_NhapSpDienThoai.getText();
        if (phoneNumber.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui l\u00f2ng nh\u1eadp s\u1ed1 \u0111i\u1ec7n tho\u1ea1i!");
            return;
        }
        generatedOTP = OTPGenerator.generateOTP(6);
        TelegramSender.sendOTP(generatedOTP);
        new TrangNhapOTP(generatedOTP, phoneNumber).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_continueActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btn_ggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ggActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ggActionPerformed

    private void btn_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_mailActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            FlatLightLaf.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        // Khởi động giao diện của bạn
        new Login();
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_continue;
    private javax.swing.JButton btn_gg;
    private javax.swing.JButton btn_mail;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_NhapSpDienThoai;
    // End of variables declaration//GEN-END:variables
}
