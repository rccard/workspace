/*******************************
 Robert Card
 Programming Assignment 2
 CSCI 150
 */

public class Movie implements Comparable
{
	//private data members for each data type stored in the parallel arrays
	private String genre;
    private int entry;
    private String movieName;
    private String director;
    private String actors;
    private int year;
    private int numOscars;
    private String link;
    private String guardianPage;
    private String country;
    
    //Constructors
    //Default Constructor
    public Movie()
    {
        this.genre = "No Genre";
        this.entry = -1;
        this.movieName = "No Movie Name";
        this.director = "No Director";
        this.actors = "No Actors";
        this.year = 9999;
        this.numOscars = -1;
        this.link = "No Link";
        this.guardianPage = "No Page";
        this.country = "No Country";
    }

    //Parameterirized Constructor (Only year, director, and numOscars)
    public Movie(String movieName, int year, String director, int numOscars)
    {
    	this.movieName = movieName;
    	this.year = year;
    	this.director = director;
    	this.numOscars = numOscars;
    }
    
    //Parameterized Constructor (Full)
    public Movie(String genre, int entry, String movieName, String director, String actors, int year, int numOscars, String link, String guardianPage, String country)
    {
    	this.genre = genre;
        this.entry = entry;
        this.movieName = movieName;
        this.director = director;
        this.actors = actors;
        this.year = year;
        this.numOscars = numOscars;
        this.link = link;
        this.guardianPage = guardianPage;
        this.country = country;
    }
    //end constructors
    
    //toString
    public String toString()
	{
		String result="";
		
		result += this.genre +", "+this.entry+", "+this.movieName+", "+this.director+", "+this.actors+", "+this.year+", "+this.numOscars+", "+this.link+", "+this.guardianPage+", "+this.country;
		
		return result;
	}//End toString
    
    //Getters
    public String getGenre()
    {
    	return genre;
    }
    
    public int getEntry()
    {
    	return entry;
    }
    
    public String getMovieName()
    {
    	return movieName;
    }
    
    public String getDirector()
    {
    	return director;
    }
    
    public String getActors()
    {
    	return actors;
    }
    
    public int getYear()
    {
    	return year;
    }
    
    public int getNumOscars()
    {
    	return numOscars;
    }
    
    public String getLink()
    {
    	return link;
    }
    
    public String getGuardianPage()
    {
    	return guardianPage;
    }
    
    public String getCountry()
    {
    	return country;
    }
    //End Getters
    
    //Setters
    public void setGenre(String genre)
    {
    	try
    	{
    		this.genre=genre;
    	}
    	catch(NullPointerException g)
    	{
    		this.genre="No Genre";
    		System.out.println("echo: NullPointer genre");
    	}
    	
    }
    
    public void setEntry(int entry)
    {
    	if(entry <= -1)
    	{
    		entry = (entry*-1);
    		this.entry=entry;
    	}
    	else
    	{
    		this.entry=entry;
    	}
    }
    
    public void setMovieName(String movieName)
    {
    	try
    	{
    		this.movieName=movieName;
    	}
    	catch(NullPointerException e)
    	{
    		this.movieName="No Movie Name";
    		System.out.println("echo: NullPointer movieName");
    	}
    }
    
    public void setDirector(String director)
    {
    	try
    	{
    		this.director=director;
    	}
    	catch(NullPointerException d)
    	{
    		this.director="No Director";
    		System.out.println("echo: NullPointer director");
    	}
    }
    
    public void setActors(String actors)
    {
    	try
    	{
    		this.actors=actors;
    	}
    	catch(NullPointerException a)
    	{
    		this.actors="No actors";
    		System.out.println("echo: NullPointer actors");
    	}
    }
    
    public void setYear(int year)
    {
    	int length = String.valueOf(year).length();
    	
    	if(length != 4)
    	{
    		this.year=1900;
    	}
    	else
    	{
    		this.year=year;
    	}
    }
    
    public void setNumOscars(int numOscars)
    {
    	if(numOscars <= -1)
    	{
    		numOscars = (numOscars*-1);
    		this.numOscars=numOscars;
    	}
    	else
    	{
    		this.numOscars=numOscars;
    	}
    	
    }
    
    public void setLink(String link)
    {
    	try
    	{
    		this.link=link;
    	}
    	catch(NullPointerException l)
    	{
    		this.link="No Link";
    		System.out.println("echo: NullPointer link");
    	}
    }
    
    public void setGuardianPage(String guardianPage)
    {
    	try
    	{
    		this.guardianPage=guardianPage;
    	}
    	catch(NullPointerException p)
    	{
    		this.guardianPage="No Page";
    		System.out.println("echo: NullPointer Page");
    	}
    }
    
    public void setCountry(String country)
    {
    	try
    	{
    		this.country=country;
    	}
    	catch(NullPointerException c)
    	{
    		this.country="No Country";
    		System.out.println("echo: NullPointer Country");
    	}
    }
    //End Setters
    
    //compareTo
    public int compareTo(Object o)
    {
    	if(this==o)
    		return 0;
    	
    	Movie oMovie = null;
    	
    	try
    	{
    		oMovie = (Movie) o;
    	}
    	catch(ClassCastException cce)
    	{
    		return -2;
    	}
    	
    	if(this.movieName.compareTo(oMovie.movieName) == 0)
    	{
    		return 0;
    	}
    	else if(this.movieName.compareTo(oMovie.movieName) < 0)
    	{
    		return -1;
    	}
    	else
    	{
    		return 1;
    	}
    }//End compareTo
    
    public boolean equals(Object o)
    {
    	if(this==o)
    		return true;
    	
    	Movie oMovie = null;
    	
    	try
    	{
    		oMovie = (Movie) o;
    	}
    	catch(ClassCastException cce)
    	{
    		return false;
    	}
    	
    	int i=0;
    	
    	if(this.movieName.compareTo(oMovie.movieName) == 0)
    	{
    		i++;
    	}
    	if(this.year==(oMovie.year))
    	{
    		i++;
    	}
    	if(this.director.compareTo(oMovie.director) ==0)
    	{
    		i++;
    	}
    	if(i==3)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
	
	//clone
    public Movie clone()
    {
    	Movie other = new Movie(this.genre, this.entry, this.movieName, this.director, this.actors, this.year, this.numOscars, this.link, this.guardianPage, this.country);
    	return other;
    }

	//Main
	public static void main(String[] args)
	{
		Movie a = new Movie();
		System.out.println(a);
		System.out.println("");
		
		Movie b = new Movie();
		
		Movie c = new Movie();
		
		a.setGenre("Action");
		a.setEntry(100);
		a.setMovieName("Die Hard");
		a.setDirector("Hamburgler");
		a.setActors("Bruce Willis");
		a.setYear(1989);
		a.setNumOscars(15);
		a.setLink("http://BruceRox.com");
		a.setGuardianPage("www.guardianpageforthat.com");
		a.setCountry("US");
		
		b.setGenre("Comedy");
		b.setEntry(200);
		b.setMovieName("Princess Bride");
		b.setDirector("Ronald");
		b.setActors("Some Blonde Guy");
		b.setYear(1960);
		b.setNumOscars(20);
		b.setLink("http://anybodywannapeanut.com");
		b.setGuardianPage("www.guardianpageforthis.com");
		b.setCountry("US");
		
		//Same as title, year, and director as a. everything else changed to test equals
		c.setGenre("Drama");
		c.setEntry(100);
		c.setMovieName("Die Hard");
		c.setDirector("Hamburgler");
		c.setActors("Carlton");
		c.setYear(1989);
		c.setNumOscars(15);
		c.setLink("http://SwedenRox.com");
		c.setGuardianPage("www.guardianpageforthis.com");
		c.setCountry("Sweden");
		
		//Test
		System.out.println(a);
		System.out.println("");
		System.out.println(b);
		
		//Test compareTo
		System.out.println(a.compareTo(b));
		
		//Test equals
		System.out.println(a.equals(a));
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		
	}//End Main
}
