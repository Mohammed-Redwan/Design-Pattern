/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template_Method;

/**
 *
 * @author abdullah
 */
public class Sub1 extends Template{

    @Override
    protected int step1(int rawData) {
        return rawData * 2;
    }

    @Override
    protected int step2(int o1r) {
        return o1r - 4;
    }

    @Override
    protected int step3(int o2r) {
        return o2r + 9;
    }

    @Override
    protected int step4(int o3r) {
        return o3r * 2;
    }
    
}
