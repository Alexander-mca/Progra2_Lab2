public class Auto {
    private String marca;
    private int velocidad;
    public Auto(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }

    public int getVelocidad(){
        return this.velocidad;
    }
    public void Acelerar(int velocidad){
        this.velocidad += velocidad;
    }
    public void Frenar(int velocidad){
        this.velocidad -= velocidad;
    }
    public Auto(String marca, int velocidad){
        this.marca = marca;
        this.velocidad = velocidad;
    }
}
