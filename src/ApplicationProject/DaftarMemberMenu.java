/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ApplicationProject;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author novad
 */
public class DaftarMemberMenu extends javax.swing.JFrame {

    /**
     * Creates new form DaftarMemberMenu
     */
    String IDMember = "";
    String NamaMember = "";
    String NomorMember = "";
    String AlamatMember = "";
    String MemberStatus = "";
    String TanggalGabung = "";
    String TanggalBerakhir = "";
    String MasaAktif = "";
    
    public DaftarMemberMenu() {
        initComponents();
        displayData();
        setTitle("Booking Menu");
        setLocationRelativeTo(null);
        
        MemberTable.addMouseListener(new MouseAdapter(){
            DefaultTableModel model = new DefaultTableModel();
            
            @Override
            public void mouseClicked(MouseEvent e){
                int i = MemberTable.getSelectedRow();
                IDMember = (MemberTable.getValueAt(i, 0).toString());
                NamaMember = (MemberTable.getValueAt(i, 1).toString());
                NomorMember =(MemberTable.getValueAt(i, 2).toString());
                AlamatMember = (MemberTable.getValueAt(i, 3).toString());
                MemberStatus = (MemberTable.getValueAt(i, 4).toString());
                TanggalGabung = (MemberTable.getValueAt(i, 5).toString());
                TanggalBerakhir = (MemberTable.getValueAt(i, 6).toString());
                MasaAktif = (MemberTable.getValueAt(i, 7).toString());
            }
        });
    }
    
    private void displayData() {
      Connection con = Koneksi.koneksi();
      try {
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM carwash_member");
         DefaultTableModel model = new DefaultTableModel();
         model.addColumn("ID Member");
         model.addColumn("Nama Member");
         model.addColumn("Nomor Telepon");
         model.addColumn("Alamat Member");
         model.addColumn("Status Member");
         model.addColumn("Tanggal Bergabung");
         model.addColumn("Masa Berakhir");
         model.addColumn("Masa Aktif");
         SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         
         while (rs.next()) {
            String id = rs.getString("ID_Member");
            String Nama = rs.getString("Nama_Member");
            String Nomor = rs.getString("Nomor_Telepon");
            String Alamat = rs.getString("Alamat_Member");
            String MemberST = rs.getString("Status_Member");
            Timestamp datePen = rs.getTimestamp("Tanggal_Gabung");
            String TanggalPen = dateFormat.format(datePen);
            Timestamp dataakhir = rs.getTimestamp("Tanggal_Habis");
            String TanggalAkhir = dateFormat.format(dataakhir);
            String Masaaktif = rs.getString("Masa_Aktif");
            model.addRow(new Object[]{id, Nama, Nomor, Alamat, MemberST, 
                TanggalPen, TanggalAkhir, Masaaktif});
         }
         MemberTable.setModel(model);
         
         if(stmt != null){
             stmt.close();
         }
      } catch(SQLException ex) {
          System.out.println(ex);
      } finally {
          Koneksi.closeConnection();
      }
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LogOutBooking = new javax.swing.JButton();
        KembaliBooking = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MemberTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        IDMemberinput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        NamaMemberinput = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        NomorTelinput = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        AlamatMeminput = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TanggalGinput = new com.github.lgooddatepicker.components.DateTimePicker();
        SimpanMember = new javax.swing.JButton();
        HapusMember = new javax.swing.JButton();
        GetDataMember = new javax.swing.JButton();
        EditMember = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        jLabel1.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Daftar");

        jLabel2.setFont(new java.awt.Font("Serif", 3, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Member");

        LogOutBooking.setBackground(new java.awt.Color(153, 51, 255));
        LogOutBooking.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        LogOutBooking.setForeground(new java.awt.Color(255, 255, 255));
        LogOutBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ApplicationProject/R__1_-removebg-preview (1).png"))); // NOI18N
        LogOutBooking.setText("LogOut");
        LogOutBooking.setBorder(null);
        LogOutBooking.setContentAreaFilled(false);
        LogOutBooking.setIconTextGap(8);
        LogOutBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBookingActionPerformed(evt);
            }
        });

        KembaliBooking.setBackground(new java.awt.Color(153, 51, 255));
        KembaliBooking.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        KembaliBooking.setForeground(new java.awt.Color(255, 255, 255));
        KembaliBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ApplicationProject/R.png"))); // NOI18N
        KembaliBooking.setText("Kembali");
        KembaliBooking.setBorder(null);
        KembaliBooking.setContentAreaFilled(false);
        KembaliBooking.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        KembaliBooking.setIconTextGap(8);
        KembaliBooking.setMaximumSize(new java.awt.Dimension(1095, 990));
        KembaliBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliBookingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(KembaliBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(511, 511, 511))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(503, 503, 503)))
                .addComponent(LogOutBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(KembaliBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogOutBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        MemberTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Member", "Nama Member", "Nomor Telepon", "Alamat Member", "Status Member", "Tanggal Bergabung", "Masa Berakhir", "Sisa Masa Aktif"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(MemberTable);

        jLabel3.setText("ID Member");

        jLabel4.setText("Nama");

        jLabel5.setText("Nomor Telepon");

        jLabel6.setText("Alamat");

        jLabel7.setText("Tanggal Bergabung");

        SimpanMember.setBackground(new java.awt.Color(0, 153, 0));
        SimpanMember.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        SimpanMember.setForeground(new java.awt.Color(255, 255, 255));
        SimpanMember.setText("Join+");
        SimpanMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanMemberActionPerformed(evt);
            }
        });

        HapusMember.setBackground(new java.awt.Color(204, 0, 0));
        HapusMember.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        HapusMember.setForeground(new java.awt.Color(255, 255, 255));
        HapusMember.setText("Hapus");
        HapusMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusMemberActionPerformed(evt);
            }
        });

        GetDataMember.setBackground(new java.awt.Color(0, 0, 255));
        GetDataMember.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        GetDataMember.setForeground(new java.awt.Color(255, 255, 255));
        GetDataMember.setText("Get Data");
        GetDataMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetDataMemberActionPerformed(evt);
            }
        });

        EditMember.setBackground(new java.awt.Color(0, 0, 255));
        EditMember.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        EditMember.setForeground(new java.awt.Color(255, 255, 255));
        EditMember.setText("Edit");
        EditMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NamaMemberinput)
                            .addComponent(NomorTelinput)
                            .addComponent(AlamatMeminput, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IDMemberinput)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TanggalGinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HapusMember, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(GetDataMember, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(EditMember, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SimpanMember, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1093, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(IDMemberinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NamaMemberinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NomorTelinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AlamatMeminput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TanggalGinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HapusMember, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GetDataMember, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditMember, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SimpanMember, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogOutBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBookingActionPerformed
        // TODO add your handling code here:
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogOutBookingActionPerformed

    private void KembaliBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliBookingActionPerformed
        // TODO add your handling code here:
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_KembaliBookingActionPerformed

    private void SimpanMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanMemberActionPerformed
        // TODO add your handling code here:
        Connection con = Koneksi.koneksi();
        if (evt.getSource() == SimpanMember) {
            String id = IDMemberinput.getText();
            String nama = NamaMemberinput.getText();
            String telepon = NomorTelinput.getText();
            String alamat = AlamatMeminput.getText();
            LocalDateTime localwaktu = TanggalGinput.getDateTimePermissive();
            LocalDateTime satubulan = localwaktu.plusMonths(1);
            Duration aktif = Duration.between(localwaktu, satubulan);
            int statusaktif = Math.toIntExact(aktif.toDays());
            String statusmember = "";
            if(statusaktif >= 0){
                statusmember = "Aktif";
            } else if(statusaktif <= 0){
                statusmember = "Tidak Aktif";
            }
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = localwaktu.format(formatter);
            String formatsatubulan = satubulan.format(formatter);
            String masa = aktif.toDays() + " Hari";
            try{
                PreparedStatement st = con.prepareStatement("INSERT INTO carwash_member(ID_Member, Nama_Member, "
                        + "Nomor_Telepon, Alamat_Member, Status_Member, "
                        + "Tanggal_Gabung, Tanggal_Habis, Masa_Aktif) "
                        + "VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
                st.setString(1, id);
                st.setString(2, nama);
                st.setString(3, telepon);
                st.setString(4, alamat);
                st.setString(5, statusmember);
                st.setString(6, formattedDateTime);
                st.setString(7, formatsatubulan);
                st.setString(8, masa);
                
                st.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Data inserted successfully!", "Insert Success", JOptionPane.INFORMATION_MESSAGE);
                if(st != null){
                   st.close(); 
                }
            } catch(SQLException ex){
                 JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Insert Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                Koneksi.closeConnection();
            }
            
            displayData();
            IDMemberinput.setText("");
            NamaMemberinput.setText("");
            NomorTelinput.setText("");
            AlamatMeminput.setText("");
            TanggalGinput.clear();
        }
    }//GEN-LAST:event_SimpanMemberActionPerformed

    private void HapusMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusMemberActionPerformed
        // TODO add your handling code here:
            Connection con = Koneksi.koneksi();
            try{
                PreparedStatement stmt = con.prepareStatement("DELETE FROM carwash_member WHERE ID_Member = ?");
                stmt.setString(1, IDMember);
                int rowDelete = stmt.executeUpdate();
                if(rowDelete > 0){
                    JOptionPane.showMessageDialog(null, "Row deleted successfully.");
                } else {
                    JOptionPane.showMessageDialog(null, "Row not found.");
                }
             if(stmt != null){
                    stmt.close();
                }
            }  catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error deleting row: " + ex.getMessage());
            } finally{
                Koneksi.closeConnection();
            }
        
        displayData();
        
        IDMemberinput.setText("");
        NamaMemberinput.setText("");
        NomorTelinput.setText("");
        AlamatMeminput.setText("");
        TanggalGinput.clear();
    }//GEN-LAST:event_HapusMemberActionPerformed

    private void GetDataMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetDataMemberActionPerformed
        // TODO add your handling code here:
        IDMemberinput.setText(IDMember);
        NamaMemberinput.setText(NamaMember);
        NomorTelinput.setText(NomorMember);
        AlamatMeminput.setText(AlamatMember);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(TanggalGabung, formatter);
        TanggalGinput.setDateTimePermissive(dateTime);
    }//GEN-LAST:event_GetDataMemberActionPerformed

    private void EditMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditMemberActionPerformed
        // TODO add your handling code here:
        Connection con = Koneksi.koneksi();
        if (evt.getSource() == EditMember) {
            String id = IDMemberinput.getText();
            String nama = NamaMemberinput.getText();
            String telepon = NomorTelinput.getText();
            String alamat = AlamatMeminput.getText();
            LocalDateTime localwaktu = TanggalGinput.getDateTimePermissive();
            LocalDateTime satubulan = localwaktu.plusMonths(1);
            Duration aktif = Duration.between(localwaktu, satubulan);
            int statusaktif = Math.toIntExact(aktif.toDays());
            String statusmember = "";
            if(statusaktif >= 0){
                statusmember = "Aktif";
            } else if(statusaktif <= 0){
                statusmember = "Tidak Aktif";
            }
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = localwaktu.format(formatter);
            String formatsatubulan = satubulan.format(formatter);
            String masa = aktif.toDays() + " Hari";
            try{
                PreparedStatement st = con.prepareStatement("UPDATE carwash_member SET ID_Member=?, Nama_Member=?, "
                        + "Nomor_Telepon=?, Alamat_Member=?, Status_Member=?, "
                        + "Tanggal_Gabung=?, Tanggal_Habis=?, Masa_Aktif=? WHERE ID_Member=? ");
                st.setString(1, id);
                st.setString(2, nama);
                st.setString(3, telepon);
                st.setString(4, alamat);
                st.setString(5, statusmember);
                st.setString(6, formattedDateTime);
                st.setString(7, formatsatubulan);
                st.setString(8, masa);
                st.setString(9, id);
                
                st.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Data inserted successfully!", "Insert Success", JOptionPane.INFORMATION_MESSAGE);
                if(st != null){
                   st.close(); 
                }
            } catch(SQLException ex){
                 JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Insert Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                Koneksi.closeConnection();
            }
            
            displayData();
            IDMemberinput.setText("");
            NamaMemberinput.setText("");
            NomorTelinput.setText("");
            AlamatMeminput.setText("");
            TanggalGinput.clear();
        }
    }//GEN-LAST:event_EditMemberActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DaftarMemberMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarMemberMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarMemberMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarMemberMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DaftarMemberMenu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlamatMeminput;
    private javax.swing.JButton EditMember;
    private javax.swing.JButton GetDataMember;
    private javax.swing.JButton HapusMember;
    private javax.swing.JTextField IDMemberinput;
    private javax.swing.JButton KembaliBooking;
    private javax.swing.JButton LogOutBooking;
    private javax.swing.JTable MemberTable;
    private javax.swing.JTextField NamaMemberinput;
    private javax.swing.JTextField NomorTelinput;
    private javax.swing.JButton SimpanMember;
    private com.github.lgooddatepicker.components.DateTimePicker TanggalGinput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}