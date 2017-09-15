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
public class kata1 {
    public static void main(String[] args) {
        Calendar date = GregorianCalendar.getInstance();
        date.set(1996,10,3);
        
        Person person = new Person("Miguel",date);
        System.out.println(person.getName() + " tiene " + person.getAge() + 
                " años");
    }
}
