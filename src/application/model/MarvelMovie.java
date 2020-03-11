package application.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import application.model.MovieInfo;
import application.model.Movies;

/**
 * I use an ArrayList to hold the best Marvel movies ever produced!!
 * @author jeremie
 *
 */

public class MarvelMovie implements Movies{

	private ArrayList<MovieInfo> marvel = new ArrayList<MovieInfo>();
	public MarvelMovie() {
		BufferedReader reader = null;
		String line;
		String lines[];
	    try
	      {
	    	reader = new BufferedReader(new FileReader("./src/application/model/marvelfilm.txt"));
	    	while ((line = reader.readLine()) != null) {
				lines= line.split(";");
				addInfo(lines[0],lines[1],lines[2],Integer.parseInt(lines[3]),lines[4]);
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
	
	/**
	 * To add a movie info, we created a new MovieInfo object, 
	 * which passes through each argument, and then adds it to the ArrayList
	 */
	public void addInfo(String title, String mainActor, String director, int yearOfPublication,String image)
	{
		MovieInfo movieInfo = new MovieInfo(title, mainActor, director, yearOfPublication,"/Images/marvel/"+image);
		marvel.add(movieInfo);
	}
	
	/* returns the ArrayList*/
	public ArrayList<MovieInfo> getInfos() {
		return marvel;
	}
	
	
}
