package com.equiel.ex3_14.userrepository;

import com.equiel.ex3_14.userclass.User;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import java.util.HashMap;

// This annotation indicates that this class is a Spring-managed bean,
// and it represents a repository for user data.
// A repository is typically used to encapsulate the logic required
// to access data sources, such as databases or in-memory data structures.
@Repository
@Primary
public class InMemoryUserRepository implements UserRepository {
    private final HashMap<String, User> usersMap;

    public InMemoryUserRepository() {
        this.usersMap = new HashMap<>();
    }

    @Override
    public void save(User user) {
        this.usersMap.put(user.getEmail(), user);
    }

    @Override
    public boolean userExists(String email) {
        return this.usersMap.containsKey(email);
    }

    public User getUser(String email) {
        return this.usersMap.get(email);
    }
}
