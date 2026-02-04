package strategy.movement;

import strategy.behavior.MovementBehavior;

public class RunMovement implements MovementBehavior
{
    @Override
    public void move()
    {
        System.out.println("The character is running");
    }
}
