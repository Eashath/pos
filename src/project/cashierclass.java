/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author ICTSTUDENT
 */
public class cashierclass {
    String id;
    String password;
    String name;
    String nic;
    String address;
    String mobilenumber;
    String homenumber;
    
    
    
    
    public cashierclass(String id,String password,String name,String nic,String address,String mobilenumber,String homenumber)
    {
        this.id=id;
        this.password=password;
        this.name=name;
        this.nic=nic;
        this.address=address;
        this.mobilenumber=mobilenumber;
        this.homenumber=homenumber;
        
    }
    
    public String getid()
    {
        return id;
    }
    public String getpassword()
    {
        return password;
    }
    public String getname()
    {
        return name;
    }
    public String getnic()
    {
        return nic;
    }
    public String getaddress()
    {
        return address;
    }
    public String getmobilenumber()
    {
        return mobilenumber;
    }
    public String gethomenumber()
    {
        return homenumber;
    }
    
}
