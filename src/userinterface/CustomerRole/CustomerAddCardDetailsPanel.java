/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author Swapnil
 */
public class CustomerAddCardDetailsPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerAddCardDetailsPanel
     */
    private JPanel userProcessContainer;
    EcoSystem ecosystem;
    private UserAccount userAccount;
    JSplitPane screen;
    Customer cus;
    
    public CustomerAddCardDetailsPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, JSplitPane screen) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = system;
        this.userAccount = account;
        this.screen = screen;
        cus = findCustomer();
        jLabel1.setText("Hey "+cus.getName() +" Update Your Card information here");
        
        System.out.println("Customer card no:"+cus.getCardNo());
        System.out.println("Customer card no:"+cus.getCardType());
        System.out.println("Customer card no:"+cus.getCardType());
        
       
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updateRestManagerLabel = new javax.swing.JLabel();
        Credit = new javax.swing.JRadioButton();
        Debit = new javax.swing.JRadioButton();
        updateRestManagerLabel1 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        updateRestManagerLabel2 = new javax.swing.JLabel();
        numberTxt = new javax.swing.JTextField();
        updateRestManagerLabel3 = new javax.swing.JLabel();
        CVVTxt = new javax.swing.JTextField();
        updateRestManagerLabel4 = new javax.swing.JLabel();
        MonthTxt = new javax.swing.JTextField();
        YearTxt = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 108, 103));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updateRestManagerLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        updateRestManagerLabel.setForeground(new java.awt.Color(255, 255, 255));
        updateRestManagerLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        updateRestManagerLabel.setText("Card Type");
        add(updateRestManagerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 114, -1));

        Credit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Credit.setForeground(new java.awt.Color(255, 255, 255));
        Credit.setSelected(true);
        Credit.setText("Credit");
        Credit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditActionPerformed(evt);
            }
        });
        add(Credit, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, -1, -1));

        Debit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Debit.setForeground(new java.awt.Color(255, 255, 255));
        Debit.setText("Debit");
        Debit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DebitActionPerformed(evt);
            }
        });
        add(Debit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, -1, -1));

        updateRestManagerLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        updateRestManagerLabel1.setForeground(new java.awt.Color(255, 255, 255));
        updateRestManagerLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        updateRestManagerLabel1.setText("Card Name");
        add(updateRestManagerLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 114, -1));

        nameText.setForeground(new java.awt.Color(72, 72, 72));
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });
        add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 151, -1));

        updateRestManagerLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        updateRestManagerLabel2.setForeground(new java.awt.Color(255, 255, 255));
        updateRestManagerLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        updateRestManagerLabel2.setText("Card Number");
        add(updateRestManagerLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 114, -1));

        numberTxt.setForeground(new java.awt.Color(72, 72, 72));
        numberTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberTxtActionPerformed(evt);
            }
        });
        add(numberTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 151, -1));

        updateRestManagerLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        updateRestManagerLabel3.setForeground(new java.awt.Color(255, 255, 255));
        updateRestManagerLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        updateRestManagerLabel3.setText("Card CVV");
        add(updateRestManagerLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 114, -1));

        CVVTxt.setForeground(new java.awt.Color(72, 72, 72));
        CVVTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CVVTxtActionPerformed(evt);
            }
        });
        add(CVVTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 151, -1));

        updateRestManagerLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        updateRestManagerLabel4.setForeground(new java.awt.Color(255, 255, 255));
        updateRestManagerLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        updateRestManagerLabel4.setText("Expiry Date");
        add(updateRestManagerLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 114, -1));

        MonthTxt.setForeground(new java.awt.Color(72, 72, 72));
        MonthTxt.setToolTipText("");
        MonthTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthTxtActionPerformed(evt);
            }
        });
        add(MonthTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 70, -1));

        YearTxt.setForeground(new java.awt.Color(72, 72, 72));
        YearTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearTxtActionPerformed(evt);
            }
        });
        add(YearTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, 70, -1));

        AddBtn.setBackground(new java.awt.Color(127, 195, 126));
        AddBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(51, 51, 51));
        AddBtn.setText("Add");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, 162, 39));

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 226));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter Card Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 180, 1480, 47));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/card_1.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 0, 600, 100));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/card_1.png"))); // NOI18N
        jLabel3.setText("jLabel2");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/card_1.png"))); // NOI18N
        jLabel4.setText("jLabel2");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 600, 100));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/card_1.png"))); // NOI18N
        jLabel5.setText("jLabel2");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 610, 600, 90));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/card_1.png"))); // NOI18N
        jLabel6.setText("jLabel2");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 610, 600, 90));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/card_1.png"))); // NOI18N
        jLabel7.setText("jLabel2");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 610, 600, 90));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("YY");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("MM ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void CreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditActionPerformed
        // TODO add your handling code here:
        Credit.setSelected(true);
        Debit.setSelected(false);
    }//GEN-LAST:event_CreditActionPerformed

    private void DebitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DebitActionPerformed
        // TODO add your handling code here:
         Credit.setSelected(false);
         Debit.setSelected(true);
    }//GEN-LAST:event_DebitActionPerformed

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    private void numberTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberTxtActionPerformed

    private void CVVTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CVVTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CVVTxtActionPerformed

    private void MonthTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MonthTxtActionPerformed

    private void YearTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YearTxtActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        Boolean isValid = validateFields(nameText.getText(), CVVTxt.getText(), numberTxt.getText(), MonthTxt.getText(), YearTxt.getText());
        if (!isValid) {
            return;
        }
        String type;
        if(Credit.isSelected()) {
            type = "Credit";
        }else{
          type="Debit";
        }
        cus.setCardNo(numberTxt.getText());
        cus.setCardName(nameText.getText());
        cus.setCardCVV(CVVTxt.getText());
        cus.setCardED(MonthTxt.getText() + "/" + YearTxt.getText());
        cus.setCardType(type);
        JOptionPane.showMessageDialog(this, "Card Details Added Successfully");
        nameText.setText("");
        CVVTxt.setText("");
        MonthTxt.setText("");
        YearTxt.setText("");
        numberTxt.setText("");
        Credit.setSelected(true);
        Debit.setSelected(false);
        CustomerStaticRight adminPanel = new CustomerStaticRight();
        screen.setRightComponent(adminPanel);
        
       
    }//GEN-LAST:event_AddBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField CVVTxt;
    private javax.swing.JRadioButton Credit;
    private javax.swing.JRadioButton Debit;
    private javax.swing.JTextField MonthTxt;
    private javax.swing.JTextField YearTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField numberTxt;
    private javax.swing.JLabel updateRestManagerLabel;
    private javax.swing.JLabel updateRestManagerLabel1;
    private javax.swing.JLabel updateRestManagerLabel2;
    private javax.swing.JLabel updateRestManagerLabel3;
    private javax.swing.JLabel updateRestManagerLabel4;
    // End of variables declaration//GEN-END:variables

    private Boolean validateFields(String name, String cvv, String number, String month, String year) {
        if(name.isEmpty() || cvv.isEmpty() || number.isEmpty() || month.isEmpty() || year.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Fields cannot be empty","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (cvv.length()!=3) {
            JOptionPane.showMessageDialog(null,"CVV must be 3","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if(number.length() != 16) {
            JOptionPane.showMessageDialog(null, "Card Number must be of 16 digits","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(!number.matches("^[0-9]+$")) {
            JOptionPane.showMessageDialog(null, "Card Number must have digits only","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(!cvv.matches("^[0-9]+$")) {
            JOptionPane.showMessageDialog(null, "CVV must have digits only","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(!month.matches("^[0-9]+$")) {
            JOptionPane.showMessageDialog(null, "Month must have digits only","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(!year.matches("^[0-9]+$")) {
            JOptionPane.showMessageDialog(null, "Year must have digits only","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(month.length() != 2) {
            JOptionPane.showMessageDialog(null, "Month must be of 2 digits","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(year.length() != 4) {
            JOptionPane.showMessageDialog(null, "Year must be of 4 digits","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private Customer findCustomer() {
        for (int i = 0; i < ecosystem.getCustomerDirectory().getCustomerList().size(); i++) {
            if (ecosystem.getCustomerDirectory().getCustomerList().get(i).getAccountDetails().getUsername().equals(this.userAccount.getUsername())) {
                return ecosystem.getCustomerDirectory().getCustomerList().get(i);
            }
        }
        return null;
    }
}
