/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ontap;

import javax.swing.JOptionPane;

/**
 *
 * @author SPC
 */
public class TicTacLare extends javax.swing.JFrame {

    /**
     * Creates new form TicTacLare
     */
    
    int turn = 2;
    int buttonused[]={0,0,0,0,0,0,0,0,0};
    int pXwon[]={0,0,0,0,0,0,0,0,0};
    int pOwon[]={0,0,0,0,0,0,0,0,0};
    
    int pXwon()
    {
        if(pXwon[0]==1 && pXwon[1]==1 && pXwon[2]==1)
        {
            return 1;
        }
        if(pXwon[3]==1 && pXwon[4]==1 && pXwon[5]==1)
        {
            return 1;
        }
        if(pXwon[6]==1 && pXwon[7]==1 && pXwon[8]==1)
        {
            return 1;
        }
        if(pXwon[0]==1 && pXwon[3]==1 && pXwon[6]==1)
        {
            return 1;
        }
        if(pXwon[1]==1 && pXwon[4]==1 && pXwon[7]==1)
        {
            return 1;
        }
        if(pXwon[2]==1 && pXwon[5]==1 && pXwon[8]==1)
        {
            return 1;
        }
        if(pXwon[2]==1 && pXwon[4]==1 && pXwon[6]==1)
        {
            return 1;
        }
        if(pXwon[0]==1 && pXwon[4]==1 && pXwon[8]==1)
        {
            return 1;
        }
        return 0;
    }
    
        
    int pOwon()
    {
        if(pOwon[0]==1 && pOwon[1]==1 && pOwon[2]==1)
        {
            return 1;
        }
        if(pOwon[3]==1 && pOwon[4]==1 && pOwon[5]==1)
        {
            return 1;
        }
        if(pOwon[6]==1 && pOwon[7]==1 && pOwon[8]==1)
        {
            return 1;
        }
        if(pOwon[0]==1 && pOwon[3]==1 && pOwon[6]==1)
        {
            return 1;
        }
        if(pOwon[1]==1 && pOwon[4]==1 && pOwon[7]==1)
        {
            return 1;
        }
        if(pOwon[2]==1 && pOwon[5]==1 && pOwon[8]==1)
        {
            return 1;
        }
        if(pOwon[2]==1 && pOwon[4]==1 && pOwon[6]==1)
        {
            return 1;
        }
        if(pOwon[0]==1 && pOwon[4]==1 && pOwon[8]==1)
        {
            return 1;
        }
        return 0;
    }
            
    
    
    
    
    
    public TicTacLare() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 51, 51));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b0.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        b0.setForeground(new java.awt.Color(255, 0, 0));
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        b3.setForeground(new java.awt.Color(255, 0, 0));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        b6.setForeground(new java.awt.Color(255, 0, 0));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        b4.setForeground(new java.awt.Color(255, 0, 0));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 0, 0));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        b7.setForeground(new java.awt.Color(255, 0, 0));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        b5.setForeground(new java.awt.Color(255, 0, 0));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        b8.setForeground(new java.awt.Color(255, 0, 0));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        btnreset.setFont(new java.awt.Font("SFU BaskervilleBook", 1, 14)); // NOI18N
        btnreset.setForeground(new java.awt.Color(51, 255, 51));
        btnreset.setText("CHƠI LẠI");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SFU Machine", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("CỜ CARO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        // TODO add your handling code here:
        if(buttonused[0]==0)
        {
            if(turn%2==0)
            {
                turn++;
                b0.setText("X");
                buttonused[0]=1;
                pXwon[0]=1;
                
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showInternalMessageDialog(rootPane,"NGƯỜI CHƠI X THẮNG");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"NGƯỜI CHƠI O THẮNG !!");
                }
            }
            else
            {
                turn++;
                b0.setText("O");
                buttonused[0]=1;
                pOwon[0]=1;
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showInternalMessageDialog(rootPane,"NGƯỜI CHƠI X THẮNG");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"NGƯỜI CHƠI O THẮNG !!");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Ô NÀY ĐÃ ĐƯỢC SỬ DỤNG - chọn ô khác đi !!!");
        }
    }//GEN-LAST:event_b0ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        if(buttonused[1]==0)
        {
            if(turn%2==0)
            {
                turn++;
                b1.setText("X");
                buttonused[1]=1;
                pXwon[1]=1;
                
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showInternalMessageDialog(rootPane,"NGƯỜI CHƠI X THẮNG");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"NGƯỜI CHƠI O THẮNG !!");
                }
            }
            else
            {
                turn++;
                b1.setText("O");
                buttonused[1]=1;
                pOwon[1]=1;
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showInternalMessageDialog(rootPane,"NGƯỜI CHƠI X THẮNG");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"NGƯỜI CHƠI O THẮNG !!");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Ô NÀY ĐÃ ĐƯỢC SỬ DỤNG - chọn ô khác đi !!!");
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        if(buttonused[2]==0)
        {
            if(turn%2==0)
            {
                turn++;
                b2.setText("X");
                buttonused[2]=1;
                pXwon[2]=1;
                
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showInternalMessageDialog(rootPane,"NGƯỜI CHƠI X THẮNG");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"NGƯỜI CHƠI O THẮNG !!");
                }
            }
            else
            {
                turn++;
                b2.setText("O");
                buttonused[2]=1;
                pOwon[2]=1;
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showInternalMessageDialog(rootPane,"NGƯỜI CHƠI X THẮNG");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"NGƯỜI CHƠI O THẮNG !!");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Ô NÀY ĐÃ ĐƯỢC SỬ DỤNG - chọn ô khác đi !!!");
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        if(buttonused[3]==0)
        {
            if(turn%2==0)
            {
                turn++;
                b3.setText("X");
                buttonused[3]=1;
                pXwon[3]=1;
                
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showInternalMessageDialog(rootPane,"NGƯỜI CHƠI X THẮNG");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"NGƯỜI CHƠI O THẮNG !!");
                }
            }
            else
            {
                turn++;
                b3.setText("O");
                buttonused[3]=1;
                pOwon[3]=1;
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showInternalMessageDialog(rootPane,"NGƯỜI CHƠI X THẮNG");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"NGƯỜI CHƠI O THẮNG !!");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Ô NÀY ĐÃ ĐƯỢC SỬ DỤNG - chọn ô khác đi !!!");
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
        if(buttonused[4]==0)
        {
            if(turn%2==0)
            {
                turn++;
                b4.setText("X");
                buttonused[4]=1;
                pXwon[4]=1;
                
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showInternalMessageDialog(rootPane,"NGƯỜI CHƠI X THẮNG");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"NGƯỜI CHƠI O THẮNG !!");
                }
            }
            else
            {
                turn++;
                b4.setText("O");
                buttonused[4]=1;
                pOwon[4]=1;
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showInternalMessageDialog(rootPane,"NGƯỜI CHƠI X THẮNG");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"NGƯỜI CHƠI O THẮNG !!");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Ô NÀY ĐÃ ĐƯỢC SỬ DỤNG - chọn ô khác đi !!!");
        }
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
        if(buttonused[5]==0)
        {
            if(turn%2==0)
            {
                turn++;
                b5.setText("X");
                buttonused[5]=1;
                pXwon[5]=1;
                
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showInternalMessageDialog(rootPane,"NGƯỜI CHƠI X THẮNG");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"NGƯỜI CHƠI O THẮNG !!");
                }
            }
            else
            {
                turn++;
                b5.setText("O");
                buttonused[5]=1;
                pOwon[5]=1;
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showInternalMessageDialog(rootPane,"NGƯỜI CHƠI X THẮNG");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"NGƯỜI CHƠI O THẮNG !!");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Ô NÀY ĐÃ ĐƯỢC SỬ DỤNG - chọn ô khác đi !!!");
        }
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
        if(buttonused[6]==0)
        {
            if(turn%2==0)
            {
                turn++;
                b6.setText("X");
                buttonused[6]=1;
                pXwon[6]=1;
                
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showInternalMessageDialog(rootPane,"NGƯỜI CHƠI X THẮNG");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"NGƯỜI CHƠI O THẮNG !!");
                }
            }
            else
            {
                turn++;
                b6.setText("O");
                buttonused[6]=1;
                pOwon[6]=1;
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showInternalMessageDialog(rootPane,"NGƯỜI CHƠI X THẮNG");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"NGƯỜI CHƠI O THẮNG !!");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Ô NÀY ĐÃ ĐƯỢC SỬ DỤNG - chọn ô khác đi !!!");
        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
        if(buttonused[7]==0)
        {
            if(turn%2==0)
            {
                turn++;
                b7.setText("X");
                buttonused[7]=1;
                pXwon[7]=1;
                
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showInternalMessageDialog(rootPane,"NGƯỜI CHƠI X THẮNG");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"NGƯỜI CHƠI O THẮNG !!");
                }
            }
            else
            {
                turn++;
                b7.setText("O");
                buttonused[7]=1;
                pOwon[7]=1;
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showInternalMessageDialog(rootPane,"NGƯỜI CHƠI X THẮNG");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"NGƯỜI CHƠI O THẮNG !!");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Ô NÀY ĐÃ ĐƯỢC SỬ DỤNG - chọn ô khác đi !!!");
        }
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        if(buttonused[8]==0)
        {
            if(turn%2==0)
            {
                turn++;
                b8.setText("X");
                buttonused[8]=1;
                pXwon[8]=1;
                
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showInternalMessageDialog(rootPane,"NGƯỜI CHƠI X THẮNG");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"NGƯỜI CHƠI O THẮNG !!");
                }
            }
            else
            {
                turn++;
                b8.setText("O");
                buttonused[8]=1;
                pOwon[8]=1;
                int result1=pXwon();
                int result2=pOwon();
                
                if(result1==1)
                {
                    JOptionPane.showInternalMessageDialog(rootPane,"NGƯỜI CHƠI X THẮNG");
                }
                else if(result2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"NGƯỜI CHƠI O THẮNG !!");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Ô NÀY ĐÃ ĐƯỢC SỬ DỤNG - chọn ô khác đi !!!");
        }
    }//GEN-LAST:event_b8ActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        b0.setText(" ");
        b1.setText(" ");
        b2.setText(" ");
        b3.setText(" ");
        b4.setText(" ");
        b5.setText(" ");
        b6.setText(" ");
        b7.setText(" ");
        b8.setText(" ");
        
        turn=2;
        for(int i=0;i<9;i++)
        {
            buttonused[i]=0;
            
        }
        for(int i=0;i<9;i++)
        {
            pXwon[i]=0;
            
        }
        for(int i=0;i<9;i++)
        {
            pOwon[i]=0;
            
        }
    }//GEN-LAST:event_btnresetActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacLare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacLare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacLare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacLare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacLare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton btnreset;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}