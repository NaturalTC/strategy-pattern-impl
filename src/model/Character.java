package model;

import strategy.behavior.JumpBehavior;
import strategy.behavior.MovementBehavior;

public class Character {

    // Attributes
    private String name;
    private int age;
    private MovementBehavior movementBehavior;
    private JumpBehavior jumpBehavior;

    // Constructor
    public Character(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // Setters
    public void setAge(int age) { this.age = age; }
    public void setName(String name) { this.name = name; }

    // Strategy Setters
    public void setMovementBehavior(MovementBehavior mb) { movementBehavior = mb; }
    public void setJumpBehavior(JumpBehavior jb) { jumpBehavior = jb; }
}
