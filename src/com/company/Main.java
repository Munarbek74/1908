package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Swimable[] oceanariums = {
                new Shark(),
                new Shark(),
                new Shark(),
                new Shark(),
                new Shark(),
                new Duck(),
                new Duck(),
                new Duck(),
                new Duck(),
                new Duck(),
                new Turtle(),
                new Turtle(),
                new Turtle(),
                new Turtle(),
                new Turtle()


        };
        for (Swimable a: oceanariums) {
       a.method();
        }
    }
}
