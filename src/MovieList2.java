import java.util.*;

public class MovieList2 {
    
static Scanner genre = new Scanner(System.in);

    public static void main(String[] args){
        String [ ] movieTitle = {"Beetlejuice", "Despicable Me", "The Conjuring", "Avengers", "Jurassic World", 
        "Avatar", "The Lion King", "Sinister", "Creed", "Gone Game"};

        String [ ] movieGenre = {"scifi", "animated", "horror", "scifi", "scifi",
        "scifi", "animated", "horror", "drama", "drama"};
        
        ArrayList<Movie> myList= new ArrayList<>();
        boolean userChoice = true;
    
        System.out.println("Welcome to the Movie List Application!!");
        System.out.println();
        System.out.println("There are 10 movies in this list");
        
        while(userChoice){    
        System.out.println("What category are you interested in?");
        String userPick = getValidCategory();
        
        for(int i=0;i< movieGenre.length;i++)
            myList.add(new Movie(movieTitle[i],movieGenre[i]));
        
        for (int i=0;i< movieGenre.length;i++)
        {
            if(myList.get(i).getMovieGenre().equalsIgnoreCase(userPick))
                System.out.println(myList.get(i).getMovieTitle());
        }
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
        public static String getValidCategory()
        {String userPick = genre.nextLine();
        	while (!userPick.equalsIgnoreCase("scifi") &&
        			!userPick.equalsIgnoreCase("drama") &&
        			!userPick.equalsIgnoreCase("horror") &&
        			!userPick.equalsIgnoreCase("animated"))
        	{
        		System.out.println("Please enter a valid genre!");
        		userPick = genre.nextLine();
        	}
                return userPick;        
    }
}