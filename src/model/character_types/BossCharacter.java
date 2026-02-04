package model.character_types;

import model.Character;

public class BossCharacter extends Character {
    public BossCharacter(String name, int age) {
        super(name, age);
    }

    public void display()
    {
        System.out.println("This is a boss character");
    }
}
