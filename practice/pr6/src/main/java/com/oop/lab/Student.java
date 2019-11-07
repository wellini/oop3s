package com.oop.lab;

public class Student implements Comparable<Student> {

    private long id;

    public Student() {
    }

    public Student(long id) {
        this.id = id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    @Override
    public int compareTo(Student cmp) {
        if (this.id == cmp.id) return 0;
        return this.id > cmp.id ? -1 : 1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
