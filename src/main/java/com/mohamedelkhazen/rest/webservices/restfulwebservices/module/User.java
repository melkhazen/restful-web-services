package com.mohamedelkhazen.rest.webservices.restfulwebservices.module;

import java.util.Date;

/**
 * @author Mohamed Elkahzen
 * @25/03/2022 - 2:26 PM
 * @project restful-web-services
 */
public class User {
    private Integer id;
    private String name;
    private Date birthdate;

    public User(Integer id, String name, Date birthdate) {
        super();
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
