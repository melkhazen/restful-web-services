package com.mohamedelkhazen.rest.webservices.restfulwebservices.module;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Mohamed Elkahzen
 * @25/03/2022 - 2:44 PM
 * @project restful-web-services
 */
@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int userCount = 3;

    static {
        users.add(new User(1, "Adam", new Date()));
        users.add(new User(2, "Eve", new Date()));
        users.add(new User(3, "Jack", new Date()));

    }

    // find all
    public List<User> findAll(){
        return users;
    }
    //save user
    public User save(User user) {
        if(user.getId()==null) {
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }
    //find one
    public User findOne(int id) {
        for(User user:users) {
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }

}
