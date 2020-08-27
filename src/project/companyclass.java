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
public class companyclass {
    String companyname;
    String companyphonenumber;
    String companyemail;
    String companyaddres;
public companyclass(String companyname,String companyphonenumber,String companyemail,String companyaddres)
    {
        this.companyname=companyname;
        this.companyphonenumber=companyphonenumber;
        this.companyemail=companyemail;
        this.companyaddres=companyaddres;

    }

    public String getcompanyname()
    {
        return companyname;
    }
    public String getcompanyphonenumber()
    {
        return companyphonenumber;
    }
    public String getcompanyemail()
    {
        return companyemail;
    }
    public String getcompanyaddres()
    {
        return companyaddres;
    }
    
}
