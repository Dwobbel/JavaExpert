package skelet.javaintermediate.chapter11.exercise6;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Created by JonathanSyntra on 17/04/2017.
 */
public class Person implements Serializable{
    private static final long serialVersionUID = -8142018486750610977L;
    private String firstname;
    private String lastname;
    private LocalDate birthday;

    public Person(String firstname, String lastname, LocalDate birthday) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
