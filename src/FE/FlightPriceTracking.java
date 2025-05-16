package FE;

import com.formdev.flatlaf.FlatLightLaf;
import java.sql.*;
import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class FlightPriceTracking extends javax.swing.JFrame {

    public FlightPriceTracking() {
        initComponents();
        setTitle("Flight Price Tracking");
        setLocationRelativeTo(null);
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
        btn_SearchFlight = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        text_From = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        text_To = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser_DepartureDate = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jSpinField_NumberOfTickets = new com.toedter.components.JSpinField();
        jLabel14 = new javax.swing.JLabel();
        jComboBox_SeatClass = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_ResultsHere = new javax.swing.JTextArea();
        btn_ComparePrice = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_ComparisonResults = new javax.swing.JTextArea();
        btn_ViewHistory = new javax.swing.JButton();
        btn_ClearHistory = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea_History = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 1300));
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

        btn_SearchFlight.setBackground(new java.awt.Color(248, 102, 65));
        btn_SearchFlight.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_SearchFlight.setForeground(new java.awt.Color(255, 255, 255));
        btn_SearchFlight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot 2025-04-27 202507.png"))); // NOI18N
        btn_SearchFlight.setText("     Search Flight ");
        btn_SearchFlight.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_SearchFlight.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_SearchFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchFlightActionPerformed(evt);
            }
        });
        jPanel3.add(btn_SearchFlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 150, 200, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(248, 102, 65));
        jLabel4.setText("From");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 50, -1));

        text_From.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_FromActionPerformed(evt);
            }
        });
        jPanel3.add(text_From, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 200, 40));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot_2025-04-27_202800-removebg-preview.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 40, 40));

        text_To.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_ToActionPerformed(evt);
            }
        });
        jPanel3.add(text_To, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 200, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(248, 102, 65));
        jLabel5.setText("To");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(248, 102, 65));
        jLabel6.setText("Departure date");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));
        jPanel3.add(jDateChooser_DepartureDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 200, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(248, 102, 65));
        jLabel13.setText("Number of tickets");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));
        jPanel3.add(jSpinField_NumberOfTickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 100, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(248, 102, 65));
        jLabel14.setText("Seat class");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        jComboBox_SeatClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economy Class", "Business Class", "First Class" }));
        jComboBox_SeatClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_SeatClassActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox_SeatClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 200, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 1000, 220));

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 550, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Screenshot_2025-04-27_084214-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 240, 90));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Backgroud_Flight_price_Tracking2.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1300, 500));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(248, 102, 65));
        jLabel15.setText("Results Here: ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 670, 170, 40));

        jTextArea_ResultsHere.setColumns(20);
        jTextArea_ResultsHere.setRows(5);
        jScrollPane2.setViewportView(jTextArea_ResultsHere);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 720, 530, 200));

        btn_ComparePrice.setBackground(new java.awt.Color(248, 102, 65));
        btn_ComparePrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_ComparePrice.setForeground(new java.awt.Color(255, 255, 255));
        btn_ComparePrice.setText("Compare Prices");
        btn_ComparePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ComparePriceActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ComparePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 720, 140, 50));

        jTextArea_ComparisonResults.setColumns(20);
        jTextArea_ComparisonResults.setRows(5);
        jScrollPane3.setViewportView(jTextArea_ComparisonResults);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 780, 350, 400));

        btn_ViewHistory.setText("View History");
        btn_ViewHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ViewHistoryActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ViewHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 950, 140, 50));

        btn_ClearHistory.setText("Clear History");
        btn_ClearHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearHistoryActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ClearHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 950, 140, 50));

        jTextArea_History.setColumns(20);
        jTextArea_History.setRows(5);
        jScrollPane4.setViewportView(jTextArea_History);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1010, 530, 210));

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

    private void btn_SearchFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchFlightActionPerformed
        // TODO add your handling code here:
        String from = text_From.getText().trim();
        String to = text_To.getText().trim();
        String seatClass = (String) jComboBox_SeatClass.getSelectedItem();
        int tickets = jSpinField_NumberOfTickets.getValue();

        java.util.Date utilDate = jDateChooser_DepartureDate.getDate();

        if (from.isEmpty() || to.isEmpty() || utilDate == null || tickets <= 0 || seatClass == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin hợp lệ.");
            return;
        }

        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/travelandmap", "root", "");

            String sql = "SELECT from_city, to_city, airline, departure_date, departure_time, price "
                    + "FROM tblflightpricetracking "
                    + "WHERE from_city = ? AND to_city = ? AND departure_date = ? AND seat_class = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, from);
            ps.setString(2, to);
            ps.setDate(3, sqlDate);
            ps.setString(4, seatClass);

            ResultSet rs = ps.executeQuery();

            StringBuilder resultText = new StringBuilder();
            NumberFormat formatter = NumberFormat.getInstance(new Locale("vi", "VN"));
            boolean found = false;

            while (rs.next()) {
                found = true;
                String fromCity = rs.getString("from_city");
                String toCity = rs.getString("to_city");
                String airline = rs.getString("airline");
                Date depDate = rs.getDate("departure_date");
                Time depTime = rs.getTime("departure_time");
                double price = rs.getDouble("price");
                double total = price * tickets;

                String formattedPrice = formatter.format(total);

                resultText.append("From: ").append(fromCity)
                        .append("\nTo: ").append(toCity)
                        .append("\nAirline: ").append(airline)
                        .append("\nDate: ").append(depDate)
                        .append("\nTime: ").append(depTime)
                        .append("\nPrice for ").append(tickets).append(" tickets: ").append(formattedPrice).append(" VND")
                        .append("\n--------------------------\n");
            }

            if (!found) {
                jTextArea_ResultsHere.setText("Không tìm thấy chuyến bay phù hợp.");
            } else {
                jTextArea_ResultsHere.setText(resultText.toString());
            }
            // Lưu lịch sử vào CSDL
            try {
                Connection connHistory = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelandmap", "root", "");
                String insertSql = "INSERT INTO tbl_historyflightpricetracking (search_type, content) VALUES (?, ?)";
                PreparedStatement psHistory = connHistory.prepareStatement(insertSql);
                psHistory.setString(1, "Flight Search");
                psHistory.setString(2, resultText.toString());
                psHistory.executeUpdate();
                connHistory.close();
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi khi lưu lịch sử: " + ex.getMessage());
            }
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi: " + ex.getMessage());
        }

    }//GEN-LAST:event_btn_SearchFlightActionPerformed

    private void jComboBox_SeatClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_SeatClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_SeatClassActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void text_FromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_FromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_FromActionPerformed

    private void text_ToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_ToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_ToActionPerformed

    private void btn_ComparePriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ComparePriceActionPerformed
        // TODO add your handling code here:
        try {
            String resultText = jTextArea_ResultsHere.getText();
            if (resultText.isEmpty() || resultText.contains("Không tìm thấy chuyến bay")) {
                jTextArea_ComparisonResults.setText("Không có dữ liệu để so sánh.");
                return;
            }

            String[] flights = resultText.split("--------------------------");
            double minPrice = Double.MAX_VALUE;
            double maxPrice = Double.MIN_VALUE;
            String minFlight = "";
            String maxFlight = "";

            for (String flight : flights) {
                if (flight.trim().isEmpty()) {
                    continue;
                }

                // Tìm dòng chứa giá
                String[] lines = flight.trim().split("\n");
                for (String line : lines) {
                    if (line.contains("Price for")) {
                        String priceStr = line.replaceAll("[^0-9]", ""); // giữ lại chỉ số
                        if (!priceStr.isEmpty()) {
                            double price = Double.parseDouble(priceStr);
                            if (price < minPrice) {
                                minPrice = price;
                                minFlight = flight.trim();
                            }
                            if (price > maxPrice) {
                                maxPrice = price;
                                maxFlight = flight.trim();
                            }
                        }
                        break;
                    }
                }
            }

            NumberFormat formatter = NumberFormat.getInstance(new Locale("vi", "VN"));
            StringBuilder compareResult = new StringBuilder();

            if (minPrice == maxPrice) {
                compareResult.append("Tất cả các chuyến bay có cùng giá: ").append(formatter.format(minPrice)).append(" VND");
            } else {
                compareResult.append("🔽 Chuyến bay rẻ nhất:\n")
                        .append(minFlight).append("\n\n")
                        .append("🔼 Chuyến bay đắt nhất:\n")
                        .append(maxFlight).append("\n\n")
                        .append("💰 Chênh lệch: ")
                        .append(formatter.format(maxPrice - minPrice)).append(" VND");
            }

            jTextArea_ComparisonResults.setText(compareResult.toString());

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi so sánh giá: " + ex.getMessage());
        }

    }//GEN-LAST:event_btn_ComparePriceActionPerformed

    private void btn_ViewHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ViewHistoryActionPerformed
        // TODO add your handling code here:
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelandmap", "root", "");
            String sql = "SELECT * FROM tbl_historyflightpricetracking ORDER BY timestamp DESC";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            StringBuilder historyText = new StringBuilder();
            while (rs.next()) {
                String type = rs.getString("search_type");
                String content = rs.getString("content");
                Timestamp time = rs.getTimestamp("timestamp");

                historyText.append("📅 ").append(time)
                        .append(" | 🔍 ").append(type)
                        .append("\n").append(content)
                        .append("\n--------------------------\n");
            }

            jTextArea_History.setText(historyText.toString());
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi xem lịch sử: " + ex.getMessage());
        }
    }//GEN-LAST:event_btn_ViewHistoryActionPerformed

    private void btn_ClearHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearHistoryActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa toàn bộ lịch sử không?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelandmap", "root", "");
                String sql = "DELETE FROM tbl_historyflightpricetracking";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.executeUpdate();
                jTextArea_History.setText("");
                conn.close();
                JOptionPane.showMessageDialog(this, "Đã xóa lịch sử thành công.");
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi khi xóa lịch sử: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btn_ClearHistoryActionPerformed

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
    private javax.swing.JButton btn_ClearHistory;
    private javax.swing.JButton btn_ComparePrice;
    private javax.swing.JButton btn_SearchFlight;
    private javax.swing.JButton btn_ViewHistory;
    private javax.swing.JButton btn_aboutUs1;
    private javax.swing.JButton btn_contact2;
    private javax.swing.JButton btn_explore1;
    private javax.swing.JButton btn_home2;
    private javax.swing.JButton btn_language1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox_SeatClass;
    private com.toedter.calendar.JDateChooser jDateChooser_DepartureDate;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private com.toedter.components.JSpinField jSpinField_NumberOfTickets;
    private javax.swing.JTextArea jTextArea_ComparisonResults;
    private javax.swing.JTextArea jTextArea_History;
    private javax.swing.JTextArea jTextArea_ResultsHere;
    private javax.swing.JTextField text_From;
    private javax.swing.JTextField text_To;
    // End of variables declaration//GEN-END:variables
}
