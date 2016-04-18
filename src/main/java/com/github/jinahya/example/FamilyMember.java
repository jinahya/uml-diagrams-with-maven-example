package com.github.jinahya.example;

/**
 * Represents a member of a family.
 *
 * @author Jin Kwon &lt;onacit_at_gmail.com&gt;
 */
public class FamilyMember {

    public String getGivenName() {
        return givenName;
    }

    public String givenName() {
        return getGivenName();
    }

    public void setGivenName(final String givenName) {
        this.givenName = givenName;
    }

    public void givenName(final String givenName) {
        setGivenName(givenName);
    }

    public Family getFamily() {
        return family;
    }

    public Family family() {
        return getFamily();
    }

    public void setFamily(final Family family) {
        this.family = family;
    }

    public FamilyMember family(final Family family) {
        setFamily(family);
        return this;
    }

    private String givenName;

    private Family family;
}
