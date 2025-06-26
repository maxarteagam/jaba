
package view;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class DatoEntrada extends javax.swing.JPanel {

    public DatoEntrada() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdeCli = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApeCli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNomCli = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbTipCli = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtAntCli = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtValCom = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Datos de entrada");

        jLabel2.setText("Identificación");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Nombres");

        jLabel5.setText("Tipo de cliente");

        cmbTipCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mayorista", "Minorista", "Ocasional" }));

        jLabel6.setText("Antigüedad");

        jLabel7.setText("Valor compra");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtIdeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtApeCli)
                                .addComponent(txtNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtValCom, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtAntCli, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbTipCli, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(287, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTipCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtAntCli, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(154, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbTipCli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAntCli;
    private javax.swing.JTextField txtApeCli;
    private javax.swing.JTextField txtIdeCli;
    private javax.swing.JTextField txtNomCli;
    private javax.swing.JTextField txtValCom;
    // End of variables declaration//GEN-END:variables

   
    //Métodos getters y setters
    
    public JComboBox<String> getCmbTipCli() {
        return cmbTipCli;
    }

    public void setCmbTipCli(JComboBox<String> cmbTipCli) {
        this.cmbTipCli = cmbTipCli;
    }

    public JTextField getTxtAntCli() {
        return txtAntCli;
    }

    public void setTxtAntCli(JTextField txtAntCli) {
        this.txtAntCli = txtAntCli;
    }

    public JTextField getTxtApeCli() {
        return txtApeCli;
    }

    public void setTxtApeCli(JTextField txtApeCli) {
        this.txtApeCli = txtApeCli;
    }

    public JTextField getTxtIdeCli() {
        return txtIdeCli;
    }

    public void setTxtIdeCli(JTextField txtIdeCli) {
        this.txtIdeCli = txtIdeCli;
    }

    public JTextField getTxtNomCli() {
        return txtNomCli;
    }

    public void setTxtNomCli(JTextField txtNomCli) {
        this.txtNomCli = txtNomCli;
    }

    public JTextField getTxtValCom() {
        return txtValCom;
    }

    public void setTxtValCom(JTextField txtValCom) {
        this.txtValCom = txtValCom;
    }

    
    
    
}
