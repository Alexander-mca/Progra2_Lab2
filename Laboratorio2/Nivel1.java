import java.util.Scanner;

public class Nivel1{

    public static void main(String[] args){
        //Ejercio 1
        System.out.println("Hola mundo");

        //Ejercicio 2
        System.out.println("Denis Alexander Morales Catalan");

        //Ejercicio 3
        int var1 = 4;
        System.out.println("Variable int: "+String.valueOf(var1));

        //Ejercicio 4
        double var2 = 23.5;
        System.out.println("Variable double:"+String.valueOf(var2));

        //Ejercicio 5
        String ciudad = "Ciudad de Guatemala";
        System.out.println("Tu ciudad: "+ciudad);

        //Ejercicio 6
        double suma = (double)var1 + var2;
        System.out.println("Suma de dos numeros = "+ String.valueOf(suma));

        //Ejercicio 7
        double resta = (double)var1 - var2;
        System.out.println("Resta = "+String.valueOf(resta));

        //Ejercicio 8
        double mult = (double)var1*var2;
        System.out.println("Multiplicacion: "+String.valueOf(mult));

        //Ejercio 9
        double division = var2/(double)var1;
        System.out.println("Division = "+ String.valueOf(division));

        //Ejercicio 10
        double operacion = (23*7/(47-7))*100 + 123;
        System.out.println("Resultado de operaciones: "+String.valueOf(operacion));

        //#11
        int a = 45,b=23;
        if(a>b){
            System.out.println("El numero "+String.valueOf(a)+" es mayor que "+ String.valueOf(b));
        }else{
             System.out.println("El numero "+String.valueOf(b)+" es mayor que "+ String.valueOf(a));
        }

        //#12
        int num1 = -23;
        if(num1<0){
            System.out.println("El numero "+String.valueOf(num1)+" es negativo");
        }else{
            System.out.println("El numero "+String.valueOf(num1)+" es positivo");
        }

        //#13
        int num_par = 78;
        if(num_par%2==0){
            System.out.println("El numero "+String.valueOf(num_par)+" es par.");
        }else{
            System.out.println("El numero "+String.valueOf(num_par)+" es impar.");
        }

        //#14
        int var3 = 45;
        System.out.println("Valor acutal variable:"+String.valueOf(var3));
        var3 = 78;
        System.out.println("Valor acutal variable:"+String.valueOf(var3));

        //#15
        String text1 = "La union de los conjuntos ";
        String text2 = "a y b lleva una subdivision.";
        String concat = text1 + text2;
        System.out.println("Concatenacion texto 1 y 2:"+concat);

        //#16
        int longitud_text = concat.length();
        System.out.println("La longitud del texto concatenado es de "+String.valueOf(longitud_text));

        //#17
        String mayus = concat.toUpperCase();
        System.out.println("Texto en mayusculas: "+mayus);

        //#18
        String minus = concat.toLowerCase();
        System.out.println("Texto en minusculas: "+minus);

        //#19
        if(text1.equals(text2)){
            System.out.println("Texto 1: '"+text1 + "' es igual que el Texto 2: '\""+text2+"'");
        }else{
            System.out.println("Texto 1: "+text1 + " NO es igual que el Texto 2: "+text2);
        }

        //#20
        System.out.println("El primer caracter del texto es "+text1.charAt(0));
        
        //#21
        String numeros = "Numeros del 1 al 10: ";
        for (int i = 0; i < 10; i++) {
                numeros += String.valueOf(i+1);
                if(i<9){
                    numeros += ",";
                }
        }
        System.out.println(numeros);

        //#22
        numeros = "Numeros del 10 al 1: ";
        for (int i = 10; i > 0; i--) {
                numeros += String.valueOf(i);
                if(i>2){
                    numeros += ",";
                }
        }
        System.out.println(numeros);

        //#23
        numeros = "Numeros pares del 1 al 20: ";
        for (int i = 1; i <= 20; i++) {
            if(i%2==0){
                numeros+=i;
                if(i!=20){
                    numeros+=",";
                }
            }
        }
        System.out.println(numeros);

        //#24
        numeros = "Numeros impares del 1 al 20: ";
        for (int i = 1; i <= 20; i++) {
            if(i%2!=0){
                numeros+=i;
                if(i!=19){
                    numeros+=",";
                }
            }
        }
        System.out.println(numeros);

        //#25
        suma = 0;
        for (int i = 1; i <= 5; i++) {
            suma += i;
        }
        System.out.println("La suma de los numeros es de: "+String.valueOf(suma));

        //#26
        String mensaje = "";
        int cont = 1;
        while(cont<=5){
            mensaje += String.valueOf(cont);
            if(cont!=5){
                mensaje += ",";
            }
            cont++;
        }
        System.out.println(mensaje);

        //#27
        for (int i = 0; i <5; i++) {
            System.out.println("Mensaje Repetido");
        }

        //#28
        for (int i = 1; i <= 5; i++) {
            System.out.println("---------Tabla del "+String.valueOf(i)+"----------");
            for (int j = 1; j <=10; j++) {
                mult = i*j;
                System.out.println(String.valueOf(i)+"x"+String.valueOf(j)+"="+String.valueOf(mult));
            }
        }

        //#29
        for (int i = 1; i <= 5; i++) {
            double potencia = Math.pow(i, 2);
            System.out.println(String.valueOf(i)+"^2 = "+String.valueOf(potencia));
        }
        //#30

        for (int i = 1; i <= 5; i++) {
            double cubo = Math.pow(i, 3);
            System.out.println(String.valueOf(i)+"^3 = "+String.valueOf(cubo));
        }
        //#31
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero:");
        int numero_pedido = pedirNumero(scan);
        System.out.println("Su numero es "+String.valueOf(numero_pedido));

        //#32
        System.out.println("Por favor ingrese el primer numero: ");
        num1 = pedirNumero(scan);
        System.out.println("Por favor ingrese el segundo numero:");
        int num2 = pedirNumero(scan);
        System.out.println("La suma de los numeros es " + String.valueOf(Suma(num1,num2)));


        scan.close();
    }
    public static int Suma(int a, int b){
        int suma = 0;
        suma = a + b;
        return suma;
    }
    public static int pedirNumero(Scanner scan){
        int numero = 0;
        while(true){
            try {
                numero = Integer.parseInt(scan.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("El numero ingresado no es Valido. Intente de nuevo:");
            }
        }
        
        return numero;
    }


}