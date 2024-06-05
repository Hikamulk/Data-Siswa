package datasiswa;

import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class app extends javax.swing.JFrame {

       public app() {
        initComponents();
        reset();

        tNis.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        KeyAdapter onlyTextAdapter = new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetter(c) && c != ' ') {
                    e.consume();
                }
            }
        };

        tTempatLahir.addKeyListener(onlyTextAdapter);
        tNama.addKeyListener(onlyTextAdapter);
    }

    void reset() {
        //mereset textfield
        tNis.setText("");
        tNama.setText("");
        tTempatLahir.setText("");
        tAlamat.setText("");
 
        //mereset hasil dari inputan
        vNama.setText("");
        vFoto.setText("");
        vNis.setText("");
        vKelamin.setText("");
        vTtl.setText("");
        vFoto.setText("");
        vJurusan.setText("");
        
        //mereset radio button, jCalendar dan Combo Box
        Kelamin.clearSelection();
        tTanggalLahir.setCalendar(null);
        tJurusan.setSelectedItem(null);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Kelamin = new javax.swing.ButtonGroup();
        panel2 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        panel3 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tTempatLahir = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tNama = new javax.swing.JTextField();
        rPer = new javax.swing.JRadioButton();
        rLaki = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        tNis = new javax.swing.JTextField();
        tTanggalLahir = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tJurusan = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        bSimpan = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAlamat = new javax.swing.JTextArea();
        pFoto = new javax.swing.JLabel();
        tFoto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        vNis = new javax.swing.JLabel();
        vNama = new javax.swing.JLabel();
        vKelamin = new javax.swing.JLabel();
        vTtl = new javax.swing.JLabel();
        vJurusan = new javax.swing.JLabel();
        vFoto = new javax.swing.JLabel();
        vAlamat = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        panel2.setBackground(new java.awt.Color(51, 51, 51));
        panel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA SISWA");
        panel2.add(jLabel1);
        jLabel1.setBounds(220, 10, 150, 20);

        getContentPane().add(panel2);
        panel2.setBounds(0, 0, 600, 40);

        panel1.setPreferredSize(new java.awt.Dimension(600, 5));
        panel1.setLayout(null);
        getContentPane().add(panel1);
        panel1.setBounds(0, 35, 600, 5);

        panel3.setBackground(new java.awt.Color(102, 102, 102));
        panel3.setPreferredSize(new java.awt.Dimension(600, 295));
        panel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ALAMAT");
        panel3.add(jLabel2);
        jLabel2.setBounds(30, 190, 120, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NIS");
        panel3.add(jLabel3);
        jLabel3.setBounds(30, 10, 70, 20);
        panel3.add(tTempatLahir);
        tTempatLahir.setBounds(150, 100, 240, 22);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NAMA");
        panel3.add(jLabel4);
        jLabel4.setBounds(30, 40, 70, 20);
        panel3.add(tNama);
        tNama.setBounds(150, 40, 240, 22);

        Kelamin.add(rPer);
        rPer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rPer.setForeground(new java.awt.Color(255, 255, 255));
        rPer.setText("PEREMPUAN");
        panel3.add(rPer);
        rPer.setBounds(250, 70, 110, 20);

        Kelamin.add(rLaki);
        rLaki.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rLaki.setForeground(new java.awt.Color(255, 255, 255));
        rLaki.setText("LAKI-LAKI");
        panel3.add(rLaki);
        rLaki.setBounds(150, 70, 100, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("JENIS KELAMIN");
        panel3.add(jLabel5);
        jLabel5.setBounds(30, 70, 110, 20);

        tNis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNisActionPerformed(evt);
            }
        });
        panel3.add(tNis);
        tNis.setBounds(150, 10, 240, 22);
        panel3.add(tTanggalLahir);
        tTanggalLahir.setBounds(150, 130, 240, 22);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TEMPAT LAHIR");
        panel3.add(jLabel6);
        jLabel6.setBounds(30, 100, 110, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TANGGAL LAHIR");
        panel3.add(jLabel7);
        jLabel7.setBounds(30, 130, 130, 20);

        tJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IPA", "IPS", "BAHASA" }));
        panel3.add(tJurusan);
        tJurusan.setBounds(150, 160, 80, 22);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("JURUSAN");
        panel3.add(jLabel8);
        jLabel8.setBounds(30, 160, 120, 20);

        bSimpan.setText("SIMPAN");
        bSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSimpanActionPerformed(evt);
            }
        });
        panel3.add(bSimpan);
        bSimpan.setBounds(500, 300, 75, 20);

        bReset.setText("RESET");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });
        panel3.add(bReset);
        bReset.setBounds(410, 300, 75, 20);

        tAlamat.setColumns(20);
        tAlamat.setRows(5);
        jScrollPane1.setViewportView(tAlamat);

        panel3.add(jScrollPane1);
        jScrollPane1.setBounds(150, 190, 240, 80);

        pFoto.setForeground(new java.awt.Color(255, 255, 255));
        pFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pFoto.setText("FOTO");
        pFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pFotoMouseClicked(evt);
            }
        });
        panel3.add(pFoto);
        pFoto.setBounds(460, 20, 120, 130);

        tFoto.setText("SOURCE FOTO");
        panel3.add(tFoto);
        tFoto.setBounds(460, 150, 100, 16);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panel3.add(jPanel1);
        jPanel1.setBounds(0, 280, 600, 10);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        vNis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vNis.setText("NIS");
        jPanel2.add(vNis);
        vNis.setBounds(10, 0, 410, 20);

        vNama.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vNama.setText("NAMA");
        jPanel2.add(vNama);
        vNama.setBounds(10, 20, 380, 20);

        vKelamin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vKelamin.setText("JENIS KELAMIN");
        jPanel2.add(vKelamin);
        vKelamin.setBounds(10, 40, 400, 20);

        vTtl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vTtl.setText("TANGGAL LAHIR");
        jPanel2.add(vTtl);
        vTtl.setBounds(10, 60, 430, 20);

        vJurusan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vJurusan.setText("JURUSAN");
        jPanel2.add(vJurusan);
        vJurusan.setBounds(10, 80, 390, 20);

        vFoto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vFoto.setText("FOTO");
        jPanel2.add(vFoto);
        vFoto.setBounds(10, 120, 270, 20);

        vAlamat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vAlamat.setText("ALAMAT");
        jPanel2.add(vAlamat);
        vAlamat.setBounds(10, 100, 340, 20);

        panel3.add(jPanel2);
        jPanel2.setBounds(0, 330, 600, 150);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("NIS");
        panel3.add(jLabel9);
        jLabel9.setBounds(30, 10, 70, 20);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("NAMA");
        panel3.add(jLabel10);
        jLabel10.setBounds(30, 40, 70, 20);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("JENIS KELAMIN");
        panel3.add(jLabel11);
        jLabel11.setBounds(30, 70, 110, 20);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("TEMPAT LAHIR");
        panel3.add(jLabel12);
        jLabel12.setBounds(30, 100, 110, 20);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("JURUSAN");
        panel3.add(jLabel13);
        jLabel13.setBounds(30, 160, 120, 20);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ALAMAT");
        panel3.add(jLabel14);
        jLabel14.setBounds(30, 190, 120, 20);

        getContentPane().add(panel3);
        panel3.setBounds(0, 40, 600, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tNisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNisActionPerformed

    }//GEN-LAST:event_tNisActionPerformed

    private void pFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pFotoMouseClicked
           try {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File file = chooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(file.toString());
            Image image = icon.getImage().getScaledInstance(pFoto.getWidth(), pFoto.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon ic = new ImageIcon(image);
            pFoto.setText("");
            pFoto.setIcon(ic);
            String filename = file.getAbsolutePath();
            tFoto.setText(filename);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Upload eror" + e);
        }
    }//GEN-LAST:event_pFotoMouseClicked

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        reset();
        pFoto.setText(null);
        pFoto.setIcon(null);
    }//GEN-LAST:event_bResetActionPerformed

    private void bSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimpanActionPerformed
    
        vNis.setText("NIS : " + tNis.getText());
        vNama.setText("NAMA : " + tNama.getText());
        vJurusan.setText("JURUSAN : " + tJurusan.getSelectedItem().toString());
        vAlamat.setText("ALAMAT :" + tAlamat.getText());
        
        if (rLaki.isSelected()) {
            vKelamin.setText(("JENIS KELAMIN : LAKI-LAKI"));
        }else if (rPer.isSelected()) {
            vKelamin.setText(("JENIS KELAMIN : PEREMPUAN"));
        }else{
            vKelamin.setText(("JENIS KELAMIN : TIDAK TERDEFINISI"));
        }
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        String tglLahir = String.valueOf(sd.format(tTanggalLahir.getDate()));
        vTtl.setText("TEMPAT,TANGGAL LAHIR : " + tTempatLahir.getText() + "," + tglLahir);

        String filename;
        try {
            filename = tFoto.getText();
            String filepath = "src/foto/";
            File folder = new File(filepath);
            if (!folder.exists()) {
                folder.mkdir();

            }
            File sourceFile = null;
            File destFile = null;
            String ekstensi = filename.substring(filename.lastIndexOf('.') + 1);
            sourceFile = new File(filename);
            Date tglUpload = new Date();
            SimpleDateFormat fr = new SimpleDateFormat("yyyyMMddhhss");
            String tglBaru = String.valueOf(fr.format(tglUpload));
            destFile = new File(filepath + tglBaru.toString() + "." + ekstensi);
            Files.copy(sourceFile.toPath(), destFile.toPath());
            vFoto.setText("FOTO : " + destFile.toString());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "upload eror" + e);

        }
    }//GEN-LAST:event_bSimpanActionPerformed

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
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new app().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Kelamin;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pFoto;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private javax.swing.JRadioButton rLaki;
    private javax.swing.JRadioButton rPer;
    private javax.swing.JTextArea tAlamat;
    private javax.swing.JLabel tFoto;
    private javax.swing.JComboBox<String> tJurusan;
    private javax.swing.JTextField tNama;
    private javax.swing.JTextField tNis;
    private com.toedter.calendar.JDateChooser tTanggalLahir;
    private javax.swing.JTextField tTempatLahir;
    private javax.swing.JLabel vAlamat;
    private javax.swing.JLabel vFoto;
    private javax.swing.JLabel vJurusan;
    private javax.swing.JLabel vKelamin;
    private javax.swing.JLabel vNama;
    private javax.swing.JLabel vNis;
    private javax.swing.JLabel vTtl;
    // End of variables declaration//GEN-END:variables
}
