package lab3;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class event_date_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter event date and time (yyyy-MM-dd HH:mm): ");
        String input = scanner.nextLine();

        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        try {
           
            LocalDateTime eventDateTime = LocalDateTime.parse(input, formatter);
            LocalDateTime currentDateTime = LocalDateTime.now();

          
            if (eventDateTime.isBefore(currentDateTime)) {
                System.out.println("The event time has already passed.");
                return;
            }

            
            Duration duration = Duration.between(currentDateTime, eventDateTime);

            long totalMinutes = duration.toMinutes();
            long days = totalMinutes / (24 * 60);
            long hours = (totalMinutes % (24 * 60)) / 60;
            long minutes = totalMinutes % 60;

           
            System.out.println("Time remaining until event:");
            System.out.println(days + " days, " + hours + " hours, and " + minutes + " minutes");

        } catch (Exception e) {
            System.out.println("Invalid input format. Please use yyyy-MM-dd HH:mm");
        }

	}

}
