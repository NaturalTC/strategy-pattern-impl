package strategy.movement;

import strategy.behavior.MovementBehavior;

public class WalkMovement implements MovementBehavior
{
    @Override
    public void movement()
    {
        System.out.println("The character is walking");
    }
}
