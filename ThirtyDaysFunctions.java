import java.util.Scanner;

/**
 * Contains functions that make it easier to work with months.
 */
public class ThirtyDaysFunctions {
    public static void main( String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.print("Which month? (1-12) ");
        int month = kb.nextInt();

        System.out.println(monthDays(month) + " days hath " + monthName(month));
    }

    /**
     * Returns the name for the given month number (1-12)
     * 
     * @author Graham Mitchell
     * @param month the month number (1-12)
     * @return the English name of the month, or "error" if out of range
     */
    public static String monthName(int month){
        String[] months = {
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
        };
        if(month > 0 && month < 13){
            return months[month - 1];
        } else {
            return "error";
        }
    }

    /**
     * Returns the number of days in a given month.
     * 
     * @author Graham Mitchell
     * @param month the month number (1-12)
     * @return the number of days in the month, or 31 if out of range
     */
    public static int monthDays(int month){
        int days;
        /*  Thirty days hath September
            April, June and November
            All the rest have thirty-one
            Except the second month alone... */

        switch(month){
            case 9:
            case 4:
            case 6:
            case 11:
                days = 30;
                break;
            case 2:
                days = 28;
                break;
            default:
                days = 31;
        }

        return days;
    }
}