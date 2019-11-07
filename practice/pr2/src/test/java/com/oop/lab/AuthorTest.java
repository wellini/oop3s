package com.oop.lab;

import org.junit.Test;

import static org.junit.Assert.*;

public class AuthorTest {

    @Test
    public void testToString() {
        Author author = new Author("Alex", "i4iksy@yahoo.com", 'M');
        assertEquals("Author{name='Alex', email='i4iksy@yahoo.com', gender=M}", author.toString());
    }
}