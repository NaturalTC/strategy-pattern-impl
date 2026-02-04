package model.character_types;

import model.Character;

public class MainCharacter extends Character {
    public MainCharacter(String name, int age) {
        super(name, age);
    }

    public void display(){
        System.out.println("This is the main character");
    }
}
