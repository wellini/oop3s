package com.oop.lab;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class InFileUsersRepositoryTest {

    @Before
    public void setUp() throws Exception {
        File file = new File(InFileUsersRepository.SOURCE);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
        bufferedWriter.write("[{\"name\": \"Alex\", \"age\": 18}]");
        bufferedWriter.flush();
    }

    @Test
    public void getUsers() {
        InFileUsersRepository inFileUsersRepository = new InFileUsersRepository();
        User user = inFileUsersRepository.getUsers().get(0);
        assertEquals("Alex", user.getName());
        assertEquals(18, user.getAge());
    }

    @Test
    public void setUsers() {
        InFileUsersRepository inFileUsersRepository = new InFileUsersRepository();
        User user = new User();
        user.setName("Ivan");
        user.setAge(20);
        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        inFileUsersRepository.setUsers(users);
        assertEquals("Ivan", user.getName());
        assertEquals(20, user.getAge());
    }

    @Test
    public void write() {
        InFileUsersRepository inFileUsersRepository = new InFileUsersRepository();
        User user = new User();
        user.setName("Ivan");
        user.setAge(20);
        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        inFileUsersRepository.setUsers(users);
        inFileUsersRepository.write();

        InFileUsersRepository inFileUsersRepository2 = new InFileUsersRepository();
        User user2 = inFileUsersRepository2.getUsers().get(0);
        assertEquals("Ivan", user2.getName());
        assertEquals(20, user2.getAge());
    }
}