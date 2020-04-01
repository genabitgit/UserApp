package com.company;

public class Main {

    public static void main(String[] args) {
        User tester = new User(7, "Developer");
        System.out.println(tester.getId());
        System.out.println(tester.getVacancy());
    }
}

class User {
    private long id;
    private String vacancy;

    public User(int id, String vacancy) {
        this.id = id;
        this.vacancy = vacancy;
    }

    long getId() {
        return id;
    }

    String getVacancy() {
        return vacancy;
    }
}
