package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
       
        System.out.print("Ingrese el tamaño del array: ");
        int n = entrada.nextInt();
        
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            array[i] = entrada.nextInt();
        }
        

        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
        

        System.out.print("Array invertido: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
}