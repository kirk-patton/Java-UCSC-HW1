
public class Population {

	public static void main(String[] args) {
		float current_population = 312032486;
		
		int seconds_per_day    = 86400;
		float seconds_per_year = seconds_per_day * 365;
		
		float birth_rate      = 7f;  /* 1 birth each 7 sec */
		float death_rate      = 13f; /* 1 death every 13 sec */
		float imigration_rate = 45f; /* 1 imigrant evey 45 seconds */
		
		
		/* Project the population for each of the next five years */
		int start = 2016;
		for( int year = start; year <= start + 5; year++){
		  float births = seconds_per_year / birth_rate;
		  float imigrations = seconds_per_year / imigration_rate;
		  float deaths      = seconds_per_year / death_rate;
				  
		  current_population += (births + imigrations - deaths);
		  System.out.printf("Year: %d population is  %.2f "
		  		+ "Births: %.2f "
		  		+ "Imigrations: %.2f "
		  		+ "Deaths:%.2f\n", year,current_population,births,imigrations,deaths);
		}
	}
}
