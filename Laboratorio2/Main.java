public class Main {
    public static void main(String[] args){
        //#2
        Persona persona1 = new Persona();

        //#3
        persona1.setNombre("Vivian");

        //#4
        System.out.println("\n--------------Ejercicio #4----------------");
        persona1.ImprimirNombre();

        //#5
        persona1.setEdad(23);

        //#6
        System.out.println("\n--------------Ejercicio #6----------------");
        persona1.ImprimirDatos();

        //#9
        Persona persona2 = new Persona("Griselda", 25);
        Persona persona3 = new Persona("Eduardo", 33);
        Persona persona4 = new Persona("Wilson", 44);

        //#10
        System.out.println("\n--------------Ejercicio #10----------------");
        persona1.ImprimirDatos();
        persona2.ImprimirDatos();
        persona3.ImprimirDatos();
        persona4.ImprimirDatos();

        //#12
        Auto auto1 = new Auto("Kia");

        //#13
        System.out.println("\n--------------Ejercicio #13----------------");
        System.out.println("Auto 1. Marca: "+auto1.getMarca());

        //#14
        System.out.println("\n--------------Ejercicio #14----------------");
        auto1.setVelocidad(33);
        System.out.println("Auto 1. Marca: "+auto1.getMarca()+", Velocidad: "+auto1.getVelocidad());

        //#15
        System.out.println("\n--------------Ejercicio #15----------------");
        auto1.Acelerar(23);
        System.out.println("Auto 1. Marca: "+auto1.getMarca()+", Velocidad: "+auto1.getVelocidad());

        //#16
        System.out.println("\n--------------Ejercicio #16----------------");
        auto1.Frenar(15);
        System.out.println("Auto 1. Marca: "+auto1.getMarca()+", Velocidad: "+auto1.getVelocidad());

        //#17
        System.out.println("\n--------------Ejercicio #17----------------");
        System.out.println("Auto 1. Marca: "+auto1.getMarca()+", Velocidad: "+auto1.getVelocidad());

        //#18
        System.out.println("\n--------------Ejercicio #18----------------");
        Auto auto2 = new Auto("Mitsubishi", 40);
        System.out.println("Auto 1. Marca: "+auto1.getMarca()+", Velocidad: "+auto1.getVelocidad());
        System.out.println("Auto 2. Marca: "+auto2.getMarca()+", Velocidad: "+auto2.getVelocidad());
        if(auto2.equals(auto1)){
            System.out.println("Es el mismo auto. Auto 1 y auto 2 son el mismo");
        }else{
            System.out.println("El auto 1 y auto 2 no son el mismo auto");
        }


    }    
}
