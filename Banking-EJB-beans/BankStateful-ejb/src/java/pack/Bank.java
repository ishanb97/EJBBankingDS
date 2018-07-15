/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import javax.ejb.Stateful;

/**
 *
 * @author lenovo
 */
@Stateful
public class Bank implements BankLocal {

    double bal;
    @Override
    public double deposit(double amt) {
        bal=bal+amt;
        return bal;
    }
    

    @Override
    public double withdraw(double amt) {
         if(bal>=amt)
        {
        bal=bal-amt;
        return bal;
        }
        else
        {
            return -1;
        }
    }

    @Override
    public double Check() {
        return bal;
    }

    @Override
    public String details1() {
        return null;
    }

    @Override
    public String details(long acc, String name) {
        return "Name: "+name+"\nAccount Number: "+acc+"\nBalance: "+bal;
    }
    
}
