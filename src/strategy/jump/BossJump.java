package strategy.jump;

import strategy.behavior.JumpBehavior;

public class BossJump implements JumpBehavior
{
    @Override
    public void jump()
    {
        System.out.println("The boss has jumped");
    }
}
