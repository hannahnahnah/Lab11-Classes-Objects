import java.util.ArrayList;
import java.util.Scanner;

public class Movie {
	
	private String movieTitle;
	private String movieCategory;
	
	public Movie() {}
	
	public Movie(String title, String category) {
		this.movieTitle = title;
		this.movieCategory = category;
	}
	
	public String getTitle() {
		return this.movieTitle;
	}
	
	public void setTitle() {
		this.movieTitle = movieTitle;
	}
	
	public String getCategory() {
		return this.movieCategory;
	}
	
	public void setCategory() {
		this.movieCategory = movieCategory;
	}
	
	public String toString() {
		return "Movie title: " + movieTitle + " Movie Category: " + movieCategory;
	}
	
	public static void displayCategories() {
		ArrayList<String> categories = new ArrayList<>();
		categories.add("Animated");
		categories.add("Drama");
		categories.add("Horror");
		categories.add("SciFi");
		categories.add("Musical");
		categories.add("Comedy");
		
		for (String category : categories) {
			System.out.println((categories.indexOf(category) + 1) + ". " + category);
		}
	}
	
	public static String categoryList(int userInput) {
		
		ArrayList<String> categories = new ArrayList<>();
			categories.add("Animated");
			categories.add("Drama");
			categories.add("Horror");
			categories.add("SciFi");
			categories.add("Musical");
			categories.add("Comedy");
		
		for (int i = 0; i < categories.size(); ++i) {
			if (userInput == i) {
				return categories.get(i); //string at i
			}
		}
		return null;
	}
	
	public static boolean userContinue() {
		Scanner scnr = new Scanner(System.in);
		String userInput;
		
			System.out.println("Would you like to continue? (y/n): ");
			userInput = scnr.nextLine();
			scnr.close();
			
			if (userInput.substring(0, 1).equalsIgnoreCase("y")) {
				return true;
			} else 
				return false;
		
	}
	

}
