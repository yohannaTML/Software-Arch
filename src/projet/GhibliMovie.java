package projet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class GhibliMovie implements Movies {

    String[] ghibli;
    BufferedReader reader = null;
    String line;
    String[] lines;

    try{
        reader = new BufferedReader(new FileReader("./src/projet/ghiblifilm.txt"));
        int t = reader.readLine();
        ghibli = new String[t];

        while ((line = reader.readLine()) != null) {
            lines = line.split(";");
            addInfo(lines[0], lines[1], lines[2], Integer.parseInt(lines[3]));
        }
        reader.close();
    }
	catch(FileNotFoundException exc)
    {
        System.out.println("Problem to open");
    }
    catch(IOException e){}
}

    public addInfo(String title, String mainActor, String director, int yearOfPublication) {

    }

    @Override
    public Iterator createIterator() {
        return null;
    }
}
