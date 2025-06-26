
package view;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Total extends javax.swing.JPanel {


    public Total() {
        initComponents();
        
        // Añadir código personalizado después de initComponents
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Back.png")));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNumComOca = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        txtValComMay = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtValComMin = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtValComOca = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPorComMay = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPorComMin = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPorComOca = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNumTotCom = new javax.swing.JTextField();
        txtNumComMay = new javax.swing.JTextField();
        txtNumComMin = new javax.swing.JTextField();

        txtNumComOca.setEditable(false);

        btnVolver.setText("Volver");

        txtValComMay.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Salida totales");

        txtValComMin.setEditable(false);

        jLabel11.setText("Mayoristas");

        txtValComOca.setEditable(false);

        jLabel12.setText("Minoristas");

        txtPorComMay.setEditable(false);

        jLabel13.setText("Ocacioinales");

        txtPorComMin.setEditable(false);

        jLabel14.setText("No. compras");

        txtPorComOca.setEditable(false);

        jLabel15.setText("Valor compras");

        jLabel17.setText("No. total compras");

        jLabel16.setText("% compras");

        txtNumTotCom.setEditable(false);

        txtNumComMay.setEditable(false);

        txtNumComMin.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnVolver))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(txtNumComMay, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNumComMin, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNumComOca, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(txtValComMay, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtValComMin, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtValComOca, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumTotCom, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPorComMay, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPorComMin, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPorComOca, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel11))
                    .addComponent(jLabel13))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel14))
                    .addComponent(txtNumComMay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumComMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumComOca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel15))
                    .addComponent(txtValComMay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValComMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValComOca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel16))
                    .addComponent(txtPorComMay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPorComMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPorComOca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtNumTotCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JTextField txtNumComMay;
    private javax.swing.JTextField txtNumComMin;
    private javax.swing.JTextField txtNumComOca;
    private javax.swing.JTextField txtNumTotCom;
    private javax.swing.JTextField txtPorComMay;
    private javax.swing.JTextField txtPorComMin;
    private javax.swing.JTextField txtPorComOca;
    private javax.swing.JTextField txtValComMay;
    private javax.swing.JTextField txtValComMin;
    private javax.swing.JTextField txtValComOca;
    // End of variables declaration//GEN-END:variables

    //Métodos getters y Setters
    public JButton getBtnVolver() {
        return btnVolver;
    }

    public void setBtnVolver(JButton btnVolver) {
        this.btnVolver = btnVolver;
    }

    public JTextField getTxtNumComMay() {
        return txtNumComMay;
    }

    public void setTxtNumComMay(JTextField txtNumComMay) {
        this.txtNumComMay = txtNumComMay;
    }

    public JTextField getTxtNumComMin() {
        return txtNumComMin;
    }

    public void setTxtNumComMin(JTextField txtNumComMin) {
        this.txtNumComMin = txtNumComMin;
    }

    public JTextField getTxtNumComOca() {
        return txtNumComOca;
    }

    public void setTxtNumComOca(JTextField txtNumComOca) {
        this.txtNumComOca = txtNumComOca;
    }

    public JTextField getTxtNumTotCom() {
        return txtNumTotCom;
    }

    public void setTxtNumTotCom(JTextField txtNumTotCom) {
        this.txtNumTotCom = txtNumTotCom;
    }

    public JTextField getTxtPorComMay() {
        return txtPorComMay;
    }

    public void setTxtPorComMay(JTextField txtPorComMay) {
        this.txtPorComMay = txtPorComMay;
    }

    public JTextField getTxtPorComMin() {
        return txtPorComMin;
    }

    public void setTxtPorComMin(JTextField txtPorComMin) {
        this.txtPorComMin = txtPorComMin;
    }

    public JTextField getTxtPorComOca() {
        return txtPorComOca;
    }

    public void setTxtPorComOca(JTextField txtPorComOca) {
        this.txtPorComOca = txtPorComOca;
    }

    public JTextField getTxtValComMay() {
        return txtValComMay;
    }

    public void setTxtValComMay(JTextField txtValComMay) {
        this.txtValComMay = txtValComMay;
    }

    public JTextField getTxtValComMin() {
        return txtValComMin;
    }

    public void setTxtValComMin(JTextField txtValComMin) {
        this.txtValComMin = txtValComMin;
    }

    public JTextField getTxtValComOca() {
        return txtValComOca;
    }

    public void setTxtValComOca(JTextField txtValComOca) {
        this.txtValComOca = txtValComOca;
    }

    
}
