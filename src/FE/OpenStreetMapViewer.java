package FE;

import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.MapMarkerDot;
import org.openstreetmap.gui.jmapviewer.tilesources.OsmTileSource;
import javax.swing.*;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;

public class OpenStreetMapViewer extends javax.swing.JFrame {

    private JMapViewer map;
    private JTextField searchField;
    private JButton searchButton;

    public OpenStreetMapViewer() {
        setTitle("Bản đồ - OpenStreetMap");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Thiết lập User-Agent để tránh lỗi 403
        System.setProperty("http.agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)");

        // Khởi tạo bản đồ
        map = new JMapViewer();
        map.setTileSource(new OsmTileSource.Mapnik()); // Sử dụng máy chủ tile Mapnik để tránh lỗi
        map.setBounds(0, 50, 800, 550);
        add(map);

        // Ô nhập tìm kiếm
        searchField = new JTextField();
        searchField.setBounds(20, 10, 200, 30);
        add(searchField);

        // Nút tìm kiếm
        searchButton = new JButton("Tìm kiếm");
        searchButton.setBounds(230, 10, 100, 30);
        add(searchButton);

        // Xử lý sự kiện khi nhấn nút tìm kiếm
        searchButton.addActionListener(e -> searchLocation(searchField.getText()));

        setVisible(true);
    }

    private void searchLocation(String searchText) {
        try {
            // Gọi API Nominatim để tìm tọa độ của địa điểm
            String url = "https://nominatim.openstreetmap.org/search?format=json&q=" + searchText.replace(" ", "%20");
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("User-Agent", "Mozilla/5.0");

            // Đọc dữ liệu từ API
            Scanner scanner = new Scanner(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            while (scanner.hasNext()) {
                response.append(scanner.nextLine());
            }
            scanner.close();

            // Phân tích JSON nhận được từ API
            JSONArray results = new JSONArray(response.toString());
            if (results.length() > 0) {
                JSONObject firstResult = results.getJSONObject(0);
                double lat = firstResult.getDouble("lat");
                double lon = firstResult.getDouble("lon");
                Coordinate location = new Coordinate(lat, lon);

                // Xóa các điểm đánh dấu cũ
                map.removeAllMapMarkers();

                // Thêm điểm ghim trên bản đồ
                MapMarkerDot marker = new MapMarkerDot(searchText, location);
                map.addMapMarker(marker);

                // Zoom vào vị trí tìm kiếm
                map.setDisplayPosition(location, 14);
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy địa điểm: " + searchText);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi tìm kiếm địa điểm!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OpenStreetMapViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpenStreetMapViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpenStreetMapViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpenStreetMapViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        new OpenStreetMapViewer();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
