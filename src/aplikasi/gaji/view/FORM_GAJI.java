/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.gaji.view;
import javax.swing.JOptionPane;
import aplikasi.gaji.koneksi.koneksi;
/**
 *
 * @author ACER
 */
public class FORM_GAJI extends javax.swing.JFrame {
aplikasi.gaji.koneksi.koneksi k = new koneksi();
    /**
     * Creates new form FORM_GAJI
     */
    public FORM_GAJI() {
        initComponents();
        k.koneksi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        posisi = new javax.swing.JComboBox();
        gaji = new javax.swing.JTextField();
        lembur = new javax.swing.JTextField();
        pajak = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        cari = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        hitung = new javax.swing.JButton();
        tunjangan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        hp = new javax.swing.JTextField();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setFont(new java.awt.Font("Meiryo UI", 1, 8)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/gaji/view/Man-icon.png"))); // NOI18N
        jButton3.setText("Gaji");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 160, -1));

        jButton1.setFont(new java.awt.Font("Meiryo UI", 1, 8)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/gaji/view/Open-folder-full-icon.png"))); // NOI18N
        jButton1.setText("Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 160, -1));

        jButton4.setFont(new java.awt.Font("Meiryo UI", 1, 8)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/gaji/view/Relationship-icon.png"))); // NOI18N
        jButton4.setText("Tentang");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 160, -1));

        jButton5.setFont(new java.awt.Font("Meiryo UI", 1, 8)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/gaji/view/help-button-hi.png"))); // NOI18N
        jButton5.setText("Petunjuk");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 160, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setText("APLIKASI PERHITUNGAN GAJI PT. RAFFLESIA APPLICATION");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 570, -1));

        jButton7.setFont(new java.awt.Font("Meiryo UI", 1, 8)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/gaji/view/Customer-service-icon.png"))); // NOI18N
        jButton7.setText("Admin");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, -1, -1));

        jButton6.setFont(new java.awt.Font("Meiryo UI", 1, 8)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/gaji/view/Home-icon.png"))); // NOI18N
        jButton6.setText("Home");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, -1));

        jLabel1.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        jLabel1.setText("ID Pegawai :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        jLabel6.setText("Nama :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, 20));

        jLabel3.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        jLabel3.setText("Pajak :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, 20));

        jLabel4.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        jLabel4.setText("Jam Lembur :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, 20));

        jLabel7.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        jLabel7.setText("Posisi :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, 20));

        jLabel5.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        jLabel5.setText("Gaji Pokok :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, 20));

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/gaji/view/Save-icon.png"))); // NOI18N
        save.setText("Simpan");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 160, 90));

        posisi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Direktur", "Manager", "Programmer", "Marketing", "Surveyor" }));
        getContentPane().add(posisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        gaji.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gajiKeyPressed(evt);
            }
        });
        getContentPane().add(gaji, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 160, 30));
        getContentPane().add(lembur, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 60, 30));
        getContentPane().add(pajak, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 180, 30));
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 240, 30));

        cari.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cariMouseMoved(evt);
            }
        });
        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cariKeyTyped(evt);
            }
        });
        getContentPane().add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 160, 30));
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 150, 30));

        jLabel8.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        jLabel8.setText("Total Gaji :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, 20));

        hitung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/gaji/view/Cash-icon.png"))); // NOI18N
        hitung.setText("Hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });
        getContentPane().add(hitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 160, -1));
        getContentPane().add(tunjangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 150, 30));

        jLabel9.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        jLabel9.setText("Alamat :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jLabel10.setFont(new java.awt.Font("Meiryo UI", 1, 14)); // NOI18N
        jLabel10.setText("No HP :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));
        getContentPane().add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 380, 30));
        getContentPane().add(hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 180, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/gaji/view/Power Point 11.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new FORM_DATA().show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        new FORM_LOGINADMIN().show();
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new FORM_UTAMA().show();
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
      try {
            k.stat.executeUpdate("insert into pegawai values ("+"'"+cari.getText()+"',"
                + "'"+nama.getText()+"',"
                + "'"+posisi.getSelectedItem()+"',"
                + "'"+gaji.getText()+"',"
                + "'"+pajak.getText()+"',"
                +"'"+lembur.getText()+"',"
                +"'"+tunjangan.getText()+"',"
                + "'"+total.getText()+"')");
            cari.setText("");
            nama.setText("");
            posisi.setSelectedItem("  ");
            gaji.setText("");
            pajak.setText("");
            lembur.setText("");
            tunjangan.setText("");
            total.setText("");
            cari.requestFocus();
            JOptionPane.showMessageDialog(rootPane,"Data tersimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Gagal"+e);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void cariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyTyped
        // TODO add your handling code here:
         
    }//GEN-LAST:event_cariKeyTyped

    private void cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode()==10) {
         try {
        k.stat=k.con.createStatement();
        k.res=k.stat.executeQuery("select * from data1 where "+"id ='"+cari.getText()+"'");
        if (k.res.next()) {
            
           cari.setText(k.res.getString("id"));
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
    }//GEN-LAST:event_cariKeyReleased

    private void cariMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cariMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_cariMouseMoved

    private void gajiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gajiKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_gajiKeyPressed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        // TODO add your handling code here:
        int z = Integer.parseInt(gaji.getText());
        int b = Integer.parseInt(lembur.getText());
        int t = b * 15000;
        int pjk = z / 100 * 1;
        int tl = z - pjk + t;
        
        tunjangan.setText(""+t);
        pajak.setText(""+pjk);
        total.setText(""+tl);
    }//GEN-LAST:event_hitungActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new pkaryawan().show();
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(FORM_GAJI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FORM_GAJI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FORM_GAJI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FORM_GAJI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FORM_GAJI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JTextField alamat;
    private javax.swing.JTextField cari;
    private javax.swing.JTextField gaji;
    private javax.swing.JButton hitung;
    private javax.swing.JTextField hp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lembur;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField pajak;
    private javax.swing.JComboBox posisi;
    private javax.swing.JButton save;
    private javax.swing.JTextField total;
    private javax.swing.JTextField tunjangan;
    // End of variables declaration//GEN-END:variables
}
