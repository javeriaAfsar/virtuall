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
public class ProxyBook  implements Book{
    private String name, author;
		private boolean available;
		
		ProxyBook(String n, String a, boolean available){
	        name = n;
	        author = a;
	        this.available = available;
	    }
                public String getName() {
			return name;
		}
		public String getAuthor() {
			return author;
		}
		public boolean isAvailable() {
			return available;
		}
		public void showInfo() {
			System.out.println("..:: PROXY BOOK ::.." + 
								"\nName: " + name + 
								"\nAuthor: " + author +
								"\nAvailability: " + available + "\n");
		}
                public OriginalBook click() {
			// Setting some default values
	        // which will be fetched from a database
	        // in an actual implementation:
	        String description = "A bestselling novel";
	        int rating = 3;
	        
	        // Creating the OriginalBook object
	        // and returning it:
	        return new OriginalBook(name, author, description, rating, available);
		}

    
    
}
