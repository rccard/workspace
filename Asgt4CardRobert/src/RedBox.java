import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

//import ToolsFor150.Fall2013.Tools;


public class RedBox
{
	private MovieArrayList movs;
	
	public RedBox()
	{
		movs = new MovieArrayList();
	}
	
	public static void main (String[]args)
	{
		//final int NUM_MOVIES = 175; //not camel case b/c two words
		//Movie[] movies = new Movie[NUM_MOVIES];
		//ArrayList<Movie> movies = new ArrayList<Movie>();
		
		//int actualSize = 0;
		
		RedBox box = new RedBox();
		
		String fileName;//name of file we're reading from
		String movieGenre; //not the array, just the genre
		
		//USE THIS AS AN EXAMPLE FOR THE HW (Change all the methods returns to void)
		//not static because it uses the box. object to call
		movieGenre = "action";//hard coded each time you call load movies
		fileName= movieGenre+".txt";
		box.loadMovies(movieGenre, fileName);
	//	printMovies(genreArray, entry, movieName, director, actors, year, numOscars, link, guardianPage,country, actualSize);
		
		movieGenre = "arthouse and drama";//hard coded each time you call load movies
		fileName= movieGenre+".txt";
		box.loadMovies(movieGenre, fileName);
		//printMovies(genreArray, entry, movieName, director, actors, year, numOscars, link, guardianPage,country, actualSize);
		
		movieGenre = "comedy";//hard coded each time you call load movies
		fileName= movieGenre+".txt";
		box.loadMovies(movieGenre, fileName);
	//	printMovies(genreArray, entry, movieName, director, actors, year, numOscars, link, guardianPage,country, actualSize);

		movieGenre = "Crime";//hard coded each time you call load movies
		fileName= movieGenre+".txt";
		box.loadMovies(movieGenre, fileName);
		//printMovies(genreArray, entry, movieName, director, actors, year, numOscars, link, guardianPage,country, actualSize);

		movieGenre = "horror";//hard coded each time you call load movies
		fileName= movieGenre+".txt";
		box.loadMovies(movieGenre, fileName);
		//printMovies(genreArray, entry, movieName, director, actors, year, numOscars, link, guardianPage,country, actualSize);
		
		movieGenre = "Romance";//hard coded each time you call load movies
		fileName= movieGenre+".txt";
		box.loadMovies(movieGenre, fileName);
		//printMovies(genreArray, entry, movieName, director, actors, year, numOscars, link, guardianPage,country, actualSize);

		movieGenre = "sci fi and fantasy";//hard coded each time you call load movies
		fileName= movieGenre+".txt";
		box.loadMovies(movieGenre, fileName);
		//printMovies(genreArray, entry, movieName, director, actors, year, numOscars, link, guardianPage,country, actualSize);
		
		box.runMenu();
	}//end main
	//ArrayList<Movie> movs
	public void runMenu() {
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
				case 1: System.out.println("Show all movies (current order)");
				printMovies(movs);
					break;
				/*	
				case 2: System.out.println("Sorting by title");
					sortByTitle(g, en, name, dir, act, yr, osc, lk, gPage, country, actualSize);
					printMovies(g, en, name, dir, act, yr, osc, lk, gPage,country, actualSize);
					break;
					
				case 3: System.out.println("Sorting by year");
				sortByYear(g, en, name, dir, act, yr, osc, lk, gPage, country, actualSize);
				printMovies(g, en, name, dir, act, yr, osc, lk, gPage,country, actualSize);
					break;
					
				case 4: System.out.println("Sorting by genre");
				sortByGenre(g, en, name, dir, act, yr, osc, lk, gPage, country, actualSize);
				printMovies(g, en, name, dir, act, yr, osc, lk, gPage,country, actualSize);
					break;
				case 5: System.out.println("Sorting by number of oscars");
				sortByOscars(g, en, name, dir, act, yr, osc, lk, gPage, country, actualSize);
				printMovies(g, en, name, dir, act, yr, osc, lk, gPage,country, actualSize);
					break;
				case 6: System.out.println("Search by title.");
					System.out.println("Enter the title: ");
					String targetTitle = keyboard.nextLine();
					findMoviesByTitle(g, en, name, dir, act, yr, osc, lk, gPage,country, actualSize, targetTitle);
					break;
					*/
				case 2:
					sortMoviesManual(movs); 
					printMovies(movs);
					break;
				case 3:
					sortMoviesManual(movs); 
					printMovies(movs);
					break;
				case 4:
					int targetInt = getValidInt("Please enter an index", 0, movs.size()-1);
					printMovieByIndex(movs, targetInt);
					break;
				case 5:
					System.out.println("Please Enter A Title(Linear)");
					String targetStringL = keyboard.nextLine();
					int indexL = findMovieByTitleLinear(movs, targetStringL);
					printMovieByIndex(movs, indexL);
					break;
				case 6:
					System.out.println("Please Enter A Title(Binary)");
					String targetStringB = keyboard.nextLine();
					int indexB = findMovieByTitleBinary(movs, targetStringB);
					printMovieByIndex(movs, indexB);
					break;
				case 7:
					System.out.println("Please Enter a Title(Add)");
					String newTitle = keyboard.nextLine();
					int newYear = getValidInt("Please Enter a Year", 1000, 2013);
					Movie newMov = new Movie(newTitle, newYear);
					//System.out.println(newMov);
					int tempSize = movs.size();
					int sizeCheck = addMovie(movs, newMov);
//					if(actualSize == tempSize)
//					{
//						System.out.println("Error: Array Size Limit Reached");
//						System.out.println("Error: "+actualSize+"/"+movs.size()+" (Current Length/Max Length)");
//						System.out.println("Error: Please Delete a Movie First");
//					}
//					else
//					{
//						System.out.println("Movie Added :");
//						System.out.println(newTitle);
//					}
					break;
				case 8:
					int sizeCheck8 = 0;
					System.out.println("Please Enter a Title(Delete)");
					String deleteTitle = keyboard.nextLine();
					int tempSizeD = sizeCheck8;
					int indexD = findMovieByTitleLinear(movs, deleteTitle);
					sizeCheck8 = removeMovieAt(movs, indexD);
//					if(actualSize == tempSizeD)
//					{
//						System.out.println("Error: Could not delete Movie");
//					}
//					else
//					{
//						System.out.println("Movie Deleted");
//						System.out.println(deleteTitle);
//					}
//					break;
				default: System.out.println("Not a valid option.");
			}
		}while(choice != QUIT);
	}
	public static int removeMovieAt(MovieArrayList movs, int indexD)
	{
		try
		{
			movs.remove(indexD);
		}
		catch(IndexOutOfBoundsException d)
		{
			System.out.println("not a valid index");
		}
		
		return movs.size();
		
//		if(indexD >= 0 && indexD < actualSize)
//		{
//			for ( int i = indexD ; i < movs.length - 1 ; i++ )
//			{
//				movs[ i ] = movs[ i + 1 ] ; 
//			}
//		return actualSize-1;
//		}
//		System.out.println("Not a valid index");
//		return actualSize;
	}
	
	public static int addMovie(MovieArrayList movs, Movie newMov)
	{
		
		movs.add(newMov);
		
//		if(movs.length == actualSize)
//		{
////			System.out.println("Error: Array Size Limit Reached");
////			System.out.println("Error: "+actualSize+"/"+movs.length+" (Current Length/Max Length)");
////			System.out.println("Error: Please Delete a Movie First");
//			return actualSize;
//		}
//		//System.out.println(actualSize);
//		movs[actualSize] = newMov;
//		return actualSize + 1;
//		//return actualSize;
		
		return movs.size();
	}
	public static int findMovieByTitleBinary(MovieArrayList movs, String targetString)
	{
		sortMoviesManual(movs);
		
		int first = 0;
		int last = movs.size();

		while (first < last) 
		{
			int mid = (first + last) / 2;
			if (targetString.compareTo(movs.get(mid).getMovieName()) < 0) 
			{
				//System.out.println("Less than");
				last = mid;
			} 
			else if (targetString.compareTo(movs.get(mid).getMovieName()) > 0) 
			{
				//System.out.println("Greater than");
				first = mid + 1;
			} 
			else 
			{
				return mid;
			}
		}
			
		return -1; 
	}
	public static int findMovieByTitleLinear(MovieArrayList movs, String targetString)
	{
//		System.out.println(movs[1].getMovieName());
//		System.out.println(targetString);

		//replace actual size with .size()
		for(int i = 0; i<movs.size(); i++)
		{
			//String movieName = movs[i].getMovieName();
			//System.out.println(movieName);
			if (movs.get(i).getMovieName().equals(targetString))
			{
				return i;
			}
		}
		System.out.println("Not Found");
		return -1;
	}
	
	public static void printMovieByIndex(MovieArrayList movs, int target)
	{
		
		if(target >=0 && target <= movs.size()-1)
		{
		System.out.println(movs.get(target));
		}
		else
		{
		System.out.println("No movie at that spot");
		}
	}
	/*
	public static void findMoviesByTitle(String[] genreArray, int[] entry, String[] movieName, String[] director, String[] actors, int[] year, int[] numOscars,
		String[] link, String[] guardianPage, String[] country, int actualSize, String target){
		
		int found = 0;
		for(int i=0; i< actualSize; i++) {
			if(target.equalsIgnoreCase(movieName[i])) {
				System.out.println(movieName[i]+", "+genreArray[i]);
				found++;
			}
		}
		if(found > 0)
			System.out.println("Not found");
	}
	*/
	public static void showMenu() 
	{
		System.out.println("Movie Menu");
		System.out.println(" 1. Show all movies (current order).");
		System.out.println(" 2. Show movies sorted - manual");
		System.out.println(" 3. Show movies sorted - auto");
		System.out.println(" 4. Print a Movie");
		System.out.println(" 5. Search Movies by Title - Linear");
		System.out.println(" 6. Search Movies by Title - Binary");
		System.out.println(" 7. Add Movie");
		System.out.println(" 8. Remove Movie");
		
	/*	System.out.println(" 2. Display movies sorted by title.");
		System.out.println(" 3. Display movies sorted by year.");
		System.out.println(" 4. Display movies sorted by genre.");
		System.out.println(" 5. Display movies sorted by number of oscars won.");		
		*/System.out.println(" 15. Exit.");
	}
	
	//take out array list, actual size, and make it not static
	public int loadMovies(String movieGenre, String fileName)
	{
		int count = movs.size();
		//read the file
		Scanner infile = null;
		try {
			int en, yr, osc = 0;
			String nm=null, dir, act, lk, page, ctry;
			infile = new Scanner(new File(fileName));
			infile.useDelimiter("[\t]");
			
			///length size
			while(infile.hasNext())
			{
				//genre[count] = movieGenre;

				en = infile.nextInt();
				//System.out.println("Entry "+en);
				try
				{
					//entry[count] = en;

					nm = infile.next();
					//name[count] = nm;
					//System.out.println("name: "+nm);
					
					dir = infile.next();
					//director[count] = dir;
					//System.out.println("director "+dir);
					
					act = infile.next();
					//actors[count] = act;
					//System.out.println("actors: "+act);
					
					yr = infile.nextInt();
					//year[count] = yr;
					//System.out.println("year "+yr);
										
					osc = infile.nextInt();
					//oscars[count] = osc;
					//System.out.println("oscars "+osc);
					
					lk = infile.next();
					//link[count] = lk;
					//System.out.println("link: "+lk);
					
					page = infile.next();
					//gPage[count] = page;
					//System.out.println("gpage:  "+page);
					
					ctry = infile.nextLine();
					//country[count] = ctry;
					//System.out.println("Country "+ctry);
					
					//movs[count] = new Movie(en, nm, dir, act, yr, osc, lk, page, ctry, movieGenre);
					movs.add(new Movie(en, nm, dir, act, yr, osc, lk, page, ctry, movieGenre));
					
					count++;
				}
				catch(InputMismatchException e)
				{
					System.out.println("Could not load data for "+nm);
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
		
	public static void printMovies(MovieArrayList movs) 
	{
		System.out.printf("%-20s %-10s %-35s %-45s %-120s %-15s %-20s %-45s %-85s %-10s \n", "Genre", "Entry", "Movie Name", "Director", "Leading Actors", "Year", "Oscars Won", "Film Link", "Guardian Page Link", "Country");
		for(int i = 0; i<movs.size(); i++)
		{ 
				
			System.out.println(movs.get(i));
		}
			
	}

	
	public static void sortMoviesManual(MovieArrayList movs)
	{
		int i = 0; 
		for(int j=0; j<movs.size(); j++)
		{
			int index=j;
			for(i=j+1; i<movs.size(); i++)
				{
					if(movs.get(i).compareTo(movs.get(index)) < 0)
						index = i;
				}
						
			//swap smallest with first\
			Movie genreTemp = movs.get(j);
			//movs[j] = movs[index];
			movs.set(movs.get(index), j);
			//movs[index] = genreTemp;
			movs.set(genreTemp, index);
		}//end outer for
			
			
	}
	
//	public static void sortMoviesAuto(MovieArrayList movs)
//	{
//		Collections.sort(movs);
//
//	}

	

public static int getValidInt(String prompt, int min, int max)
	
	{				
		Scanner in = new Scanner(System.in);
		int num = 0;
		boolean valid = false;
		do{
			System.out.println(prompt);
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
