package application.controller;


import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;


import application.model.DisneyMovie;
import application.model.MarvelMovie;
import application.model.GhibliMovie;
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
	private ListView<MovieInfo> listDisney;
	private final ObservableList<MovieInfo> data_disney = FXCollections.observableArrayList();

	@FXML
	private ListView<MovieInfo> listMarvel;
	private final ObservableList<MovieInfo> data_marvel = FXCollections.observableArrayList();

	@FXML
	private ListView<MovieInfo> listGhibli;
	private final ObservableList<MovieInfo> data_ghibli = FXCollections.observableArrayList();
	
	@FXML
	private ListView<MovieInfo> listAll;
	private final ObservableList<MovieInfo> all_data = FXCollections.observableArrayList();

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		Movies disney = new DisneyMovie();
		Movies marvel = new MarvelMovie();
		Movies ghibli = new GhibliMovie();

		Iterator d = disney.createIterator();
		Iterator m = marvel.createIterator();
		Iterator g = ghibli.createIterator();

		while(d.hasNext()) {
			MovieInfo movieInfo_d = (MovieInfo)d.next();
			data_disney.add(movieInfo_d);
			all_data.add(movieInfo_d);
		}

		while(m.hasNext()) {
			MovieInfo movieInfo_m = (MovieInfo)m.next();
			data_marvel.add(movieInfo_m);
			all_data.add(movieInfo_m);
		}

		while(g.hasNext()) {
			MovieInfo movieInfo_g = (MovieInfo)g.next();
			data_ghibli.add(movieInfo_g);
			all_data.add(movieInfo_g);
		}

		listMarvel.setCellFactory(new Callback<ListView<MovieInfo>,ListCell<MovieInfo>>(){

			@Override
			public ListCell<MovieInfo> call(ListView<MovieInfo> arg0) {
				ListCell<MovieInfo> listcell_m= new ListCell<MovieInfo>() {
					@Override
					protected void updateItem(MovieInfo movie,boolean b) {
						super.updateItem(movie, b);
						if(movie!=null) {
							Image image = new Image(getClass().getResource("../../"+movie.getImage()).toExternalForm(),250,250,true,false);
							ImageView im = new ImageView(image);
							setGraphic(im);
							setText(movie.getTitle()+"\n"+movie.getYearOfPublication()+"\nDirector: "+movie.getDirector()+"\nMain Actor: "+movie.getMainActor());
						}
					}
				};
				return listcell_m;
			}

		});


		listDisney.setCellFactory(new Callback<ListView<MovieInfo>,ListCell<MovieInfo>>() {
			@Override
			public ListCell<MovieInfo> call(ListView<MovieInfo> arg0) {
				ListCell<MovieInfo> listcell_d= new ListCell<MovieInfo>(){
					@Override
					protected void updateItem(MovieInfo movie_d,boolean b) {
						super.updateItem(movie_d, b);
						if (movie_d != null) {
							Image image = new Image(getClass().getResource("../../"+movie_d.getImage()).toExternalForm(),250,250,true,false);
							ImageView im = new ImageView(image);
							setGraphic(im);
							setText(movie_d.getTitle()+"\n"+movie_d.getYearOfPublication()+"\nDirector: "+movie_d.getDirector()+"\nMain Actor: "+movie_d.getMainActor());
						}
					}
				};
				return listcell_d;
			}

		});

		listGhibli.setCellFactory(new Callback<ListView<MovieInfo>,ListCell<MovieInfo>>() {
			@Override
			public ListCell<MovieInfo> call(ListView<MovieInfo> arg0) {
				ListCell<MovieInfo> listcell_g= new ListCell<MovieInfo>(){
					@Override
					protected void updateItem(MovieInfo movie_g,boolean b) {
						super.updateItem(movie_g, b);
						if (movie_g != null) {
							Image image = new Image(getClass().getResource("../../"+movie_g.getImage()).toExternalForm(),250,250,true,false);
							ImageView im = new ImageView(image);
							setGraphic(im);
							setText(movie_g.getTitle()+"\n"+movie_g.getYearOfPublication()+"\nDirector: "+movie_g.getDirector()+"\nMain Actor: "+movie_g.getMainActor());
						}
					}
				};
				return listcell_g;
			}

		});

		listAll.setCellFactory(new Callback<ListView<MovieInfo>,ListCell<MovieInfo>>(){

			@Override
			public ListCell<MovieInfo> call(ListView<MovieInfo> arg0) {
				ListCell<MovieInfo> listcell_m= new ListCell<MovieInfo>() {
					@Override
					protected void updateItem(MovieInfo movie,boolean b) {
						super.updateItem(movie, b);
						if(movie!=null) {
							Image image = new Image(getClass().getResource("../../"+movie.getImage()).toExternalForm(),250,250,true,false);
							ImageView im = new ImageView(image);
							setGraphic(im);
							setText(movie.getTitle()+"\n"+movie.getYearOfPublication()+"\nDirector: "+movie.getDirector()+"\nMain Actor: "+movie.getMainActor());
						}
					}
				};
				return listcell_m;
			}

		});
		listMarvel.setItems(data_marvel);
		listDisney.setItems(data_disney);
		listGhibli.setItems(data_ghibli);
		listAll.setItems(all_data);



	}
}
