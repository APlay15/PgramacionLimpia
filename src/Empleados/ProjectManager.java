/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucat
 */
public class ProjectManager extends Employee {

    int bonus;

    @Override
    public int payAmount() {
        return monthlySalary + bonus;
    }
}
