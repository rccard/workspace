
public class Movie implements Comparable {
	private String genre;
	private int entry;
	private String movieName;
	private String director;
	private String actors;
	private int year;
	private int numOscars;
	private String imdbLink;
	private String guardianLink;
	private String country;
	
	public Movie() {
		setEntry(0);
		setName("");
		setDirector("");
		setActors("");
		setYear(1000);
		setNumOscars(0);
		setIMDBLink("");
		setGuardianLink("");
		setCountry("");
		setGenre("");
		
	}
	
	public Movie(String mn, int y)
	{
		setName(mn);
		setYear(y);
		
		setEntry(0);
		setDirector("");
		setActors("");
		setNumOscars(0);
		setIMDBLink("");
		setGuardianLink("");
		setCountry("");
		setGenre("");
	}
	public Movie(int e, String mn, String d, String a, int y, int nO, String iL, String gL, String c, String g) {
		setEntry(e);
		setName(mn);
		setDirector(d);
		setActors(a);
		setYear(y);
		setNumOscars(nO);
		setIMDBLink(iL);
		setGuardianLink(gL);
		setCountry(c);
		setGenre(g);
	}
	public Movie(String mn, String d, int y, int nO) {
		setEntry(0);
		setName(mn);
		setDirector(d);
		setActors("");
		setYear(y);
		setNumOscars(nO);
		setIMDBLink("");
		setGuardianLink("");
		setCountry("");
		setGenre("");
	}
	
	public String toString() {
		String result="";
		result += this.entry+", ";
		result += this.movieName+", ";
		result += this.director+", ";
		result += this.actors+", ";
		result += this.year+", ";
		result += this.numOscars+", ";
		result += this.guardianLink+", ";
		result += this.imdbLink+", ";
		result += this.country+", ";
		result += this.genre+", ";
		return result;
	}
	
	public void setEntry(int e) {
		if(e >=0 ) {
			this.entry = e;
		}
		else
			this.entry = 0;
	}
	
	public void setName(String mn) {
		if(mn != null) {
			this.movieName = mn;
		}
		else {
			this.movieName = "";
		}	
	}
	
	public void setDirector(String d) {
		if(d !=null) {
			this.director = director;
		}
		else {
			this.director = "";
		}
	}
	public void setActors(String a) {
		if(a !=null) {
			this.actors = actors;
		}
		else {
			this.actors = "";
		}
	}
	public void setYear(int y) {
		if(y >= 1000 && y <= 9999) {
			this.year =y;
		}
		else {
			this.year = 1000;
		}
	}
	public void setNumOscars(int nO) {
		if(nO >= 0) {
			this.numOscars = nO;
		}
		else {
			this.numOscars = 0;
		}
	}
	public void setGuardianLink(String gL) {
		if(gL !=null) {
			this.guardianLink = gL;
		}
		else {
			this.guardianLink = "";
		}
	}
	public void setIMDBLink(String iL) {
		if(iL !=null) {
			this.imdbLink = iL;
		}
		else {
			this.imdbLink = "";
		}
	}
	public void setCountry(String c) {
		if(c !=null) {
			this.country = c;
		}
		else {
			this.country = "";
		}
	}
	public void setGenre(String g) {
		if(g !=null) {
			this.genre = g;
		}
		else {
			this.genre = "";
		}
	}
	public String getMovieName() {
		return this.movieName;
	}
	public String getDirector() {
		return this.director;
	}
	public String getActors() {
		return this.actors;
	}
	public String getCountry() {
		return this.country;
	}
	public String getGuardianLink() {
		return this.guardianLink;
	}
	public String getImdbLink() {
		return this.imdbLink;
	}
	public int getYear() {
		return this.year;
	}
	public int getEntry() {
		return this.entry;
	}
	public int getNumOscars() {
		return this.numOscars;
	}
	public String getGenre() {
		return this.genre;
	}
	public Movie clone() {
		return new Movie(this.entry, this.movieName, this.director, this.actors, this.year, this.numOscars, this.guardianLink, this.imdbLink, this.country, this.genre);
	}
	public boolean equals(Movie other) {
		if(this.movieName.equals(other.movieName)
		   && this.director.equals(other.director)
		   && this.year == other.year
		   && this.numOscars == other.numOscars) {
			return true;
		}
		else {
			return false;
		}
	}
	public int compareTo(Object other) {
		if(this == other) {
			return 0; //same object in memory
		}
		try {
			Movie otherMovie = (Movie) other;
			return this.movieName.compareTo(otherMovie.movieName);

		} catch (ClassCastException ce) {
			return -2; //other object not a movie
		}
		
	}
}
