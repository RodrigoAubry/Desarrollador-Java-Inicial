package org.example;

import java.util.HashMap;
import java.util.Map;

public class Producto {

    Map<String, String> producto = new HashMap<>();
    Map<String, String> tipoDescuento = new HashMap<>();
    private String fechaDesde;
    private String fechaHasta;


    public Producto() {
    }

    public Producto(String[] prod) {
        this.producto.put("nombre",prod[0]);
        this.producto.put("peso",prod[1]);
        this.producto.put("unidad",prod[2]);
        this.producto.put("precio",prod[3]);
        this.tipoDescuento.put("tipoDescuento",prod[4]);
        this.tipoDescuento.put("cantidad",prod[5]);
        this.tipoDescuento.put("tope",prod[6]);
        this.fechaDesde=prod[7];
        this.fechaHasta=prod[8];
    }


    public void setProducto(Map<String, String> producto) {
        this.producto = producto;
    }

    public void setTipoDescuento(Map<String, String> tipoDescuento) {
        this.tipoDescuento = tipoDescuento;
    }

    public void setFechaDesde(String fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public void setFechaHasta(String fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public Map<String, String> getProducto() {
        return producto;
    }

    public Map<String, String> getTipoDescuento() {
        return tipoDescuento;
    }

    public String getFechaDesde() {
        return fechaDesde;
    }

    public String getFechaHasta() {
        return fechaHasta;
    }
}
