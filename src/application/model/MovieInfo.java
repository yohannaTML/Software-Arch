package application.model;

/**
 * 
 * @author yohanna, Jeremy, Marine
 *A MovieInfo consists of a title, a mainActor, a director and 
 *and the year of publication. 
 */

public class MovieInfo {
	private String title;
	private String mainActor;
	private String director;
	private int yearOfPublication;
	private String image;
	
	public MovieInfo(String title, String mainActor, String director, int yearOfPublication,String image) {
		this.title = title;
		this.mainActor = mainActor;
		this.director = director;
		this.yearOfPublication = yearOfPublication;
		this.image=image;
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
	public String getImage() {
		return image;
	}
}
