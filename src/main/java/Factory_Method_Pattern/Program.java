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
public class Program {

    public static void main(String[] args) {
        PowerUpSlot[] slots = new PowerUpSlot[2];

        slots[0] = new DashSlot();
        slots[1] = new DoubleJumpSlot();

        for (PowerUpSlot slot : slots) {
            slot.UsePowerInSlot();
        }

        slots[0].ChangePowerInSlot(new DoubleJump());
        slots[1].ChangePowerInSlot(new Dash());

        for (PowerUpSlot slot : slots) {
            slot.UsePowerInSlot();
        }
    }
}
