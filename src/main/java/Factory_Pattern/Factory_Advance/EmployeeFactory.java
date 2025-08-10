
package Factory_Pattern.Factory_Advance;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeFactory {

    public static Employee creatEmployee(String empolyeeType) {
        Employee employee = null;
        File dir = new File("C:\\Users\\abdullah\\Desktop\\java\\projects\\Design Pattern\\src\\Factory_Pattern\\Factory_Advance\\Employee_Types");
        File[] classes = dir.listFiles();
        for (File f : classes) {
//            System.out.println(f.getName());
            String className = f.getName().split("\\.")[0];  // مثلاً: "PartTimeEmployee"
            String fullClassName = "Factory_Pattern.Factory_Advance.Employee_Types." + className;
            
            if (className.equals(empolyeeType)) {
                try {
                    Class temp = Class.forName(fullClassName);
                    try {
                        employee = (Employee) temp.newInstance();
                    } catch (InstantiationException ex) {
                        Logger.getLogger(EmployeeFactory.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(EmployeeFactory.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(EmployeeFactory.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return employee;

    }
}
