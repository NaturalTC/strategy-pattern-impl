package strategy.jump;

import strategy.behavior.JumpBehavior;

public class JumpLow implements JumpBehavior
{
    @Override
    public void jump()
    {
        System.out.println("The character performs a low jump");
    }
}
