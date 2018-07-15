/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import javax.ejb.Local;

/**
 *
 * @author lenovo
 */
@Local
public interface BankLocal {

    double deposit(double amt);

    double withdraw(double amt);

    double Check();

    String details1();

    String details(long acc, String name);
    
}
