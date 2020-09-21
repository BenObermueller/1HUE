/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1hue;

/**
 *
 * @author Ben Obermüller
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       EratosthenesPrimeSieve e = new EratosthenesPrimeSieve(10);
       
        System.out.println(e.isPrime(8));
    }
    
}
