/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1hue;

import java.util.Scanner;

/**
 *
 * @author Ben Obermüller
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Höchste gewuenschte Priemzahl:");
        EratosthenesPrimeSieve e = new EratosthenesPrimeSieve(Integer.parseInt(s.nextLine()));
        e.printPrimes();
        System.out.println("Zahl:");
        System.out.println(e.isPrime(Integer.parseInt(s.nextLine())));
        System.out.println("Max Zahl für printNZahlen()");
        e.printNZahlen(Integer.parseInt(s.nextLine()));
    }
    
}
