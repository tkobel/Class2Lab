package model;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Tracy
 */
public class WelcomeService {
    private Calendar date = new GregorianCalendar();
    
    private String getTimeDescription(Calendar date) {
        Calendar endOfMorning = new GregorianCalendar();
        endOfMorning.set(Calendar.HOUR_OF_DAY, 12);
        Calendar startOfEvening = new GregorianCalendar();
        startOfEvening.set(Calendar.HOUR_OF_DAY, 17);
        
        if(date.before(endOfMorning)) {
            return "morning";
        } 
        else if (date.after(startOfEvening)) {
            return "evening";
        }
        else {
            return "afternoon";
        }
    }
}
