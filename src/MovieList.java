import java.util.*;

public class MovieList {
	
static Scanner genre = new Scanner(System.in);

	public static void main(String[] args){
		String [ ] movieTitle = {"Beetlejuice", "Despicable Me", "The Conjuring", "Avengers", "Jurassic World", 
		"Avatar", "The Lion King", "Sinister", "Creed", "Gone Girl"};

		String [ ] movieGenre = {"scifi", "animated", "horror", "scifi", "scifi",
		"scifi", "animated", "horror", "drama", "drama"};
		
		ArrayList<Movie> myList= new ArrayList<>();
		boolean userChoice = true;
	
		System.out.println("Welcome to the Movie List Application!!");
		System.out.println();
		System.out.println("There are 10 movies in this list");
		
		while(userChoice){	
		System.out.println("What category are you interested in? The Categories are: \n1= Scifi \n2= Animated \n3= Horror \n4= Drama:");
		int userPickInt = readValidInteger();
		String userPick = "";
		
		for(int i=0;i< movieGenre.length;i++)
			myList.add(new Movie(movieTitle[i],movieGenre[i]));
		 
				if (userPickInt == 1)
				{
					userPick = "Scifi";
				}
		
				if (userPickInt == 2)
				{
					userPick = "Animated";
				}
					
				if (userPickInt == 3)
				{
					userPick = "Horror";
				}
					
				if (userPickInt == 4)
				{
					userPick = "Drama";
				}
					
		for (int i=0;i< movieGenre.length;i++)
		{if(myList.get(i).getMovieGenre().equalsIgnoreCase(userPick))
				System.out.println(myList.get(i).getMovieTitle());}
		
		System.out.println();
		System.out.println("Continue? (Y/N):");
		String userReply = genre.nextLine();
		System.out.println();
		
		if (userReply.equalsIgnoreCase("Y"))
		{userChoice = true;}

		if (userReply.equalsIgnoreCase("N"))
		{userChoice = false;}
		}
}	
	public static int readValidInteger()
		{
			while (!genre.hasNextInt())
			{
				genre.nextInt();
			}
		int x = genre.nextInt();
		genre.nextLine();
		return x;
	}
		
		public static int getValidNumberInRange (int min, int max)
	{
	int input = genre.nextInt();
	genre.nextLine();
	while ((input < min) || (input> max))
	{
		System.out.println("Please put a number within range!");

	input = readValidInteger();
	}
	return input;
	}
		
		
	}
	
			

