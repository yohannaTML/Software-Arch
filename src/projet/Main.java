package projet;

public class Main {

	
	public static void main(String[] args) {
		MarvelMovie marvel = new MarvelMovie();
		DisneyMovie disney = new DisneyMovie();
		GhibliMovie ghibli = new GhibliMovie();
		
		Client client = new Client();
		client.addClient("marvel", marvel);
		client.addClient("disney", disney);
		client.addClient("ghibli", ghibli);

		client.printMovie();
	}

}
