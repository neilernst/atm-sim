package edu.cmu.sei.atm.ui;

// Fig. 25.31: DisplayQueryResults.java
// Display the contents of the Authors table in the
// Books database.

import java.sql.SQLException;
import javax.swing.JOptionPane;
import edu.cmu.sei.atm.util.ResultSetTableModel;
import edu.cmu.sei.atm.util.DatabaseUtilities;
/**
 * this class is not a part of the ATM project
 * but only added to facilitates the management of user accounts
 * with the following features:
 * add a new account, modifies an existent account, delete account.
 * @author hadj
 */
public class AccountManager extends javax.swing.JFrame {

    /** Creates new form AccountManager */
    public AccountManager() {
        initComponentsExtra();
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPaneresultTable = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        jPanelQeury = new javax.swing.JPanel();
        jScrollPaneQueryArea = new javax.swing.JScrollPane();
        queryArea = new javax.swing.JTextArea();
        submitButton = new javax.swing.JButton();
        jPanelFormular = new javax.swing.JPanel();
        jLabelAccountNumber = new javax.swing.JLabel();
        jTextFieldAccountNumber = new javax.swing.JTextField();
        jLabelPIN = new javax.swing.JLabel();
        jTextFieldPIN = new javax.swing.JTextField();
        jLabelAvailableBalance = new javax.swing.JLabel();
        jTextFieldAvailableBalance = new javax.swing.JTextField();
        jLabelTotalBalance = new javax.swing.JLabel();
        jTextFieldTotalBalance = new javax.swing.JTextField();
        jButtonConfirm = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jPanelButton = new javax.swing.JPanel();
        jButtonAdd = new javax.swing.JButton();
        jButtonModify = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        resultTable.setModel(tableModel);
        jScrollPaneresultTable.setViewportView(resultTable);

        jPanelQeury.setLayout(new javax.swing.BoxLayout(jPanelQeury, javax.swing.BoxLayout.LINE_AXIS));

        queryArea.setColumns(20);
        queryArea.setRows(5);
        queryArea.setText("SELECT * FROM client ORDER BY account_number ASC");
        jScrollPaneQueryArea.setViewportView(queryArea);

        jPanelQeury.add(jScrollPaneQueryArea);

        submitButton.setBackground(new java.awt.Color(240, 239, 238));
        submitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/submit_des.png"))); // NOI18N
        submitButton.setBorderPainted(false);
        submitButton.setFocusPainted(false);
        submitButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/submit_en.png"))); // NOI18N
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jPanelQeury.add(submitButton);

        jPanelFormular.setVisible(false);
        jPanelFormular.setLayout(new java.awt.GridBagLayout());

        jLabelAccountNumber.setText("Account Number:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanelFormular.add(jLabelAccountNumber, gridBagConstraints);

        jTextFieldAccountNumber.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanelFormular.add(jTextFieldAccountNumber, gridBagConstraints);
        jTextFieldAccountNumber.setText(String.valueOf(dbu.getNextAccountNumber()));

        jLabelPIN.setText("PIN:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanelFormular.add(jLabelPIN, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanelFormular.add(jTextFieldPIN, gridBagConstraints);

        jLabelAvailableBalance.setText("Available Balance:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanelFormular.add(jLabelAvailableBalance, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanelFormular.add(jTextFieldAvailableBalance, gridBagConstraints);

        jLabelTotalBalance.setText("Total Balance:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanelFormular.add(jLabelTotalBalance, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanelFormular.add(jTextFieldTotalBalance, gridBagConstraints);

        jButtonConfirm.setBackground(new java.awt.Color(240, 239, 238));
        jButtonConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ok_des.png"))); // NOI18N
        jButtonConfirm.setBorderPainted(false);
        jButtonConfirm.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ok_en.png"))); // NOI18N
        jButtonConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanelFormular.add(jButtonConfirm, gridBagConstraints);

        jButtonCancel.setBackground(new java.awt.Color(240, 239, 238));
        jButtonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancel_des.png"))); // NOI18N
        jButtonCancel.setBorderPainted(false);
        jButtonCancel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/cancel_en.png"))); // NOI18N
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanelFormular.add(jButtonCancel, gridBagConstraints);

        jPanelButton.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        jButtonAdd.setBackground(new java.awt.Color(240, 239, 238));
        jButtonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_user_des.png"))); // NOI18N
        jButtonAdd.setBorderPainted(false);
        jButtonAdd.setFocusPainted(false);
        jButtonAdd.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/add_user_en.png"))); // NOI18N
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jPanelButton.add(jButtonAdd);

        jButtonModify.setBackground(new java.awt.Color(240, 239, 238));
        jButtonModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit_user_des.png"))); // NOI18N
        jButtonModify.setBorderPainted(false);
        jButtonModify.setFocusPainted(false);
        jButtonModify.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/edit_user_en.png"))); // NOI18N
        jButtonModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifyActionPerformed(evt);
            }
        });
        jPanelButton.add(jButtonModify);

        jButtonDelete.setBackground(new java.awt.Color(240, 239, 238));
        jButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remove_user_des.png"))); // NOI18N
        jButtonDelete.setBorderPainted(false);
        jButtonDelete.setFocusPainted(false);
        jButtonDelete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/remove_user_en.png"))); // NOI18N
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanelButton.add(jButtonDelete);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPaneresultTable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelFormular, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelQeury, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelQeury, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneresultTable, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelFormular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-700)/2, (screenSize.height-502)/2, 700, 502);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmActionPerformed
        int accountNumber, PIN;
        double availableBalance, totalBalance;
        try {
            accountNumber = Integer.valueOf(jTextFieldAccountNumber.getText());
            PIN = Integer.valueOf(jTextFieldPIN.getText());
            availableBalance = Double.valueOf(jTextFieldAvailableBalance.getText());
            totalBalance = Double.valueOf(jTextFieldTotalBalance.getText());
            dbu.updateAccount(accountNumber, PIN, availableBalance, totalBalance);
            jTextFieldAccountNumber.setText(null);
            jTextFieldPIN.setText(null);
            jTextFieldAvailableBalance.setText(null);
            jTextFieldTotalBalance.setText(null);
            if (addClicked) {
                jTextFieldAccountNumber.setText(String.valueOf(dbu.getNextAccountNumber()));
            }
            if (modifyClicked) {
                jPanelFormular.setVisible(false);
                jPanelButton.setVisible(true);
                modifyClicked = false;
            }
            submitQuery("SELECT * FROM client ORDER BY account_number ASC");

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null,
                    nfe.getMessage() + "\nAll fields must be in a positive"
                    + " number format", "Input Format Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonConfirmActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        jPanelFormular.setVisible(false);
        jPanelButton.setVisible(true);
        addClicked = false;

}//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        jPanelFormular.setVisible(true);
        jTextFieldAccountNumber.setText(String.valueOf(dbu.getNextAccountNumber()));
        jPanelButton.setVisible(false);
        addClicked = true;

    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifyActionPerformed
        if (resultTable.getSelectedRow() >= 0) {
            String tmp = "";
            jPanelFormular.setVisible(true);
            tmp = tableModel.getValueAt(resultTable.getSelectedRow(), 0).toString();
            jTextFieldAccountNumber.setText(tmp);
            tmp = tableModel.getValueAt(resultTable.getSelectedRow(), 1).toString();
            jTextFieldPIN.setText(tmp);
            tmp = tableModel.getValueAt(resultTable.getSelectedRow(), 2).toString();
            jTextFieldAvailableBalance.setText(tmp);
            tmp = tableModel.getValueAt(resultTable.getSelectedRow(), 3).toString();
            jTextFieldTotalBalance.setText(tmp);
            jPanelButton.setVisible(false);
        } else {
            jPanelButton.setVisible(true);
            jPanelFormular.setVisible(false);
            JOptionPane.showMessageDialog(null,
                    "no account is selected", "Input Error",
                    JOptionPane.ERROR_MESSAGE);
        }



        modifyClicked = true;
    }//GEN-LAST:event_jButtonModifyActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        if (resultTable.getSelectedRow() >= 0) {
            int respond = -1;
            int accountNumber ;
       respond = JOptionPane.showConfirmDialog(null,
                    "are you sure you want to delete " +
                    "this account permanently ?", "Notice",
                    JOptionPane.ERROR_MESSAGE);
            if (respond == 0) {
                accountNumber = Integer.valueOf(
                        tableModel.getValueAt(resultTable.getSelectedRow(), 0).toString());
            dbu.deleteAccount(accountNumber);
            submitQuery("SELECT * FROM client ORDER BY account_number ASC");
            }
        } else {

            JOptionPane.showMessageDialog(null,
                    "no account is selected", "Input Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        submitQuery(queryArea.getText());
}//GEN-LAST:event_submitButtonActionPerformed

    public void submitQuery(String query) {
        // perform a new query
        try {
            tableModel.setQuery(query);
        } // end try
        catch (SQLException sqlException) {
            JOptionPane.showMessageDialog(null,
                    sqlException.getMessage(), "Database error",
                    JOptionPane.ERROR_MESSAGE);

            // try to recover from invalid user query
            // by executing default query
            try {
                tableModel.setQuery(DEFAULT_QUERY);
                queryArea.setText(DEFAULT_QUERY);
            } // end try
            catch (SQLException sqlException2) {
                JOptionPane.showMessageDialog(null,
                        sqlException2.getMessage(), "Database error",
                        JOptionPane.ERROR_MESSAGE);

                // ensure database connection is closed
                tableModel.disconnectFromDatabase();

                // terminate application
            } // end inner catch
        } // end outer catch

    }

    private void initComponentsExtra() {
        try {
            dbu.ensureDatabaseExistence();
            // create TableModel for results of query SELECT * FROM authors
            tableModel = new ResultSetTableModel(JDBC_DRIVER, DATABASE_URL,
                    USERNAME, PASSWORD, DEFAULT_QUERY);
        } catch (ClassNotFoundException classNotFound) {
            JOptionPane.showMessageDialog(null,
                    "MySQL driver not found", "Driver not found",
                    JOptionPane.ERROR_MESSAGE);

            // terminate application
        } // end catch
        catch (SQLException sqlException) {
            JOptionPane.showMessageDialog(null, sqlException.getMessage(),
                    "Database error", JOptionPane.ERROR_MESSAGE);

            // ensure database connection is closed
            tableModel.disconnectFromDatabase();

            // terminate application
        } // end catch
    }

    public static void main(String[] args) {
        new AccountManager().setVisible(true);

    } // end main*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonConfirm;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonModify;
    private javax.swing.JLabel jLabelAccountNumber;
    private javax.swing.JLabel jLabelAvailableBalance;
    private javax.swing.JLabel jLabelPIN;
    private javax.swing.JLabel jLabelTotalBalance;
    private javax.swing.JPanel jPanelButton;
    private javax.swing.JPanel jPanelFormular;
    private javax.swing.JPanel jPanelQeury;
    private javax.swing.JScrollPane jScrollPaneQueryArea;
    private javax.swing.JScrollPane jScrollPaneresultTable;
    private javax.swing.JTextField jTextFieldAccountNumber;
    private javax.swing.JTextField jTextFieldAvailableBalance;
    private javax.swing.JTextField jTextFieldPIN;
    private javax.swing.JTextField jTextFieldTotalBalance;
    private javax.swing.JTextArea queryArea;
    private javax.swing.JTable resultTable;
    DatabaseUtilities dbu = new DatabaseUtilities();
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
    private static final long serialVersionUID = 1L;
// JDBC driver and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/credit_card_db";
    final String USERNAME = dbu.getDataBaseUserName();
    final String PASSWORD = dbu.getDataBasePassword();
// default query selects all rows from authors table
    static String DEFAULT_QUERY = "SELECT * FROM client ORDER BY account_number ASC";
    private ResultSetTableModel tableModel;
    private boolean addClicked, modifyClicked = false;
}



/**************************************************************************
 *  2009-2010 by SENOUCI hadj.
 *  Email: senoucihs@gmail.com
 *  this code is free which mean
 *  you can re-utilize it as you want
 *************************************************************************/