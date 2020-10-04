/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emilianosantoandremicroproyecto;

import javax.swing.*;

/**
 *
 * @author emi
 */
public class EmilianoSantoandreMicroProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Bienvenido. Calcule la Cuota de su seguro");
        int modelo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año del automóvil"));
        String marca = JOptionPane.showInputDialog("Ingrese la marca del automóvil").toUpperCase();
        String[] alta = {"BMW", "AUDI", "VOLVO"};
        int valorSeguro = 0;

        int valorCotizacionAnio = cotizarA(modelo);
        valorSeguro += valorCotizacionAnio;
        boolean auto = altaGama(alta, marca);

        if (auto == true) {
            valorSeguro += 1800;
        } else {
            valorSeguro += 890;
        }

        JOptionPane.showMessageDialog(null, "Auto Marca: " + marca + "\nAño: " + modelo + "\nSu cuota final es de: " + valorSeguro);

    }

    public static int cotizarA(int anioIngresado) {

        int valorRetorno = 0;

        if (anioIngresado >= 1990 && anioIngresado <= 1999) {
            valorRetorno = 480;
        } else if (anioIngresado >= 2000 && anioIngresado <= 2010) {
            valorRetorno = 780;
        } else if (anioIngresado >= 2011 && anioIngresado <= 2016) {
            valorRetorno = 950;
        } else if (anioIngresado >= 2017 && anioIngresado <= 2020) {
            valorRetorno = 1200;
        } else {
            valorRetorno = 350;
        }

        return valorRetorno;

    }

    // funcion boolean para alta gama
    public static boolean altaGama(String alta[], String marcaM) {

        for (String nombre : alta) {
            if (nombre.equals(marcaM)) {
                return true;
            }
        }

        return false;
    }

}
