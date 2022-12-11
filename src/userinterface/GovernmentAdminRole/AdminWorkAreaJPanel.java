

package userinterface.GovernmentAdminRole;


import Business.EcoSystem;
import Business.GovernmentOfficial.GovernmentOfficial;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raaga
 */

public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount ua;
    String managerName;
    GovernmentOfficial govOfficial;
    
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount ua, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ua = ua;
        managerName = ua.getEmployee().getName();
        ecosystem = system;
        govOfficial = findManageGrocery();
        valueLabel.setText(govOfficial.getName());
        jLabel1.setText("Admin Work Area: "+govOfficial.getName());
        //valueLabel.setText();
    }
    
    public GovernmentOfficial findManageGrocery() {
        for(int i = 0; i < ecosystem.getGovOfficialDirectory().getGovOfficialList().size(); i ++) {
            if(ecosystem.getGovOfficialDirectory().getGovOfficialList().get(i).getAccountDetails().getUsername().equals(this.ua.getUsername())) {
                return ecosystem.getGovOfficialDirectory().getGovOfficialList().get(i);
            }
        }
        return null;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        updatestorepanel = new javax.swing.JPanel();
        nameText = new javax.swing.JTextField();
        phoneText = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        phoneLabel1 = new javax.swing.JLabel();
        phoneText1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Admin Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        manageEmployeeJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        manageEmployeeJButton.setText("Manage menu");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 150, 50));

        manageOrganizationJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        manageOrganizationJButton.setText("Manage Orders");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 150, 50));

        enterpriseLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        enterpriseLabel.setText("Therapist Name :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 170, 30));

        valueLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 130, -1));

        updatestorepanel.setBackground(new java.awt.Color(204, 255, 255));

        nameText.setForeground(new java.awt.Color(72, 72, 72));

        phoneText.setForeground(new java.awt.Color(72, 72, 72));

        phoneLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        phoneLabel.setForeground(new java.awt.Color(72, 72, 72));
        phoneLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        phoneLabel.setText("Phone");

        nameLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(72, 72, 72));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        nameLabel.setText("Your Name");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Update Your Information");

        updateButton.setBackground(new java.awt.Color(0, 0, 0));
        updateButton.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        phoneLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        phoneLabel1.setForeground(new java.awt.Color(72, 72, 72));
        phoneLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        phoneLabel1.setText("Address");

        phoneText1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        phoneText1.setForeground(new java.awt.Color(72, 72, 72));

        javax.swing.GroupLayout updatestorepanelLayout = new javax.swing.GroupLayout(updatestorepanel);
        updatestorepanel.setLayout(updatestorepanelLayout);
        updatestorepanelLayout.setHorizontalGroup(
            updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatestorepanelLayout.createSequentialGroup()
                .addGroup(updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updatestorepanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(updatestorepanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updatestorepanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(updatestorepanelLayout.createSequentialGroup()
                                .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(updatestorepanelLayout.createSequentialGroup()
                                .addComponent(phoneLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(phoneText1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(updatestorepanelLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        updatestorepanelLayout.setVerticalGroup(
            updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatestorepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addGap(18, 18, 18)
                .addGroup(updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel1)
                    .addComponent(phoneText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        add(updatestorepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 430, 290));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ItDJ.gif"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 250, 260));
    }// </editor-fold>//GEN-END:initComponents

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed
        ManageGovPlansPanel mm = new ManageGovPlansPanel(userProcessContainer, ecosystem, govOfficial, ua);
        userProcessContainer.add("manageNetworkJPanel",mm);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed
        ManageOrdersPanel mm = new ManageOrdersPanel(userProcessContainer, ecosystem, govOfficial, ua);
        userProcessContainer.add("manageNetworkJPanel",mm);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:

        if(phoneText.getText().isEmpty() || nameText.getText().isEmpty() || phoneText1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Fields cannot be empty", "Error Message", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(phoneText.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "Phone Number must be of 10 digits", "Error Message", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(!phoneText.getText().matches("^[0-9]+$")) {
            JOptionPane.showMessageDialog(null, "Phone Number must have digits only", "Error Message", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            govOfficial.setName(nameText.getText());
            govOfficial.setPhone(phoneText.getText());
            govOfficial.setAddress(phoneText1.getText());
            JOptionPane.showMessageDialog(null, "Details updated successfully");
        }
    }//GEN-LAST:event_updateButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel phoneLabel1;
    private javax.swing.JTextField phoneText;
    private javax.swing.JTextField phoneText1;
    private javax.swing.JButton updateButton;
    private javax.swing.JPanel updatestorepanel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
