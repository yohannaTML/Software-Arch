package application.controller;


import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;



import application.model.MarvelMovie;
import application.model.MovieInfo;
import application.model.Movies;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.util.Callback;

public class Controller implements Initializable{
	
	@FXML
    private Tab marvel_tab;

    @FXML
    private Tab ghibli_tab;

    @FXML
    private Tab disney_tab;
    
    @FXML
    private ListView<MovieInfo> listMarvel;
	private final ObservableList<MovieInfo> data = FXCollections.observableArrayList();


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		data.clear();
		Movies marvel = new MarvelMovie();
		Iterator m = marvel.createIterator();
		while(m.hasNext()) {
			MovieInfo movieInfo = (MovieInfo)m.next();
			data.add(movieInfo);
		}
		
		listMarvel.setCellFactory(new Callback<ListView<MovieInfo>,ListCell<MovieInfo>>(){

			@Override
			public ListCell<MovieInfo> call(ListView<MovieInfo> arg0) {
				ListCell<MovieInfo> listecell= new ListCell<MovieInfo>() {
					@Override
					protected void updateItem(MovieInfo movie,boolean b) {
						super.updateItem(movie, b);
						if(movie!=null) {
							Image image = new Image(getClass().getResource("../../Images/marvel/"+movie.getImage()).toExternalForm(),250,250,true,false);
							ImageView im = new ImageView(image);
							setGraphic(im);
							setText(movie.getTitle()+"\n"+movie.getYearOfPublication()+"\nDirector: "+movie.getDirector()+"\nMain Actor: "+movie.getMainActor());
							setFont(Font.font ("Verdana", 20));
						}
					}
				};
				return listecell;
			}
			
		});
		listMarvel.setItems(data);
		
		
		
		
	}
}
