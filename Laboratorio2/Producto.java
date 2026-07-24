public class Producto {
    private String nombre;
    private double precio;
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    public Producto(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void MostrarProducto(){
        System.out.println("Nombre: "+this.nombre+" Precio: Q"+this.precio);
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public double getPrecio(){
        return this.precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }



}
    
