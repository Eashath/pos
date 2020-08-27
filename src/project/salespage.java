/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ICTSTUDENT
 */
public class salespage extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    
Connection conn=null;
PreparedStatement PST=null;
ResultSet RS=null;
Statement st;
double a;
    double b;
    double result;
    int flag1=0;

    /**
     * Creates new form salespage
     */

    public salespage() 
    {
        
        initComponents();
        
        setDefaultCloseOperation (salespage.DISPOSE_ON_CLOSE);
        comeload();
        billno();
        totalsum();
        
        
        pidpan.setVisible(false);
        qtypan.setVisible(false);
        jPanel12.setVisible(false);
        customername.requestFocus();
        
         AutoCompleteDecorator.decorate(productid1);
         
        //........................................
         setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
//        this.setLocation(500, 200);
        final salespage gui = this;
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int i =  JOptionPane.showConfirmDialog(gui,
                        "Are you sure to exit?", "Closing dialog",
                         JOptionPane.YES_NO_OPTION);
                if (i == JOptionPane.YES_OPTION) {
                 //   .....................................
                    
                     try{
                        String query = "INSERT INTO daysales(date,daytotal,nosales)values(?,?,?)";
                        conn = dbconnection.getConnection();
                        PST = conn.prepareStatement(query);
                        PST.setString(1,jLabel1.getText());
                        PST.setString(2,billtotal.getText());
                        PST.setString(3,salescount.getText());
                
                

                PST.executeUpdate();
                System.out.println("gotline");
//                     JOptionPane.showMessageDialog(null, "<html><b><font color=rgb(0, 0, 255) font size=\"4\"font face=\"Times New Roman\"> </font></b></html>", "Details", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("C:\\Users\\ICTSTUDENT\\Desktop\\project\\src\\project\\images\\tenor (1).gif"));
                      
                     
                     
            }
            catch(SQLException ex)
            {
                System.out.println("gotline");
//                            JOptionPane.showMessageDialog(null, "Duplicate Update");

                System.err.println(ex);
            }
                
            try{
                        String query1 = "UPDATE daysales set nosales=?,daytotal=? where date=?";
                        conn = dbconnection.getConnection();
                        PST = conn.prepareStatement(query1);
                        
                        PST.setString(1,salescount.getText());
                        PST.setString(2,billtotal.getText());
                        PST.setString(3,jLabel1.getText());
                
                

                PST.executeUpdate();
                System.out.println("gotline");
                     JOptionPane.showMessageDialog(null, "Save All Data sucessfully!!");
                

            }
            catch(SQLException ex)
            {
                System.out.println("gotline");
//                            JOptionPane.showMessageDialog(null,ex);

                System.err.println(ex);
            }
//         
                     
                     
                     
                     
                    //.........................................
                    System.exit(0);
                }
            }
        });

        setVisible(true);
         
       
        //..............................................
        
//       cashierid.setText(login.uid.getText());
{
         new Thread(){
         
            
            @Override
            public void run(){
                while(true){
                    Date dNow = new Date( );{
                    
                    SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
                    String time = ""+ft.format(dNow);
                    SimpleDateFormat bn = new SimpleDateFormat ("E hh:mm:ss a");
                    String time1 = ""+bn.format(dNow);
                    
                    jLabel1.setText(time);
                    jLabel7.setText(time1);
                    
                }
                
            }
            }
        } .start();
         
         }
         showdepth1();
         daytotal();
         int co= jTable3.getRowCount();
         salescount.setText(String.valueOf(co));

    }
     
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel18 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        nosale = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        reprint = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        salescount = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        sellno = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        billtotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        productdelete = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        billsubtotal = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        print = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        cashierid = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        productid1 = new javax.swing.JComboBox<>();
        qtypan = new javax.swing.JPanel();
        qty = new javax.swing.JTextField();
        asdfer = new javax.swing.JLabel();
        pidpan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        productid = new javax.swing.JTextField();
        productname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        productprice = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        aqty = new javax.swing.JTextField();
        buyprice = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cnamepan = new javax.swing.JPanel();
        customername = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        total = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton33 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        TextField = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buymore");
        setResizable(false);

        jPanel18.setBorder(javax.swing.BorderFactory.createMatteBorder(6, 12, 2, 12, new java.awt.Color(0, 0, 0)));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/bm.png"))); // NOI18N

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "SALES PAGE"));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/checkout-48.png"))); // NOI18N

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/home-24.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(293, 293, 293)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 53, Short.MAX_VALUE))))
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 98, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 12, 2, 12, new java.awt.Color(0, 0, 0)));
        jPanel14.setRequestFocusEnabled(false);
        jPanel14.setVerifyInputWhenFocusTarget(false);

        jPanel2.setLayout(null);

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "NO ITEMS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        nosale.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nosale.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nosale, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nosale, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel19);
        jPanel19.setBounds(780, 430, 100, 50);

        jPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        reprint.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        reprint.setText("RE PRINT");
        reprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reprintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reprint)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(reprint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.add(jPanel16);
        jPanel16.setBounds(410, 760, 210, 50);

        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        salescount.setEditable(false);
        salescount.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("NO OF SALES");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salescount, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salescount, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel11);
        jPanel11.setBounds(630, 760, 220, 50);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "DATE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(690, 20, 130, 40);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "TIME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(820, 20, 160, 40);

        jTable3.setAutoCreateRowSorter(true);
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SELLER", "BILL NO", "DATE & TIME", "COUSTOMER NAME", "TOTAL"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable3MouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTable3);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(410, 500, 740, 252);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "BILL NO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel4.setRequestFocusEnabled(false);
        jPanel4.setVerifyInputWhenFocusTarget(false);

        sellno.setEditable(false);
        sellno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        sellno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sellno, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(sellno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(30, 20, 110, 50);

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        billtotal.setEditable(false);
        billtotal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        billtotal.setForeground(new java.awt.Color(204, 0, 51));
        billtotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("DAY TOTAL");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(billtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(billtotal))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.add(jPanel5);
        jPanel5.setBounds(880, 760, 270, 50);

        productdelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        productdelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/delete-bin-24.png"))); // NOI18N
        productdelete.setText("DELETE");
        productdelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        productdelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productdeleteActionPerformed(evt);
            }
        });
        jPanel2.add(productdelete);
        productdelete.setBounds(610, 430, 110, 30);

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("BILL TOTAL");

        billsubtotal.setEditable(false);
        billsubtotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        billsubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billsubtotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(billsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(billsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel6);
        jPanel6.setBounds(900, 430, 247, 44);

        update.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/update-left-rotation-24.png"))); // NOI18N
        update.setText("CHANGE");
        update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.setPreferredSize(new java.awt.Dimension(100, 40));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel2.add(update);
        update.setBounds(480, 430, 120, 30);

        print.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/print-24.png"))); // NOI18N
        print.setText("PRINT");
        print.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        print.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        print.setPreferredSize(new java.awt.Dimension(100, 40));
        print.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                printMouseMoved(evt);
            }
        });
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printMouseExited(evt);
            }
        });
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel2.add(print);
        print.setBounds(360, 430, 100, 30);

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "CASHIER ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        cashierid.setEditable(false);
        cashierid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cashierid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cashierid)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cashierid, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.add(jPanel13);
        jPanel13.setBounds(1010, 20, 130, 50);

        jPanel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("PRODUCT NAME");
        jLabel12.setToolTipText("");

        productid1.setEditable(true);
        productid1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                productid1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                productid1PopupMenuWillBecomeVisible(evt);
            }
        });
        productid1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productid1MouseClicked(evt);
            }
        });
        productid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productid1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(productid1, 0, 153, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(productid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel15);
        jPanel15.setBounds(160, 20, 310, 46);

        qtypan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        qtypan.setPreferredSize(new java.awt.Dimension(300, 44));

        qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qtyKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qtyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtyKeyTyped(evt);
            }
        });

        asdfer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        asdfer.setText("QTY");

        javax.swing.GroupLayout qtypanLayout = new javax.swing.GroupLayout(qtypan);
        qtypan.setLayout(qtypanLayout);
        qtypanLayout.setHorizontalGroup(
            qtypanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qtypanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(asdfer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        qtypanLayout.setVerticalGroup(
            qtypanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qtypanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(qtypanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asdfer)
                    .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(qtypan);
        qtypan.setBounds(30, 320, 312, 44);

        pidpan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pidpan.setPreferredSize(new java.awt.Dimension(312, 167));
        pidpan.setRequestFocusEnabled(false);
        pidpan.setVerifyInputWhenFocusTarget(false);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("PRODUCT ID");

        productid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                productidKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                productidKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                productidKeyTyped(evt);
            }
        });

        productname.setEditable(false);
        productname.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("PRODUCT NAME");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("SELL PRICE");
        jLabel4.setToolTipText("");

        productprice.setEditable(false);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("AVAILABLE QTY");

        aqty.setEditable(false);

        buyprice.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("BUY PRICE");

        javax.swing.GroupLayout pidpanLayout = new javax.swing.GroupLayout(pidpan);
        pidpan.setLayout(pidpanLayout);
        pidpanLayout.setHorizontalGroup(
            pidpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pidpanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pidpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pidpanLayout.createSequentialGroup()
                        .addGroup(pidpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(pidpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productname, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pidpanLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aqty, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pidpanLayout.createSequentialGroup()
                        .addGroup(pidpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pidpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buyprice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(productprice, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        pidpanLayout.setVerticalGroup(
            pidpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pidpanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pidpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(productid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pidpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(productname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pidpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(aqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pidpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(13, 13, 13)
                .addGroup(pidpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buyprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel2.add(pidpan);
        pidpan.setBounds(30, 140, 312, 167);

        cnamepan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cnamepan.setPreferredSize(new java.awt.Dimension(300, 44));

        customername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                customernameKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("CUSTOMER NAME");

        javax.swing.GroupLayout cnamepanLayout = new javax.swing.GroupLayout(cnamepan);
        cnamepan.setLayout(cnamepanLayout);
        cnamepanLayout.setHorizontalGroup(
            cnamepanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cnamepanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(customername, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        cnamepanLayout.setVerticalGroup(
            cnamepanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cnamepanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cnamepanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(customername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(cnamepan);
        cnamepan.setBounds(30, 90, 312, 44);

        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        total.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("TOTAL");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel12);
        jPanel12.setBounds(30, 380, 312, 46);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setPreferredSize(new java.awt.Dimension(350, 347));

        jButton33.setText("0");
        jButton33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton22.setText("2");
        jButton22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton19.setText("5");
        jButton19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setText("6");
        jButton20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton23.setText("1");
        jButton23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton21.setText("3");
        jButton21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton25.setText(".");
        jButton25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton34.setText("DEL");
        jButton34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton26.setText("X");
        jButton26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setText("/");
        jButton27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton13.setText("=");
        jButton13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton28.setText("-");
        jButton28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setText("+");
        jButton29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton15.setText("7");
        jButton15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("8");
        jButton16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton32.setText("AC");
        jButton32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton17.setText("9");
        jButton17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        TextField.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        TextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldActionPerformed(evt);
            }
        });
        TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldKeyTyped(evt);
            }
        });

        jButton18.setText("4");
        jButton18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton34)
                    .addComponent(jButton32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(30, 500, 358, 300);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setToolTipText("");
        jPanel7.setPreferredSize(new java.awt.Dimension(937, 372));
        jPanel7.setRequestFocusEnabled(false);

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCT ID", "PRODUCT NAME", "PRICE", "QTY", "SUB TOTAL"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel7);
        jPanel7.setBounds(363, 84, 780, 332);
        jPanel7.getAccessibleContext().setAccessibleName("");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/backr.png"))); // NOI18N
        jLabel17.setText("jLabel17");
        jLabel17.setBorder(javax.swing.BorderFactory.createMatteBorder(6, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel17);
        jLabel17.setBounds(10, 10, 1150, 810);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.setOpaque(false);
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/user-24.png"))); // NOI18N
        jButton1.setText("CAHSIER");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/report-24.png"))); // NOI18N
        jButton2.setText("SALES REPORT");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/sales-performance-24.png"))); // NOI18N
        jButton3.setText("SALES  PROFIT");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/company-24.png"))); // NOI18N
        jButton5.setText("COMPANY");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/product-24.png"))); // NOI18N
        jButton4.setText("PRODUCT");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/update-left-rotation-24.png"))); // NOI18N
        jButton6.setText("UPDATE QTY");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/search-24.png"))); // NOI18N
        jButton9.setText("SEARCH");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "OTHERS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     public ArrayList<billshowclass>billshowclasslist(String ValToSerach)
    {
    ArrayList<billshowclass> billshowclasslist=new ArrayList<>();
    try
    {
        conn=dbconnection.getConnection();
        PST=conn.prepareStatement("Select * from billno where date=?");
        PST.setString(1, jLabel1.getText());
        RS=PST.executeQuery();
        billshowclass billshowclass;
        while(RS.next())
        {
        
            billshowclass = new billshowclass(RS.getString("cashierid"),RS.getString("billnumber"),RS.getString("date"),RS.getString("customername"),RS.getString("total"));
            billshowclasslist.add(billshowclass);
        }
    
    }
    catch(SQLException e)
    {
        //JOptionPane.showMessageDialog(null, e);
    }
    return billshowclasslist;
    }
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        productdetails pd=new productdetails();
        pd.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new updateqty().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

//    public ArrayList<billshowclass>billshowclasslist()
//    {
//    ArrayList<billshowclass> billshowclasslist=new ArrayList<>();
//    try
//    {
//        conn=dbconnection.getConnection();
//        
//        PST=conn.prepareStatement("Select * from billno where date=?");
//        PST.setString(1, jLabel1.getText());
//        st=conn.createStatement();
//        RS=st.executeQuery("Select * from billno;");
//        RS=PST.executeQuery();
//        billshowclass billshowclass;
//        while(RS.next())
//        {
//        
//            billshowclass = new billshowclass(RS.getString("billnumber"),RS.getString("date"),RS.getString("customername"),RS.getString("total"));
//            billshowclasslist.add(billshowclass);
//        }
//    
//    }
//    catch(SQLException e)
//    {
//        //JOptionPane.showMessageDialog(null, e);
//    }
//    return billshowclasslist;
      //---------------------------------------------------------------------------------------------------------
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new productform().setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new companydetails().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new salesreport().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new cashierform().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int i=jTable2.getSelectedRow();
        TableModel model=jTable2.getModel();
        productid.setText(model.getValueAt(i,0).toString());
        productname.setText(model.getValueAt(i,1).toString());
        productprice.setText(model.getValueAt(i,2).toString());
        qty.setText(model.getValueAt(i,3).toString());
        total.setText(model.getValueAt(i,4).toString());
         try{
            conn=dbconnection.getConnection();
            PST=conn.prepareStatement("SELECT * FROM product Where productid=?");

            PST.setString(1,productid.getText());

            RS=PST.executeQuery();
            if(RS.next()) {
            } else {
            }
            {

                aqty.setText(RS.getString("productqty"));
                buyprice.setText(RS.getString("productunitprice"));
            }

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Invalite Product ID!!");

        }
        
        qtypan.setVisible(true);
        total.setVisible(true);
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        String s = TextField.getText();
        TextField.setText(s+'4');// TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        String s = TextField.getText();
        TextField.setText(s+'9');// TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        TextField.setText("");
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        String s = TextField.getText();
        TextField.setText(s+'8');// TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        String s = TextField.getText();
        TextField.setText(s+'7');// TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed

        String s = TextField.getText();
        a=Double.parseDouble(s);
        TextField.setText("");
        flag1=1;
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        String s = TextField.getText();
        a=Double.parseDouble(s);
        TextField.setText("");
        flag1=2;// TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        String s = TextField.getText();

        switch (flag1) {
            case 1:
            b=Double.parseDouble(s);
            result=a+b;
            break;
            case 2:
            b=Double.parseDouble(s);
            result=a-b;
            break;
            case 3:
            b=Double.parseDouble(s);
            result=a*b;
            break;
            case 4:
            b=Double.parseDouble(s);
            if(b==0) {
                JOptionPane.showMessageDialog(null,"Invalid input");
            }
            else{
                result=a/b;
            }
            break;
            case 5:
            result=Math.sin(Math.toRadians(a));
            break;
            case 6:
            result=Math.cos(Math.toRadians(a));
            break;
            case 7:
            if(a==90){
                JOptionPane.showMessageDialog(null,"Invalid input");
            }
            else{
                result=Math.tan(Math.toRadians(a));
            }
            break;
            case 8:
            b=Double.parseDouble(s);
            result=Math.pow(a, b);
            break;
            case 9:
            result=Math.sqrt(a);
            break;
            default:
            break;
        }

        if(result!=Math.ceil(result)) TextField.setText(result+"");
        else{
            TextField.setText(Math.round(result)+"");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        String s = TextField.getText();
        a=Double.parseDouble(s);
        TextField.setText("");
        flag1=4;// TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        String s = TextField.getText();
        a=Double.parseDouble(s);
        TextField.setText("");
        flag1=3;// TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        String s = TextField.getText();
        StringBuilder str = new StringBuilder(s);
        str.deleteCharAt(s.length()-1);
        TextField.setText(str.toString());// TODO add your handling code here:
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        String s = TextField.getText();
        TextField.setText(s+'.');// TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        String s = TextField.getText();
        TextField.setText(s+'3');// TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        String s = TextField.getText();
        TextField.setText(s+'1');// TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        String s = TextField.getText();
        TextField.setText(s+'6');// TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        String s = TextField.getText();
        TextField.setText(s+'5');// TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        String s = TextField.getText();
        TextField.setText(s+'2');// TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        String s = TextField.getText();
        TextField.setText(s+'0');// TODO add your handling code here:
    }//GEN-LAST:event_jButton33ActionPerformed

    private void customernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customernameKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_ENTER ||evt.getKeyCode() == KeyEvent.VK_DELETE)

        pidpan.setVisible(true);
        productid.requestFocus();
    }//GEN-LAST:event_customernameKeyPressed

    private void productidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productidKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar(); //get input from text field character by character
        if (!((c >= '0') && ('9' >= c)))
        {
            getToolkit().beep();
            evt.consume();
        }
        if(productid.getText().length()>=4)
        {
            evt.consume();
        }
    }//GEN-LAST:event_productidKeyTyped

    private void productidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productidKeyReleased
        // TODO add your handling code here:
        try{
            conn=dbconnection.getConnection();
            PST=conn.prepareStatement("SELECT * FROM product Where productid=?");

            PST.setString(1,productid.getText());

            RS=PST.executeQuery();
            if(RS.next()) {
            } else {
            }
            {
                productname.setText(RS.getString("productname"));
                productprice.setText(RS.getString("productnormalprice"));
                aqty.setText(RS.getString("productqty"));
                buyprice.setText(RS.getString("productunitprice"));
            }

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Invalite Product ID!!");

        }
    }//GEN-LAST:event_productidKeyReleased

    private void productidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productidKeyPressed
        // TODO add your handling code here:
          
                   if(evt.getKeyCode()== KeyEvent.VK_ENTER ||evt.getKeyCode() == KeyEvent.VK_DELETE)
                    {
                          if ("".equals(productid.getText())) {
//                JOptionPane.showMessageDialog(null, "type qty first");
                          } else
                        qtypan.setVisible(true);
                    }
                    else 
                        if ( evt.getKeyCode() == KeyEvent.VK_ESCAPE )
                        {

                        pidpan.setVisible(false);
                        customername.setVisible(true);
                        customername.requestFocus();
                        productid.setText("");
                        productname.setText("");
                        productprice.setText("");
                        qty.setText("");
                        total.setText("");
                        }
   
    
        
        //qtypan.setVisible(true);
        qty.requestFocus();
    }//GEN-LAST:event_productidKeyPressed

    private void qtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar(); //get input from text field character by character
        if (!((c >= '0') && ('9' >= c)))
        {
            getToolkit().beep();
            evt.consume();
        }
        if(qty.getText().length()>=4)
        {
            evt.consume();
        }
        
    }//GEN-LAST:event_qtyKeyTyped

    private void qtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyKeyReleased
        // TODO add your handling code here:
        int r;
        try{
            conn=dbconnection.getConnection();
            PST=conn.prepareStatement("SELECT productqty from product where productid=?");
            PST.setString(1,productid.getText());
            ResultSet rs=PST.executeQuery();
            while(rs.next())
            {
                String id=rs.getString("productqty");
                r=Integer.parseInt(id);
                String s=qty.getText();
                int sum=Integer.parseInt(s);
                if(r>sum)
                {
                    double v=Double.parseDouble(productprice.getText());
                    double  d=Double.parseDouble(qty.getText());
                    double  f;
                    f = d*v;
                    jPanel12.setVisible(true);
                    total.setText(String.valueOf(f));
                }

                else

                {

                    JOptionPane.showMessageDialog(null,"No Stock");
                    qty.setVisible(true);
                    qty.setText("");
                    qty.requestFocus();
                }
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }//GEN-LAST:event_qtyKeyReleased

    private void qtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DELETE) {
            qty.requestFocus();
            if ("".equals(qty.getText())) {
                JOptionPane.showMessageDialog(null, "type qty first");
            } else {
                try {

                    String query = "INSERT INTO bill(billno,date,time,customername,productid,productname,productnormalprice,sellingprice,quantity,subtotal)values(?,?,?,?,?,?,?,?,?,?)";
                    conn = dbconnection.getConnection();
                    PST = conn.prepareStatement(query);
                    PST.setString(1, sellno.getText());
                    PST.setString(2, jLabel1.getText());
                    PST.setString(3, jLabel7.getText());
                    PST.setString(4, customername.getText());
                    PST.setString(5, productid.getText());
                    PST.setString(6, productname.getText());
                    PST.setString(7, buyprice.getText());
                    PST.setString(8, productprice.getText());
                    PST.setString(9, qty.getText());
                    PST.setString(10, total.getText());

                    PST.executeUpdate();
                    System.out.println("gotline");
                    JOptionPane.showMessageDialog(null, "Insert Successfully");

                    try {
                        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

                        model.addRow(new Object[]{productid.getText(), productname.getText(), productprice.getText(), qty.getText(), total.getText()});
                        Connection con;
                        con = dbconnection.getConnection();
                        st = con.createStatement();

                        String sql1 = "UPDATE product SET productqty=productqty - '" + qty.getText() + "' WHERE productid='" + String.valueOf(productid.getText()) + "'";
                        st.executeUpdate(sql1);

                    } catch (SQLException e) {

                        JOptionPane.showMessageDialog(null, e);
                    }

                } catch (SQLException ex) {
                    System.err.println(ex);
                    JOptionPane.showMessageDialog(null, "Duplicated Entry");
                }
                pidpan.setVisible(true);
                qtypan.setVisible(false);
                productid.setText("");
                productname.setText("");
                aqty.setText("");
                productprice.setText("");
                qty.setText("");
                total.setText("");
                buyprice.setText("");
                productid.requestFocus();
                jPanel12.setVisible(false);
               
                totalsum();
                int co= jTable2.getRowCount();
                nosale.setText(String.valueOf(co));

            }

        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {

            qtypan.setVisible(false);
            jPanel12.setVisible(false);
            pidpan.setVisible(true);

            productid.requestFocus();
            productid.setText("");
            productname.setText("");
            aqty.setText("");
            productprice.setText("");
            qty.setText("");
            total.setText("");
            buyprice.setText("");
        }
        
    }//GEN-LAST:event_qtyKeyPressed

    private void productid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productid1ActionPerformed

    private void productid1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productid1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_productid1MouseClicked

    private void productid1PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_productid1PopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_productid1PopupMenuWillBecomeVisible

    private void productid1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_productid1PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        //        productid1.setText("");
        AutoCompleteDecorator.decorate(productid1);
        try{
            conn=dbconnection.getConnection();
            PST=conn.prepareStatement("SELECT * FROM product Where productname=?");

            PST.setString(1, (String) productid1.getSelectedItem());

            RS=PST.executeQuery();
            if(!RS.next()) {
            } else {
            }
            {
                productid.setText(RS.getString("productid"));
                productname.setText(RS.getString("productname"));
                productprice.setText(RS.getString("productnormalprice"));
                aqty.setText(RS.getString("productqty"));
                buyprice.setText(RS.getString("productunitprice"));
                qtypan.setVisible(true);
                qty.requestFocus();

            }
            pidpan.setVisible(true);

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Invalite Product ID!!");

        }

    }//GEN-LAST:event_productid1PopupMenuWillBecomeInvisible

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        
        //.......................................
        if(jTable2.getRowCount()<1)
        {

            JOptionPane.showMessageDialog(null, "Empty Bill Not ");
        }
        else
        {
        try{
            String query1 = "INSERT INTO billno(cashierid,customername,billnumber,date,time,total)values(?,?,?,?,?,?)";
            conn = dbconnection.getConnection();
            PST = conn.prepareStatement(query1);
            PST.setString(1, cashierid.getText());
            PST.setString(2, customername.getText());
            PST.setString(3, sellno.getText());
            PST.setString(4, jLabel1.getText());
            PST.setString(5, jLabel7.getText());
            PST.setString(6, billsubtotal.getText());
            //                    PST.setString(6,(" TOTAL "));
            //                    PST.setString(7, (" := "));
            //                    PST.setString(8, billsubtotal.getText());

            PST.executeUpdate();
            System.out.println("gotline");
            //            JOptionPane.showMessageDialog(null, "Print Succesfully");
            try{
                String query = "INSERT INTO bill(billno,date,time,customername,productid,productname,sellingprice,quantity,subtotal,billtotal)values(?,?,?,?,?,?,?,?,?,?)";
                conn = dbconnection.getConnection();
                PST = conn.prepareStatement(query);
                PST.setString(1, sellno.getText());
                PST.setString(2, jLabel1.getText());
                PST.setString(3, jLabel7.getText());
                PST.setString(4, customername.getText());
                PST.setString(5, ("  "));
                PST.setString(6, ("  "));
                PST.setString(7, (" "));
                PST.setString(8, ("  "));
                PST.setString(9, (" "));
                PST.setString(10,billsubtotal.getText());

                PST.executeUpdate();
                System.out.println("gotline");
                //                JOptionPane.showMessageDialog(null, "Print Succesfully");
                //daytotal();

            }
            catch(SQLException ex)
            {
                System.out.println("gotline");
                //            JOptionPane.showMessageDialog(null, "Duplicate Update");

                System.err.println(ex);
            }

            //./........................................................................

        }
        
        catch(SQLException ex)
        {
            System.out.println("gotline");
            //            JOptionPane.showMessageDialog(null, "Duplicate Update");

            System.err.println(ex);
        }
        
        
        try {
            JasperDesign jasdi=JRXmlLoader.load("C:\\Users\\ICTSTUDENT\\Desktop\\project\\src\\project\\report\\bill.jrxml");
            String sql="SELECT productname,quantity,sellingprice,subtotal FROM bill WHERE billno='"+sellno.getText()+"'";
            conn=dbconnection.getConnection();
            JRDesignQuery newQuery=new JRDesignQuery();
            newQuery.setText(sql);

            jasdi.setQuery(newQuery);
            /////////////
            HashMap<String, Object> para=new HashMap<>();
            para.put("billnumber",sellno.getText());
            para.put("total",billsubtotal.getText());
            para.put("customername",customername.getText());
            para.put("date",jLabel1.getText());
            para.put("time",jLabel7.getText());

            JasperReport js=JasperCompileManager.compileReport(jasdi);
            JasperPrint jp=JasperFillManager.fillReport(js,para,conn);

//            JasperViewer viewer = new JasperViewer(jp, true);
//            
//            viewer.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
//            viewer.setVisible(true);
            
            JasperViewer.viewReport(jp,false);
           


        } catch (JRException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        

        billsubtotal.setText("");
        productid.setText("");
        productname.setText("");
        productprice.setText("");
        qty.setText("");
        buyprice.setText("");
        total.setText("");
        pidpan.setVisible(false);
        qtypan.setVisible(false);
        customername.setText("");
        customername.requestFocus();
        sellno.setText("");
        billno();
        totalsum();
        showdepth1();
        int co= jTable3.getRowCount();
        salescount.setText(String.valueOf(co));
        daytotal();
        nosale.setText("");
       

        DefaultTableModel df=(DefaultTableModel)jTable2.getModel();
        while(df.getRowCount()>0)
        {
            df.removeRow(0);
        }
        
    }//GEN-LAST:event_printActionPerformed
    }
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        
        try{
            conn=dbconnection.getConnection();
            PST=conn.prepareStatement("DELETE FROM bill Where productid=?");
            PST.setString(1, productid.getText());

            PST.executeUpdate();
            
             try {
                        String sql1 = "UPDATE product SET productqty=productqty + '" + qty.getText() + "' WHERE productid='" + String.valueOf(productid.getText()) + "'";
                        st.executeUpdate(sql1);
                         } catch (SQLException e)
                         {
                            JOptionPane.showMessageDialog(null, e);
                         }
             
             } catch (SQLException e) {

                        JOptionPane.showMessageDialog(null, e);
                    }

//            JOptionPane.showMessageDialog(null, "Delete sucessfully!!");
                        //..............................................................................................
                         try {

                            String query = "INSERT INTO bill(billno,date,time,customername,productid,productname,productnormalprice,sellingprice,quantity,subtotal)values(?,?,?,?,?,?,?,?,?,?)";
                            conn = dbconnection.getConnection();
                            PST = conn.prepareStatement(query);
                            PST.setString(1, sellno.getText());
                            PST.setString(2, jLabel1.getText());
                            PST.setString(3, jLabel7.getText());
                            PST.setString(4, customername.getText());
                            PST.setString(5, productid.getText());
                            PST.setString(6, productname.getText());
                            PST.setString(7, buyprice.getText());
                            PST.setString(8, productprice.getText());
                            PST.setString(9, qty.getText());
                            PST.setString(10, total.getText());

                            PST.executeUpdate();
                            System.out.println("gotline");
                            JOptionPane.showMessageDialog(null, "Update Successfully");

                                try {
                                    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

                                    model.addRow(new Object[]{productid.getText(), productname.getText(), productprice.getText(), qty.getText(), total.getText()});
                                    Connection con;
                                    con = dbconnection.getConnection();
                                    st = con.createStatement();

                                    String sql = "UPDATE product SET productqty=productqty - '" + qty.getText() + "' WHERE productid='" + String.valueOf(productid.getText()) + "'";
                                    st.executeUpdate(sql);

                   

                } catch (SQLException ex) {
                    System.err.println(ex);
                    JOptionPane.showMessageDialog(null, "Duplicated Entry");
                }
                        //..............................................................................................
                        
                        
                        
                        
                        
                        

                    

        } catch (SQLException ex) {
            Logger.getLogger(productform.class.getName()).log(Level.SEVERE, null, ex);

        }
                         
        DefaultTableModel df=(DefaultTableModel)jTable2.getModel();
        df.removeRow(jTable2.getSelectedRow());
        int co= jTable2.getRowCount();
        nosale.setText(String.valueOf(co));
        totalsum();
    }//GEN-LAST:event_updateActionPerformed

    private void billsubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billsubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billsubtotalActionPerformed

    private void productdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productdeleteActionPerformed
        // TODO add your handling code here:

        try{
            conn=dbconnection.getConnection();
            PST=conn.prepareStatement("DELETE FROM bill Where productid=?");
            PST.setString(1, productid.getText());

            PST.executeUpdate();
            
             try {
                        String sql1 = "UPDATE product SET productqty=productqty + '" + qty.getText() + "' WHERE productid='" + String.valueOf(productid.getText()) + "'";
                        st.executeUpdate(sql1);

                    } catch (SQLException e) {

                        JOptionPane.showMessageDialog(null, e);
                    }

            JOptionPane.showMessageDialog(null, "Delete sucessfully!!");

        } catch (SQLException ex) {
            Logger.getLogger(productform.class.getName()).log(Level.SEVERE, null, ex);

        }
        DefaultTableModel df=(DefaultTableModel)jTable2.getModel();
        df.removeRow(jTable2.getSelectedRow());
        
        
        productid.setText("");
        productname.setText("");
        aqty.setText("");
        productprice.setText("");
        qty.setText("");
        buyprice.setText("");
        billsubtotal.setText("");
        total.setText("");
        productid.requestFocus();
        totalsum();
        int co= jTable2.getRowCount();
        nosale.setText(String.valueOf(co));

    }//GEN-LAST:event_productdeleteActionPerformed

    private void sellnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellnoActionPerformed

    private void jTable3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3MouseEntered

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
        int i=jTable3.getSelectedRow();
        TableModel model=jTable3.getModel();
        jTextField1.setText(model.getValueAt(i,1).toString());
        customername.setText(model.getValueAt(i,3).toString());
        billsubtotal.setText(model.getValueAt(i,4).toString());
       
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        new login().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void printMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseMoved
        // TODO add your handling code here:
         print.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_printMouseMoved

    private void printMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseExited
        // TODO add your handling code here:
        print.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_printMouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new salesprofit ().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void reprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reprintActionPerformed
        // TODO add your handling code here:
         try {
            JasperDesign jasdi=JRXmlLoader.load("C:\\Users\\ICTSTUDENT\\Desktop\\project\\src\\project\\report\\reprint.jrxml");
            String sql="SELECT productname,quantity,sellingprice,subtotal FROM bill WHERE billno ='"+jTextField1.getText()+"'";
            conn=dbconnection.getConnection();
            JRDesignQuery newQuery=new JRDesignQuery();
            newQuery.setText(sql);

            jasdi.setQuery(newQuery);
            /////////////
            HashMap<String, Object> para=new HashMap<>();
            para.put("billnumber",jTextField1.getText());
            para.put("total",billsubtotal.getText());
            para.put("customername",customername.getText());
            para.put("date",jLabel1.getText());
            para.put("time",jLabel7.getText());

            JasperReport js=JasperCompileManager.compileReport(jasdi);
            JasperPrint jp=JasperFillManager.fillReport(js,para,conn);

            
            JasperViewer.viewReport(jp,false);
           


        } catch (JRException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_reprintActionPerformed

    private void TextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldKeyTyped
        // TODO add your handling code here:
       char c=evt.getKeyChar(); //get input from text field character by character
        if (!((c >= '0') && ('9' >= c)))
        {
            getToolkit().beep();
            evt.consume();
        }
        if(TextField.getText().length()>=10)
        {
            evt.consume();
        }
    }//GEN-LAST:event_TextFieldKeyTyped
   
    
    //...........................................................
//    public ArrayList<billshowclass>billshowclasslist1()
//    {
//    ArrayList<billshowclass> billshowclasslist1=new ArrayList<>();
//    try
//    {
//       conn=dbconnection.getConnection();
//        PST=conn.prepareStatement("Select * from billno where date='"+jLabel1+"'");
//        st=conn.createStatement();
////        RS=st.executeQuery("Select * from billno");
//        RS=PST.executeQuery();
//        billshowclass billshowclass;
//        while(RS.next())
//        {
//        
//            billshowclass = new billshowclass(RS.getString("cashierid"),RS.getString("billnumber"),RS.getString("date"),RS.getString("customername"),RS.getString("total"));
//            billshowclasslist1.add(billshowclass);
//        }
//    
//    }
//    catch(SQLException e)
//    {
//        //JOptionPane.showMessageDialog(null, e);
//    }
//    return billshowclasslist1;
//    }
        
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(salespage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>
    //</editor-fold>
    
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new salespage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextField;
    private javax.swing.JTextField aqty;
    private javax.swing.JLabel asdfer;
    private javax.swing.JTextField billsubtotal;
    private javax.swing.JTextField billtotal;
    private javax.swing.JTextField buyprice;
    public static javax.swing.JTextField cashierid;
    private javax.swing.JPanel cnamepan;
    private javax.swing.JTextField customername;
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    public static javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    public static javax.swing.JButton jButton3;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    public static javax.swing.JButton jButton4;
    public static javax.swing.JButton jButton5;
    public static javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    public static javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel nosale;
    private javax.swing.JPanel pidpan;
    private javax.swing.JButton print;
    private javax.swing.JButton productdelete;
    private javax.swing.JTextField productid;
    private javax.swing.JComboBox<String> productid1;
    private javax.swing.JTextField productname;
    private javax.swing.JTextField productprice;
    private javax.swing.JTextField qty;
    private javax.swing.JPanel qtypan;
    public static javax.swing.JButton reprint;
    private javax.swing.JTextField salescount;
    public static javax.swing.JTextField sellno;
    private javax.swing.JTextField total;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    private void totalsum() {
        double sum = 0;
        for (int w = 0; w < jTable2.getRowCount(); w++) {
            sum = sum +Double.parseDouble(jTable2.getValueAt(w, 4).toString());
        }
        billsubtotal.setText(String.valueOf(sum));
    }
     private void daytotal() {
        double sum1 = 0;
        for (int r = 0; r < jTable3.getRowCount(); r++) 
        {
            sum1 = sum1 +Double.parseDouble(jTable3.getValueAt(r, 4).toString());
        }
        billtotal.setText(String.valueOf(sum1));
    }

    private void billno() {
         String sql1="SELECT COUNT(*) FROM billno";
     try{
            conn=dbconnection.getConnection();
            PST=conn.prepareStatement(sql1);
            RS=PST.executeQuery();
            while(RS.next())
            {
                int g=Integer.parseInt(RS.getString(1));
                g=g+1;
                sellno.setText(String.valueOf("BM"+g));
            }
     }
     catch(NumberFormatException | SQLException e)
     {
         JOptionPane.showMessageDialog(null,e);
     }
        
    }

//    private void showdepth() {
//        ArrayList<billshowclass> list=billshowclasslist(billno.getText());
//        DefaultTableModel model=new DefaultTableModel();
//        model.setColumnIdentifiers(new Object[]{"billno","date","customername","billtotal"});
//        Object [] row=new Object[4];
//        
//        for(int i=0;i<list.size();i++)
//        {
//            row[0]=list.get(i).getbillnumber();
//            row[1]=list.get(i).getdate();
//            row[2]=list.get(i).getcustomername();
//            row[3]=list.get(i).gettotal();
//            model.addRow(row);
//        }
//        jTable3.setModel(model);
        
//}
     public void showdepth1() {
        ArrayList<billshowclass> list=billshowclasslist(jLabel1.getText());
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"cashierid","billno","date","customername","billtotal"});
        Object [] row=new Object[5];
        
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getcashierid();
            row[1]=list.get(i).getbillnumber();
            row[2]=list.get(i).getdate();
            row[3]=list.get(i).getcustomername();
            row[4]=list.get(i).gettotal();
            model.addRow(row);
        }
        jTable3.setModel(model);
        
    }
     
//      private void showdepth() {
//        ArrayList<billshowclass> list=billshowclasslist1();
//        DefaultTableModel model=new DefaultTableModel();
//        model.setColumnIdentifiers(new Object[]{"billnumber","date","customername","billtotal"});
//        Object [] row=new Object[4];
//        for(int i=0;i<list.size();i++)
//        {
//            row[0]=list.get(i).getbillnumber();
//            row[1]=list.get(i).getdate();
//            row[2]=list.get(i).getcustomername();
//            row[3]=list.get(i).gettotal();
//            model.addRow(row);
//        }
//        jTable3.setModel(model);
//      }
     
    private void comeload() {
         try{
            conn=dbconnection.getConnection();
            PST=conn.prepareStatement("SELECT productname FROM product");
            RS=PST.executeQuery();
            while(RS.next())
            {
                String did=RS.getString("productname");
                productid1.addItem(did);
            }
            } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,ex);
        }
       
    }    
}


    

