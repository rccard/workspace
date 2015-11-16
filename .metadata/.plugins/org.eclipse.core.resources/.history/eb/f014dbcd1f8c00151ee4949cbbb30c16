/*******************************
 Robert Card
 Programming Assignment 2
 CSCI 150
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MovieProgram 
{ 	public static void main (String[]args)
	{
//		final int NUM_MOVIES = 175; //not camel case b/c two words
//		String[] genreArray = new String[NUM_MOVIES];
//		int[] entry = new int[NUM_MOVIES]; //entry number
//		String[] movieName = new String[NUM_MOVIES]; //movie name
//		String [] director = new String [NUM_MOVIES]; //director name
//		String[] actors = new String [NUM_MOVIES]; //actors
//		int[] year = new int[NUM_MOVIES]; //year
//		int[] numOscars = new int[NUM_MOVIES]; //oscars
//		String[] link = new String[NUM_MOVIES]; //website
//		String[] guardianPage = new String[NUM_MOVIES];//guardian film page
//		String[] country = new String[NUM_MOVIES];//country
		int actualSize = 0;
		String fileName;//name of file we're reading from
		String movieGenre; //not the array, just the genre
		
////////////////////////////////////////////
		final int MAX = 175;
		
		/*
		String[] names = new String[MAX];
		double[] channels = new double[MAX];
		double[] ratings = new double[MAX];
		*/
		Movie[] movies = new Movie[MAX];

//		Arrays.sort(shows, 0, size);
//		
//		
//		printShows(shows, size);
		
//////////////////////////////////////////////
		
		movieGenre = "action";//hard coded each time you call load movies
		fileName= movieGenre+".txt";
		actualSize = loadMovies(movieGenre, movies, fileName, actualSize);
//		printMovies(movieGenre, movies, fileName, actualSize);
		
		movieGenre = "arthouse and drama";//hard coded each time you call load movies
		fileName= movieGenre+".txt";
		actualSize = loadMovies(movieGenre, movies, fileName, actualSize);
//		printMovies(movieGenre, movies, fileName, actualSize);
		
		movieGenre = "comedy";//hard coded each time you call load movies
		fileName= movieGenre+".txt";
		actualSize = loadMovies(movieGenre, movies, fileName, actualSize);
	//	printMovies(movieGenre, movies, fileName, actualSize);

		movieGenre = "Crime";//hard coded each time you call load movies
		fileName= movieGenre+".txt";
		actualSize = loadMovies(movieGenre, movies, fileName, actualSize);
		//printMovies(movieGenre, movies, fileName, actualSize);

		movieGenre = "horror";//hard coded each time you call load movies
		fileName= movieGenre+".txt";
		actualSize = loadMovies(movieGenre, movies, fileName, actualSize);
		//printMovies(movieGenre, movies, fileName, actualSize);
		
		movieGenre = "Romance";//hard coded each time you call load movies
		fileName= movieGenre+".txt";
		actualSize = loadMovies(movieGenre, movies, fileName, actualSize);
		//printMovies(movieGenre, movies, fileName, actualSize);

		movieGenre = "sci fi and fantasy";//hard coded each time you call load movies
		fileName= movieGenre+".txt";
		actualSize = loadMovies(movieGenre, movies, fileName, actualSize);
		//printMovies(movieGenre, movies, fileName, actualSize);
		
		runMenu(movieGenre, movies, fileName, actualSize);
	}//end main
	public static void runMenu(String movieGenre, Movie[] m, String fileName, int actualSize) {
		final int QUIT = 15;
		int choice = 0;
		do {
			//Show menu
			showMenu();
			
			//Reading choice
			Scanner keyboard = new Scanner(System.in);
			
			//System.out.println("Choose an option from the menu. ");
			choice = getValidInt("Please choose an option from the menu: ",1, QUIT);
			System.out.println("You chose option: "+choice);
			//Processing
			switch(choice) {
				case 1: System.out.println("Printing all movies");
					printMovies(movieGenre, m, fileName, actualSize);
					break;
					
				case 2: System.out.println("Sorting Movies - manual");
					sortMoviesManual(m, actualSize);
					printMovies(movieGenre, m, fileName, actualSize);
					break;
					
				case 3: System.out.println("Sorting Movies - manual");
					sortMoviesAuto(m, actualSize);
					printMovies(movieGenre, m, fileName, actualSize);
					break;
					
//				case 2: System.out.println("Sorting by title");
//					sortByTitle(g, en, name, dir, act, yr, osc, lk, gPage, country, actualSize);
//					printMovies(g, en, name, dir, act, yr, osc, lk, gPage,country, actualSize);
//					break;
//					
//				case 3: System.out.println("Sorting by year");
//				sortByYear(g, en, name, dir, act, yr, osc, lk, gPage, country, actualSize);
//				printMovies(g, en, name, dir, act, yr, osc, lk, gPage,country, actualSize);
//					break;
//					
//				case 4: System.out.println("Sorting by genre");
//				sortByGenre(g, en, name, dir, act, yr, osc, lk, gPage, country, actualSize);
//				printMovies(g, en, name, dir, act, yr, osc, lk, gPage,country, actualSize);
//					break;
//				case 5: System.out.println("Sorting by number of oscars");
//				sortByOscars(g, en, name, dir, act, yr, osc, lk, gPage, country, actualSize);
//				printMovies(g, en, name, dir, act, yr, osc, lk, gPage,country, actualSize);
//					break;
//				case 6: System.out.println("Search by title.");
//					System.out.println("Etner the title: ");
//					String targetTitle = keyboard.nextLine();
//					findMoviesByTitle(g, en, name, dir, act, yr, osc, lk, gPage,country, actualSize, targetTitle);
//					break;
				default: System.out.println("Not a valid option.");
			}
		}while(choice != QUIT);
	}
	
	public static void sortMoviesAuto(Movie[] m, int actualSize)
	{
		Arrays.sort(m);
	}
	public static void sortMoviesManual(Movie[] m, int actualSize)
	{
		
		int i = 0; 
		for(int j=0; j<actualSize; j++)
		{
			int index=j;
			for(i=j+1; i<actualSize; i++)
				{
					if(m[i].compareTo(m[index]) < 0)
						index = i;
				}
			
			
						
////			swap smallest with first\
//			String genreTemp = genreArray[j];
//			genreArray[j] = genreArray[index];
//			genreArray[index] = genreTemp;
//			
//			int entryTemp = entry[j];
//			entry[j] = entry[index];
//			entry[index] = entryTemp;
//			
//			//swap any parallel array also
//			String nameTemp = movieName[j];
//			movieName[j] = movieName[index];
//			movieName[index] = nameTemp;
//			
//			String directTemp = director[j];
//			director[j] = director[index];
//			director[index] = directTemp;
//			
//			String actTemp = actors[j];
//			actors[j] = actors[index];
//			actors[index] = actTemp;
//			
//			int yrTemp = year[j];
//			year[j] = year[index];
//			year[index] = yrTemp;
//			
//			int oscTemp = numOscars[j];
//			numOscars[j] = numOscars[index];
//			numOscars[index] = oscTemp;
//			
//			String linkTemp = link[j];
//			link[j] = link[index];
//			link[index] = linkTemp;
//			
//			String gPageTemp = guardianPage[j];
//			guardianPage[j] = guardianPage[index];
//			guardianPage[index] = gPageTemp;
//
//			String countryTemp = country[j];
//			country[j] = country[index];
//			country[index] = countryTemp;
		}
	}
	public static void findMoviesByTitle(String[] genreArray, int[] entry, String[] movieName, String[] director, String[] actors, int[] year, int[] numOscars,
			String[] link, String[] guardianPage, String[] country, int actualSize,String target)
	{
		int found = 0;
		
		for(int i=0; i<actualSize; i++)
		{
			if(target.equalsIgnoreCase(movieName[i]))
				System.out.println(movieName[i]+", "+genreArray[i]);
			found++;
		}
		if(found > 0)
			System.out.println("Not Found");
	}
	public static void showMenu() 
	{
		System.out.println("Movie Menu");
		System.out.println(" 1. Display all movies.");
		System.out.println(" 2. Show movies sorted - manual.");
		System.out.println(" 3. Show movies sorted - auto.");
//		System.out.println(" 2. Display movies sorted by title.");
//		System.out.println(" 3. Display movies sorted by year.");
//		System.out.println(" 4. Display movies sorted by genre.");
//		System.out.println(" 5. Display movies sorted by number of oscars won.");		
		System.out.println(" 15. Exit.");
	}
	
	public static int loadMovies(String movieGenre, Movie[] m, String fileName, int actualSize)
	{
		int count = actualSize;
		//read the file
		Scanner infile = null;
		try {
			int en, yr, osc = 0;
			String nm, dir, act, lk, page, ctry;
			String genre;
			
			infile = new Scanner(new File(fileName));
			infile.useDelimiter("[\t]");
			
			while(infile.hasNext() && count<m.length)
			{
				genre = movieGenre;

				en = infile.nextInt();
				//System.out.println("Entry "+en);
				try
				{
					int entry = en;

					nm = infile.next();
					
					String name = nm;
//					System.out.println("name: "+nm);
					
					dir = infile.next();
					String director = dir;
//					System.out.println("director "+dir);
					
					act = infile.next();
					String actors = act;
//					System.out.println("actors: "+act);
					
					yr = infile.nextInt();
					int year = yr;
//					System.out.println("year "+yr);
										
					osc = infile.nextInt();
					int oscars = osc;
//					System.out.println("oscars "+osc);
					
					lk = infile.next();
					String link = lk;
//					System.out.println("link: "+lk);
					
					page = infile.next();
					String gPage = page;
//					System.out.println("gpage:  "+page);
					
					ctry = infile.nextLine();
					String country = ctry;
//					System.out.println("Country "+ctry);
							
					Movie o = new Movie(movieGenre, entry, name, director, actors, year, oscars, link, gPage, country);
					m[count] = o;
					
					
//					System.out.println(m[count]);
					
					count++;
				}
				catch(InputMismatchException e)
				{
					System.out.println("Could not load data for ");
					
							//+name[count]);
					infile.nextLine();
				
				}
				catch(ArrayIndexOutOfBoundsException a)
				{
				System.out.println("No movies outside of those bounds");
				}
				
			}//end while
			
		}//end try
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.print("Could not find file");
			e.printStackTrace();
		}
		finally 
		{infile.close();}
		
		return count;
	}// end load movies
		
	public static void printMovies(String movieGenre, Movie[] m, String fileName, int actualSize) 
	{
		System.out.printf("%-20s %-10s %-35s %-45s %-120s %-15s %-20s %-45s %-85s %-10s \n", "Genre", "Entry", "Movie Name", "Director", "Leading Actors", "Year", "Oscars Won", "Film Link", "Guardian Page Link", "Country");
		for(int i = 0; i<actualSize; i++)
		{ 
			
			System.out.println(m[i]);
				
//			System.out.printf("%-20s %-10s %-35s %-45s %-120s %-15s %-20s %-45s %-85s %-10s \n",genreArray[i], entry[i], movieName[i], director[i], actors[i], year[i], numOscars[i], 
//								link[i], guardianPage[i], country[i]);
		
		}
			
	}

	
	public static void sortByTitle(String[] genreArray, int[] entry, String[] movieName, String[] director, String[] actors, int[] year, int[] numOscars,
		String[] link, String[] guardianPage, String[] country, int actualSize)
	{
		int i = 0; 
		for(int j=0; j<actualSize; j++)
		{
			int index=j;
			for(i=j+1; i<actualSize; i++)
				{
					if(movieName[i].compareTo(movieName[index]) < 0)
						index = i;
				}
						
			//swap smallest with first\
			String genreTemp = genreArray[j];
			genreArray[j] = genreArray[index];
			genreArray[index] = genreTemp;
			
			int entryTemp = entry[j];
			entry[j] = entry[index];
			entry[index] = entryTemp;
			
			//swap any parallel array also
			String nameTemp = movieName[j];
			movieName[j] = movieName[index];
			movieName[index] = nameTemp;
			
			String directTemp = director[j];
			director[j] = director[index];
			director[index] = directTemp;
			
			String actTemp = actors[j];
			actors[j] = actors[index];
			actors[index] = actTemp;
			
			int yrTemp = year[j];
			year[j] = year[index];
			year[index] = yrTemp;
			
			int oscTemp = numOscars[j];
			numOscars[j] = numOscars[index];
			numOscars[index] = oscTemp;
			
			String linkTemp = link[j];
			link[j] = link[index];
			link[index] = linkTemp;
			
			String gPageTemp = guardianPage[j];
			guardianPage[j] = guardianPage[index];
			guardianPage[index] = gPageTemp;

			String countryTemp = country[j];
			country[j] = country[index];
			country[index] = countryTemp;
		}
	}//end sortByTitle

	public static void sortByYear(String[] genreArray, int[] entry, String[] movieName, String[] director, String[] actors, int[] year, int[] numOscars,
			String[] link, String[] guardianPage, String[] country, int actualSize)
		{
			int i = 0; 
			for(int j=0; j<actualSize; j++)
			{
				int index=j;
				for(i=j+1; i<actualSize; i++)
					{
						if(year[i] < year[index])
							index = i;
					}
							
				//swap smallest with first\
				String genreTemp = genreArray[j];
				genreArray[j] = genreArray[index];
				genreArray[index] = genreTemp;
				
				int entryTemp = entry[j];
				entry[j] = entry[index];
				entry[index] = entryTemp;
				
				//swap any parallel array also
				String nameTemp = movieName[j];
				movieName[j] = movieName[index];
				movieName[index] = nameTemp;
				
				String directTemp = director[j];
				director[j] = director[index];
				director[index] = directTemp;
				
				String actTemp = actors[j];
				actors[j] = actors[index];
				actors[index] = actTemp;
				
				int yrTemp = year[j];
				year[j] = year[index];
				year[index] = yrTemp;
				
				int oscTemp = numOscars[j];
				numOscars[j] = numOscars[index];
				numOscars[index] = oscTemp;
				
				String linkTemp = link[j];
				link[j] = link[index];
				link[index] = linkTemp;
				
				String gPageTemp = guardianPage[j];
				guardianPage[j] = guardianPage[index];
				guardianPage[index] = gPageTemp;

				String countryTemp = country[j];
				country[j] = country[index];
				country[index] = countryTemp;
			}//end for
		}//end sortByYear
	
	public static void sortByGenre(String[] genreArray, int[] entry, String[] movieName, String[] director, String[] actors, int[] year, int[] numOscars,
			String[] link, String[] guardianPage, String[] country, int actualSize)
		{
			int i = 0; 
			for(int j=0; j<actualSize; j++)
			{
				int index=j;
				for(i=j+1; i<actualSize; i++)
					{
						if(genreArray[i].compareTo(genreArray[index]) < 0)
							index = i;
					}
							
				//swap smallest with first\
				String genreTemp = genreArray[j];
				genreArray[j] = genreArray[index];
				genreArray[index] = genreTemp;
				
				int entryTemp = entry[j];
				entry[j] = entry[index];
				entry[index] = entryTemp;
				
				//swap any parallel array also
				String nameTemp = movieName[j];
				movieName[j] = movieName[index];
				movieName[index] = nameTemp;
				
				String directTemp = director[j];
				director[j] = director[index];
				director[index] = directTemp;
				
				String actTemp = actors[j];
				actors[j] = actors[index];
				actors[index] = actTemp;
				
				int yrTemp = year[j];
				year[j] = year[index];
				year[index] = yrTemp;
				
				int oscTemp = numOscars[j];
				numOscars[j] = numOscars[index];
				numOscars[index] = oscTemp;
				
				String linkTemp = link[j];
				link[j] = link[index];
				link[index] = linkTemp;
				
				String gPageTemp = guardianPage[j];
				guardianPage[j] = guardianPage[index];
				guardianPage[index] = gPageTemp;

				String countryTemp = country[j];
				country[j] = country[index];
				country[index] = countryTemp;
			}//end for
		}//end sortByGenre

	public static void sortByOscars(String[] genreArray, int[] entry, String[] movieName, String[] director, String[] actors, int[] year, int[] numOscars,
			String[] link, String[] guardianPage, String[] country, int actualSize)
		{
			int i = 0; 
			for(int j=0; j<actualSize; j++)
			{
				int index=j;
				for(i=j+1; i<actualSize; i++)
					{
						if(numOscars[i] < numOscars[index])
							index = i;
					}
							
				//swap smallest with first\
				String genreTemp = genreArray[j];
				genreArray[j] = genreArray[index];
				genreArray[index] = genreTemp;
				
				int entryTemp = entry[j];
				entry[j] = entry[index];
				entry[index] = entryTemp;
				
				//swap any parallel array also
				String nameTemp = movieName[j];
				movieName[j] = movieName[index];
				movieName[index] = nameTemp;
				
				String directTemp = director[j];
				director[j] = director[index];
				director[index] = directTemp;
				
				String actTemp = actors[j];
				actors[j] = actors[index];
				actors[index] = actTemp;
				
				int yrTemp = year[j];
				year[j] = year[index];
				year[index] = yrTemp;
				
				int oscTemp = numOscars[j];
				numOscars[j] = numOscars[index];
				numOscars[index] = oscTemp;
				
				String linkTemp = link[j];
				link[j] = link[index];
				link[index] = linkTemp;
				
				String gPageTemp = guardianPage[j];
				guardianPage[j] = guardianPage[index];
				guardianPage[index] = gPageTemp;

				String countryTemp = country[j];
				country[j] = country[index];
				country[index] = countryTemp;
			}//end for
		}//end sortByOscars

public static int getValidInt(String prompt, int min, int max)
	
	{				
		Scanner in = new Scanner(System.in);
		int num = 0;
		boolean valid = false;
		do{
			System.out.println("choose an option from the menu");
			try{				
					num = in.nextInt();
					if(num >= min && num <= max)		
						{
							valid = true;
						}
					else
						{
						System.out.println("The number must be in the range "+min+" to "+max);
						}
					System.out.println("you guessed "+num);				
				}
			catch(InputMismatchException ime)
				{
				System.out.println("Error. Please only enter an integer between "+min+" and "+max+" (inclusive)");
				in.next();
				}
			}
			while(!valid);
			return num;
	}

	
}//end class
