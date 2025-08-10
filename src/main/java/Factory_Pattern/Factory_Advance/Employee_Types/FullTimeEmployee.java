/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory_Pattern.Factory_Advance.Employee_Types;

import Factory_Pattern.Factory_Advance.Employee;

/**
 *
 * @author abdullah
 */
public class FullTimeEmployee implements Employee {

    @Override
    public String getReport() {
        return "Full Time Employee And Total Salary 2000$";
    }

}
