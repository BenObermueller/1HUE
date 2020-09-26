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
        for(int i = 1; i<= this.maxP; i++){
            if(isPrime(i)==true){
                System.out.println(i);
            }
        } 
    }
    
    public void printNZahlen(int max){
        if(max<=2){
            System.out.println("Die Obergrenze ist zu klein! Sie muss größer als zwei sein!");
        }else{
            for(int i = 4; i <= max; i++){
                if(i%2 == 0){
                    for(int y = 2; y<i; y++){
                        int rest = i-y;
                        if(isPrime(rest)==true){
                            System.out.println(i +" Summe: " + i +" = " + rest +" + " + y);
                            break;
                        }
                    }
                        
                }
            }
        }
    }
}
