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
public class salesclass {
    String billno;
    String date;
    String customername;
    String productid;
    String productname;
    String sellingprice;
    String quantity;
    String subtotal;
    String billtotal;
    
    
    
    public salesclass(String billno,String date,String customername,String productid,String productname,String sellingprice,String quantity,String subtotal,String billtotal)
    {
        this.billno=billno;
        this.date=date;
        this.customername=customername;
        this.productid=productid;
        this.productname=productname;
        this.sellingprice=sellingprice;
        this.quantity=quantity;
        this.subtotal=subtotal;
        this.billtotal=billtotal;
    }
    
    public String getbillno()
    {
        return billno;
    }
    public String getdate()
    {
        return date;
    }
    public String getcustomername()
    {
        return customername;
    }
    public String getproductid()
    {
        return productid;
    }
    public String geproductname()
    {
        return productname;
    }
    public String getsellingprice()
    {
        return sellingprice;
    }
    public String getquantity()
    {
        return quantity;
    }
    public String getsubtotal()
    {
        return subtotal;
    }
    public String getbilltotal()
    {
        return billtotal;
    }
    
}
