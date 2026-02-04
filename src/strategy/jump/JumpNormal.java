package strategy.jump;

import strategy.behavior.JumpBehavior;

public class JumpNormal implements JumpBehavior
{
    @Override
    public void jump()
    {
        System.out.println("The character performs a normal jump");
    }
}
