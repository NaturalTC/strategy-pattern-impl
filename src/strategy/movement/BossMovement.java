package strategy.movement;

import strategy.behavior.MovementBehavior;

public class BossMovement implements MovementBehavior
{
    @Override
    public void move()
    {
        System.out.println("The boss has moved");
    }
}
