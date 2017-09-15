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
public class kata1 {
    public static void main(String[] args) {
        Person person = new Person("pepito", new Date(1996,9,03));
        System.out.println(person.getName() + " tiene " + person.getAge() +
                " años");
    }
}
