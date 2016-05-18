/*
 * How to handle the exception hierarchies?
 * - I create own classes extends exception and then 
 * - i used it 
 */

package sas;

public class Main {

	public Main() {

	}

	public static void main(String[] args) {
		
      try{
    	  throw new Mammel();
      }catch (Mammel m){
    	  System.err.println("It is mammel.");
//      }catch (Animal a){
//    	  System.err.println("It is animal.");
      }
		
		
	}

}
