/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistema.view;


import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
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

        ImageIcon icon = new ImageIcon(getClass().getResource("/images/fundo.jpg"));
        Image image = icon.getImage();
        painel_desktop = new javax.swing.JDesktopPane() {
            public void paintComponent(Graphics g){
                g.drawImage(image, 0,0, getWidth(),getHeight(),this);
            }
        };
        jLabel1 = new javax.swing.JLabel();
        usuarioLogado = new javax.swing.JLabel();
        menuDeOpcoes = new javax.swing.JMenuBar();
        opcaoClientes = new javax.swing.JMenu();
        cadastrarClientes = new javax.swing.JMenuItem();
        opcaoFuncionarios = new javax.swing.JMenu();
        controleDeFuncionarios = new javax.swing.JMenuItem();
        opcaoFornecedores = new javax.swing.JMenu();
        controleDeFornecedores = new javax.swing.JMenuItem();
        opcaoProdutos = new javax.swing.JMenu();
        controleDeEstoque = new javax.swing.JMenuItem();
        consultaDeProdutos = new javax.swing.JMenuItem();
        opcaoVendas = new javax.swing.JMenu();
        abrirPVD = new javax.swing.JMenuItem();
        posicaoDoDia = new javax.swing.JMenuItem();
        controleDeVendas = new javax.swing.JMenuItem();
        opcaoConfiguracoes = new javax.swing.JMenu();
        trocarUsuario = new javax.swing.JMenuItem();
        opcaoSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        painel_desktop.setBackground(new java.awt.Color(255, 255, 255));
        painel_desktop.setPreferredSize(new java.awt.Dimension(860, 515));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Usuário Logado: ");

        usuarioLogado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        painel_desktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel_desktop.setLayer(usuarioLogado, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painel_desktopLayout = new javax.swing.GroupLayout(painel_desktop);
        painel_desktop.setLayout(painel_desktopLayout);
        painel_desktopLayout.setHorizontalGroup(
            painel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_desktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(476, Short.MAX_VALUE))
        );
        painel_desktopLayout.setVerticalGroup(
            painel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_desktopLayout.createSequentialGroup()
                .addContainerGap(489, Short.MAX_VALUE)
                .addGroup(painel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        menuDeOpcoes.setBackground(new java.awt.Color(51, 102, 255));
        menuDeOpcoes.setForeground(new java.awt.Color(0, 0, 0));
        menuDeOpcoes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        opcaoClientes.setForeground(new java.awt.Color(0, 0, 0));
        opcaoClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clientes.png"))); // NOI18N
        opcaoClientes.setText("Clientes");

        cadastrarClientes.setText("Cadastrar Clientes");
        cadastrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarClientesActionPerformed(evt);
            }
        });
        opcaoClientes.add(cadastrarClientes);

        menuDeOpcoes.add(opcaoClientes);

        opcaoFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/funcionarios.png"))); // NOI18N
        opcaoFuncionarios.setText("Funcionários");

        controleDeFuncionarios.setText("Controle de funcionarios");
        controleDeFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleDeFuncionariosActionPerformed(evt);
            }
        });
        opcaoFuncionarios.add(controleDeFuncionarios);

        menuDeOpcoes.add(opcaoFuncionarios);

        opcaoFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fornecedores.png"))); // NOI18N
        opcaoFornecedores.setText("Fornecedores");

        controleDeFornecedores.setText("Controle de fornecedores");
        controleDeFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleDeFornecedoresActionPerformed(evt);
            }
        });
        opcaoFornecedores.add(controleDeFornecedores);

        menuDeOpcoes.add(opcaoFornecedores);

        opcaoProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/produtos.png"))); // NOI18N
        opcaoProdutos.setText("Produtos");

        controleDeEstoque.setText("Controle de estoque");
        opcaoProdutos.add(controleDeEstoque);

        consultaDeProdutos.setText("Consulta de produtos");
        opcaoProdutos.add(consultaDeProdutos);

        menuDeOpcoes.add(opcaoProdutos);

        opcaoVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vendas.png"))); // NOI18N
        opcaoVendas.setText("Vendas");

        abrirPVD.setText("Abrir PVD");
        opcaoVendas.add(abrirPVD);

        posicaoDoDia.setText("Posição do dia");
        opcaoVendas.add(posicaoDoDia);

        controleDeVendas.setText("Controle de vendas");
        opcaoVendas.add(controleDeVendas);

        menuDeOpcoes.add(opcaoVendas);

        opcaoConfiguracoes.setForeground(new java.awt.Color(0, 0, 0));
        opcaoConfiguracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/configuracoes.png"))); // NOI18N
        opcaoConfiguracoes.setText("Configurações");

        trocarUsuario.setText("Trocar de Usuário");
        opcaoConfiguracoes.add(trocarUsuario);

        menuDeOpcoes.add(opcaoConfiguracoes);

        opcaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sair.png"))); // NOI18N
        opcaoSair.setText("Sair");
        opcaoSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opcaoSairMouseClicked(evt);
            }
        });
        menuDeOpcoes.add(opcaoSair);

        setJMenuBar(menuDeOpcoes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcaoSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcaoSairMouseClicked
        
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja mesmo fazer logout?");
        
        if(escolha == 0)
        {
            FrmLogin telaLogin = new FrmLogin();
            
            telaLogin.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_opcaoSairMouseClicked

    private void cadastrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarClientesActionPerformed
        
        FrmCadastrarClientes telaClientes = new FrmCadastrarClientes();
        telaClientes.setVisible(true);
    }//GEN-LAST:event_cadastrarClientesActionPerformed

    private void controleDeFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controleDeFuncionariosActionPerformed
        
        FrmFuncionario telaFuncionarios = new FrmFuncionario();
        telaFuncionarios.setVisible(true);
    }//GEN-LAST:event_controleDeFuncionariosActionPerformed

    private void controleDeFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controleDeFornecedoresActionPerformed
        
        FrmFornecedores telaFornecedores = new FrmFornecedores();
        telaFornecedores.setVisible(true);
    }//GEN-LAST:event_controleDeFornecedoresActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrirPVD;
    private javax.swing.JMenuItem cadastrarClientes;
    private javax.swing.JMenuItem consultaDeProdutos;
    private javax.swing.JMenuItem controleDeEstoque;
    private javax.swing.JMenuItem controleDeFornecedores;
    private javax.swing.JMenuItem controleDeFuncionarios;
    public javax.swing.JMenuItem controleDeVendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar menuDeOpcoes;
    private javax.swing.JMenu opcaoClientes;
    private javax.swing.JMenu opcaoConfiguracoes;
    private javax.swing.JMenu opcaoFornecedores;
    private javax.swing.JMenu opcaoFuncionarios;
    private javax.swing.JMenu opcaoProdutos;
    private javax.swing.JMenu opcaoSair;
    private javax.swing.JMenu opcaoVendas;
    private javax.swing.JDesktopPane painel_desktop;
    public javax.swing.JMenuItem posicaoDoDia;
    private javax.swing.JMenuItem trocarUsuario;
    private javax.swing.JLabel usuarioLogado;
    // End of variables declaration//GEN-END:variables

    public void setUsuarioLogado(String nome) 
    {
        usuarioLogado.setText(nome);
    }
}
