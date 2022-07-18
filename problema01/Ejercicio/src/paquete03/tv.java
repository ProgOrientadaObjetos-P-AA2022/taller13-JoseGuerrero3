/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import java.util.ArrayList;
import paquete01.Televisor;

/**
 *
 * @author SALA I
 */
public class tv {

    private double totalPrecio;
    private double tvCaro;
    private String marcasVendidas;
    private ArrayList<Televisor> listadotv = new ArrayList<>();

    public tv(ArrayList<tv> a) {

        ArrayList<tv> tv = a;
        tvCaro = 0;

    }

    public void establecerListatv(Televisor a) {

        listadotv = a;
    }

    public double totalPrecio(Televisor t) {
        double s = 0;
        for (int i = 0; i < t.size(); i++) {
            s = s + t.get(i).obtenerPrecio();

        }
        totalPrecio = s;
        return 0;
    }

    public double obtenerPrecioTotal() {
        return totalPrecio;
    }

    public void establecerMarcasVendidas() {
        String s = "";
        for (int  = 0; i < televisores.size(); i++ ){
         s = String.format("%s%s\n", s, tv.get().obtenerMarca());
         }
            
       marcasVendidas = s;
       
        
    }

    public String obtenerMarcasVendidas() {
        return marcasVendidas;
    }
    
    public

}
