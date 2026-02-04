package strategy.movement;

import strategy.behavior.MovementBehavior;

public class RunMovement implements MovementBehavior
{
    @Override
    public void movement()
    {
        System.out.println("The character is running");
    }
}
