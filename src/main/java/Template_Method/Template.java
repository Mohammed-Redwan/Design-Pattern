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
public abstract class Template {

    public final int doOperations(int rawData) {
        return step4(step3(step2(step1(rawData))));
    }

    protected abstract int step1(int rawData);

    protected abstract int step2(int o1r);

    protected abstract int step3(int o2r);

    protected abstract int step4(int o3r);
}
