package projet;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * I use a HashTable to hold the best Disney movies ever produced!!
 * @author yohanna
 *
 */
public class DisneyMovie implements Movies{
	Hashtable movieInfos = new Hashtable();
	
	
	public DisneyMovie() {
		addInfo(" Aladdin", "Will smith", "Guy Ritchie", 2019);
		addInfo("Mulan", "Ming-Na Wen", "Tony Bancroft", 1998);
		addInfo("The Lion King", "Donald Glover", "Jon Favreau", 2019);
		addInfo("Pocahontas", "Irene Bedard", "Mike Gabriel", 1995);
		addInfo("The princess and the frog", "Anika Noni Rose", "Ron Clements", 2009);
	}
	
	/**
	 * To add a movie info, we created a new MovieInfo object, 
	 * which passes through each argument, and then adds it to the HashMap
	 */
	public void addInfo(String title, String mainActor, String director, int yearOfPublication)
	{
		MovieInfo movieInfo = new MovieInfo(title, mainActor, director, yearOfPublication);
		movieInfos.put(movieInfo.getTitle(), movieInfo);
	}
	/**
	 * The getInfo() method returns the list of movie infos
	 * @return
	 */
	public Hashtable getInfos() {
		return movieInfos;
	}

	public Iterator createIterator() {
		return movieInfos.values().iterator();
	}
	
}
