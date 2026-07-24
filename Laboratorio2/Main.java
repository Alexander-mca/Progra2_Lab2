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

        //#19
        System.out.println("\n--------------Ejercicio #19----------------");
        Producto producto1 = new Producto("Lampara");
        System.out.println("Producto 1. Nombre: "+ producto1.getNombre());

        //#20
        System.out.println("\n--------------Ejercicio #20----------------");
        producto1.setPrecio(23.5);
        System.out.println("Producto 1. Nombre: "+ producto1.getNombre()+", Precio: "+producto1.getPrecio());

        //#21
        System.out.println("\n--------------Ejercicio #21----------------");
        producto1.setPrecio(33.5);
        producto1.setNombre("Cubo Rubic");
        System.out.println("Producto 1. Nombre: "+ producto1.getNombre()+", Precio: "+producto1.getPrecio());

        //#22
        Producto producto2 = new Producto("Manzana",10);
        Producto producto3 = new Producto("Tomate", 7);
        Producto producto4 = new Producto("Cinta Adhesiva", 12.5);

        //#23
        System.out.println("\n--------------Ejercicio #23----------------");
        producto1.MostrarProducto();
        producto2.MostrarProducto();
        producto3.MostrarProducto();
        producto4.MostrarProducto();

        //#24
        System.out.println("\n--------------Ejercicio #24----------------");
        Cuenta cuenta1 = new Cuenta(100);
        cuenta1.MostrarSaldo();

        //#25
        System.out.println("\n--------------Ejercicio #25----------------");
        cuenta1.Depositar(250);
        cuenta1.MostrarSaldo();

        //#26
        System.out.println("\n--------------Ejercicio #26----------------");
        cuenta1.Retirar(200);
        cuenta1.MostrarSaldo();

        //#27
        System.out.println("\n--------------Ejercicio #27----------------");
        cuenta1.MostrarSaldo();

        //#28
        System.out.println("\n--------------Ejercicio #28----------------");
        cuenta1.Retirar(350);
        cuenta1.MostrarSaldo();

        //#29
        System.out.println("\n--------------Ejercicio #29----------------");
        Cuenta cuenta2 = new Cuenta(1500);
        Cuenta cuenta3 = new Cuenta(13000);
        Cuenta cuenta4 = new Cuenta(500);
        System.out.println("\n--------------Cuenta 1----------------");
        cuenta1.MostrarSaldo();
        System.out.println("\n--------------Cuenta 2----------------");
        cuenta2.MostrarSaldo();
        System.out.println("\n--------------Cuenta 3----------------");
        cuenta3.MostrarSaldo();
        System.out.println("\n--------------Cuenta 4----------------");
        cuenta4.MostrarSaldo();


    }    
}
