import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc =   new Scanner(System.in);
        System.out.println("Ingrese un número entero  -> ");
        var numero = sc.nextInt();

        System.out.println("El doble de " + numero + " es " + (numero*2));
        System.out.println("El triple de " + numero + " es " + (numero*3));
        System.out.println(numeroRespuesta(numero));
    }
    public static int numeroDoble(int numero){
        return (numero*2);
    }
    public static int numeroTriple(int numero){
        return (numero*3);

    }
    public static String numeroRespuesta(int numero){
        return "El doble de " + numero + " es " + (numero*2)+
        "\n  El triple de " + numero + " es " + (numero*3);
    }
}

