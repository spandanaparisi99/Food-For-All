/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;

import Business.NGO.NGO;
import Business.Orders.GroceryOrderDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSplitPane;

/**
 *
 * @author Swapnil
 */
public class CustomerOrderNGOPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    EcoSystem ecosystem;
    private UserAccount userAccount;
    DefaultTableModel model;
    DefaultTableModel model1;
    Customer cust;
    JSplitPane screen;

    /**
     * Creates new form CustomerSelectLegalPanel
     */
    public CustomerOrderNGOPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, JSplitPane screen) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        ecosystem = system;
        this.screen = screen;
        cust = findCustomer();
        model = new DefaultTableModel();
        model1 = new DefaultTableModel();
        legaltable.setModel(model);
        pastorderstable.setModel(model1);
        model.addColumn("NGO");
        model.addColumn("Location");
        model.addColumn("Phone");
        
        model1.addColumn("Id");
        model1.addColumn("Status");
        model1.addColumn("NGO");
        
        populateRequestTable();
        populateCustomerOrders();
        
        
        
        
        
    }
    
     public void populateCustomerOrders() {
        for (int i = model1.getRowCount() - 1; i >= 0; i--) {
            model1.removeRow(i);
        }
        for (int i = 0; i < cust.getNGOorderDirectoryList().size();i++) {
            model1.addRow(new Object[]{
                i+1,
                cust.getNGOorderDirectoryList().get(i).getStatus(),
                cust.getNGOorderDirectoryList().get(i).getNGO().getName()
            });
        }

    }
     public Customer findCustomer() {
        for (int i = 0; i < ecosystem.getCustomerDirectory().getCustomerList().size(); i++) {
            if (ecosystem.getCustomerDirectory().getCustomerList().get(i).getAccountDetails().getUsername().equals(this.userAccount.getUsername())) {
                return ecosystem.getCustomerDirectory().getCustomerList().get(i);
            }
        }
        return null;
    }
    
   public void populateRequestTable() {
        for (int i = 0; i < ecosystem.getNGODirectory().getNGOList().size(); i++) {
            if(ecosystem.getNGODirectory().getNGOList().get(i).getNetwork().equals(cust.getNetwork())){
             model.addRow(new Object[]{
                ecosystem.getNGODirectory().getNGOList().get(i).getName(),
                ecosystem.getNGODirectory().getNGOList().get(i).getAddress(),
                ecosystem.getNGODirectory().getNGOList().get(i).getPhone(),});
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pastorderstable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        legaltable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Titlelabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 108, 103));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(254, 254, 226));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pastorderstable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pastorderstable.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        pastorderstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pastorderstable.setGridColor(new java.awt.Color(0, 0, 0));
        pastorderstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pastorderstableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(pastorderstable);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Your Past Orders with us!");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, 250));

        jPanel2.setBackground(new java.awt.Color(254, 254, 226));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton2.setBackground(new java.awt.Color(127, 195, 126));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Select");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        legaltable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        legaltable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(legaltable);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select one of your choice");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, 280));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ngo.gif"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 470, 480));

        Titlelabel.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        Titlelabel.setForeground(new java.awt.Color(254, 254, 226));
        Titlelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titlelabel.setText("Welcome to NGO Plans");
        add(Titlelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 804, 88));
    }// </editor-fold>//GEN-END:initComponents

    private void pastorderstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pastorderstableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pastorderstableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.out.println(legaltable.getSelectedRow() + " row ");
        if (legaltable.getSelectedRow() >= 0) {
            CustomerSelectNGOPanel mm = new CustomerSelectNGOPanel(userProcessContainer, this.userAccount, ecosystem,  ecosystem.getNGODirectory().getNGOList().get(legaltable.getSelectedRow()), screen);
            //            userProcessContainer.add("manageNetworkJPanel", mm);
            //            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            //            layout.next(userProcessContainer);
            screen.setRightComponent(mm);
            System.out.println("Legal Service Selected");
        } else {
            JOptionPane.showMessageDialog(this, "Please select a Legal Service");
        }

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titlelabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable legaltable;
    private javax.swing.JTable pastorderstable;
    // End of variables declaration//GEN-END:variables
}
