package Main;

import Model.Person;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Person manuel = new Person("Manuel", new Date(75,3,25));
        Person gabriel = new Person("Gabriel", new Date(99,9,16));
        System.out.print(manuel.getName());
        System.out.print(" ");
        System.out.print(manuel.getAge()+ " años");
        System.out.print("\n");
        
        System.out.print(gabriel.getName());
        System.out.print(" ");
        System.out.print(gabriel.getAge()+ " años");
        System.out.print("\n");
    }
    
}
