/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otrasEstructuras;

import java.util.Scanner;

/**
 *
 * @author miguel
 * Contar cifras con la estructura While, usando el mod: %
 * 
 */
public class WhileEjm {

    public static void main(String[] args) {
        //ingreso
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        String num = scanner.nextLine();
        scanner.close();
        //conversion
        int x = Integer.valueOf(num).intValue();

        //contando digitos
        int ctosdig = 0;
        while (x > 0) {
            int dig = x % 10;
            ++ctosdig;
            x -= dig;
            x /= 10;
        }
        System.out.println("El valor tiene " + ctosdig + " digitos");

    }
}
