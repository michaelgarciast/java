//Ejercicio 02
//Efectuar un programa en java, que permita ingresar una pila de n elementos,
//ingresar n por teclado. Luego imprimir la suma de todos sus elementos.

//Librerias
import java.util.Scanner;
import java.util.Stack;

public class TallerDosEjercicio02 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            Stack<Integer> pila = new Stack<>();

            // Pedir la cantidad de elementos de la pila
            System.out.print("Ingrese la cantidad de elementos de la pila: ");
            int n = sc.nextInt();

            // Pedir los elementos y agregarlos a la pila
            for(int i = 0; i < n; i++){
                System.out.print("Ingresar el elemento " + (i+1) + " de la pila: ");
                int elemento = sc.nextInt();
                pila.push(elemento);
            }

            // Calcular la suma de los elementos de la pila
            int suma = 0;
            while(!pila.isEmpty()){
                suma += pila.pop();
            }
             // Mostrar la suma de los elementos de la pila
            System.out.println("La suma de los elementos de la pila es: " + suma);
        }
    }
}