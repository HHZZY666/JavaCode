package com.hzyedu.extend_.improve_;

import com.hzyedu.extend_.Graduate;
import com.hzyedu.extend_.Pupil;

public class Extends {
    public static void main(String[] args) {
        com.hzyedu.extend_.Pupil pupil = new Pupil();
        pupil.name = "银角大王~";
        pupil.age = 11;
        pupil.testing();
        pupil.setScore(50);
        pupil.showInfo();

        com.hzyedu.extend_.Graduate graduate = new Graduate();
        graduate.name = "金角大王~";
        graduate.age = 23;
        graduate.testing();
        graduate.setScore(80);
        graduate.showInfo();
    }
}
