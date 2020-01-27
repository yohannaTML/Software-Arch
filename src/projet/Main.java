package projet;

public class Main {

	
	public static void main(String[] args) {
		MarvelMovie marvel = new MarvelMovie();
		DisneyMovie disney = new DisneyMovie();
		
		Client client = new Client(disney, marvel);
		client.printMovie();
	}

}
