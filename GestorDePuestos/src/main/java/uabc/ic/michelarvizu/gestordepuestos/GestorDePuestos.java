/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uabc.ic.michelarvizu.gestordepuestos;

/**
 *
 * @author arviz
 */
public class GestorDePuestos {    
    public static void main(String[] args) {
        Control control = new Control();
        for(int i = 0; i < 10; i++) {
            control.asignarPuesto(new Vendedor("Vendedor " + i));
        }
        
    }
}
