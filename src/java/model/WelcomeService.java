package model;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Tracy
 */
public class WelcomeService {
    private Calendar date = new GregorianCalendar();
    private String name;
    
    public WelcomeService(String name) {
        setName(name);
        setDate(date);
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        
    private String getTimeDescription() {
        Calendar endOfMorning = (new GregorianCalendar());
        endOfMorning.set(Calendar.HOUR_OF_DAY, 12);
        Calendar startOfEvening = new GregorianCalendar();
        startOfEvening.set(Calendar.HOUR_OF_DAY, 17);
        
        if(date.before((Calendar)endOfMorning)) {
            return "morning";
        } 
        else if (date.after((Calendar)startOfEvening)) {
            return "evening";
        }
        else {
            return "afternoon";
        }
    }
    
    public String welcomeMessage() {
        return "Good " + getTimeDescription() + ", " + getName() +
                ". Welcome!";
    }
    

}
