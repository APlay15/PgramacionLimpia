/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucat
 */
public class EmployeeFactory {
    
    public void makeEmployee(EmployeeType type) throws Exception{
        switch(type){
            case ENGINEER:
                Engineer eng = new Engineer();
            case SALESMAN:
                SalesMan salesM = new SalesMan();
            case PROJECT_MANAGER:
                ProjectManager project = new ProjectManager();
            default:
                throw new Exception("Empleado Incorrecto");
        }
    }
}
