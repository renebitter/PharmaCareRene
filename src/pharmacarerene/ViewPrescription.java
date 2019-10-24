package pharmacarerene;

/**
 *
 * @author reneb
 */
public class ViewPrescription extends javax.swing.JFrame {

    public ViewPrescription() {
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

        jScrollPane = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        lblDoctorId = new javax.swing.JLabel();
        txtDoctorId = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        lblPatientName = new javax.swing.JLabel();
        lblPrescriptionId = new javax.swing.JLabel();
        txtPrescriptionId = new javax.swing.JTextField();
        lblPatientId = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        jButtonExit = new javax.swing.JButton();
        txtPatientName = new javax.swing.JTextField();
        lblDoctorName = new javax.swing.JLabel();
        txtDoctorName = new javax.swing.JTextField();
        btnCheckPrescriptionId = new javax.swing.JButton();
        lblPatientType = new javax.swing.JLabel();
        txtPatientType = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Drug", "Dose", "Frequency", "Start Date", "End Date", "Active"
            }
        ));
        jScrollPane.setViewportView(jTable);

        lblDoctorId.setText("Doctor ID");

        txtDoctorId.setEditable(false);
        txtDoctorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorIdActionPerformed(evt);
            }
        });

        lblDate.setText("Date");

        txtDate.setEditable(false);
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        lblPatientName.setText("Patient Name");

        lblPrescriptionId.setText("Prescription ID");

        lblPatientId.setText("Patient ID");

        txtPatientId.setEditable(false);
        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });

        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        txtPatientName.setEditable(false);

        lblDoctorName.setText("Doctor Name");

        txtDoctorName.setEditable(false);

        btnCheckPrescriptionId.setText("Check");
        btnCheckPrescriptionId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckPrescriptionIdActionPerformed(evt);
            }
        });

        lblPatientType.setText("Patient Type");

        txtPatientType.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonExit)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrescriptionId)
                            .addComponent(lblPatientId))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPrescriptionId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btnCheckPrescriptionId))
                            .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 338, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPatientType)
                                .addGap(24, 24, 24)
                                .addComponent(txtPatientType, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblPatientName)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblDate)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblDoctorId)
                        .addGap(50, 50, 50)
                        .addComponent(txtDoctorId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDoctorName)
                        .addGap(18, 18, 18)
                        .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrescriptionId)
                    .addComponent(txtPrescriptionId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheckPrescriptionId))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientName)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientType)
                    .addComponent(txtPatientType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPatientId))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoctorName)
                    .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoctorId)
                    .addComponent(txtDoctorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDoctorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorIdActionPerformed

    }//GEN-LAST:event_txtDoctorIdActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void btnCheckPrescriptionIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckPrescriptionIdActionPerformed

        int id = Integer.parseInt(txtPrescriptionId.getText());
        txtPrescriptionId.setText("Searching...");
//        System.out.println(id);

        try {
            Prescription p = GetPrescriptionDetails.getPrescription(id);
            txtPrescriptionId.setText(String.valueOf(p.getIdPrescription()));
            txtDoctorName.setText(p.getNameDoctor());
            txtPatientName.setText(p.getNamePatient());
            txtPatientType.setText(String.valueOf(p.getTypePatient()));
            txtPatientId.setText(String.valueOf(p.getIdPatient()));
            txtDoctorId.setText(String.valueOf(p.getIdDoctor()));
            //TODO: DATE in DB
//            txtDate.setText(p.getDate()); 

            //TODO: Add txt to jTable
//            txtDrug.setText(p.getNameDrug());
//            txtDose.setText(p.getDose());
//            txtFrequency.setText(p.getFrequency());
//            txtDateStart.setText(p.getDateStart());
//            txtDateEnd.setText(p.getDateEnd());
//            txtActive.setText(p.getActive());

//            System.out.println(p);

        }
        catch (Exception e) {
            txtPrescriptionId.setText("Not found!");
            System.out.println(e);
        }
    }//GEN-LAST:event_btnCheckPrescriptionIdActionPerformed

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
            java.util.logging.Logger.getLogger(ViewPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrescription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckPrescriptionId;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDoctorId;
    private javax.swing.JLabel lblDoctorName;
    private javax.swing.JLabel lblPatientId;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblPatientType;
    private javax.swing.JLabel lblPrescriptionId;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDoctorId;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPatientType;
    private javax.swing.JTextField txtPrescriptionId;
    // End of variables declaration//GEN-END:variables
}
