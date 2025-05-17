package FE;

import Food.Giaodien;
import com.formdev.flatlaf.FlatLightLaf;
import findcompanios.giaodien;
import java.sql.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    DefaultListModel mod = new DefaultListModel();

    public Home() {
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        Ten_Logo = new javax.swing.JLabel();
        btn_language = new javax.swing.JButton();
        btn_aboutUs = new javax.swing.JButton();
        btn_contact1 = new javax.swing.JButton();
        btn_explore = new javax.swing.JButton();
        btn_Out = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Text_NhapThongTin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnRadio_Culture = new javax.swing.JRadioButton();
        btnRadio_Food = new javax.swing.JRadioButton();
        btnRadio_Nature = new javax.swing.JRadioButton();
        btnRadio_Adventure = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btn_chuyenTrang1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btn_chuyenTrang3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_chuyenTrang4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        btn_chuyenTrang = new javax.swing.JButton();
        btn_home1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        btn_Search = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jLabel76 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_Chuyentien = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        Panel_ChuaThongTinSearchLayout.setVerticalGroup(
            Panel_ChuaThongTinSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1300, 4276));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ten_Logo.setFont(new java.awt.Font("Vivaldi", 1, 35)); // NOI18N
        Ten_Logo.setText("Travel and Map");
        jPanel2.add(Ten_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 40, -1, 50));

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
        jPanel2.add(btn_language, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, -1, -1));

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
        jPanel2.add(btn_aboutUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, -1, 70));

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
        jPanel2.add(btn_contact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, -1, 71));

        btn_explore.setBackground(new java.awt.Color(0, 0, 0));
        btn_explore.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_explore.setForeground(new java.awt.Color(255, 255, 255));
        btn_explore.setText("Explore");
        btn_explore.setBorder(null);
        btn_explore.setContentAreaFilled(false);
        btn_explore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exploreActionPerformed(evt);
            }
        });
        jPanel2.add(btn_explore, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, 97, 70));

        btn_Out.setBackground(new java.awt.Color(0, 102, 102));
        btn_Out.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Out.setForeground(new java.awt.Color(255, 255, 255));
        btn_Out.setText("<-");
        btn_Out.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Out.setBorderPainted(false);
        btn_Out.setContentAreaFilled(false);
        btn_Out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OutActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Out, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 50, -1, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("<html><pre>Choose a Country For Your<br>    Next Adventure ?</pre></html>");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("From local escapes to far-flung adventures");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 335, -1, -1));

        Text_NhapThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_NhapThongTinActionPerformed(evt);
            }
        });
        jPanel2.add(Text_NhapThongTin, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 379, 360, 50));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Or browse the selected type");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 452, -1, -1));

        btnRadio_Culture.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRadio_Culture.setForeground(new java.awt.Color(255, 255, 255));
        btnRadio_Culture.setText("Culture");
        btnRadio_Culture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadio_CultureActionPerformed(evt);
            }
        });
        jPanel2.add(btnRadio_Culture, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 480, -1, -1));

        btnRadio_Food.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRadio_Food.setForeground(new java.awt.Color(255, 255, 255));
        btnRadio_Food.setText("Food");
        btnRadio_Food.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadio_FoodActionPerformed(evt);
            }
        });
        jPanel2.add(btnRadio_Food, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 480, -1, -1));

        btnRadio_Nature.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRadio_Nature.setForeground(new java.awt.Color(255, 255, 255));
        btnRadio_Nature.setText("Nature");
        btnRadio_Nature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadio_NatureActionPerformed(evt);
            }
        });
        jPanel2.add(btnRadio_Nature, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 480, -1, -1));

        btnRadio_Adventure.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRadio_Adventure.setForeground(new java.awt.Color(255, 255, 255));
        btnRadio_Adventure.setText("Adventure");
        btnRadio_Adventure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadio_AdventureActionPerformed(evt);
            }
        });
        jPanel2.add(btnRadio_Adventure, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 480, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Best of");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 548, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("VietNam");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 548, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Molokini_NewYork.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 296, 200));

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("New York, USA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 86, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Molokini and Turtle Town");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 170, 10));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Snorkeling Adventure Aboard");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel11.setText("4 days");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 43, -1));

        jLabel18.setText("From $250");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 60, -1));

        btn_chuyenTrang1.setBackground(new java.awt.Color(0, 102, 102));
        btn_chuyenTrang1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_chuyenTrang1.setForeground(new java.awt.Color(255, 102, 0));
        btn_chuyenTrang1.setText("👁️‍");
        btn_chuyenTrang1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_chuyenTrang1.setBorderPainted(false);
        btn_chuyenTrang1.setContentAreaFilled(false);
        btn_chuyenTrang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chuyenTrang1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_chuyenTrang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 40, 30));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 200, 300));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Inclusive Ultimate Circle Island.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 200));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("New York, USA");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 78, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("All Inclusive Ultimate Circle");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 10));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Island Day hTour with Lunch");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel17.setText("4 days");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 43, -1));

        jLabel24.setText("From $771");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        btn_chuyenTrang3.setBackground(new java.awt.Color(0, 102, 102));
        btn_chuyenTrang3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_chuyenTrang3.setForeground(new java.awt.Color(255, 102, 0));
        btn_chuyenTrang3.setText("👁");
        btn_chuyenTrang3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_chuyenTrang3.setBorderPainted(false);
        btn_chuyenTrang3.setContentAreaFilled(false);
        btn_chuyenTrang3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chuyenTrang3ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_chuyenTrang3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 40, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 580, 200, 300));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Kayak Tour.png"))); // NOI18N
        jLabel19.setText("jLabel19");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 199));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 153, 153));
        jLabel20.setText("New York, USA");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 95, 10));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("Clear Kayak Tour of Shell Key");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 226, 163, 10));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("Preserve and Tampa Bay Area");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 10));

        jLabel23.setText("4 days");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 43, -1));

        jLabel12.setText("From $225");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        btn_chuyenTrang4.setBackground(new java.awt.Color(0, 102, 102));
        btn_chuyenTrang4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_chuyenTrang4.setForeground(new java.awt.Color(255, 102, 0));
        btn_chuyenTrang4.setText("👁");
        btn_chuyenTrang4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_chuyenTrang4.setBorderPainted(false);
        btn_chuyenTrang4.setContentAreaFilled(false);
        btn_chuyenTrang4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chuyenTrang4ActionPerformed(evt);
            }
        });
        jPanel4.add(btn_chuyenTrang4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 40, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, 200, 300));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 153, 153));
        jLabel27.setText("New York, USA");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 79, 10));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("Mauna Kea Summit Sunset and");
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 180, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setText("Kona Waikoloa Pick Up");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 150, 10));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setText("Stars Free Astro Photos Hilo ");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 236, 180, 10));

        jLabel30.setText("4 days");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel31.setText("From $711");
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 60, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Mauna Kea.png"))); // NOI18N
        jLabel32.setText("jLabel32");
        jPanel5.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 200));

        btn_chuyenTrang.setBackground(new java.awt.Color(0, 102, 102));
        btn_chuyenTrang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_chuyenTrang.setForeground(new java.awt.Color(255, 102, 0));
        btn_chuyenTrang.setText("👁");
        btn_chuyenTrang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_chuyenTrang.setBorderPainted(false);
        btn_chuyenTrang.setContentAreaFilled(false);
        btn_chuyenTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chuyenTrangActionPerformed(evt);
            }
        });
        jPanel5.add(btn_chuyenTrang, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 40, 30));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 580, 200, 300));

        btn_home1.setBackground(new java.awt.Color(0, 102, 102));
        btn_home1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_home1.setForeground(new java.awt.Color(255, 102, 0));
        btn_home1.setText("Home");
        btn_home1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_home1.setBorderPainted(false);
        btn_home1.setContentAreaFilled(false);
        btn_home1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_home1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, 71));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("See activities");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 130, 40));

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Enjoy these cool staycation promotions.");
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("DaNangTour");
        jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/activities1.png"))); // NOI18N
        jLabel39.setText("jLabel39");
        jPanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 250));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 1030, 300, 250));
        jPanel6.getAccessibleContext().setAccessibleDescription("");

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("See activities");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 130, 40));

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Don't forget to check out these activities");
        jPanel7.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("All Time");
        jPanel7.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 120, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("HaNoiTour");
        jPanel7.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/activites2.png"))); // NOI18N
        jLabel40.setText("jLabel40");
        jPanel7.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 250));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1030, 300, 250));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("See activities");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 130, 40));

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("80% Discount");
        jPanel8.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("HoChiMinh Tour");
        jPanel8.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/activites3.png"))); // NOI18N
        jLabel41.setText("jLabel41");
        jPanel8.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 250));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 1030, 300, 250));

        jPanel9.setBackground(new java.awt.Color(254, 247, 244));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel43.setText("Popular things to do");
        jPanel9.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jButton4.setBackground(new java.awt.Color(235, 102, 43));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("See All");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jPanel9.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 250, 40));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_food.png"))); // NOI18N
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 90));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setText("Food");
        jPanel10.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 140, 170));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_FlightPriceTracking.png"))); // NOI18N
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setFocusPainted(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 80));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setText("Flight Price ");
        jPanel11.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setText("Tracking");
        jPanel11.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 140, 170));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_TripPlanner.png"))); // NOI18N
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, 70));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setText("Trip Planner");
        jPanel12.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jPanel9.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 140, 170));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_ShareExperiences.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, 70));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setText("Share Experience");
        jPanel13.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jPanel9.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 80, 140, 170));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_FindCompanions.png"))); // NOI18N
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, 70));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setText("Find Companions");
        jPanel14.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jPanel9.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 140, 170));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setBackground(new java.awt.Color(254, 247, 244));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_MysteryTravel.png"))); // NOI18N
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, 80));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setText("Mystery Travel");
        jPanel15.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jPanel9.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 260, 140, 170));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel51.setText("<html>Discover a curated selection of meaningful activities<br>and services designed to enrich your journey<br>-whether you're planning, exploring, or simply looking<br>for inspiration along the way.</html>\n");
        jPanel9.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1390, 1300, 500));

        btn_Search.setBackground(new java.awt.Color(255, 153, 51));
        btn_Search.setText("Search");
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 380, 70, 50));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel55.setText("Trending Destinations");
        jPanel2.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 1950, -1, -1));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot 2025-04-26 001007.png"))); // NOI18N
        jButton11.setText("jButton11");
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 1990, 120, 150));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot 2025-04-26 001021.png"))); // NOI18N
        jButton12.setText("jButton12");
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 1990, 120, 150));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot 2025-04-26 001035.png"))); // NOI18N
        jButton13.setText("jButton13");
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 1990, 120, 150));

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot 2025-04-26 001135.png"))); // NOI18N
        jButton14.setText("jButton14");
        jPanel2.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 1990, 120, 150));

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot 2025-04-26 001152.png"))); // NOI18N
        jButton15.setText("jButton15");
        jPanel2.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 1990, 120, 150));

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot 2025-04-26 001203.png"))); // NOI18N
        jButton16.setText("jButton16");
        jPanel2.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 1990, 120, 150));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel56.setText("Beach Tours");
        jPanel2.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 2150, -1, -1));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel57.setText("Museum Tour");
        jPanel2.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 2150, -1, -1));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel58.setText("Food");
        jPanel2.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 2150, -1, -1));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel59.setText("Hiking");
        jPanel2.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 2150, -1, -1));

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel60.setText("City Tours");
        jPanel2.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 2150, -1, -1));

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel61.setText("Cruises");
        jPanel2.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 2150, -1, -1));

        jLabel62.setText("100+ Tours");
        jPanel2.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 2170, -1, -1));

        jLabel63.setText("100+ Tours");
        jPanel2.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 2170, -1, -1));

        jLabel64.setText("100+ Tours");
        jPanel2.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 2170, -1, -1));

        jLabel65.setText("100+ Tours");
        jPanel2.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 2170, -1, -1));

        jLabel66.setText("100+ Tours");
        jPanel2.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 2170, -1, -1));

        jLabel67.setText("100+ Tours");
        jPanel2.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 2170, -1, -1));

        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot 2025-04-26 003250.png"))); // NOI18N
        jLabel68.setText("jLabel68");
        jPanel17.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 450));

        jPanel2.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 2340, 450, 450));

        jPanel16.setBackground(new java.awt.Color(254, 247, 244));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel69.setText("Why choose Tourz");
        jPanel16.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel70.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel70.setText("Ultimate flexibility");
        jPanel16.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        jLabel71.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel71.setText("Memorable experiences");
        jPanel16.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel72.setText("Quality at our core");
        jPanel16.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        jLabel73.setText("You’re in control, with free cancellation and payment.");
        jPanel16.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        jLabel74.setText("Browse and book tours and activities so incredible.");
        jPanel16.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        jLabel75.setText("High quality standards. Millions of reviews.");
        jPanel16.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot 2025-04-26 004329.png"))); // NOI18N
        jButton17.setContentAreaFilled(false);
        jPanel16.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, 50));

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot 2025-04-26 004338.png"))); // NOI18N
        jButton18.setContentAreaFilled(false);
        jPanel16.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 70, 70));

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot 2025-04-26 004342.png"))); // NOI18N
        jButton19.setContentAreaFilled(false);
        jPanel16.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 80, 70));

        jPanel2.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 2280, 770, 570));

        jLabel77.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("Keep things flexible");
        jPanel2.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 3110, -1, -1));

        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("<html><pre>Use Reserve Now & Pay Later to secure the activities you<br>     don't want to miss without being locked in.</pre></html>");
        jPanel2.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 3180, -1, -1));

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot_2025-04-26_005808-removebg-preview.png"))); // NOI18N
        jButton20.setContentAreaFilled(false);
        jPanel2.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 3220, -1, -1));

        jLabel76.setBackground(new java.awt.Color(255, 255, 255));
        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot 2025-04-26 005343.png"))); // NOI18N
        jLabel76.setText("jLabel76");
        jPanel2.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3000, 1300, 410));

        jPanel18.setBackground(new java.awt.Color(254, 247, 244));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel80.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel80.setText("What our Travelers are saying ");
        jPanel18.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel81.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 102, 51));
        jLabel81.setText("Evaluate");
        jPanel19.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel84.setText("<html>\"Da Nang truly exceeded my expectations.<br>From the breathtaking beaches to the vibrant <br>street food scene, every moment felt <br>unforgettable. The locals were incredibly <br>welcoming and made the trip even more special.\"</html>\n");
        jPanel19.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 100));

        jLabel91.setText("– Emily Tran, Travel Blogger");
        jPanel19.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        jPanel18.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 300, 250));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel82.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 102, 51));
        jLabel82.setText("Evaluate");
        jPanel20.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel85.setText("<html>\"Exploring Hanoi was like stepping into a living<br> museum. The blend of ancient temples, bustling <br> markets, and rich culture made every day an<br> adventure. I can’t wait to come back and<br> discover even more.\"</html>\n");
        jPanel20.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel96.setText("– Lucas Nguyen, Photographer");
        jPanel20.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        jPanel18.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 300, 250));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel83.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 102, 51));
        jLabel83.setText("Evaluate");
        jPanel21.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel86.setText("<html>\"Saigon’s energy is absolutely infectious! From1<br> hidden coffee shops to lively night markets, <br> every corner tells a story. It’s a city that never <br> sleeps and always surprises.\"</html>\n");
        jPanel21.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel100.setText("– Sophia Le, Digital Nomad");
        jPanel21.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, 30));

        jPanel18.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, 300, 250));

        jLabel101.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel101.setText("4.9");
        jPanel18.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        jLabel102.setText("1000+ reviews on TravelAndMap. Certificate of Excellence");
        jPanel18.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, -1, -1));

        jLabel103.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel103.setText("16M");
        jPanel18.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, -1, -1));

        jLabel104.setText("Happy Customers");
        jPanel18.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, -1, -1));

        jPanel2.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3410, 1300, 520));

        jLabel106.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(255, 255, 255));
        jLabel106.setText("Please email us when you want to post on our site. ");
        jPanel2.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 4020, -1, -1));

        jButton21.setBackground(new java.awt.Color(255, 102, 51));
        jButton21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton21.setText("Subscribe");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 4100, 144, 40));

        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 4090, 420, 60));

        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot 2025-04-26 231432.png"))); // NOI18N
        jPanel2.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3930, 1300, -1));

        jButton22.setBackground(new java.awt.Color(235, 102, 43));
        jButton22.setText("See All");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(941, 1300, 160, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Tour");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 980, 90, -1));

        btn_Chuyentien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Chuyentien.setForeground(new java.awt.Color(255, 255, 255));
        btn_Chuyentien.setText("Exchange rate");
        btn_Chuyentien.setContentAreaFilled(false);
        btn_Chuyentien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChuyentienActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Chuyentien, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 60, 160, 30));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Background_Home.png"))); // NOI18N
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 530));

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRadio_CultureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadio_CultureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRadio_CultureActionPerformed

    private void btn_OutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OutActionPerformed
        // TODO add your handling code here:
        Login dk = new Login();
        dk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_OutActionPerformed

    private void btn_exploreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exploreActionPerformed

        Explore dk = new Explore();

        dk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_exploreActionPerformed

    private void btn_contact1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_contact1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_contact1ActionPerformed

    private void btn_aboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aboutUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_aboutUsActionPerformed

    private void btn_languageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_languageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_languageActionPerformed

    private void btn_chuyenTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chuyenTrangActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_chuyenTrangActionPerformed

    private void btn_home1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_home1ActionPerformed

    private void btn_chuyenTrang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chuyenTrang1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_chuyenTrang1ActionPerformed

    private void btn_chuyenTrang3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chuyenTrang3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_chuyenTrang3ActionPerformed

    private void btn_chuyenTrang4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chuyenTrang4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_chuyenTrang4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        FlightPriceTracking dk = new FlightPriceTracking();

        dk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        giaodien dk = new giaodien();
        dk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        MysteryTravel dk = new MysteryTravel();
        dk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Giaodien dk = new Giaodien();
        dk.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void Text_NhapThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_NhapThongTinActionPerformed
        // TODO add your handling code here:
        String searchText = Text_NhapThongTin.getText().trim().toLowerCase();

        if (searchText.isEmpty()) {
            jPopupMenu1.setVisible(false);
            return;
        } else {
            jPopupMenu1.show(Text_NhapThongTin, 0, Text_NhapThongTin.getHeight());

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelandmap", "root", "");

                String sql = "SELECT QuocGia, ThanhPho, DiaDiemDuLich FROM tblsearch_home WHERE "
                        + "LOWER(QuocGia) LIKE ? OR LOWER(ThanhPho) LIKE ? OR LOWER(DiaDiemDuLich) LIKE ?";
                pst = conn.prepareStatement(sql);

                String formattedSearch = "%" + searchText + "%"; // Định dạng từ khóa tìm kiếm

                pst.setString(1, formattedSearch);
                pst.setString(2, formattedSearch);
                pst.setString(3, formattedSearch);

                rs = pst.executeQuery();

                mod.removeAllElements(); // Xóa danh sách cũ trước khi cập nhật mới

                while (rs.next()) {
                    String place = rs.getString("QuocGia") + ", " + rs.getString("ThanhPho") + ", " + rs.getString("DiaDiemDuLich");
                    mod.addElement(place);
                }

                // Kiểm tra nếu danh sách gợi ý trống thì không hiển thị popup
                if (!mod.isEmpty()) {
                    jPopupMenu1.show(Text_NhapThongTin, 0, Text_NhapThongTin.getHeight());
                } else {
                    jPopupMenu1.setVisible(false);
                }

            } catch (Exception e) {
                System.out.println("Lỗi SQL: " + e.getMessage());
            }
        }


    }//GEN-LAST:event_Text_NhapThongTinActionPerformed

    private void List_ThongTinSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_List_ThongTinSearchMouseClicked
        // TODO add your handling code here:
        String selectedValue = List_ThongTinSearch.getSelectedValue();
        Text_NhapThongTin.setText(selectedValue);
        jPopupMenu1.setVisible(false);
    }//GEN-LAST:event_List_ThongTinSearchMouseClicked

    private void btnRadio_FoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadio_FoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRadio_FoodActionPerformed

    private void btnRadio_NatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadio_NatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRadio_NatureActionPerformed

    private void btnRadio_AdventureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadio_AdventureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRadio_AdventureActionPerformed

    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed
        // TODO add your handling code here:

        // Lấy dữ liệu nhập vào từ TextField
        String inputText = Text_NhapThongTin.getText().trim();

        // Tách chuỗi theo dấu phẩy
        String[] parts = inputText.split(",");

        // Gán từng phần vào biến tương ứng
        String national = (parts.length > 0) ? parts[0].trim() : "";
        String city = (parts.length > 1) ? parts[1].trim() : "";
        String placeName = (parts.length > 2) ? parts[2].trim() : "";

        // Xác định category từ radio button
        String category = "";
        if (btnRadio_Food.isSelected()) {
            category = "Food";
        } else if (btnRadio_Nature.isSelected()) {
            category = "Nature";
        } else if (btnRadio_Adventure.isSelected()) {
            category = "Adventure";
        } else if (btnRadio_Culture.isSelected()) {
            category = "Culture";
        } else {
            category = "Unknown";
        }

        // Gọi đúng constructor 5 tham số
        SearchResults sr = new SearchResults(national, city, placeName, category, inputText);
        sr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_SearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ThongTin dk = new ThongTin();
        dk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ThongTin2 dk = new ThongTin2();
        dk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ThongTin3 dk = new ThongTin3();

        dk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        DatTour dk = new DatTour();

        dk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void btn_ChuyentienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChuyentienActionPerformed
        // TODO add your handling code here:
        TienTe dk = new TienTe();

        dk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ChuyentienActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Share_Ex dk = new Share_Ex();

        dk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
        Trip_planner dk = new Trip_planner();

        dk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

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
        new Home();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> List_ThongTinSearch;
    private javax.swing.JPanel Panel_ChuaThongTinSearch;
    private javax.swing.JLabel Ten_Logo;
    private javax.swing.JTextField Text_NhapThongTin;
    private javax.swing.JRadioButton btnRadio_Adventure;
    private javax.swing.JRadioButton btnRadio_Culture;
    private javax.swing.JRadioButton btnRadio_Food;
    private javax.swing.JRadioButton btnRadio_Nature;
    private javax.swing.JButton btn_Chuyentien;
    private javax.swing.JButton btn_Out;
    private javax.swing.JButton btn_Search;
    private javax.swing.JButton btn_aboutUs;
    private javax.swing.JButton btn_chuyenTrang;
    private javax.swing.JButton btn_chuyenTrang1;
    private javax.swing.JButton btn_chuyenTrang3;
    private javax.swing.JButton btn_chuyenTrang4;
    private javax.swing.JButton btn_contact1;
    private javax.swing.JButton btn_explore;
    private javax.swing.JButton btn_home1;
    private javax.swing.JButton btn_language;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
