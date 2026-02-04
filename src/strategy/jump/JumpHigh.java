package strategy.jump;

import strategy.behavior.JumpBehavior;

public class JumpHigh implements JumpBehavior
{
    @Override
    public void jump()
    {
        System.out.println("The character performs a high jump");
    }
}
