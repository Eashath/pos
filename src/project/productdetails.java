/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author ICTSTUDENT
 */
public class productdetails extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement PST=null;
ResultSet RS=null;
Statement st;
    /**
     * Creates new form productdetails
     */
    public productdetails() {
        
        initComponents();
        setDefaultCloseOperation (productdetails.DISPOSE_ON_CLOSE);
        comeload();
        comload1();
        comload2();
        showdepth();
        showdepth1();
        showdepth2();
        namecombo.setSelectedItem("");
        AutoCompleteDecorator.decorate(namecombo);
        AutoCompleteDecorator.decorate(companycombo);
        AutoCompleteDecorator.decorate(produc);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        namecombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        companycombo = new javax.swing.JComboBox<>();
        produc = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(6, 12, 2, 12, new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("PRODUCT DETAILS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 12, 6, 12, new java.awt.Color(0, 0, 0)));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "COMPANY", "PRICE", "QTY"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("PRODUCT NAME");

        namecombo.setEditable(true);
        namecombo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                namecomboPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("PRODUCT ID");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("COMPANY PRODUCT");

        companycombo.setEditable(true);
        companycombo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                companycomboPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        produc.setEditable(true);
        produc.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                producPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(namecombo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(produc, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3)
                        .addGap(43, 43, 43)
                        .addComponent(companycombo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(namecombo)
                        .addComponent(jLabel2)
                        .addComponent(produc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(companycombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public ArrayList<Project>Projectlist(String ValToSerach)
    {
    ArrayList<Project> Projectlist=new ArrayList<>();
    try
    {
        conn=dbconnection.getConnection();
//        PST=conn.prepareStatement("Select * from product where productid=?;");
        PST=conn.prepareStatement("Select * from product where productname=?;");
        PST.setString(1, namecombo.getSelectedItem().toString());
        RS=PST.executeQuery();
        Project Project;
        while(RS.next())
        {
        
            Project=new Project(RS.getString("productid"),RS.getString("productname"),RS.getString("productcompanyname"),RS.getString("productunitprice"),RS.getString("productqty"),RS.getString("productnormalprice"));
            Projectlist.add(Project);
        }
    
    }
    catch(SQLException e)
    {
        //JOptionPane.showMessageDialog(null, e);
    }
    return Projectlist;
    }
    //.......................................................................................
     public ArrayList<Project>Projectlist1(String ValToSerach)
    {
    ArrayList<Project> Projectlist1=new ArrayList<>();
    try
    {
        conn=dbconnection.getConnection();
//        PST=conn.prepareStatement("Select * from product where productid=?;");
        PST=conn.prepareStatement("Select * from product where productcompanyname=?");
        PST.setString(1, companycombo.getSelectedItem().toString());
        RS=PST.executeQuery();
        Project Project;
        while(RS.next())
        {
        
            Project=new Project(RS.getString("productid"),RS.getString("productname"),RS.getString("productcompanyname"),RS.getString("productunitprice"),RS.getString("productqty"),RS.getString("productnormalprice"));
            Projectlist1.add(Project);
        }
    
    }
    catch(SQLException e)
    {
        //JOptionPane.showMessageDialog(null, e);
    }
    return Projectlist1;
    }
    //...............................................
     public ArrayList<Project>Projectlist2(String ValToSerach)
    {
    ArrayList<Project> Projectlist2=new ArrayList<>();
    try
    {
        conn=dbconnection.getConnection();
        PST=conn.prepareStatement("Select * from product where productid=?");
        PST.setString(1, produc.getSelectedItem().toString());
        RS=PST.executeQuery();
        Project Project;
        while(RS.next())
        {
        
            Project=new Project(RS.getString("productid"),RS.getString("productname"),RS.getString("productcompanyname"),RS.getString("productunitprice"),RS.getString("productqty"),RS.getString("productnormalprice"));
            Projectlist2.add(Project);
        }
    
    }
    catch(SQLException e)
    {
        //JOptionPane.showMessageDialog(null, e);
    }
    return Projectlist2;
    }
    private void namecomboPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_namecomboPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        
        try{
            conn=dbconnection.getConnection();
            PST=conn.prepareStatement("SELECT * FROM product Where productname=?");

            PST.setString(1,namecombo.getSelectedItem().toString());
//            namecombo.setSelectedItem("");
//            AutoCompleteDecorator.decorate(namecombo);
            RS=PST.executeQuery();
            if(RS.next())
            {
                showdepth();
            }
           

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Invalite Product ID!!");

        }
    }//GEN-LAST:event_namecomboPopupMenuWillBecomeInvisible

    private void companycomboPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_companycomboPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        
//        AutoCompleteDecorator.decorate(companycombo);
        try{
            conn=dbconnection.getConnection();
            PST=conn.prepareStatement("SELECT * FROM product Where productcompanyname=?");
            
            PST.setString(1,companycombo.getSelectedItem().toString());

            RS=PST.executeQuery();
            if(RS.next())
            {
                showdepth1();
            }
           

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Invalite Product ID!!");

        }
    }//GEN-LAST:event_companycomboPopupMenuWillBecomeInvisible

    private void producPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_producPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        try{
            conn=dbconnection.getConnection();
            PST=conn.prepareStatement("SELECT * FROM product Where productid=?");

            PST.setString(1,produc.getSelectedItem().toString());
//            produc.setSelectedItem("");
            AutoCompleteDecorator.decorate(produc);
            RS=PST.executeQuery();
            if(RS.next())
            {
                showdepth2();
            }
           

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Invalite Product ID!!");

        }
    }//GEN-LAST:event_producPopupMenuWillBecomeInvisible

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(productdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(productdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(productdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(productdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new productdetails().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> companycombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> namecombo;
    private javax.swing.JComboBox<String> produc;
    // End of variables declaration//GEN-END:variables

    private void comeload() {
        try{
            conn=dbconnection.getConnection();
            PST=conn.prepareStatement("SELECT productname FROM product");
            RS=PST.executeQuery();
            while(RS.next())
            {
                String did=RS.getString("productname");
                namecombo.addItem(did);
            }
            } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,ex);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    private void comload1() {
        try{
            conn=dbconnection.getConnection();
            PST=conn.prepareStatement("SELECT companyname FROM company");
            RS=PST.executeQuery();
            while(RS.next())
            {
                String did=RS.getString("companyname");
                companycombo.addItem(did);
            }
            } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,ex);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }
//.........................................
     private void comload2() {
        try{
            conn=dbconnection.getConnection();
            PST=conn.prepareStatement("SELECT productid FROM product");
            RS=PST.executeQuery();
            while(RS.next())
            {
                String did=RS.getString("productid");
                produc.addItem(did);
            }
            } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,ex);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }
    private void showdepth() {
         ArrayList<Project> list=Projectlist(namecombo.getSelectedItem().toString());
         
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"productid","productname","productcompanyname","productnormalprice","productqty"});
        Object [] row=new Object[5];
        
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getproductid();
            row[1]=list.get(i).getproductname();
            row[2]=list.get(i).getproductcompanyname();
            //row[3]=list.get(i).getproductunitprice();
            
            row[3]=list.get(i).getproductnormalprice();
            row[4]=list.get(i).getproductqty();
            
            model.addRow(row);
        }
        jTable1.setModel(model);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void showdepth1() {
         ArrayList<Project> list=Projectlist1(companycombo.getSelectedItem().toString());
         
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"productid","productname","productcompanyname","productnormalprice","productqty"});
        Object [] row=new Object[5];
        
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getproductid();
            row[1]=list.get(i).getproductname();
            row[2]=list.get(i).getproductcompanyname();
            //row[3]=list.get(i).getproductunitprice();
            
            row[3]=list.get(i).getproductnormalprice();
            row[4]=list.get(i).getproductqty();
            
            model.addRow(row);
        }
        jTable1.setModel(model);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void showdepth2() {
        ArrayList<Project> list=Projectlist2(produc.getSelectedItem().toString());
         
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"productid","productname","productcompanyname","productnormalprice","productqty"});
        Object [] row=new Object[5];
        
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getproductid();
            row[1]=list.get(i).getproductname();
            row[2]=list.get(i).getproductcompanyname();
            //row[3]=list.get(i).getproductunitprice();
            
            row[3]=list.get(i).getproductnormalprice();
            row[4]=list.get(i).getproductqty();
            
            model.addRow(row);
        }
        jTable1.setModel(model);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
