/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.ic.michelarvizu.gestordepuestos;

import java.util.ArrayList;

/**
 *
 * @author arviz
 */
public class Control {
    private ArrayList<Puesto> puestos;

    public Control(){
        crearPuestos(8);
    }

    public void crearPuestos(int cantidad) {
        puestos = new ArrayList<Puesto>();
        for(int i = 0; i < cantidad; i++) {
            puestos.add(new Puesto("Puesto "+(i+1)));
            System.out.println(puestos.get(i).getNombre());
        }
    }

    public void asignarPuesto(Vendedor vendedor) {
        int i = 0;
        while(i < puestos.size()) {
            if(puestos.get(i).getVendedor() == null) {
                break;
            }
            i++;
        }
        if(i == puestos.size()) {
            System.out.println("No hay puestos disponibles.");
        } else {
            vendedor.setPuesto(puestos.get(i));
            puestos.get(i).setVendedor(vendedor);
            System.out.println("Vendedor " + vendedor.getNombre() + " tiene puesto " + puestos.get(i).getNombre());
        }
    }


}
