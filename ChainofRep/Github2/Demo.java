/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainofRep.Github2;

/**
 *
 * @author JAVERIA
 */
public class Demo {
    public static void main(String[] args) {
		Currency amount = new Currency(200);
		DispenserChain chain = new DispenserChain();
		chain.dispense(amount);

	}
    
}
