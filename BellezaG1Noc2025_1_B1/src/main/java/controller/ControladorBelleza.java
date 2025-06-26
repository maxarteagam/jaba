package controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;
import model.Belleza;
import model.Validar;
import view.DatoEntrada;
import view.Parcial;
import view.Total;
import view.VistaBelleza;

public class ControladorBelleza implements ActionListener {

    //Atributos de la clase
    private final Belleza bel;
    private final VistaBelleza visBel;
    private final DatoEntrada datEnt;
    private final Parcial par;
    private final Total tot;
    private final Validar val;

    //Variables auxiliares
    float porDes, valDes, valPag, valComMay = 0, valComMin = 0, valComOca = 0, valTotCom;
    float porComMay, porComMin, porComOca;
    int numComMay, numComMin, numComOca, numTotCom;

    //Formatos de salidas
    DecimalFormat f1 = new DecimalFormat("###,###,###.##");
    DecimalFormat f2 = new DecimalFormat("#########.##%");
    DecimalFormat f3 = new DecimalFormat("$###,###,###.##");

    //Asignar cabecera y valores a la tabla tblparcial del panel Parcial
    String cabecera[] = {"Ident.", "Apellidos", "Nombres", "Val. compra", "% Desc.", "Val. Desc.", "Val. Pagar"};
    String datos[][] = {};
    DefaultTableModel modelo = new DefaultTableModel(datos, cabecera);

    //Constructor
    public ControladorBelleza(Belleza bel, VistaBelleza visBel, DatoEntrada datEnt, Parcial par, Total tot, Validar val) {
        this.bel = bel;
        this.visBel = visBel;
        this.datEnt = datEnt;
        this.par = par;
        this.tot = tot;
        this.val = val;

        //Adición de los botones
        this.visBel.getBtnValidar().addActionListener(e -> {
            btnValidar();
        });

        this.visBel.getBtnCalcular().addActionListener(e -> {
            btnCalcular();
        });

        this.visBel.getBtnTotalizar().addActionListener(e -> {
            btnTotalizar();
        });

        this.visBel.getBtnNuevo().addActionListener(e -> {
            btnNuevo();
        });

        this.visBel.getBtnSalir().addActionListener(e -> {
            System.exit(0);
        });
        
        this.par.getBtnVolver().addActionListener(e ->{
            btnVolver();
        });
        
        this.tot.getBtnVolver().addActionListener(e ->{
            btnVolver();
        });
        

        //Adicionar el cobobox cmbTipCli
        this.datEnt.getCmbTipCli().addActionListener(this);

        //Asignar el modelo a la tabla
        par.getTblParcial().setModel(modelo);
    }

    public void btnValidar() {
        if (val.validarNumeroEnteroPositivo(datEnt.getTxtIdeCli().getText())) {
            bel.setIdeCli(datEnt.getTxtIdeCli().getText());
            if (val.validarApellido(datEnt.getTxtApeCli().getText())) {
                bel.setApeCli(datEnt.getTxtApeCli().getText());
                if (val.validarNombre(datEnt.getTxtNomCli().getText())) {
                    bel.setNomCli(datEnt.getTxtNomCli().getText());

                    switch (datEnt.getCmbTipCli().getSelectedIndex()) {
                        case 0 -> {
                            bel.setTipCli(1);
                        }
                        case 1 -> {
                            bel.setTipCli(2);
                        }
                        case 2 -> {
                            bel.setTipCli(3);
                        }
                    }

                    if (val.validarNumeroEnteroPositivo(datEnt.getTxtAntCli().getText())) {
                        bel.setAntCli(Integer.parseInt(datEnt.getTxtAntCli().getText()));
                        if (val.validarNumeroRealPositivo(datEnt.getTxtValCom().getText())) {
                            bel.setValCom(Float.parseFloat(datEnt.getTxtValCom().getText()));
                            visBel.getBtnCalcular().setEnabled(true);
                            visBel.getBtnTotalizar().setEnabled(true);
                            visBel.getBtnValidar().setEnabled(false);
                        } else {
                            error(datEnt.getTxtValCom(), "Error en el campo valor de la compra, su contenido no es válido");
                        }
                    } else {
                        error(datEnt.getTxtAntCli(), "Error en el campo antigüedad del cliente, su contenido no es válido");
                    }

                } else {
                    error(datEnt.getTxtNomCli(), "Error en el campo nombre del cliente, su contenido no es válido");
                }
            } else {
                error(datEnt.getTxtApeCli(), "Error en el campo apellido del cliente, su contenido no es válido");
            }
        } else {
            error(datEnt.getTxtIdeCli(), "Error en el campo identificación del cliente, su contenido no es válido");
        }
        
        
    }

    public void btnCalcular() {
        porDes = bel.determinarPorcentaje(bel.getTipCli(), bel.getAntCli(), bel.getValCom());
        valDes = bel.valorDescuento(bel.getValCom(), porDes);
        valPag = bel.valorPagar(bel.getValCom(), valDes);

        switch (bel.getTipCli()) {
            case 1 -> {
                numComMay = bel.contar(numComMay);
                valComMay = bel.acumular(valComMay, valPag);
            }

            case 2 -> {
                numComMin = bel.contar(numComMin);
                valComMin = bel.acumular(valComMin, valPag);
            }
            case 3 -> {
                numComOca = bel.contar(numComOca);
                valComOca = bel.acumular(valComOca, valPag);
            }
        }

        //Datos de salida parciales
        Object contenido[] = {bel.getIdeCli(), bel.getApeCli(), bel.getNomCli(), f3.format(bel.getValCom()), f2.format(porDes / 100), f3.format(valDes), f3.format(valPag)};
        modelo.addRow(contenido);
        deshabilitarBtn();
        showPane(par);

    }

    public void btnTotalizar() {
        numTotCom = bel.sumar3Valores(numComMay, numComMin, numComOca);
        valTotCom = bel.sumar3Valores(valComMay, valComMin, valComOca);
        porComMay = bel.calcularPorcentaje(numComMay, numTotCom);
        porComMin = bel.calcularPorcentaje(numComMin, numTotCom);
        porComOca = bel.calcularPorcentaje(numComOca, numTotCom);
        tot.getTxtNumComMay().setText(String.valueOf(numComMay));
        tot.getTxtNumComMin().setText(String.valueOf(numComMin));
        tot.getTxtNumComOca().setText(String.valueOf(numComOca));
        tot.getTxtNumTotCom().setText(String.valueOf(numTotCom));
        
        tot.getTxtValComMay().setText(f3.format(valComMay));
        tot.getTxtValComMin().setText(f3.format(valComMin));
        tot.getTxtValComOca().setText(f3.format(valComOca));
        
        tot.getTxtPorComMay().setText(f2.format(porComMay/100));
        tot.getTxtPorComMin().setText(f2.format(porComMin/100));
        tot.getTxtPorComOca().setText(f2.format(porComOca/100));
        deshabilitarBtn();
        showPane(tot);
        
    }

    public void btnNuevo() {
        datEnt.getTxtIdeCli().setText("");
        datEnt.getTxtApeCli().setText("");
        datEnt.getTxtNomCli().setText("");
        datEnt.getTxtAntCli().setText("");
        datEnt.getTxtValCom().setText("");
        datEnt.getTxtIdeCli().requestFocus();
    }
    
    public void btnVolver(){
        showPane(datEnt);
        habilitarBtn();
        btnNuevo();
    }

    //Hacer visible un panel
    public void showPane(JPanel p) {
        p.setSize(800, 500);
        p.setLocation(0, 0);

        visBel.getContenedor().removeAll();
        visBel.getContenedor().add(p, BorderLayout.CENTER);
        visBel.getContenedor().revalidate();
        visBel.getContenedor().repaint();
    }

    public void titulo() {
        visBel.setTitle("Descuento por compras");
        visBel.setLocationRelativeTo(null);

        TitledBorder borDatEnt = new TitledBorder("Datos de entrada");
        datEnt.setBorder(borDatEnt);

        TitledBorder borPar = new TitledBorder("Datos de salida parciales");
        par.setBorder(borPar);

        TitledBorder borTot = new TitledBorder("Datos de salida totales");
        tot.setBorder(borTot);
    }

    //Método para mostrar un mensaje de error y limpiar el campo de texto y asignarle el focus
    public void error(javax.swing.JTextField txtName, String msg) {
        // Cambiar el color del texto del JOptionPane a rojo
        UIManager.put("OptionPane.messageForeground", new ColorUIResource(Color.RED));
        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
        txtName.setText("");
        txtName.requestFocus();

        // Resetear el color a su valor original (opcional)
        UIManager.put("OptionPane.messageForeground", new ColorUIResource(Color.BLACK));
    }
    
    public void deshabilitarBtn(){
        visBel.getBtnValidar().setEnabled(false);
        visBel.getBtnCalcular().setEnabled(false);
        visBel.getBtnTotalizar().setEnabled(false);
        visBel.getBtnNuevo().setEnabled(false);
        visBel.getBtnSalir().setEnabled(false);
    }
    
    public void habilitarBtn(){
        visBel.getBtnValidar().setEnabled(true);
        visBel.getBtnTotalizar().setEnabled(true);
        visBel.getBtnNuevo().setEnabled(true);
        visBel.getBtnSalir().setEnabled(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
