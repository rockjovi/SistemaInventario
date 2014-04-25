/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemainventario;

/**
 *
 * @author Nicolás
 */
public class SistemaInventario {

   private int codigo;
   private String nombre;
   private String factura;
   private String fecha;
   private String proveedor;

    public SistemaInventario() {
    }

    public SistemaInventario(int codigo, String nombre, String factura, String fecha, String proveedor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.factura = factura;
        this.fecha = fecha;
        this.proveedor = proveedor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
   
   
    
}
