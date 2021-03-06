package Simakir;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.awt.PrintJob;
import java.awt.Graphics;
import java.awt.Font;

public class DataParkir extends javax.swing.JFrame {
    DefaultTableModel masuk, keluar;
    koneksi konek = new koneksi();
    
    public DataParkir(java.awt.Frame parent, boolean modal) {
        konek.koneksi();
        initComponents();
        btnSimpan.setBackground(Color.green);
        btnReset.setBackground(Color.red);
        btnCari.setBackground(Color.yellow);
        btnKeluar.setBackground(Color.red);
        btnCetak.setBackground(Color.green);
        btnClear.setBackground(Color.blue);
        tampil_masuk();
        tampil_keluar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblbiaya = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNoPol = new javax.swing.JTextField();
        cbJenis = new javax.swing.JComboBox<>();
        btnSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMasuk = new javax.swing.JTable();
        btnReset = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbKeluar = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtKNoPol = new javax.swing.JTextField();
        txtKNoTiket = new javax.swing.JTextField();
        txtKJenis = new javax.swing.JTextField();
        txtKTglMasuk = new javax.swing.JTextField();
        txtKJamMasuk = new javax.swing.JTextField();
        txtKDurasiH = new javax.swing.JTextField();
        txtKDurasiJ = new javax.swing.JTextField();
        txtKBiaya = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        txtKBiayaAkhir = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnCetak = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        lblbiaya.setText("jLabel13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Parkir");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Music\\Simakir\\src\\images\\btn_back.png")); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setText("No. Pol");

        jLabel2.setText("Jenis");

        txtNoPol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoPolKeyTyped(evt);
            }
        });

        cbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih Jenis Kendaraan-", "Motor", "Mobil" }));

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        tbMasuk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Tiket", "No. Pol", "Jenis", "Tanggal Masuk", "Jam Masuk"
            }
        ));
        jScrollPane1.setViewportView(tbMasuk);

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbJenis, javax.swing.GroupLayout.Alignment.TRAILING, 0, 204, Short.MAX_VALUE)
                            .addComponent(txtNoPol, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(108, 108, 108))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNoPol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnReset))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Parkir Masuk", jPanel2);

        tbKeluar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Tiket", "No. Pol", "Jenis", "Tgl Keluar", "Jam Keluar", "Biaya"
            }
        ));
        jScrollPane2.setViewportView(tbKeluar);

        jLabel4.setText("No. Pol");

        jLabel5.setText("No. Tiket");

        jLabel6.setText("Jenis");

        jLabel7.setText("Tgl Masuk");

        jLabel8.setText("Jam Masuk");

        jLabel9.setText("Durasi Hari");

        jLabel10.setText("Durasi Jam");

        jLabel11.setText("Biaya Parkir");

        txtKNoPol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKNoPolKeyTyped(evt);
            }
        });

        txtKNoTiket.setEditable(false);

        txtKJenis.setEditable(false);

        txtKTglMasuk.setEditable(false);

        txtKJamMasuk.setEditable(false);

        txtKDurasiH.setEditable(false);

        txtKDurasiJ.setEditable(false);

        txtKBiaya.setEditable(false);

        btnCari.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Music\\Simakir\\src\\images\\btnCari.png")); // NOI18N
        btnCari.setContentAreaFilled(false);
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        btnKeluar.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Music\\Simakir\\src\\images\\btnParkirKeluar.png")); // NOI18N
        btnKeluar.setContentAreaFilled(false);
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        txtKBiayaAkhir.setEditable(false);

        jLabel12.setText("Biaya Akhir");

        btnCetak.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Music\\Simakir\\src\\images\\btnCetak.png")); // NOI18N
        btnCetak.setContentAreaFilled(false);
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Music\\Simakir\\src\\images\\btnClear.png")); // NOI18N
        btnClear.setContentAreaFilled(false);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtKTglMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtKDurasiH)
                                            .addComponent(txtKBiaya))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel8))
                                            .addComponent(jLabel12))
                                        .addGap(12, 12, 12))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtKJenis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                            .addComponent(txtKNoTiket, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtKNoPol, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtKDurasiJ, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtKJamMasuk, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCari, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKBiayaAkhir, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnKeluar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClear)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtKNoPol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtKNoTiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtKJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(txtKTglMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKJamMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(txtKDurasiH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKDurasiJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtKBiayaAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Parkir Keluar", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 490, 410));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Music\\Simakir\\src\\images\\bg_dataparkir.png")); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNoPolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoPolKeyTyped
        // TODO add your handling code here:
        evt.setKeyChar(Character.toUpperCase(evt.getKeyChar())); 
    }//GEN-LAST:event_txtNoPolKeyTyped

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        if (txtNoPol.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nomor polisi belum diisi!");
        } else if (cbJenis.getSelectedItem().equals("-Pilih Jenis Kendaraan-")) {
            JOptionPane.showMessageDialog(this, "Jenis kendaraan belum dipilih");
        } else {
            String nopol, jenis, sql;
            nopol = txtNoPol.getText();
            jenis = cbJenis.getSelectedItem().toString();

            sql = "INSERT INTO tb_parkir(no_pol,jenis,tgl_masuk,jam_masuk)"
                    + "VALUES('"+nopol+"','"+jenis+"',CURDATE(),CURTIME())";
            try{
                konek.st = konek.conn.createStatement();
                konek.st.execute(sql);
            }
            catch (SQLException e){
                JOptionPane.showMessageDialog(this, "Data gagal disimpan"+e);
                return;
            }
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
        }
        resetAll();
        tampil_masuk();
        tampil_keluar();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtNoPol.setText("");
        cbJenis.setSelectedIndex(0);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        if(txtKNoPol.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "No. Pol masih kosong!");
        else {
            DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
            DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
            formatRp.setCurrencySymbol("Rp ");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator('.');
            rupiah.setDecimalFormatSymbols(formatRp);

            String sql = "SELECT *, DATEDIFF(CURDATE(), tgl_masuk) durasi_hari, (TIME_FORMAT(CURTIME(),'%H')-TIME_FORMAT(jam_masuk, '%H')) durasi_jam "
                    + "FROM tb_parkir WHERE no_pol='"+txtKNoPol.getText()+"' AND biaya=0";
            try
            {
                konek.st = konek.conn.createStatement();
                konek.rs = konek.st.executeQuery(sql);
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(this, "Kesalahan query"+ex);
            }
            int size=0;
            try {
                while (konek.rs.next()){
                    size++;
                    txtKNoTiket.setText(konek.rs.getString("no_tiket").toString());
                    txtKJenis.setText(konek.rs.getString("jenis").toString());
                    txtKTglMasuk.setText(konek.rs.getString("tgl_masuk").toString());
                    txtKJamMasuk.setText(konek.rs.getString("jam_masuk").toString());
                    int hari = Integer.parseInt(konek.rs.getString("durasi_hari"));
                    int jam = Integer.parseInt(konek.rs.getString("durasi_jam"));
                    int biaya, biaya_akhir;
                    if(txtKJenis.getText().equals("Mobil")){
                        txtKBiaya.setText(rupiah.format(5000));
                        biaya = 5000;
                    } else {
                        txtKBiaya.setText(rupiah.format(2000));
                        biaya = 2000;
                    }
                    if(hari>0){
                        txtKDurasiH.setText(""+hari+" hari");
                        txtKDurasiJ.setText("-");
                        biaya_akhir = biaya + (50000*hari);
                        txtKBiayaAkhir.setText(rupiah.format(biaya_akhir));
                        lblbiaya.setText(""+biaya_akhir);
                    }
                    else{ 
                        txtKDurasiH.setText("0 hari");
                        txtKDurasiJ.setText(konek.rs.getString("durasi_jam").toString()+" jam");
                        biaya_akhir = biaya + (1000*jam);
                        txtKBiayaAkhir.setText(rupiah.format(biaya_akhir));
                        lblbiaya.setText(""+biaya_akhir);
                    }

                 }
                if(size==0)
                {
                    JOptionPane.showMessageDialog(this,"Data tidak ditemukan");
                    return;
                }
                konek.rs.close();
                konek.st.close();
            } catch (SQLException ex){
            }
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void txtKNoPolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKNoPolKeyTyped
        evt.setKeyChar(Character.toUpperCase(evt.getKeyChar())); 
    }//GEN-LAST:event_txtKNoPolKeyTyped

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        if(txtKNoPol.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Data kosong!");
        else {
            int biaya = Integer.parseInt(lblbiaya.getText());
            String sql, notiket;
            notiket = txtKNoTiket.getText();
            
            sql = "UPDATE tb_parkir SET tgl_keluar=CURDATE(), jam_keluar=CURTIME(), biaya='"+biaya+"' "
                    + "WHERE no_tiket='"+notiket+"'";
                try{
                    konek.st = konek.conn.createStatement();
                    konek.st.execute(sql);
                }
                catch (SQLException e){
                    JOptionPane.showMessageDialog(this, "Data gagal disimpan"+e);
                    return;
                }
                JOptionPane.showMessageDialog(this, "Data berhasil diperbaharui");
            
            resetAll();
            tampil_masuk();
            tampil_keluar();
        }
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        if (txtKNoPol.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data masing kosong!");
        } else {
            PrintJob p = getToolkit().getPrintJob(this, "Cetak Tiket", null);

            Graphics g = p.getGraphics();
            g.setFont(new Font("Serif", Font.BOLD, 20));
            g.drawString("TIKET NO: "+txtKNoTiket.getText(), 200, 18);
            g.drawLine(10, 30, 600, 30);
            g.setFont(new Font("Courier New", Font.PLAIN, 12));
            g.drawString("No. Pol", 10, 50);
            g.drawString(" : ", 100, 50);
            g.drawString(txtKNoPol.getText(), 160, 50);

            g.drawString("Jenis", 10, 60);
            g.drawString(" : ", 100, 60);
            g.drawString(txtKJenis.getText(), 160, 60);

            g.drawString("Tanggal Masuk", 10, 70);
            g.drawString(" : ", 100, 70);
            g.drawString(txtKTglMasuk.getText(), 160, 70);

            g.drawString("Jam Masuk", 10, 80);
            g.drawString(" : ", 100, 80);
            g.drawString(txtKJamMasuk.getText(), 160, 80);

            g.drawString("Durasi Jam", 10, 90);
            g.drawString(" : ", 100, 90);
            g.drawString(txtKDurasiJ.getText(), 160, 90);

            g.drawString("Durasi Hari", 10, 100);
            g.drawString(" : ", 100, 100);
            g.drawString(txtKDurasiH.getText(), 160, 100);

            g.drawString("Biaya Parkir", 10, 110);
            g.drawString(" : ", 100, 110);
            g.drawString(txtKBiaya.getText(), 160, 110);

            g.drawString("Biaya Akhir", 10, 120);
            g.drawString(" : ", 100, 120);
            g.drawString(txtKBiayaAkhir.getText(), 160, 120);

            g.setFont(new Font("Courier New", Font.PLAIN, 8));
            g.drawString("*Parkir lebih dari 1 jam dikenai biaya tambahan Rp 1000,00 berlaku kelipatan jam", 10, 150);
            g.drawString("*Parkir lebih dari 1 hari dikenai biaya tambahan Rp 50.000,00 berlaku kelipatan hari", 10, 160);

            p.end();
        }
    }//GEN-LAST:event_btnCetakActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtKNoPol.setText("");
        txtKNoTiket.setText("");
        txtKJenis.setText("");
        txtKTglMasuk.setText("");
        txtKJamMasuk.setText("");
        txtKDurasiH.setText("");
        txtKDurasiJ.setText("");
        txtKBiaya.setText("");
        txtKBiayaAkhir.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.hide();
        utama utm = new utama();
        utm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void resetAll(){
        txtNoPol.setText("");
        cbJenis.setSelectedIndex(0);
        masuk = (DefaultTableModel) tbMasuk.getModel();
        keluar = (DefaultTableModel) tbKeluar.getModel();
        int rowCount1 = masuk.getRowCount();
        int rowCount2 = keluar.getRowCount();
       for (int i = rowCount1 - 1; i >= 0; i--) {
            masuk.removeRow(i);
        }
        for (int i = rowCount2 - 1; i >= 0; i--) {
            keluar.removeRow(i);
        }
    }
    
    public void tampil_masuk(){
        masuk = (DefaultTableModel) tbMasuk.getModel();
        try {
            konek.st = konek.conn.createStatement();
            String query = "SELECT * FROM tb_parkir WHERE biaya=0 ORDER BY no_tiket DESC LIMIT 25";
            konek.rs = konek.st.executeQuery(query);
            while (konek.rs.next()) {
                String no_tiket = konek.rs.getString("no_tiket");
                String no_pol = konek.rs.getString("no_pol");
                String jenis = konek.rs.getString("jenis");
                String tgl_masuk = konek.rs.getString("tgl_masuk");
                String jam_masuk = konek.rs.getString("jam_masuk");
                
                String [] data = {no_tiket, no_pol, jenis, tgl_masuk, jam_masuk};
                masuk.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal ambil data"+e);
        }
        tbMasuk.setModel(masuk);
    }
    
    public void tampil_keluar(){
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        rupiah.setDecimalFormatSymbols(formatRp);
        
        keluar = (DefaultTableModel) tbKeluar.getModel();
        try {
            konek.st = konek.conn.createStatement();
            String query = "SELECT * FROM tb_parkir WHERE biaya <> 0 ORDER BY tgl_keluar DESC,jam_keluar DESC LIMIT 15";
            konek.rs = konek.st.executeQuery(query);
            while (konek.rs.next()) {
                String no_tiket = konek.rs.getString("no_tiket");
                String no_pol = konek.rs.getString("no_pol");
                String jenis = konek.rs.getString("jenis");
                String tgl_keluar = konek.rs.getString("tgl_keluar");
                String jam_keluar = konek.rs.getString("jam_keluar");
                String biaya = konek.rs.getString("biaya");
                Double biaya2 = Double.parseDouble(biaya);
                String biaya_final = (rupiah.format(biaya2));
                
                String [] data = {no_tiket, no_pol, jenis, tgl_keluar, jam_keluar, biaya_final};
                keluar.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal ambil data"+e);
        }
        tbKeluar.setModel(keluar);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DataParkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataParkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataParkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataParkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DataParkir dialog = new DataParkir(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cbJenis;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblbiaya;
    private javax.swing.JTable tbKeluar;
    private javax.swing.JTable tbMasuk;
    private javax.swing.JTextField txtKBiaya;
    private javax.swing.JTextField txtKBiayaAkhir;
    private javax.swing.JTextField txtKDurasiH;
    private javax.swing.JTextField txtKDurasiJ;
    private javax.swing.JTextField txtKJamMasuk;
    private javax.swing.JTextField txtKJenis;
    private javax.swing.JTextField txtKNoPol;
    private javax.swing.JTextField txtKNoTiket;
    private javax.swing.JTextField txtKTglMasuk;
    private javax.swing.JTextField txtNoPol;
    // End of variables declaration//GEN-END:variables
}
