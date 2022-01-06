/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistema.dao;

import br.com.sistema.jdbc.ConnectionFactory;
import br.com.sistema.model.Fornecedores;
import br.com.sistema.model.WebServiceCep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class FornecedoresDAO {
    
    private Connection connection;
    
    public void cadastrarFornecedor(Fornecedores dadosFornecedores)
    {
        try
        {
            ConnectionFactory makeConnection = new ConnectionFactory();
            connection = makeConnection.getConnection();
            
            String sqlInsertComand = "insert into tb_fornecedores(nome, cnpj, email, cep, telefone, celular, endereco, numero, complemento, bairro, cidade, estado)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement stmt = connection.prepareStatement(sqlInsertComand);
            
            stmt.setString(1, dadosFornecedores.getNome());
            stmt.setString(2, dadosFornecedores.getCnpj());
            stmt.setString(3, dadosFornecedores.getEmail());
            stmt.setString(4, dadosFornecedores.getCep());
            stmt.setString(5, dadosFornecedores.getTelefone());
            stmt.setString(6, dadosFornecedores.getCelular());
            stmt.setString(7, dadosFornecedores.getEndereco());
            stmt.setInt(8, dadosFornecedores.getNumero());
            stmt.setString(9, dadosFornecedores.getComplemento());
            stmt.setString(10, dadosFornecedores.getBairro());
            stmt.setString(11, dadosFornecedores.getCidade());
            stmt.setString(12, dadosFornecedores.getUf());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro: " +erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    ////////////////////////////////////////////////////////////////////////////
    public void alterarDadosFornecedor(Fornecedores dadosFornecedor)
    {
        try
        {
            ConnectionFactory makeConnection = new ConnectionFactory();
            connection = makeConnection.getConnection();
            
            String sqlUpadateComand = "update tb_fornecedores set nome = ?, cnpj = ?, email = ?, cep = ?, telefone = ?,"
                    + "celular = ?, endereco = ?, numero = ?, complemento = ?, bairro = ?, cidade = ?, estado = ? where id = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sqlUpadateComand);
            
            stmt.setString(1, dadosFornecedor.getNome());
            stmt.setString(2, dadosFornecedor.getCnpj());
            stmt.setString(3, dadosFornecedor.getEmail());
            stmt.setString(4, dadosFornecedor.getCep());
            stmt.setString(5, dadosFornecedor.getTelefone());
            stmt.setString(6, dadosFornecedor.getCelular());
            stmt.setString(7, dadosFornecedor.getEndereco());
            stmt.setInt(8, dadosFornecedor.getNumero());
            stmt.setString(9, dadosFornecedor.getComplemento());
            stmt.setString(10, dadosFornecedor.getBairro());
            stmt.setString(11, dadosFornecedor.getCidade());
            stmt.setString(12, dadosFornecedor.getUf());
            stmt.setInt(13, dadosFornecedor.getId());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso!");
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro: " +erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    ////////////////////////////////////////////////////////////////////////////
    public void excluirFornecedor(Fornecedores dadosFornecedor)
    {
        try
        {
            ConnectionFactory makeConnection = new ConnectionFactory();
            connection = makeConnection.getConnection();
            
            String sqlDeleteComand = "delete from tb_fornecedores where id = ?";
            PreparedStatement stmt = connection.prepareStatement(sqlDeleteComand);
            stmt.setInt(1, dadosFornecedor.getId());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Excluído com Sucesso");
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro: "+erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    ////////////////////////////////////////////////////////////////////////////
    public List<Fornecedores> listaFuncionarios()
    {
        try
        {
            ConnectionFactory makeConnection = new ConnectionFactory();
            connection = makeConnection.getConnection();
            
            List<Fornecedores> lista = new ArrayList();
            String sqlSelectComand = "select * from tb_fornecedores";
            
            PreparedStatement stmt = connection.prepareStatement(sqlSelectComand);
            ResultSet res = stmt.executeQuery();
            
            while(res.next())
            {
                Fornecedores dadosFornecedor = new Fornecedores();
                
                dadosFornecedor.setBairro(res.getString("bairro"));
                dadosFornecedor.setCelular(res.getString("celular"));
                dadosFornecedor.setCep(res.getString("cep"));
                dadosFornecedor.setCidade(res.getString("cidade"));
                dadosFornecedor.setCnpj(res.getString("cnpj"));
                dadosFornecedor.setComplemento(res.getString("complemento"));
                dadosFornecedor.setEmail(res.getString("email"));
                dadosFornecedor.setEndereco(res.getString("endereco"));
                dadosFornecedor.setId(res.getInt("id"));
                dadosFornecedor.setNome(res.getString("nome"));
                dadosFornecedor.setNumero(res.getInt("numero"));
                dadosFornecedor.setTelefone(res.getString("telefone"));
                dadosFornecedor.setUf(res.getString("estado"));
                
                lista.add(dadosFornecedor);
            }
            return lista;
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro: "+erro, "ERRO", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    ////////////////////////////////////////////////////////////////////////////
    public Fornecedores buscaCep(String cep)
    {
        WebServiceCep wsc = WebServiceCep.searchCep(cep);
        Fornecedores dadosCep = new Fornecedores();
        
        if(wsc.wasSuccessful())
        {
            dadosCep.setBairro(wsc.getBairro());
            dadosCep.setCidade(wsc.getCidade());
            dadosCep.setEndereco(wsc.getLogradouroFull());
            dadosCep.setUf(wsc.getUf());
            
            return dadosCep;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Erro numero: " +wsc.getResulCode());
            JOptionPane.showMessageDialog(null, "Descrição do erro: " +wsc.getResultText());
            
            return null;
        }
    }
}
