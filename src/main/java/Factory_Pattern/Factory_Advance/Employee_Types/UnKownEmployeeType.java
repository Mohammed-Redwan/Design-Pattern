
package Factory_Pattern.Factory_Advance.Employee_Types;
import Factory_Pattern.Factory_Advance.Employee;

public class UnKownEmployeeType implements Employee{

    @Override
    public String getReport() {
        return "Unkown Type";
    }
    
}
