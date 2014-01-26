package model;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Tracy
 */
public class WelcomeService {
    private Calendar date;
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
    
    public String welcomeMessage() {
        return "Good " + getTimeDescription(getDate()) + ", " + getName() +
                ". Welcome!";
    }
}
