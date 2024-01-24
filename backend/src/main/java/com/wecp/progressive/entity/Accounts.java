package com.wecp.progressive.entity;

import ch.qos.logback.core.joran.conditional.ElseAction;

public class Accounts implements Comparable<Accounts>{
    private int account_id;
    private String customer_id;
    private double balance;

    public Accounts(){

    }
    public Accounts(int account_id,String customer_id,double balance){
        this.account_id = account_id;
        this.customer_id = customer_id;
        this.balance = balance;

    }
    public int getAccount_id() {
        return account_id;
    }
    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }
    public String getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "Accounts [account_id=" + account_id + ", customer_id=" + customer_id + ", balance=" + balance + "]";
    }
    public int compareTo(Accounts obj)
    {
        if(this.getBalance()>obj.getBalance())
        {
            return -1;
        }
        else if(this.getBalance()<obj.getBalance())
        {
            return 1;
        }
        else{
            return 0;
        }
    }
    
}