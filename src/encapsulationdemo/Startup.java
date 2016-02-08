/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulationdemo;

/**
 *
 * @author Dell
 */
public class Startup {
    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setSsn(4567);
        obj.setEmpName("Yasir");
        obj.setEmpAge(28);
        System.out.println("Employee SSN:" + obj.getSsn());
        System.out.println("Employee Name:" + obj.getEmpName());
        System.out.println("Employee Age" + obj.getEmpAge());
    }
    
}
