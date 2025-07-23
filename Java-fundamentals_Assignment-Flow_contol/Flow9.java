import java.time.Month;

public class Flow9{

    public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("Please enter the month in numbers");
            System.exit(0);
        }

       
        int month = Integer.parseInt(args[0]);

      
        if (month < 1 || month > 12) {
            System.out.println("Invalid month");
            System.exit(0);
        }

        // Get the uppercase month name (e.g., "JANUARY")
        String monthStr = Month.of(month).name();

        // Convert to title case (e.g., "January")
        monthStr = monthStr.substring(0, 1).toUpperCase() + monthStr.substring(1).toLowerCase();

        System.out.println(monthStr);
    }
}
