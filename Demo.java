/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirtualProxy1;

/**
 *
 * @author JAVERIA
 */
public class Demo {
    public static void main(String[] args) {
		// Creating a ProxyBook
	    // and showing its info:
	    Book book = new ProxyBook("Ice and Fire", "Elia Martell", true);
	    book.showInfo();
            
            //requesting the complete object and showing info
              book = ((ProxyBook)book).click();
	    book.showInfo();
    }
    
}
