package application.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import application.model.MovieInfo;
import application.model.Movies;

public class GhibliMovie implements Movies {

    private MovieInfo[] ghibli;
    private int index=0;

	public GhibliMovie() {

		BufferedReader reader = null;
		String line;
		String[] lines;

		try{
			reader = new BufferedReader(new FileReader("./src/application/model/ghiblimovie.txt"));
			int t = Integer.parseInt(reader.readLine());
			ghibli = new MovieInfo[t];

        while ((line = reader.readLine()) != null) {
            lines = line.split(";");
            addInfo(lines[0], lines[1], lines[2], Integer.parseInt(lines[3]),lines[4]);
            index++;
        }
        reader.close();
    }
	catch(FileNotFoundException exc)
    {
        System.out.println("Problem to open");
    }
    catch(IOException e){}
}

    public void addInfo(String title, String mainActor, String director, int yearOfPublication,String image) {
        MovieInfo movie = new MovieInfo(title, mainActor, director, yearOfPublication,"/Images/ghibli/"+image);
        ghibli[index] = movie;
    }

    public MovieInfo[] getInfos() {
        return ghibli;
    }

    @Override
    public Iterator createIterator() {
        return new GhibliIterator(ghibli);
    }
}
