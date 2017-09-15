/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Person {

    /**
     * @param args the command line arguments
     */
    public final Date birthdate;
    public final String name;

    public Person(String name, Date birthdate){
        this.name = name;
        this.birthdate = birthdate;
    }
    public String getName(){
        return name;
    }
    public Date getBirthdate(){
        return birthdate;
    }
    public int getAge(){
        return (int) (new Date().getTime() - birthdate.getTime());
    }
}
