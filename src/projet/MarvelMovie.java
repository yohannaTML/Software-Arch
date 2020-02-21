package projet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class MarvelMovie implements Movies{

	private ArrayList<MovieInfo> marvel = new ArrayList<MovieInfo>();
	public MarvelMovie() {
		BufferedReader reader = null;
		String line;
		String lines[];
	    try
	      {
	    	reader = new BufferedReader(new FileReader("./src/projet/marvelfilm.txt"));
	    	while ((line = reader.readLine()) != null) {
				lines= line.split(";");
				addInfo(lines[0],lines[1],lines[2],Integer.parseInt(lines[3]));
			}
			reader.close();
	      }
	    catch(FileNotFoundException exc)
	      {
	    	System.out.println("Problem to open");
	      } catch (IOException e) {}
	    
	}
	@Override
	public Iterator<MovieInfo> createIterator() {
		return marvel.iterator();
	}
	public void addInfo(String title, String mainActor, String director, int yearOfPublication)
	{
		MovieInfo movieInfo = new MovieInfo(title, mainActor, director, yearOfPublication);
		marvel.add(movieInfo);
	}
	
	
	public ArrayList<MovieInfo> getInfos() {
		return marvel;
	}
	
	
}
