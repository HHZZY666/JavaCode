package com.hzyedu.extend_;

public class Extends {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "银角大王";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(80);
        pupil.showInfo();

        Graduate graduate = new Graduate();
        graduate.name = "金角大王";
        graduate.age = 22;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();
    }
}
