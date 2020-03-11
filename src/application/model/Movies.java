package application.model;

import java.util.Iterator;

/* This is an interface where we create the iterator*/

public interface Movies {
	public Iterator<MovieInfo> createIterator();
}
