package projet;

import java.util.Hashtable;
import java.util.Iterator;

public class Client {
	Hashtable<String,Movies> movie = new Hashtable<String, Movies>();
	
	public void addClient(String label, Movies movies) {
		movie.put(label, movies);
	}
	
	public void printMovie() {
		Iterator disneyIterator = movie.get("disney").createIterator();
		Iterator marvelIterator = movie.get("marvel").createIterator();
		Iterator ghibliIterator = movie.get("ghibli").createIterator();
		
		System.out.println("---------- Marvel Category-------------");
		printMovie(marvelIterator);
		System.out.println("---------- Disney Category-------------");
		printMovie(disneyIterator);
		System.out.println("---------- Ghibli Category-------------");
		printMovie(ghibliIterator);
		
	}
	
	private void printMovie(Iterator iterator) {
		while(iterator.hasNext()) {
			MovieInfo movieInfo = (MovieInfo)iterator.next();
			System.out.print(movieInfo.getTitle() + ", ");
			System.out.print(movieInfo.getMainActor() + ", ");
			System.out.print(movieInfo.getDirector() + ", ");
			System.out.println(movieInfo.getYearOfPublication() + ", ");
			
		}
	}

}
