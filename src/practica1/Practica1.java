/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de x (Porfavor escriba 1 si no no jala): ");
        int x = scanner.nextInt();

        System.out.print("Ingrese el valor de z (Porfavor escriba 10 si no no jala): ");
        int z = scanner.nextInt();

        int y = 1;
            int r = SumaCuadrados(x, y, z);
            System.out.println("La suma de los cuadrados de los primeros 10 numeros es: " + r);
    }

    public static int SumaCuadrados(int x, int y, int z) {
        if (x > z) {
            return 0;
        } else {
            int cuadradoActual = x * x;
            return cuadradoActual + SumaCuadrados(x + 1, y, z);
        }
    }
}



