/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory_Method_Pattern;

/**
 *
 * @author abdullah
 */
public class DoubleJumpSlot extends PowerUpSlot{

    @Override
    public PowerUp setPower() {
        return new DoubleJump();
    }
    
}
