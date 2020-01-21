package projet;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public class MarvelMovie implements Movies{

	private ArrayList<MovieInfo> marvel = new ArrayList<MovieInfo>();

	@Override
	public Iterator createIterator() {
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
