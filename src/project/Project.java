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
public class Project {
    String productid;
    String productname;
    String productcompanyname;
    String productunitprice;
    String productqty;
    String productnormalprice;
    //String date;
    ///String total;
    
    
    
    public Project(String productid,String productname,String productcompanyname,String productunitprice,String productqty,String productnormalprice)
    {
        this.productid=productid;
        this.productname=productname;
        this.productcompanyname=productcompanyname;
        this.productunitprice=productunitprice;
        this.productqty=productqty;
        this.productnormalprice=productnormalprice;
        //this.date=date;
        //this.total=total;
        
    }
    
    public String getproductid()
    {
        return productid;
    }
    public String getproductname()
    {
        return productname;
    }
    public String getproductcompanyname()
    {
        return productcompanyname;
    }
    public String getproductunitprice()
    {
        return productunitprice;
    }
    public String getproductqty()
    {
        return productqty;
    }
    public String getproductnormalprice()
    {
        return productnormalprice;
    }
    //public String getdate()
    //{
       // return date;
    //}
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        new login().setVisible(true);
        
        splash ld=new splash();
        ld.setVisible(true);
        try{
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(20);
                splash.loadingnum.setText(Integer.toString(i)+"%");
               // ld.loadingbar.setValue(i);
               if(i==100)
               {
                   
                  ld.setVisible(false);
                  login l=new login();
                  l.setVisible(true);
               }
                
            }
            
        }
        catch(InterruptedException e)
        {
            
        }
        
    
    }
   }
