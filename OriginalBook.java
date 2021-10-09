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
public class OriginalBook implements Book {
    private String name, author, description;
		private int rating;
		private boolean available;
		
		public OriginalBook(String n, String a, String d, int r, boolean available) {
			name = n;
			author = a;
			description = d;
			rating = r;
			this.available = available;
		}
                public String getName() {
			return name;
		}
		public String getAuthor() {
			return author;
		}
		public String getDescription() {
			return description;
		}
		public int getRating() {
			return rating;
		}
		public boolean isAvailable() {
			return available;
		}
                public void showInfo() {
			System.out.println("..:: COMPLETE BOOK ::.." + 
								"\nName: " + name + 
								"\nAuthor: " + author + 
								"\nDescription: " + description + 
								"\nRating: " + rating + 
								"\nAvailability: " + available + "\n");
		}
    
}
