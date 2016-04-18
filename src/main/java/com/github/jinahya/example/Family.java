package com.github.jinahya.example;

/**
 * The family class.
 *
 * @author Jin Kwon &lt;onacit_at_gmail.com&gt;
 */
public class Family {

    public String getSurname() {
        return surname;
    }

    public String surname() {
        return getSurname();
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Family surname(final String surname) {
        setSurname(surname);
        return this;
    }

    private String surname;
}
