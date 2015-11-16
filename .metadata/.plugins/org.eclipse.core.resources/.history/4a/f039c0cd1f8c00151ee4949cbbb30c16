
public class MovieArrayList
{

	private int actualSize;
	private Movie[] movies;
	// = new Movie[0]
	
	public MovieArrayList() 
	{
		setActualSize(0);
		setMovieArray(100);
	}
	
	public MovieArrayList(int maxLength)
	{
		setActualSize(0);
		setMovieArray(maxLength);
	}
	
	public void setActualSize(int a) {
		if(a >=0 ) {
			this.actualSize = a;
		}
		else
			this.actualSize = 0;
	}
	
	public void setMovieArray(int maxLength) {
		if(maxLength >=0 ) {
			this.movies = new Movie[maxLength];
		}
		else
			this.movies = new Movie[100];
	}
	
	public int getActualSize() 
	{
		return this.actualSize;
	}
	
	public Movie[] getMovies() 
	{
		return this.movies;
	}
	
	public int size()
	{
		return this.actualSize;
	}
	
	public Movie get(int index)
	{
		if(index >=0 && index <= actualSize-1)
		{
			return movies[index];
		}
		else
		{
			return null;
		}
	}
	
	
	
	public void set(Movie mov, int index)
	{
		if(index >=0 && index <= actualSize-1)
		{
			mov = movies[index];
		}
		else
		{
			System.out.println("not a valid index");
		}
	}
	
	public void add(Movie mov)
	{
		growBufferIfNecessary();
		actualSize++;
		
		movies[actualSize -1] = mov;
		
	}
	private void growBufferIfNecessary()
	{
		if (actualSize==movies.length)
		{
			Movie[] newBuffer= new Movie[2*movies.length];
			for(int i=0;i<movies.length; i++)
			{
				newBuffer[i] = movies[i];
			}
			movies = newBuffer;
		}
	}
	
	public boolean remove(int index)
	{
		if(index>=0 && index < actualSize)
		{
			Movie removed = movies[index];
			
			for (int i = index +1; i < actualSize; i++)
			{
				movies[i-1] = movies[i];
			}
			actualSize--;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean remove(Movie m)
	{
		if(m.equals(m)==true)
			
			for(int i = 0; i<movies.length; i++)
			{
				//String movieName = movs[i].getMovieName();
				//System.out.println(movieName);
				if (this.movies[i].equals(m))
				{
					return true;
				}
			}
			System.out.println("Not Found");
			return false;
			
	}
	public static void main (String[]args)
	{
		
		
	}

}
