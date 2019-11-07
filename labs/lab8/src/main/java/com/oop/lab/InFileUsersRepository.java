package com.oop.lab;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class InFileUsersRepository {

    public static final String SOURCE = "data/user.repository";

    private List<User> users;

    public InFileUsersRepository() {
        File file = new File(SOURCE);
        if (!file.exists()) users = new LinkedList<>();
        else {
            ObjectMapper mapper = new ObjectMapper();
            try {
                users = mapper.readValue(file, new TypeReference<List<User>>() {
                });
            } catch (IOException e) {
                users = new LinkedList<>();
            }
        }
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void write() {
        try {
            File file = new File(SOURCE);
            if (!file.exists()) file.createNewFile();
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(file, users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
