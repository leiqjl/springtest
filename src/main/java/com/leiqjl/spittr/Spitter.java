package com.leiqjl.spittr;

import lombok.Data;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Data
public class Spitter {

    private Long id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    public Spitter() {

    }

    public Spitter(String username, String password, String firstName, String lastName) {
        this(null, username, password, firstName, lastName);
    }

    public Spitter(Long id, String username, String password, String firstName, String lastName) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that, "firstName", "lastName", "username", "password", "email");
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, "firstName", "lastName", "username", "password", "email");
    }

}
