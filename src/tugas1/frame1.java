/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author Krisna Putra F
 */
public class frame1 extends javax.swing.JFrame {

    /**
     * Creates new form frame1
     */
    public frame1() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dsk = new javax.swing.JTextField();
        hb1 = new javax.swing.JTextField();
        hb2 = new javax.swing.JTextField();
        hb3 = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("Diskon");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 170, 70, 18);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Pembayaran");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 0, 120, 40);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("Harga Barang 1");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 50, 140, 18);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("Harga Barang 2");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 90, 120, 18);

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setText("Harga Barang 3");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 130, 120, 18);

        dsk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dskActionPerformed(evt);
            }
        });
        getContentPane().add(dsk);
        dsk.setBounds(160, 170, 120, 30);
        getContentPane().add(hb1);
        hb1.setBounds(160, 50, 120, 30);

        hb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hb2ActionPerformed(evt);
            }
        });
        getContentPane().add(hb2);
        hb2.setBounds(160, 90, 120, 30);
        getContentPane().add(hb3);
        hb3.setBounds(160, 130, 120, 30);

        submit.setText("Proses");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(300, 170, 80, 40);

        TA.setColumns(20);
        TA.setRows(5);
        jScrollPane1.setViewportView(TA);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 210, 280, 150);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 370);

        setBounds(0, 0, 416, 411);
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

        int h1=Integer.parseInt(hb1.getText());
        int h2=Integer.parseInt(hb2.getText());
        int h3=Integer.parseInt(hb3.getText());
        int diskon=Integer.parseInt(dsk.getText());
        int totalbarang=h1+h2+h3;
        int hsdiskon=totalbarang-((totalbarang/100)*diskon);
        TA.setText("Harga Barang 1= "+String.valueOf(h1)+"\nHarga Barang 2="+String.valueOf(h2)+"\nHarga Barang 3= "+String.valueOf(h3)+"\nTotal Harga= "+String.valueOf(totalbarang)+"\nDiskon=  "+String.valueOf(diskon)+"\nTotal Pembayaran= "+String.valueOf(hsdiskon));
    }//GEN-LAST:event_submitActionPerformed

    private void dskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dskActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dskActionPerformed

    private void hb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hb2ActionPerformed

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
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TA;
    private javax.swing.JTextField dsk;
    private javax.swing.JTextField hb1;
    private javax.swing.JTextField hb2;
    private javax.swing.JTextField hb3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
