import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MovieApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int categoryChoice = 0;
		String userInput = "y";
	

		do { 
			ArrayList<Movie> movieObjects = new ArrayList<>(); //create array of 100 Movie Objects, each with title and category
			for (int i = 1; i <= 100; ++i) {
				movieObjects.add(MovieIO.getMovie(i));
			}
			
			System.out.println("Welcome to the Movie List Application!");
	
			System.out.println("There are " + movieObjects.size() + " movies in this list.");
			System.out.println("What category are you interested in?");
			Movie.displayCategories();
			do {
				try {
					System.out.println("Please eneter a number, 1-6: ");
					categoryChoice = scnr.nextInt();
					scnr.nextLine();
					if (categoryChoice >= 1 && categoryChoice <= 6) {
						System.out.println("You entered " + categoryChoice + ". " + Movie.categoryList(categoryChoice - 1) + ".");
					} else {
						System.out.println("That is not a valid category.");
					}
				} catch (Exception ex) {
					System.out.println("That is not a valid category..");
					scnr.nextLine();
				}
			} while ((categoryChoice < 1) || (categoryChoice > 6)); 
			
				
			switch (categoryChoice) {
					case 1:
						Set<String> animateds = new TreeSet<>();
						for (int i = 0; i <movieObjects.size(); ++i) {
							if (movieObjects.get(i).getCategory().equals("animated")) {
								animateds.add(movieObjects.get(i).getTitle());
							}
						}
						for (String animated: animateds) {
							System.out.println(animated);
						}
						break;
					case 2:
						Set<String> dramas = new TreeSet<>();
						for (int i = 0; i <movieObjects.size(); ++i) {
							if (movieObjects.get(i).getCategory().equals("drama")) {
								dramas.add(movieObjects.get(i).getTitle());
							}
						}
						for (String drama: dramas) {
							System.out.println(drama);
						}
						break;
					case 3:
						Set<String> horrors = new TreeSet<>();
						for (int i = 0; i <movieObjects.size(); ++i) {
							if (movieObjects.get(i).getCategory().equals("horror")) {
								horrors.add(movieObjects.get(i).getTitle());
							}
						}
						for (String horror: horrors) {
							System.out.println(horror);
						}
						break;
					case 4:
						Set<String> scifis = new TreeSet<>();
						for (int i = 0; i <movieObjects.size(); ++i) {
							if (movieObjects.get(i).getCategory().equals("scifi")) {
								scifis.add(movieObjects.get(i).getTitle());
							}
						}
						for (String scifi: scifis) {
							System.out.println(scifi);
						}
						break;
					case 5:
						Set<String> musicals = new TreeSet<>();
						for (int i = 0; i <movieObjects.size(); ++i) {
							if (movieObjects.get(i).getCategory().equals("musical")) {
								musicals.add(movieObjects.get(i).getTitle());
							}
						}
						for (String musical: musicals) {
							System.out.println(musical);
						}
						break;
					case 6:
						Set<String> comedys = new TreeSet<>();
						for (int i = 0; i <movieObjects.size(); ++i) {
							if (movieObjects.get(i).getCategory().equals("comedy")) {
								comedys.add(movieObjects.get(i).getTitle());
								System.out.println(comedys);
							}
						}
						for (String comedy: comedys) {
							System.out.println(comedy);
						}
						break;
					default:
						break;
						
					}
			
			System.out.println("Would you like to continue? (y/n): ");
			userInput = scnr.nextLine();
			
			
			
			
		} while (userInput.substring(0, 1).equalsIgnoreCase("y"));

		System.out.println("Goodbye. This is the end of this F#cking Lab!");
		scnr.close();
	}

}
