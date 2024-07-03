package view;

import dao.DataSource;
import dao.daoCaderno;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Caderno;

public class JIFCadernoExcluir extends javax.swing.JInternalFrame {

    public JIFCadernoExcluir() {
        initComponents();
    }

    @SuppressWarnings("desmarcado")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TFdescricao = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TFcodigoCaderno = new javax.swing.JTextField();
        TFdescricaoCaderno = new javax.swing.JTextField();
        TFidprodutoCaderno = new javax.swing.JTextField();
        TFvalorCaderno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TFquantidadeCaderno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TFidalunoCaderno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setTitle("Excluir Divida");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Excluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Fechar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Descrição");

        TFdescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TFdescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFdescricaoActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Pesquisar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFdescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton4))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Código:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Id Produto:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Descrição:");

        TFcodigoCaderno.setEditable(false);
        TFcodigoCaderno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TFcodigoCaderno.setSelectionColor(new java.awt.Color(0, 0, 0));

        TFdescricaoCaderno.setEditable(false);
        TFdescricaoCaderno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TFdescricaoCaderno.setSelectionColor(new java.awt.Color(0, 0, 0));

        TFidprodutoCaderno.setEditable(false);
        TFidprodutoCaderno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TFidprodutoCaderno.setSelectionColor(new java.awt.Color(0, 0, 0));

        TFvalorCaderno.setEditable(false);
        TFvalorCaderno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TFvalorCaderno.setSelectionColor(new java.awt.Color(0, 0, 0));
        TFvalorCaderno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFvalorCadernoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Valor:");

        TFquantidadeCaderno.setEditable(false);
        TFquantidadeCaderno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TFquantidadeCaderno.setSelectionColor(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Quantidade:");

        TFidalunoCaderno.setEditable(false);
        TFidalunoCaderno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TFidalunoCaderno.setSelectionColor(new java.awt.Color(0, 0, 0));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Id Cliente:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TFidalunoCaderno, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3)
                        .addGap(11, 11, 11)
                        .addComponent(TFidprodutoCaderno, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                    .addComponent(TFdescricaoCaderno)
                    .addComponent(TFvalorCaderno, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TFquantidadeCaderno)
                    .addComponent(TFcodigoCaderno, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFcodigoCaderno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TFdescricaoCaderno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFvalorCaderno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TFquantidadeCaderno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TFidalunoCaderno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(TFidprodutoCaderno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(196, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TFdescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFdescricaoActionPerformed

    }//GEN-LAST:event_TFdescricaoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // cria um datasource para conexão com o banco
        DataSource dataSource = new DataSource();

        // instancia um objeto
        daoCaderno dao = new daoCaderno(dataSource);
        
        // cria um arraylist para jogar os dados recuperados dentro
        ArrayList<Caderno> lista = dao.readOne(TFdescricao.getText());
        TFcodigoCaderno.setText("");
        TFdescricaoCaderno.setText("");
        TFvalorCaderno.setText("");
        TFquantidadeCaderno.setText("");
        TFidalunoCaderno.setText("");
        TFidprodutoCaderno.setText("");


        // verifica se a lista retornou vazia
        if(lista != null){
            for(Caderno m : lista){
               TFcodigoCaderno.setText(String.valueOf(m.getIdCaderno()));
                TFdescricaoCaderno.setText(m.getDescricao());
                TFvalorCaderno.setText(String.valueOf(m.getValor()));
                TFquantidadeCaderno.setText(String.valueOf(m.getQuantidade()));
                TFidalunoCaderno.setText(String.valueOf(m.getIdAluno()));
                TFidprodutoCaderno.setText(String.valueOf(m.getIdProduto()));      
            }
        }
        // fecha DataSource
        dataSource.closeDataSource();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (Integer.parseInt(TFcodigoCaderno.getText())<=0) {
            JOptionPane.showMessageDialog(null,"Fornecedor não selecionado para excluir!");
        }
        else {
            int opcao = JOptionPane.showConfirmDialog(null,"Deseja excluir?","Atenção",JOptionPane.YES_OPTION);

            if(opcao == JOptionPane.YES_OPTION){
                DataSource dataSource = new DataSource();

                daoCaderno dao = new daoCaderno(dataSource);

                int codigo = Integer.parseInt(TFcodigoCaderno.getText());
                dao.excluir(codigo);
                
                //Executa consulta
                jButton4ActionPerformed(evt);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TFvalorCadernoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFvalorCadernoActionPerformed

    }//GEN-LAST:event_TFvalorCadernoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFcodigoCaderno;
    private javax.swing.JTextField TFdescricao;
    private javax.swing.JTextField TFdescricaoCaderno;
    private javax.swing.JTextField TFidalunoCaderno;
    private javax.swing.JTextField TFidprodutoCaderno;
    private javax.swing.JTextField TFquantidadeCaderno;
    private javax.swing.JTextField TFvalorCaderno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}