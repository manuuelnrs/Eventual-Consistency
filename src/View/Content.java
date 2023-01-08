package View;

import Controller.service_bus;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.Thread;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Content extends javax.swing.JFrame {

    public Content() {
        initComponents();
        status.setText("");
    }
    
    public int pausaMS(){
        int ms_random = (int)(Math.random()*(1500-500+1)+500); // Random 500ms-1500ms
        System.out.println(ms_random);
        try {
            Thread.sleep(ms_random);
        } catch (InterruptedException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ms_random;
    }
    
    public void close(){
        Icon icon = new javax.swing.ImageIcon(getClass().getResource("icon.png"));
        Object[] options = {"OK"};
        int opcion = JOptionPane.showOptionDialog(null,
                   "-- Created By --\n  @Mikeahm2506\n  @Manuuelnrs",
                   "Data Consistency",
                   JOptionPane.INFORMATION_MESSAGE,
                   JOptionPane.QUESTION_MESSAGE,
                   icon,
                   options,
                   options[0]);
        if (opcion == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }

    /**
     * FORM
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupConsistency = new javax.swing.ButtonGroup();
        panelMain = new javax.swing.JPanel();
        panelInfo = new javax.swing.JPanel();
        btnCassandra = new javax.swing.JButton();
        btnDynamo = new javax.swing.JButton();
        labelInfo = new javax.swing.JLabel();
        labelTitle = new javax.swing.JLabel();
        rbtnStrong = new javax.swing.JRadioButton();
        rbtnEventual = new javax.swing.JRadioButton();
        rbtnCausal = new javax.swing.JRadioButton();
        btnSimulate = new javax.swing.JButton();
        btnWrite = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        panelContent = new javax.swing.JPanel();
        scrollPanel = new javax.swing.JScrollPane();
        jTableData = new javax.swing.JTable();
        scrollPanel2 = new javax.swing.JScrollPane();
        jTableData2 = new javax.swing.JTable();
        scrollPanel3 = new javax.swing.JScrollPane();
        jTableData3 = new javax.swing.JTable();
        title_services = new javax.swing.JLabel();
        title_status = new javax.swing.JLabel();
        status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Consistency");
        setIconImage(getIconImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelMain.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 102, 255)));

        btnCassandra.setText("Apache Casssandra");
        btnCassandra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCassandraActionPerformed(evt);
            }
        });

        btnDynamo.setText("Dynamo AWS");
        btnDynamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDynamoActionPerformed(evt);
            }
        });

        labelInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelInfo.setForeground(new java.awt.Color(0, 102, 102));
        labelInfo.setText("INFO");

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCassandra, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDynamo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCassandra)
                    .addComponent(btnDynamo)
                    .addComponent(labelInfo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitle.setText("Simulation Data Consistency");

        groupConsistency.add(rbtnStrong);
        rbtnStrong.setSelected(true);
        rbtnStrong.setText("Strong");

        groupConsistency.add(rbtnEventual);
        rbtnEventual.setText("Eventual");

        rbtnCausal.setText("Causal");
        rbtnCausal.setEnabled(false);

        btnSimulate.setBackground(new java.awt.Color(255, 51, 51));
        btnSimulate.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnSimulate.setForeground(new java.awt.Color(255, 255, 255));
        btnSimulate.setText("Simulate");
        btnSimulate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimulateActionPerformed(evt);
            }
        });

        btnWrite.setBackground(new java.awt.Color(0, 102, 204));
        btnWrite.setForeground(new java.awt.Color(255, 255, 255));
        btnWrite.setText("Write/Read");
        btnWrite.setEnabled(false);
        btnWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWriteActionPerformed(evt);
            }
        });

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/reset.png"))); // NOI18N
        btnReset.setEnabled(false);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelTitle)
                        .addGap(124, 124, 124))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addComponent(rbtnStrong)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtnEventual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtnCausal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSimulate, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnWrite, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnReset)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtnStrong)
                        .addComponent(rbtnEventual)
                        .addComponent(rbtnCausal)
                        .addComponent(btnSimulate)
                        .addComponent(btnWrite)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableData.setEnabled(false);
        scrollPanel.setViewportView(jTableData);

        jTableData2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableData2.setEnabled(false);
        scrollPanel2.setViewportView(jTableData2);

        jTableData3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableData3.setEnabled(false);
        scrollPanel3.setViewportView(jTableData3);

        javax.swing.GroupLayout panelContentLayout = new javax.swing.GroupLayout(panelContent);
        panelContent.setLayout(panelContentLayout);
        panelContentLayout.setHorizontalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPanel)
                    .addComponent(scrollPanel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollPanel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        panelContentLayout.setVerticalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContentLayout.createSequentialGroup()
                .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        title_services.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        title_services.setForeground(new java.awt.Color(0, 102, 255));
        title_services.setText("LinkedIn Services");

        title_status.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title_status.setForeground(new java.awt.Color(0, 0, 0));
        title_status.setText("Status:");

        status.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        status.setForeground(new java.awt.Color(0, 153, 51));
        status.setText("Initial");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(title_services)
                        .addGap(91, 91, 91)
                        .addComponent(title_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title_services)
                    .addComponent(title_status)
                    .addComponent(status))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        close();
    }//GEN-LAST:event_formWindowClosing

    private void btnCassandraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCassandraActionPerformed
        String txtCassandra = "[ESP] Cassandra permite ajustar la disponibilidad y la consistencia de los datos\n"
                + "configurando las propiedades «replication factor» y «consistency level».\nSoftware en << https://cassandra.apache.org/_/download.html >>";
        JOptionPane.showMessageDialog(null,txtCassandra, "Cassandra Consistency",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnCassandraActionPerformed

    private void btnDynamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDynamoActionPerformed
        String txtDynamo = "[ESP] DynamoDB utiliza las lecturas eventualmente consistentes a menos que \n"
                + "especifique lo contrario. Las operaciones de lectura (como GetItem, Queryy Scan) \n"
                + "proporcionan un parámetro ConsistentRead. Si establece este parámetro en verdadero, "
                + "DynamoDB utiliza lecturas de consistencia alta durante la operación.\n"
                + "Software en << https://docs.aws.amazon.com/amazondynamodb/"
                + "    latest/developerguide/DynamoDBLocal.html >>";
        JOptionPane.showMessageDialog(null,txtDynamo, "Dynamo Consistency",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnDynamoActionPerformed

    private void btnSimulateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimulateActionPerformed
        btnSimulate.setEnabled(false);
        btnWrite.setEnabled(true);
        btnReset.setEnabled(true);
        
        // INITIAL LOADING...
        jTableData.setModel( service_bus.adjustModel(1, "", 0, 0) );
        jTableData2.setModel( service_bus.adjustModel(2, "", 0, 0) );
        jTableData3.setModel( service_bus.adjustModel(3, "", 0, 0) );
        
        status.setText("Initial");
    }//GEN-LAST:event_btnSimulateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        btnSimulate.setEnabled(true);
        btnWrite.setEnabled(false);
        btnReset.setEnabled(false);
        jTableData.setModel( service_bus.adjustModel(0, "", 0, 0) );
        jTableData2.setModel( service_bus.adjustModel(0, "", 0, 0) );
        jTableData3.setModel( service_bus.adjustModel(0, "", 0, 0) );
        status.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWriteActionPerformed
        String[] users = {"Usuario 1", "Usuario 3", "Usuario 10"};
        String user = (String) JOptionPane.showInputDialog(null, "Select the user to write", "Users", JOptionPane.DEFAULT_OPTION, null, users, users[0]);
               
        if( user != null ){
            String response = JOptionPane.showInputDialog("Write the name to change of " + user);
            if (response != "" && rbtnStrong.isSelected() ){
                switch (user) {
                    case "Usuario 1":
                        jTableData.setModel( service_bus.adjustModel(1, response, 0, 2) );
                        jTableData2.setModel( service_bus.adjustModel(2, response, 0, 2) );
                        status.setText("Updated in 0.0001 ms");
                        break;
                    case "Usuario 3":
                        jTableData2.setModel( service_bus.adjustModel(2, response, 2, 2) );
                        jTableData3.setModel( service_bus.adjustModel(3, response, 2, 2) );
                        status.setText("Updated in 0.0001 ms");
                        break;
                    case "Usuario 10":
                        jTableData.setModel( service_bus.adjustModel(1, response, 1, 2) );
                        jTableData3.setModel( service_bus.adjustModel(3, response, 1, 2) );
                        status.setText("Updated in 0.0001 ms");
                        break;
                    default:
                        break;
                }
            }
            else if (response != "" && rbtnEventual.isSelected() ){
                switch (user) {
                    case "Usuario 1":
                        int miliseconds = 0;
                        miliseconds += pausaMS();
                        jTableData.setModel( service_bus.adjustModel(1, response, 0, 2) );
                        miliseconds += pausaMS();
                        jTableData2.setModel( service_bus.adjustModel(2, response, 0, 2) );
                        status.setText("Updated in "+miliseconds+" ms");
                        break;

                    case "Usuario 3":
                        int miliseconds2 = 0;
                        miliseconds2 += pausaMS();
                        jTableData2.setModel( service_bus.adjustModel(2, response, 2, 2) );
                        miliseconds2 += pausaMS();
                        jTableData3.setModel( service_bus.adjustModel(3, response, 2, 2) );
                        status.setText("Updated in "+miliseconds2+" ms");
                        break;
                    case "Usuario 10":
                        int miliseconds3 = 0;
                        miliseconds3 += pausaMS();
                        jTableData.setModel( service_bus.adjustModel(1, response, 1, 2) );
                        miliseconds3 += pausaMS();
                        jTableData3.setModel( service_bus.adjustModel(3, response, 1, 2) );
                        status.setText("Updated in "+miliseconds3+" ms");
                        break;
                    default:
                        break;
                }
            }
        }
        
        
        
    }//GEN-LAST:event_btnWriteActionPerformed

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
        getImage(ClassLoader.getSystemResource("View/icon.png"));

       return retValue;
    }
    
    public static void main(String args[]) {
        /* THEME */
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Content.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* DISPLAY */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Content().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCassandra;
    private javax.swing.JButton btnDynamo;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimulate;
    private javax.swing.JButton btnWrite;
    private javax.swing.ButtonGroup groupConsistency;
    private javax.swing.JTable jTableData;
    private javax.swing.JTable jTableData2;
    private javax.swing.JTable jTableData3;
    private javax.swing.JLabel labelInfo;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelContent;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JPanel panelMain;
    private javax.swing.JRadioButton rbtnCausal;
    private javax.swing.JRadioButton rbtnEventual;
    private javax.swing.JRadioButton rbtnStrong;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JScrollPane scrollPanel2;
    private javax.swing.JScrollPane scrollPanel3;
    private javax.swing.JLabel status;
    private javax.swing.JLabel title_services;
    private javax.swing.JLabel title_status;
    // End of variables declaration//GEN-END:variables
}
