/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

/**
 *
 * @author TUFF
 */
public class GUI_PenjualanMakanan extends javax.swing.JFrame {

    /**
     * Creates new form GUI_PenjualanMakanan
     */
    public GUI_PenjualanMakanan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSiomay = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxMie = new javax.swing.JCheckBox();
        cbxLalapan = new javax.swing.JCheckBox();
        cbxNasgor = new javax.swing.JCheckBox();
        cbxSiomay = new javax.swing.JCheckBox();
        txtBatagor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnPesan = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMie = new javax.swing.JTextField();
        txtLalapan = new javax.swing.JTextField();
        cbxBatagor = new javax.swing.JCheckBox();
        txtNasgor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        memoMakanan = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Menu Makanan");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Harga");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Jumlah");

        cbxMie.setText("Mie Ayam");
        cbxMie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMieActionPerformed(evt);
            }
        });

        cbxLalapan.setText("Lalapan");

        cbxNasgor.setText("Nasi Goreng");

        cbxSiomay.setText("Siomay");

        jLabel4.setText("Rp 7000");

        jLabel5.setText("Rp 10000");

        btnPesan.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnPesan.setText("PESAN");
        btnPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesanActionPerformed(evt);
            }
        });

        jLabel6.setText("Rp 12000");

        jLabel7.setText("Rp 8000");

        jLabel8.setText("Rp 5000");

        cbxBatagor.setText("Batagor");

        memoMakanan.setColumns(20);
        memoMakanan.setRows(5);
        jScrollPane1.setViewportView(memoMakanan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(38, 38, 38))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxMie)
                                .addGap(50, 50, 50)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cbxLalapan)
                            .addGap(62, 62, 62)
                            .addComponent(jLabel5))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbxNasgor)
                                .addComponent(cbxSiomay))
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8))))
                    .addComponent(cbxBatagor))
                .addGap(49, 49, 49)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(214, 214, 214))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtBatagor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(txtSiomay, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNasgor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLalapan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMie, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPesan)
                        .addGap(26, 26, 26)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxMie)
                            .addComponent(jLabel4)
                            .addComponent(txtMie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxLalapan)
                            .addComponent(jLabel5)
                            .addComponent(txtLalapan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxNasgor)
                            .addComponent(jLabel6)
                            .addComponent(txtNasgor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxSiomay)
                            .addComponent(jLabel7)
                            .addComponent(txtSiomay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxBatagor)
                            .addComponent(jLabel8)
                            .addComponent(txtBatagor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnPesan))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxMieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxMieActionPerformed

    private void btnPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesanActionPerformed
        // TODO add your handling code here:
        String x;
        x="";
        int bayar = 0;
        if(cbxMie.isSelected()){
            int jumlah=Integer.parseInt(txtMie.getText());
            int total,harga1;
            harga1=7000;
            total=jumlah*harga1;
            bayar=bayar+total;
            x += cbxMie.getText()+" Rp 7000"+" x "+jumlah+" = "+total+"\n";
            txtMie.setEnabled(false);
            cbxMie.setEnabled(false);
        }
        if(cbxLalapan.isSelected()){
            int jumlah=Integer.parseInt(txtLalapan.getText());
            int total,harga2;
            harga2=10000;
            total=jumlah*harga2;
            bayar=bayar+total;
            x += cbxLalapan.getText()+" Rp 10000"+" x "+jumlah+" = "+total+"\n";
            txtLalapan.setEnabled(false);
            cbxLalapan.setEnabled(false);
        }
        if(cbxNasgor.isSelected()){
            int jumlah=Integer.parseInt(txtNasgor.getText());
            int total,harga3;
            harga3=12000;
            total=jumlah*harga3;
            bayar=bayar+total;
            x += cbxNasgor.getText()+" Rp 12000"+" x "+jumlah+" = "+total+"\n";
            txtNasgor.setEnabled(false);
            cbxNasgor.setEnabled(false);
        }
        if(cbxSiomay.isSelected()){
            int jumlah=Integer.parseInt(txtSiomay.getText());
            int total,harga4;
            harga4=8000;
            total=jumlah*harga4;
            bayar=bayar+total;
            x += cbxSiomay.getText()+" Rp 8000"+" x "+jumlah+" = "+total+"\n";
            txtSiomay.setEnabled(false);
            cbxSiomay.setEnabled(false);
        }
        if(cbxBatagor.isSelected()){
            int jumlah=Integer.parseInt(txtBatagor.getText());
            int total,harga5;
            harga5=5000;
            total=jumlah*harga5;
            bayar=bayar+total;
            x += cbxBatagor.getText()+" Rp 5000"+" x "+jumlah+" = "+total+"\n";
            txtBatagor.setEnabled(false);
            cbxBatagor.setEnabled(false);
        }
        memoMakanan.setText(x+"==========================="+"\n"+"Total Bayar = Rp "+bayar);
    }//GEN-LAST:event_btnPesanActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_PenjualanMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_PenjualanMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_PenjualanMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_PenjualanMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_PenjualanMakanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesan;
    private javax.swing.JCheckBox cbxBatagor;
    private javax.swing.JCheckBox cbxLalapan;
    private javax.swing.JCheckBox cbxMie;
    private javax.swing.JCheckBox cbxNasgor;
    private javax.swing.JCheckBox cbxSiomay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea memoMakanan;
    private javax.swing.JTextField txtBatagor;
    private javax.swing.JTextField txtLalapan;
    private javax.swing.JTextField txtMie;
    private javax.swing.JTextField txtNasgor;
    private javax.swing.JTextField txtSiomay;
    // End of variables declaration//GEN-END:variables
}