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
public class Inventario {
    private ArrayList<Producto> productos;
    
    public Inventario() {
        productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto newProducto) {
        productos.add(newProducto);
    }
    
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    
    
    
}
