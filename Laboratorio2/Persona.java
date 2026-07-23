public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public Persona(String nombre){
        this.nombre = nombre;
    }
    public void ImprimirNombre(){
        System.out.println(this.nombre);
    }
    public void ImprimirDatos(){
        System.out.println("Nombre: "+this.nombre+", Edad: "+this.edad);
    }
    public Persona(){

    }
    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}

