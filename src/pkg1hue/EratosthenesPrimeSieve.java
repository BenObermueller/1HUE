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
public class EratosthenesPrimeSieve implements PrimeSieve {

    int maxP;

    public EratosthenesPrimeSieve(int maxP) {
        this.maxP = maxP;
    }

    @Override
    public boolean isPrime(int x) {
        for(int i = 2; i < x; i++) {
         int Rest = x % i;
         if (Rest == 0) {
            return false;
         }
      }
      return true;
    }

    @Override
    public void printPrimes() {
    }
}
