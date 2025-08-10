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
public abstract class PowerUpSlot {
    private PowerUp power;
    private int usesLeft;
    
    public PowerUpSlot()
    {
        SetPowerInSlot();
    }
    public void UsePowerInSlot()
    {
        power.use();
    }
    public void ChangePowerInSlot(PowerUp power)
    {
        this.power = power;
    }
    
    public void SetPowerInSlot()
    {
        this.usesLeft = 3;
        this.power = setPower();
    }
    public abstract PowerUp setPower();
    
}
