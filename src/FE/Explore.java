package FE;

import java.sql.*;
import javax.swing.DefaultListModel;

public class Explore extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    DefaultListModel mod = new DefaultListModel();

    public Explore() {
        initComponents();
        jPopupMenu1.add(Panel_ChuaThongTinSearch);
        List_ThongTinSearch.setModel(mod);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Panel_ChuaThongTinSearch = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        List_ThongTinSearch = new javax.swing.JList<>();
        Ten_Logo = new javax.swing.JLabel();
        btn_home = new javax.swing.JButton();
        btn_language = new javax.swing.JButton();
        btn_aboutUs = new javax.swing.JButton();
        btn_contact1 = new javax.swing.JButton();
        btn_explore = new javax.swing.JButton();
        text_h1 = new javax.swing.JLabel();
        text_h3 = new javax.swing.JLabel();
        text_h2 = new javax.swing.JLabel();
        khung_DaNang = new javax.swing.JPanel();
        text_h2_TripToDaNang = new javax.swing.JLabel();
        text_h1_DaNang = new javax.swing.JLabel();
        image_DaNang = new javax.swing.JLabel();
        khung_HaNoi = new javax.swing.JPanel();
        text_h2_TripToHaNoi = new javax.swing.JLabel();
        text_h1_HaNoi = new javax.swing.JLabel();
        image_HaNoi = new javax.swing.JLabel();
        khung_SaiGon = new javax.swing.JPanel();
        text_h2_TripToSaiGon = new javax.swing.JLabel();
        text_h1_SaiGon = new javax.swing.JLabel();
        image_SaiGon = new javax.swing.JLabel();
        btn_search = new javax.swing.JButton();
        text_nhapThongTin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jPopupMenu1.setFocusable(false);

        List_ThongTinSearch.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        List_ThongTinSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                List_ThongTinSearchMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(List_ThongTinSearch);

        javax.swing.GroupLayout Panel_ChuaThongTinSearchLayout = new javax.swing.GroupLayout(Panel_ChuaThongTinSearch);
        Panel_ChuaThongTinSearch.setLayout(Panel_ChuaThongTinSearchLayout);
        Panel_ChuaThongTinSearchLayout.setHorizontalGroup(
            Panel_ChuaThongTinSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        Panel_ChuaThongTinSearchLayout.setVerticalGroup(
            Panel_ChuaThongTinSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(95, 179, 156));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ten_Logo.setFont(new java.awt.Font("Vivaldi", 1, 35)); // NOI18N
        Ten_Logo.setText("Travel and Map");
        getContentPane().add(Ten_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, 50));

        btn_home.setBackground(new java.awt.Color(0, 102, 102));
        btn_home.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_home.setForeground(new java.awt.Color(255, 255, 255));
        btn_home.setText("Home");
        btn_home.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_home.setBorderPainted(false);
        btn_home.setContentAreaFilled(false);
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 45, -1, 60));

        btn_language.setBackground(new java.awt.Color(0, 102, 102));
        btn_language.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_language.setForeground(new java.awt.Color(255, 255, 255));
        btn_language.setText("Language");
        btn_language.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_language.setBorderPainted(false);
        btn_language.setContentAreaFilled(false);
        btn_language.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_languageActionPerformed(evt);
            }
        });
        getContentPane().add(btn_language, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, 70));

        btn_aboutUs.setBackground(new java.awt.Color(0, 102, 102));
        btn_aboutUs.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_aboutUs.setForeground(new java.awt.Color(255, 255, 255));
        btn_aboutUs.setText("About Us");
        btn_aboutUs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_aboutUs.setBorderPainted(false);
        btn_aboutUs.setContentAreaFilled(false);
        btn_aboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aboutUsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_aboutUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 41, -1, 70));

        btn_contact1.setBackground(new java.awt.Color(0, 102, 102));
        btn_contact1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_contact1.setForeground(new java.awt.Color(255, 255, 255));
        btn_contact1.setText("Contact");
        btn_contact1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_contact1.setBorderPainted(false);
        btn_contact1.setContentAreaFilled(false);
        btn_contact1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_contact1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_contact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, -1, 70));

        btn_explore.setBackground(new java.awt.Color(0, 0, 0));
        btn_explore.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_explore.setForeground(new java.awt.Color(255, 102, 51));
        btn_explore.setText("Explore");
        btn_explore.setBorder(null);
        btn_explore.setContentAreaFilled(false);
        btn_explore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exploreActionPerformed(evt);
            }
        });
        getContentPane().add(btn_explore, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, 97, 68));

        text_h1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        text_h1.setForeground(new java.awt.Color(255, 255, 255));
        text_h1.setText("MOUNTAINS | PLAINS | BEACHES");
        text_h1.setToolTipText("");
        text_h1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(text_h1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 180, -1, -1));

        text_h3.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        text_h3.setForeground(new java.awt.Color(255, 255, 255));
        text_h3.setText("Spend your vacation with our activites");
        getContentPane().add(text_h3, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 219, -1, -1));

        text_h2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        text_h2.setForeground(new java.awt.Color(255, 255, 255));
        text_h2.setText("MOST POPULAR");
        getContentPane().add(text_h2, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 302, -1, -1));

        khung_DaNang.setBackground(new java.awt.Color(255, 255, 255));
        khung_DaNang.setPreferredSize(new java.awt.Dimension(120, 0));

        text_h2_TripToDaNang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        text_h2_TripToDaNang.setText("Trip To DaNang");

        text_h1_DaNang.setText("12 people going");

        image_DaNang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/DaNang.png"))); // NOI18N

        javax.swing.GroupLayout khung_DaNangLayout = new javax.swing.GroupLayout(khung_DaNang);
        khung_DaNang.setLayout(khung_DaNangLayout);
        khung_DaNangLayout.setHorizontalGroup(
            khung_DaNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(khung_DaNangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(khung_DaNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(image_DaNang, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(khung_DaNangLayout.createSequentialGroup()
                        .addComponent(text_h1_DaNang, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addComponent(text_h2_TripToDaNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        khung_DaNangLayout.setVerticalGroup(
            khung_DaNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, khung_DaNangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image_DaNang, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_h2_TripToDaNang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_h1_DaNang)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(khung_DaNang, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 335, -1, 160));

        khung_HaNoi.setBackground(new java.awt.Color(255, 255, 255));
        khung_HaNoi.setPreferredSize(new java.awt.Dimension(120, 0));

        text_h2_TripToHaNoi.setBackground(new java.awt.Color(2, 63, 118));
        text_h2_TripToHaNoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        text_h2_TripToHaNoi.setText("Trip To HaNoi");

        text_h1_HaNoi.setBackground(new java.awt.Color(2, 63, 118));
        text_h1_HaNoi.setText("27 people going");

        image_HaNoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/HaNoi.png"))); // NOI18N

        javax.swing.GroupLayout khung_HaNoiLayout = new javax.swing.GroupLayout(khung_HaNoi);
        khung_HaNoi.setLayout(khung_HaNoiLayout);
        khung_HaNoiLayout.setHorizontalGroup(
            khung_HaNoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(khung_HaNoiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(khung_HaNoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(image_HaNoi, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(khung_HaNoiLayout.createSequentialGroup()
                        .addGroup(khung_HaNoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_h2_TripToHaNoi)
                            .addComponent(text_h1_HaNoi))
                        .addGap(0, 23, Short.MAX_VALUE)))
                .addContainerGap())
        );
        khung_HaNoiLayout.setVerticalGroup(
            khung_HaNoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, khung_HaNoiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image_HaNoi, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_h2_TripToHaNoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_h1_HaNoi)
                .addGap(18, 18, 18))
        );

        getContentPane().add(khung_HaNoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 335, -1, 160));

        khung_SaiGon.setBackground(new java.awt.Color(255, 255, 255));
        khung_SaiGon.setPreferredSize(new java.awt.Dimension(120, 0));

        text_h2_TripToSaiGon.setBackground(new java.awt.Color(2, 63, 118));
        text_h2_TripToSaiGon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        text_h2_TripToSaiGon.setText("Trip To SaiGon");

        text_h1_SaiGon.setBackground(new java.awt.Color(2, 63, 118));
        text_h1_SaiGon.setText("20 people going");

        image_SaiGon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/SaiGon.png"))); // NOI18N

        javax.swing.GroupLayout khung_SaiGonLayout = new javax.swing.GroupLayout(khung_SaiGon);
        khung_SaiGon.setLayout(khung_SaiGonLayout);
        khung_SaiGonLayout.setHorizontalGroup(
            khung_SaiGonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(khung_SaiGonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(khung_SaiGonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(image_SaiGon, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(khung_SaiGonLayout.createSequentialGroup()
                        .addGroup(khung_SaiGonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_h2_TripToSaiGon)
                            .addComponent(text_h1_SaiGon))
                        .addGap(0, 23, Short.MAX_VALUE)))
                .addContainerGap())
        );
        khung_SaiGonLayout.setVerticalGroup(
            khung_SaiGonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, khung_SaiGonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image_SaiGon, javax.swing.GroupLayout.PREFERRED_SIZE, 92, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_h2_TripToSaiGon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_h1_SaiGon)
                .addGap(18, 18, 18))
        );

        getContentPane().add(khung_SaiGon, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 335, -1, 160));

        btn_search.setBackground(new java.awt.Color(231, 172, 114));
        btn_search.setText("Search");
        getContentPane().add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(881, 513, 101, 58));

        text_nhapThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nhapThongTinActionPerformed(evt);
            }
        });
        text_nhapThongTin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text_nhapThongTinKeyReleased(evt);
            }
        });
        getContentPane().add(text_nhapThongTin, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 513, 772, 58));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Backgroud_Explore.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exploreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exploreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_exploreActionPerformed

    private void btn_languageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_languageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_languageActionPerformed

    private void btn_aboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aboutUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_aboutUsActionPerformed

    private void text_nhapThongTinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_nhapThongTinKeyReleased
        // TODO add your handling code here:

        if (text_nhapThongTin.getText().equals("")) {
            jPopupMenu1.setVisible(false);
        } else {
            jPopupMenu1.show(text_nhapThongTin, 0, text_nhapThongTin.getHeight());

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelandmap", "root", "");
                String sql = "SELECT * FROM `tblsearch` where `ThanhPho` like '" + text_nhapThongTin.getText() + "%'";

                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();

                mod.removeAllElements();

                while (rs.next()) {
                    mod.addElement(rs.getString("ThanhPho") + ", " + rs.getString("DiaChi") + ", " + rs.getString("GiaiTri"));
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_text_nhapThongTinKeyReleased

    private void text_nhapThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nhapThongTinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nhapThongTinActionPerformed

    private void List_ThongTinSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_List_ThongTinSearchMouseClicked
        // TODO add your handling code here:
        text_nhapThongTin.setText(List_ThongTinSearch.getSelectedValue());
        jPopupMenu1.setVisible(false);
    }//GEN-LAST:event_List_ThongTinSearchMouseClicked

    private void btn_contact1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_contact1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_contact1ActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        // TODO add your handling code here:
        Home dk = new Home();
        dk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_homeActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Explore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> List_ThongTinSearch;
    private javax.swing.JPanel Panel_ChuaThongTinSearch;
    private javax.swing.JLabel Ten_Logo;
    private javax.swing.JButton btn_aboutUs;
    private javax.swing.JButton btn_contact1;
    private javax.swing.JButton btn_explore;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_language;
    private javax.swing.JButton btn_search;
    private javax.swing.JLabel image_DaNang;
    private javax.swing.JLabel image_HaNoi;
    private javax.swing.JLabel image_SaiGon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel khung_DaNang;
    private javax.swing.JPanel khung_HaNoi;
    private javax.swing.JPanel khung_SaiGon;
    private javax.swing.JLabel text_h1;
    private javax.swing.JLabel text_h1_DaNang;
    private javax.swing.JLabel text_h1_HaNoi;
    private javax.swing.JLabel text_h1_SaiGon;
    private javax.swing.JLabel text_h2;
    private javax.swing.JLabel text_h2_TripToDaNang;
    private javax.swing.JLabel text_h2_TripToHaNoi;
    private javax.swing.JLabel text_h2_TripToSaiGon;
    private javax.swing.JLabel text_h3;
    private javax.swing.JTextField text_nhapThongTin;
    // End of variables declaration//GEN-END:variables
}
