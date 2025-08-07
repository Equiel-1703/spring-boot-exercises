package com.equiel.ex3_14.userrepository;

import com.equiel.ex3_14.userclass.User;

public interface UserRepository {
    public void save(User user);
    public boolean userExists(String email);
}
