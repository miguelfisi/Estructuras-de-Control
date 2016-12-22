/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otrasEstructuras;

import java.io.IOException;
import java.util.*;

/**
 *
 * @author miguel
 * Contar cifras con la estructura While, usando la division: %
 */
public class While_doWhileEjm2 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n, cifras;
        char car;
        System.out.println("*****CONTAR LAS CIFRAS DE UN "
                    + "NUMERO ENTERO EN JAVA*****");
        do {
            
            System.out.println("Introduce un numero entero");
            n = sc.nextInt();
            cifras = 0;
            while (n != 0) {
                n = n / 10;
                cifras++;
            }
            System.out.println("El numero tiene " + cifras + " cifras");
            System.out.println("Continuar: N es no/S o cualquier caracter "
                    + "es si");
            car = (char) System.in.read();

        } while (car != 'n' && car != 'N');
        System.out.println("**Hasta Luego***");
    }

}
