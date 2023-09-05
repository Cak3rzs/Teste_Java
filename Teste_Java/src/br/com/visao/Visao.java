
package br.com.visao;
import br.com.controle.Controle;

/**
 *
 * @author laboratorio
 */
public class Visao extends javax.swing.JFrame {
    private final Controle controle;
    private boolean necessidades_Especiais;    
    public Visao() {
        initComponents();
        controle = new Controle();  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTcusto_fabrica = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jBsim = new javax.swing.JButton();
        jBnao = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Digite o custo de fábrica:");

        jTcusto_fabrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcusto_fabricaActionPerformed(evt);
            }
        });

        jLabel2.setText("Você é portador de doenças especiais?");

        jBsim.setText("Sim");
        jBsim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsimActionPerformed(evt);
            }
        });

        jBnao.setText("Não");
        jBnao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnaoActionPerformed(evt);
            }
        });

        jLabel3.setText("O custo do consumidor é:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTcusto_fabrica, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBsim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBnao))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTcusto_fabrica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsim)
                    .addComponent(jBnao))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTcusto_fabricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcusto_fabricaActionPerformed
       String textoCustoFabrica = jTcusto_fabrica.getText();
        if (!textoCustoFabrica.isEmpty()) {
        try {
            double custoFabrica = Double.parseDouble(textoCustoFabrica);

            if (custoFabrica > 0) {
                necessidades_Especiais = false;  // Remova a declaração da variável local
                double custoConsumidor = controle.calcularCustoConsumidor(necessidades_Especiais);
                jLabel3.setText("O custo do consumidor é: R$ " + String.format("%.2f", custoConsumidor));
            } else {
                jLabel3.setText("Erro: Digite um valor válido para o custo de fábrica.");
            }
        } catch (NumberFormatException e) {
            jLabel3.setText("Erro: Digite um valor válido para o custo de fábrica.");
        }
    } else {
        jLabel3.setText("Erro: Digite o custo de fábrica antes de pressionar Enter.");
    }
 
        
                
                
                
    }//GEN-LAST:event_jTcusto_fabricaActionPerformed
    
    
    private void jBsimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsimActionPerformed
          try {
        double custoFabrica = Double.parseDouble(jTcusto_fabrica.getText());
        necessidades_Especiais = true; // Se o botão "Sim" está selecionado
        double custoConsumidor = controle.calcularCustoConsumidor(necessidades_Especiais);
        jLabel3.setText("O custo do consumidor é: R$ " + String.format("%.2f", custoConsumidor));
    } catch (NumberFormatException e) {
        jLabel3.setText("Erro: Digite um valor válido para o custo de fábrica.");
    }
    }//GEN-LAST:event_jBsimActionPerformed

    private void jBnaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnaoActionPerformed
         necessidades_Especiais = false; // Se o checkbox "Não" está selecionado
    double custoConsumidor = controle.calcularCustoConsumidor(necessidades_Especiais);
    jLabel3.setText("O custo do consumidor é: R$ " + String.format("%.2f", custoConsumidor));
    }//GEN-LAST:event_jBnaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Visao().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBnao;
    private javax.swing.JButton jBsim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTcusto_fabrica;
    // End of variables declaration//GEN-END:variables

}

