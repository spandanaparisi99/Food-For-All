/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Swapnil
 */
public class CustomerCart extends javax.swing.JPanel {

    /**
     * Creates new form CustomerCart
     */
    private JPanel userProcessContainer;
    EcoSystem ecosystem;
    DefaultTableModel grocModel;
    private UserAccount userAccount;
    DefaultTableModel foodModel;
    DefaultTableModel ngoModel;
    DefaultTableModel farmModel;
    DefaultTableModel govModel;
    Customer cust;
    JSplitPane screen;
    Double Total;
    Double Sum;
    DefaultTableModel factoryModel;
    
    public CustomerCart(JPanel userProcessContainer, UserAccount account, EcoSystem system, JSplitPane screen, Customer cust) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.screen = screen;
        this.userAccount = account;
        this.cust = cust;
        ecosystem = system;
         
        createTableModel();
        populateCustomerOrders();
    }
    
    public void populateCustomerOrders() {
        //NGO
        for (int i = ngoModel.getRowCount() - 1; i >= 0; i--) {
            ngoModel.removeRow(i);
        }
        for (int i = 0; i < cust.getNGOorderDirectoryList().size();i++) {
            ngoModel.addRow(new Object[]{
                i+1,
                cust.getNGOorderDirectoryList().get(i).getStatus(),
                cust.getNGOorderDirectoryList().get(i).getNGO().getName()
            });
        }
        
        //grocery
        for (int i = grocModel.getRowCount() - 1; i >= 0; i--) {
            grocModel.removeRow(i);
        }
        for (int i = 0; i < cust.getOrderDirectoryList().size();i++) {
            grocModel.addRow(new Object[]{
                i+1,
                cust.getOrderDirectoryList().get(i).getStatus(),
                cust.getOrderDirectoryList().get(i).getGrocery().getName()
            });
            
            
        }
        
        // farm
         for (int i = farmModel.getRowCount() - 1; i >= 0; i--) {
            farmModel.removeRow(i);
        }
        for (int i = 0; i < cust.getFarmDirectoryList().size();i++) {
            farmModel.addRow(new Object[]{
                i+1,
                cust.getFarmDirectoryList().get(i).getStatus(),
                cust.getFarmDirectoryList().get(i).getFarmManager().getName()
            });
        }
        
        //gov 
          for (int i = govModel.getRowCount() - 1; i >= 0; i--) {
            govModel.removeRow(i);
        }
        for (int i = 0; i < cust.getGovorderDirectoryList().size();i++) {
            govModel.addRow(new Object[]{
                i+1,
                cust.getGovorderDirectoryList().get(i).getStatus(),
                cust.getGovorderDirectoryList().get(i).getGovOfficial().getName()
            });
        }
              
        // restaurant
        for (int i = foodModel.getRowCount() - 1; i >= 0; i--) {
            foodModel.removeRow(i);
        }
        for (int i = 0; i < cust.getHotelorderDirectoryList().size();i++) {
            foodModel.addRow(new Object[]{
                i+1,
                cust.getHotelorderDirectoryList().get(i).getStatus(),
                cust.getHotelorderDirectoryList().get(i).getRestaurant().getName()
            });
    }
        
        //factory
          for (int i = factoryModel.getRowCount() - 1; i >= 0; i--) {
            factoryModel.removeRow(i);
        }
        for (int i = 0; i < cust.getFactoryOrderDirectoryList().size();i++) {
            factoryModel.addRow(new Object[]{
                i+1,
                cust.getFactoryOrderDirectoryList().get(i).getStatus(),
                cust.getFactoryOrderDirectoryList().get(i).getFactory().getName()
            });
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        groceryListTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        restListTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        ngoTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        farmListTable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        govListTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        factoryListTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        title5 = new javax.swing.JLabel();
        title6 = new javax.swing.JLabel();

        title1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/111.jpg"))); // NOI18N

        setBackground(new java.awt.Color(0, 108, 103));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        groceryListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Location", "Phone No", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(groceryListTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 442, 97));

        restListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Location", "Phone No", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(restListTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, -1, 97));

        ngoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Location", "Phone No", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(ngoTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 442, 97));

        farmListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Location", "Phone No", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(farmListTable);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, -1, 97));

        govListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Location", "Phone No", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(govListTable);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 442, 97));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 226));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Grocery Order");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 442, 24));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 226));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Restaurant Order");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 452, 24));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 226));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("NGO Program Order");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 432, 24));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 226));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Farm Produce Order");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 452, 24));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 226));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Government Plan Order");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 442, 24));

        factoryListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Location", "Phone No", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(factoryListTable);

        add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, -1, 97));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(254, 254, 226));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Factory Outlet Order");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 452, 24));

        title2.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        title2.setForeground(new java.awt.Color(254, 254, 226));
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("All your orders in one place!");
        add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 940, 60));

        jPanel1.setBackground(new java.awt.Color(254, 254, 226));
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, 130, 750));

        jPanel2.setBackground(new java.awt.Color(254, 254, 226));
        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 750));

        title5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/111.jpg"))); // NOI18N
        add(title5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, 560, 120));

        title6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/111.jpg"))); // NOI18N
        add(title6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 580, 590, 120));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable factoryListTable;
    private javax.swing.JTable farmListTable;
    private javax.swing.JTable govListTable;
    private javax.swing.JTable groceryListTable;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable ngoTable;
    private javax.swing.JTable restListTable;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title5;
    private javax.swing.JLabel title6;
    // End of variables declaration//GEN-END:variables

    private void createTableModel() {
         grocModel = new DefaultTableModel();
         groceryListTable.setModel(grocModel);
         grocModel.addColumn("Id");
         grocModel.addColumn("Status");
         grocModel.addColumn("Grcoery Store Name");
         
         
         
         foodModel = new DefaultTableModel();
         restListTable.setModel(foodModel);
         foodModel.addColumn("Id");
         foodModel.addColumn("Status");
         foodModel.addColumn("Restaurant Name");
         
         ngoModel = new DefaultTableModel();
         ngoTable.setModel(ngoModel);
         ngoModel.addColumn("Id");
         ngoModel.addColumn("Status");
         ngoModel.addColumn("NGO Name");
         
         farmModel = new DefaultTableModel();
         farmListTable.setModel(farmModel);
         farmModel.addColumn("Id");
         farmModel.addColumn("Status");
         farmModel.addColumn("Farm Name");
         
         govModel = new DefaultTableModel();
         govListTable.setModel(govModel);
         govModel.addColumn("Id");
         govModel.addColumn("Status");
         govModel.addColumn("Gov Program Name");
         
         factoryModel = new DefaultTableModel();
         factoryListTable.setModel(factoryModel);
         factoryModel.addColumn("Id");
         factoryModel.addColumn("Status");
         factoryModel.addColumn("Factory Name");
    }

  /* private void populateTable() {
        if(cust.getOrderDirectoryList().size() > 0){
            for (int i = grocModel.getRowCount() - 1; i >= 0; i--) {
                grocModel.removeRow(i);
            }
            int index = (cust.getOrderDirectoryList().size()) - 1;
            for (int i = 0; i < cust.getOrderDirectoryList().get(index).getOrderList().size(); i++) {
                Total = 0.0;
                Total = Double.parseDouble(cust.getOrderDirectoryList().get(index).getOrderList().get(i).getPrice()) * cust.getOrderDirectoryList().get(index).getOrderList().get(i).getQuantity();
                Sum+=Total;
                grocModel.addRow(new Object[]{
                    cust.getOrderDirectoryList().get(index).getId(),
                    cust.getOrderDirectoryList().get(index).getOrderList().get(i).getItem(),
                    cust.getOrderDirectoryList().get(index).getOrderList().get(i).getItem(),
                    cust.getOrderDirectoryList().get(index).getOrderList().get(i).getPrice(),
                    cust.getOrderDirectoryList().get(index).getOrderList().get(i).getQuantity(),
                    Total
                });
            }
        }
        
        if(cust.getHotelorderDirectoryList().size() > 0){
             for (int i = grocModel.getRowCount() - 1; i >= 0; i--) {
                grocModel.removeRow(i);
            }
            int index = (cust.getOrderDirectoryList().size()) - 1;
            for (int i = 0; i < cust.getOrderDirectoryList().get(index).getOrderList().size(); i++) {
                Total = 0.0;
                Total = Double.parseDouble(cust.getOrderDirectoryList().get(index).getOrderList().get(i).getPrice()) * cust.getOrderDirectoryList().get(index).getOrderList().get(i).getQuantity();
                Sum+=Total;
                grocModel.addRow(new Object[]{
                    cust.getOrderDirectoryList().get(index).getId(),
                    cust.getOrderDirectoryList().get(index).getOrderList().get(i).getItem(),
                    cust.getOrderDirectoryList().get(index).getOrderList().get(i).getItem(),
                    cust.getOrderDirectoryList().get(index).getOrderList().get(i).getPrice(),
                    cust.getOrderDirectoryList().get(index).getOrderList().get(i).getQuantity(),
                    Total
                });
            }
        }
    }
    */
}
