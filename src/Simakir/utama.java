
package Simakir;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class utama extends javax.swing.JFrame {
    
    public utama() {
        initComponents();
        JFrame frame = new JFrame();
        frame.setUndecorated(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPendapatan = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        btnParkir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPendapatan.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Music\\Simakir\\src\\images\\btn_pendapatan.png")); // NOI18N
        btnPendapatan.setContentAreaFilled(false);
        btnPendapatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendapatanActionPerformed(evt);
            }
        });
        getContentPane().add(btnPendapatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, -1, -1));

        btnKeluar.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Music\\Simakir\\src\\images\\btn_keluar.png")); // NOI18N
        btnKeluar.setContentAreaFilled(false);
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, -1, -1));

        btnAbout.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Music\\Simakir\\src\\images\\btn_about.png")); // NOI18N
        btnAbout.setContentAreaFilled(false);
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });
        getContentPane().add(btnAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 470, -1, -1));

        btnParkir.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Music\\Simakir\\src\\images\\btn_parkir.png")); // NOI18N
        btnParkir.setContentAreaFilled(false);
        btnParkir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParkirActionPerformed(evt);
            }
        });
        getContentPane().add(btnParkir, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Music\\Simakir\\src\\images\\bg_dashboard.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnParkirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParkirActionPerformed
        this.hide();
        new DataParkir(this,true).setVisible(true);
    }//GEN-LAST:event_btnParkirActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        this.hide();
        new About(this,true).setVisible(true);
    }//GEN-LAST:event_btnAboutActionPerformed

    private void btnPendapatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendapatanActionPerformed
        this.hide();
        new Pendapatan(this,true).setVisible(true);
    }//GEN-LAST:event_btnPendapatanActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        Object[] options = {"Ya", "Tidak, tetap di halaman"};
        int dialog = JOptionPane.showOptionDialog(this, "Apakah Anda yakin akan Keluar?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (dialog == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnKeluarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnParkir;
    private javax.swing.JButton btnPendapatan;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
