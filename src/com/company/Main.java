package com.company;

public class Main {

    public static void main(String[] args) {
        Hero[] heroes = {new Medic(),new Magic(),new Warrior()};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();

        }
    }
}
