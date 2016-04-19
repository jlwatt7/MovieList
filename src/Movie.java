
public class Movie {

	public Movie(String movieTitle, String movieGenre) {
		super();
		this.movieTitle = movieTitle;
		this.movieGenre = movieGenre;
	}
	private String movieTitle;
	private String movieGenre;
	
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	
	}
}



