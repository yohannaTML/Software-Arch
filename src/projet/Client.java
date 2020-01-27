package projet;

import java.util.Iterator;

public class Client {
	DisneyMovie disneyMovie;
	//MarvelMovie marvelMovie;
	
	public Client(DisneyMovie disneyMovies) {
		this.disneyMovie = disneyMovies;
		//this.marvelMovie = marvelMovie;
	}
	
	public void printMovie() {
		Iterator disneyIterator = disneyMovie.createIterator();
		//Iterator marvelIterator = MarvelMovie.createIterator();
		/*System.out.print("---------- Disney Category-------------");
		printMovie(disneyIterator);
		*/
	}
	
	private void printMovie(Iterator iterator) {
		while(iterator.hasNext()) {
			MovieInfo movieInfo = (MovieInfo)iterator.next();
			System.out.print(movieInfo.getTitle() + ", ");
			System.out.print(movieInfo.getMainActor() + ", ");
			System.out.print(movieInfo.getDirector() + ", ");
			System.out.print(movieInfo.getYearOfPublication() + ", ");
		}
	}

}
