

package app;

import controller.ControladorBelleza;
import model.Belleza;
import model.Validar;
import view.DatoEntrada;
import view.Parcial;
import view.Total;
import view.VistaBelleza;

public class Principal {

    public static void main(String[] args) {
        
        Belleza bel               = new Belleza();
        VistaBelleza visBel       = new VistaBelleza();
        DatoEntrada datEnt        = new DatoEntrada();
        Parcial par               = new Parcial();
        Total tot                 = new Total();
        Validar  val              = new Validar();
        ControladorBelleza conBel = new ControladorBelleza(bel, visBel, datEnt, par, tot, val);
        conBel.titulo();
        visBel.setVisible(true);
        visBel.getBtnCalcular().setEnabled(false);
        visBel.getBtnTotalizar().setEnabled(false);
        conBel.showPane(datEnt);
        
    }
}
