import model.character_types.BossCharacter;
import model.character_types.MainCharacter;
import model.Character;
import strategy.behavior.JumpBehavior;
import strategy.jump.BossJump;
import strategy.jump.JumpHigh;
import strategy.jump.JumpNormal;
import strategy.movement.BossMovement;
import strategy.movement.RunMovement;

public class main {

    public static void main(String[] args){

        Character boss = new BossCharacter("Demi", 199);
        Character mainChar = new MainCharacter("Anna", 22);

        mainChar.setMovementBehavior(new RunMovement());
        mainChar.setJumpBehavior(new JumpNormal());

        boss.setMovementBehavior(new BossMovement());
        boss.setJumpBehavior(new BossJump());

        mainChar.display();
        mainChar.performJump();
        mainChar.performMove();
        System.out.println("\n--------------------------------------------------\n");
        boss.display();
        boss.performJump();
        boss.performMove();

    }
}
