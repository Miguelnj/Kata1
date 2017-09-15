/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author usuario
 */
public class Person {

    /**
     * @param args the command line arguments
     */
    public final Calendar birthdate;
    public final String name;
    private final long MILLISECONDS_PER_YEAR = (long)(365.25*24*60*60*1000);

    public Person(String name, Calendar birthdate){
        this.name = name;
        this.birthdate = birthdate;
    }
    public String getName(){
        return name;
    }
    public Calendar getBirthdate(){
        return birthdate;
    }
    public int getAge(){
        Calendar actual = GregorianCalendar.getInstance();
        return (int) (millisecondsToYear(actual.getTimeInMillis() - 
                birthdate.getTimeInMillis()));
    }
    
    private long millisecondsToYear(long milles){
        return milles / MILLISECONDS_PER_YEAR;
    }
}
