/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.gaji.view;

import javax.swing.table.DefaultTableModel;
import aplikasi.gaji.koneksi.koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import aplikasi.gaji.koneksi.koneksi;

/**
 *
 * @author ACER
 */
public class FORM_DATAADMIN extends javax.swing.JFrame {
aplikasi.gaji.koneksi.koneksi k = new koneksi();
    /**
     * Creates new form FORM_DATAADMIN
     */
    private DefaultTableModel tabelpegawai;
    public FORM_DATAADMIN() {
        
        initComponents();
        k.koneksi();
        tabelpegawai = new DefaultTableModel() ;
tabel.setModel(tabelpegawai);

tabelpegawai.addColumn("ID");
tabelpegawai.addColumn("Nama");
tabelpegawai.addColumn("Alamat");
tabelpegawai.addColumn("No HP");
tabelpegawai.addColumn("Posisi");
tabelpegawai.addColumn("Gaji Pokok");

    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        Background = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        hp = new javax.swing.JTextField();
        posisi = new javax.swing.JComboBox();
        gaji = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setFont(new java.awt.Font("Meiryo UI", 1, 8)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/gaji/view/help-button-hi.png"))); // NOI18N
        jButton5.setText("Petunjuk");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 160, -1));

        jButton4.setFont(new java.awt.Font("Meiryo UI", 1, 8)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/gaji/view/Relationship-icon.png"))); // NOI18N
        jButton4.setText("Tentang");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 160, -1));

        jButton1.setFont(new java.awt.Font("Meiryo UI", 1, 8)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/gaji/view/Open-folder-full-icon.png"))); // NOI18N
        jButton1.setText("Data");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 160, -1));

        jButton3.setFont(new java.awt.Font("Meiryo UI", 1, 8)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/gaji/view/signup-icon.png"))); // NOI18N
        jButton3.setText("Tambah");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 160, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setText("APLIKASI PERHITUNGAN GAJI PT. RAFFLESIA APPLICATION");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 570, -1));

        jButton7.setFont(new java.awt.Font("Meiryo UI", 1, 8)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/gaji/view/Man-icon.png"))); // NOI18N
        jButton7.setText("Karyawan");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, -1));

        jButton6.setFont(new java.awt.Font("Meiryo UI", 1, 8)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/gaji/view/Home-icon.png"))); // NOI18N
        jButton6.setText("Home");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, -1));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/gaji/view/hapus.png"))); // NOI18N
        jButton9.setText("DELETE");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, -1, -1));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/gaji/view/tampil.png"))); // NOI18N
        jButton8.setText("SHOW");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, -1, -1));

        jLabel6.setText("ID Pegawai :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cariKeyPressed(evt);
            }
        });
        getContentPane().add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 120, -1));

        tabel.setAutoCreateRowSorter(true);
        tabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(tabel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 600, 360));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/gaji/view/Power Point 11.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 490));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 140, 30));
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 240, 30));
        getContentPane().add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 280, 30));
        getContentPane().add(hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 133, 30));

        posisi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Direktur", "Manager", "Programmer", "Marketing", "Surveyor" }));
        getContentPane().add(posisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, -1));
        getContentPane().add(gaji, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 160, 30));

        jButton10.setFont(new java.awt.Font("Meiryo UI", 1, 8)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/gaji/view/Home-icon.png"))); // NOI18N
        jButton10.setText("Home");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, -1));

        jButton11.setFont(new java.awt.Font("Meiryo UI", 1, 8)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/gaji/view/Home-icon.png"))); // NOI18N
        jButton11.setText("Home");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        new FORM_UTAMA().show();
        dispose();
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new FORM_ADMIN().show();
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        try {
        k.stat.executeUpdate("delete from data1 where "+"id ='"+id.getText()+"'");
           id.setText("");
        nama.setText("");
        posisi.setSelectedItem("");
        alamat.setText("");
        hp.setText("");
        gaji.setText("");
        id.requestFocus();
        JOptionPane.showMessageDialog(rootPane,"Data Terhapus");
    } catch (Exception e) {
    }

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        tabelpegawai.getDataVector().removeAllElements();//untuk mengkosongkan isi tabel di form

        tabelpegawai.fireTableDataChanged();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/gaji", "root", "");
            Statement statement = connection.createStatement();
            String sql = "select * from data1 order by id";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                Object [] o = new Object[6];
                o[0] = rs.getString("ID");
                o[1] = rs.getString("Nama");
                o[2] = rs.getString("Alamat");
                o[3] = rs.getString("No HP");
                o[4] = rs.getString("Posisi");
                o[5] = rs.getString("Gaji Pokok");
                

                tabelpegawai.addRow(o);

            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal koneksi "+e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FORM_DATAADMIN.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void cariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyPressed
        if (evt.getKeyCode()==10) {
         try {
        k.stat=k.con.createStatement();
        k.res=k.stat.executeQuery("select * from data1 where "+"id ='"+cari.getText()+"'");
        if (k.res.next()) {
            id.setText(k.res.getString("id"));
            nama.setText(k.res.getString("nama"));
            alamat.setText(k.res.getString("alamat"));
            hp.setText(k.res.getString ("no hp"));
            posisi.setSelectedItem(k.res.getString("posisi"));
            gaji.setText(k.res.getString("gaji pokok"));
            
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"ID Tidak Terdaftar !");
        }
    } catch (Exception e) {
    }
        }
    }//GEN-LAST:event_cariKeyPressed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cariActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new FORM_TAMBAH().show();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new padmin().show();
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new FORM_TENTANG().show();
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

                         
    
    
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
            java.util.logging.Logger.getLogger(FORM_DATAADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FORM_DATAADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FORM_DATAADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FORM_DATAADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FORM_DATAADMIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JTextField alamat;
    private javax.swing.JTextField cari;
    private javax.swing.JTextField gaji;
    private javax.swing.JTextField hp;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama;
    private javax.swing.JComboBox posisi;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}