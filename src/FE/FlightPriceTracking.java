package FE;
import com.formdev.flatlaf.FlatLightLaf;
public class FlightPriceTracking extends javax.swing.JFrame {

    public FlightPriceTracking() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Ten_Logo1 = new javax.swing.JLabel();
        btn_home2 = new javax.swing.JButton();
        btn_language1 = new javax.swing.JButton();
        btn_aboutUs1 = new javax.swing.JButton();
        btn_contact2 = new javax.swing.JButton();
        btn_explore1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jSpinField1 = new com.toedter.components.JSpinField();
        jLabel14 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 930));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ten_Logo1.setFont(new java.awt.Font("Vivaldi", 1, 35)); // NOI18N
        Ten_Logo1.setText("Travel and Map");
        jPanel1.add(Ten_Logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, 50));

        btn_home2.setBackground(new java.awt.Color(0, 102, 102));
        btn_home2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_home2.setForeground(new java.awt.Color(255, 255, 255));
        btn_home2.setText("Home");
        btn_home2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_home2.setBorderPainted(false);
        btn_home2.setContentAreaFilled(false);
        btn_home2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_home2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_home2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, 71));

        btn_language1.setBackground(new java.awt.Color(0, 102, 102));
        btn_language1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_language1.setForeground(new java.awt.Color(255, 255, 255));
        btn_language1.setText("Language");
        btn_language1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_language1.setBorderPainted(false);
        btn_language1.setContentAreaFilled(false);
        btn_language1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_language1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_language1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        btn_aboutUs1.setBackground(new java.awt.Color(0, 102, 102));
        btn_aboutUs1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_aboutUs1.setForeground(new java.awt.Color(255, 255, 255));
        btn_aboutUs1.setText("About Us");
        btn_aboutUs1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_aboutUs1.setBorderPainted(false);
        btn_aboutUs1.setContentAreaFilled(false);
        btn_aboutUs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aboutUs1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_aboutUs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, -1, 70));

        btn_contact2.setBackground(new java.awt.Color(0, 102, 102));
        btn_contact2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_contact2.setForeground(new java.awt.Color(255, 255, 255));
        btn_contact2.setText("Contact");
        btn_contact2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_contact2.setBorderPainted(false);
        btn_contact2.setContentAreaFilled(false);
        btn_contact2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_contact2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_contact2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, -1, 71));

        btn_explore1.setBackground(new java.awt.Color(0, 0, 0));
        btn_explore1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_explore1.setForeground(new java.awt.Color(255, 255, 255));
        btn_explore1.setText("Explore");
        btn_explore1.setBorder(null);
        btn_explore1.setContentAreaFilled(false);
        btn_explore1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_explore1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_explore1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 97, 70));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel7.setText("It’s A Big World Out ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, 70));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setText("There, Go Explore!");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("We're here to make your travel dreams a reality. Our intuitive ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, -1, 60));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("search engine scours thousands of flights to bring you the best ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, -1, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("deals tailored to your preferences and budget.");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, -1, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(248, 102, 65));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot 2025-04-27 202507.png"))); // NOI18N
        jButton4.setText("     Search Flight ");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 150, 200, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(248, 102, 65));
        jLabel4.setText("From");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 50, -1));
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 200, 40));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot_2025-04-27_202800-removebg-preview.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 40, 40));
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 200, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(248, 102, 65));
        jLabel5.setText("To");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(248, 102, 65));
        jLabel6.setText("Departure date");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));
        jPanel3.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 200, 40));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(248, 102, 65));
        jCheckBox1.setText("Round-trip");
        jPanel3.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 100, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(248, 102, 65));
        jLabel13.setText("Number of tickets");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));
        jPanel3.add(jSpinField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 100, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(248, 102, 65));
        jLabel14.setText("Seat class");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economy Class", "Business Class", "First Class" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 200, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 1000, 220));

        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("One Way");
        jButton3.setContentAreaFilled(false);
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot_2025-04-27_084214-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 362, 270, 90));

        jPanel2.setBackground(new java.awt.Color(248, 102, 65));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setForeground(new java.awt.Color(248, 102, 65));
        jButton1.setText("Round Trip");
        jButton1.setContentAreaFilled(false);
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot_2025-04-27_085147-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, -8, -1, 70));

        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Muti City");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 550, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot_2025-04-27_084214-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 240, 90));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Backgroud_Flight_price_Tracking2.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1300, 500));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(248, 102, 65));
        jLabel15.setText("Results here: ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 670, 170, 40));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 710, 650, 190));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1288, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_home2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home2ActionPerformed
        // TODO add your handling code here:
        Home dk = new Home();

        dk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_home2ActionPerformed

    private void btn_language1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_language1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_language1ActionPerformed

    private void btn_aboutUs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aboutUs1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_aboutUs1ActionPerformed

    private void btn_contact2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_contact2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_contact2ActionPerformed

    private void btn_explore1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_explore1ActionPerformed
        // TODO add your handling code here:
        Explore dk = new Explore();

        dk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_explore1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            FlatLightLaf.setup(); // setup giao diện FlatLaf
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        // Khởi động giao diện của bạn
        new FlightPriceTracking(); // hoặc tên Frame/Form của bạn

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlightPriceTracking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ten_Logo1;
    private javax.swing.JButton btn_aboutUs1;
    private javax.swing.JButton btn_contact2;
    private javax.swing.JButton btn_explore1;
    private javax.swing.JButton btn_home2;
    private javax.swing.JButton btn_language1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.components.JSpinField jSpinField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
