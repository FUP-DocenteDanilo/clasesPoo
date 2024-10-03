package poo;

public class Producto {
    
    private int codigo;
    private String nombre;
    private double precio;

    public Producto(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto() {
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double calcularTotal(int cantidad){
        return precio*cantidad;
    }
    
    public void descuento(double precio){
        double descuento = precio*0.10;
        System.out.println("El producto tiene un descuento de :"+descuento);
    
    }
    
    
    
    
    
}
