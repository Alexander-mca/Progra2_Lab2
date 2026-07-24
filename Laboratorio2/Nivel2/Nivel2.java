import java.util.Random;

public class Nivel2 {
    public static void main(String[] args){
        Random rand = new Random();

        System.out.println("Ejercicios Nivel 2");

        //#1
        System.out.println("\n--------------Ejercicio #1----------------");
        int[] arreglo1 = new int[3];
        for (int i = 0;i < arreglo1.length; i++){
            arreglo1[i] = rand.nextInt(1000);
            System.out.println("arreglo["+i+"] = " + arreglo1[i]);
        }

        //#2
        System.out.println("\n--------------Ejercicio #2----------------");
        int[] arreglo2 = new int[5];
        for (int i = 0;i < arreglo2.length; i++){
            arreglo2[i] = rand.nextInt(1000);
            System.out.println("arreglo["+i+"] = " + arreglo2[i]);
        }

        //#3
        System.out.println("\n--------------Ejercicio #3----------------");
        int suma = 0;
        for (int i = 0; i < arreglo2.length; i++) {
            suma += arreglo2[i];
        }
        System.out.println("El total de la suma del arreglo es de "+ suma);

        //#4
        System.out.println("\n--------------Ejercicio #4----------------");
        int mayor = Mayor(arreglo1);
        System.out.println("El numero mayor del arreglo es " + mayor);

        //#5
        System.out.println("\n--------------Ejercicio #5----------------");
        int menor = Menor(arreglo1);
        System.out.println("El numero menor del arreglo es "+menor);

        //#6
        System.out.println("\n--------------Ejercicio #6----------------");
        int cont = Count(arreglo2);
        System.out.println("El arreglo tiene "+cont+" elementos");

        //#7
        System.out.println("\n--------------Ejercicio #7----------------");
        System.out.println("Elementos del arreglo");
        ImprimirArreglo(arreglo2);

        //#8
        System.out.println("\n--------------Ejercicio #8----------------");
        String[] nombres = {"Rodrigo","Eduardo","Alvaro","Lucia","Mariela"};
        ImprimirArreglo(nombres);

        //#9
        System.out.println("\n--------------Ejercicio #9----------------");
        System.out.println("arreglo[0] ="+ nombres[0]);

        //#10
        System.out.println("\n--------------Ejercicio #10----------------");
        System.out.println("El ultimo elemento del arreglo es "+nombres[nombres.length-1]);

        //#11
        System.out.println("\n--------------Ejercicio #11----------------");
        ImprimirHola();

        //#12
        System.out.println("\n--------------Ejercicio #12----------------");
        ImprimirNumero(mayor);

        //#13
        System.out.println("\n--------------Ejercicio #13----------------");
        suma = Suma(mayor, menor);
        System.out.println(mayor+" + "+menor+" = "+suma);
        
        //#14
        System.out.println("\n--------------Ejercicio #14----------------");
        int resta = Resta(mayor, menor);
        System.out.println(mayor +" - "+menor+" = "+resta);

        //#15
        System.out.println("\n--------------Ejercicio #15----------------");
        int mult = Multiplicar(mayor, menor);
        System.out.println(mayor +" * "+menor+" = "+mult);

        //#16
        System.out.println("\n--------------Ejercicio #16----------------");
        int div = Dividir(mayor, menor);
        System.out.println(mayor +" / "+menor+" = "+div);

        //#17
        System.out.println("\n--------------Ejercicio #17----------------");
        int num1 = Retornar();
        System.out.println("Numero retornado: "+ num1);

        //#18
        System.out.println("\n--------------Ejercicio #18----------------");
        suma = Suma(mayor, menor);
        System.out.println(mayor+" + "+menor+" = "+suma);

        //#19
        System.out.println("\n--------------Ejercicio #19----------------");
        mayor = Mayor(rand.nextInt(1000),rand.nextInt(1000));
        System.out.println("El numero mayor es "+ mayor);

        //#20
        System.out.println("\n--------------Ejercicio #20----------------");
        num1 = rand.nextInt(1000);
        System.out.println("El numero "+num1+" es " +(esPar(num1)?" Par ":" Impar "));

        //#21
        System.out.println("\n--------------Ejercicio #21----------------");
        ImprimirTexto("El dia estaba soleado.");

        //#22
        System.out.println("\n--------------Ejercicio #22----------------");
        Saludo("Vivian");

        //#23
        System.out.println("\n--------------Ejercicio #23----------------");
        ImprimirNumeros();

        //#24
        System.out.println("\n--------------Ejercicio #24----------------");
        ImprimirPares();

        //#25
        System.out.println("\n--------------Ejercicio #25----------------");
        num1 = rand.nextInt(1000);
        System.out.println("El doble del numero "+ num1 + " es "+Doble(num1));

        //#26
        System.out.println("\n--------------Ejercicio #26----------------");
        num1 = rand.nextInt(1000);
        System.out.println("El doble del numero "+ num1 + " es "+Triple(num1));

        //#27
        System.out.println("\n--------------Ejercicio #27----------------");
        toMayus("El dia de hoy esta soleado.");

        //#28
        System.out.println("\n--------------Ejercicio #28----------------");
        num1 = Contar_Caracteres("El dia de hoy estuvo lluvioso");
        System.out.println("El numero de caracteres del texto son "+ num1);

        //#29
        System.out.println("\n--------------Ejercicio #29----------------");
        num1 = rand.nextInt(1000);
        int num2 = num1;
        System.out.println("El numero "+num1+" y "+num2 +(Comparar(num1,num2)?" ":" no ")+"son iguales");

        //#30
        System.out.println("\n--------------Ejercicio #30----------------");
        num1 = rand.nextInt(1000);
        System.out.println("El numero "+ num1+(esPositivo(num1)?" es positivo.":" es negativo"));
    }

    public static boolean esPositivo(int a){
        return a>0;
    }
    public static boolean Comparar(int a, int b){
        return a==b;
    }

    public static int Contar_Caracteres(String texto){
        return texto.length();
    }
    public static String toMayus(String texto){
        return texto.toUpperCase();
    }
    public static int Triple(int a){
        return a*3;
    }

    public static int Doble(int a){
        return a*2;
    }
    public static void ImprimirPares(){
        for (int i = 1; i < 21; i++) {
            if(i%2==0){
                System.out.print(i);
                if(i!=20){
                    System.out.print(",");
                }
            }
            
        }
    }
    public static void ImprimirNumeros(){
        for (int i = 1; i <= 15; i++) {
            System.out.print(i);
            if(i!=15){
                System.out.print(",");
            }
        }
    }
    public static void Saludo(String nombre){
        System.out.println("Hola "+ nombre);
    }
    public static void ImprimirTexto(String text){
        System.out.println(text);
    }
    public static boolean esPar(int a){
        return (a%2==0);
    }
    public static int Mayor(int a, int b){
        return (a>b)? a : b;
    }

    public static int Retornar(){
        return 327;
    }
    public static int Dividir(int a, int b){
        if(b==0){
            System.out.println("El divisor no puede ser 0. Error.");
            return 0;
        }
        return a/b;
    }
    public static int Multiplicar(int a, int b){
        return a*b;
    }
    public static int Resta(int a, int b){
        return a - b;

    }
    private static int Suma(int a, int b){
        return a+b;
    }

    private static void ImprimirNumero(int numero){
        System.out.println(numero);
    }

    private static void ImprimirHola(){
        System.out.println("Hola");
    }

    private static void ImprimirArreglo(int[] arr){
        for (Object elem : arr) {
            System.out.println(elem);
        }
    }
    private static void ImprimirArreglo(String[] arr){
        for (Object elem : arr) {
            System.out.println(elem);
        }
    }
    public static int Count(int[] arr){
        int cont = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                break;
            }
            cont++;
        }
        return cont;
    }
    public static int Mayor(int[] arr){
        int mayor = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > mayor){
                mayor = arr[i];
            }
        }
        return mayor;
    }
    public static int Menor(int[] arr){
        int menor = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < menor){
                menor = arr[i];
            }
        }
        return menor;
    }
}
