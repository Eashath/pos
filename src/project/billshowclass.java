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
public class billshowclass {
    String billnumber;
    String date;
    String customername;
    String total;
    String cashierid;
    
     public billshowclass( String cashierid,String billnumber,String date,String customername,String total)
    {
        this.billnumber=billnumber;
        this.date=date;
        this.customername=customername;
        this.total=total;
        this.cashierid=cashierid;
    }
    
    public String getbillnumber()
    {
        return billnumber;
    }
    public String getdate()
    {
        return date;
    }
    public String getcustomername()
    {
        return customername;
    }

    public String gettotal()
    {
        return total;
    }
    public String getcashierid()
    {
        return cashierid;
    }
}
