package Factory_Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Factory_Pattern.Factory_1.Animal;
import Factory_Pattern.Factory_1.AnimalFactory;
import Factory_Pattern.Factory_Advance.Employee;
import Factory_Pattern.Factory_Advance.EmployeeFactory;
import java.util.ArrayList;

/**
 *
 * @author abdullah
 */
public class Program {
       public static void main(String[] args)
       {
           
           Employee empoloyee = EmployeeFactory.creatEmployee("FullTimeEmployee");
           System.out.println(empoloyee.getReport());
           
       }
}
