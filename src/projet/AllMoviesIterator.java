package projet;

import java.util.Iterator;

public class AllMoviesIterator implements Iterator{

	MovieInfo[] list;
	int position = 0;
	
	public AllMoviesIterator(MovieInfo[] list) {
		this.list = list;
	}

	/**
	 * The next() method returns the next
	 * object in the collection.
	 */
	public Object next() {
		MovieInfo movieInfo = list[position];
		position = position + 1;
		return movieInfo;
	}
	
	/**
	 * The hasNext() method tells us if there are more 
	 * elements in the collection to go through.
	 */
	
	public boolean hasNext() {
		if(position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}
	
}
