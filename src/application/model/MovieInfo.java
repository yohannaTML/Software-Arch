package application.model;

/**
 * 
 * @author yohanna
 *A MovieInfo consists of a title, a mainActor, a director and 
 *and the year of publication. 
 */

public class MovieInfo {
	String title;
	String mainActor;
	String director;
	int yearOfPublication;
	
	public MovieInfo(String title, String mainActor, String director, int yearOfPublication) {
		this.title = title;
		this.mainActor = mainActor;
		this.director = director;
		this.yearOfPublication = yearOfPublication;
	}
	
	public String getTitle() {
		return title;
	}

	public String getMainActor() {
		return mainActor;
	}

	public String getDirector() {
		return director;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}
}
