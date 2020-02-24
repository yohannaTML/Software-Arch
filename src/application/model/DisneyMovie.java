package application.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;

import application.model.Movies;

/**
 * I use a HashTable to hold the best Disney movies ever produced!!
 * @author yohanna
 *
 */
public class DisneyMovie implements Movies{
	Hashtable<String, MovieInfo> movieInfos = new Hashtable<String, MovieInfo>();
	
	public DisneyMovie() {
		BufferedReader reader = null;
		String line;
		String lines[];
	    try
	      {
	    	reader = new BufferedReader(new FileReader("./src/application/model/disneymovie.txt"));
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
	
	/**
	 * To add a movie info, we created a new MovieInfo object, 
	 * which passes through each argument, and then adds it to the HashMap
	 */
	public void addInfo(String title, String mainActor, String director, int yearOfPublication,String image)
	{
		MovieInfo movieInfo = new MovieInfo(title, mainActor, director, yearOfPublication,"/Images/disney/"+image);
		movieInfos.put(movieInfo.getTitle(), movieInfo);
	}
	/**
	 * The getInfo() method returns the list of movie infos
	 * @return
	 */
	public Hashtable<String, MovieInfo> getInfos() {
		return movieInfos;
	}

	public Iterator<MovieInfo> createIterator() {
		return movieInfos.values().iterator();
	}
	
}
