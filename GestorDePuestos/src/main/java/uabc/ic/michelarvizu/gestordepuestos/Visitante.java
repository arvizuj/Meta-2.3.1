/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.ic.michelarvizu.gestordepuestos;


/**
 *
 * @author arviz
 */
public class Visitante {
    private int comprasRegistradas;
    private int visitasRegistradas;
    private Puesto puestoPreferido;

    public Visitante() {
        comprasRegistradas = 0;
        visitasRegistradas = 1;
    }

    public int getComprasRegistradas() {
        return comprasRegistradas;
    }

    public void setComprasRegistradas(int comprasRegistradas) {
        this.comprasRegistradas = comprasRegistradas;
    }

    public Puesto getPuestoPreferido() {
        return puestoPreferido;
    }

    public void setPuestoPreferido(Puesto puestoPreferido) {
        this.puestoPreferido = puestoPreferido;
    }

    public int getVisitasRegistradas() {
        return visitasRegistradas;
    }

    public void setVisitasRegistradas(int visitasRegistradas) {
        this.visitasRegistradas = visitasRegistradas;
    }

    
}
