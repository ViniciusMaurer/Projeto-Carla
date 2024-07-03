package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import model.Produtos;

public class daoProdutos {
    
    // variavel de datasource para a conexão
    private DataSource dataSource;
    
    // método construtor para passar o dataSource
    public daoProdutos(DataSource dataSource){
        this.dataSource = dataSource;
    }

    // para popular os dados no arraylist de acordo com a quantidade de 
    // registros na tabela de produtos

    public ArrayList<Produtos> readAll(){

        //Connection con = dataSource.getConnection();
        PreparedStatement ps = null;

        try{
            String SQL = "SELECT * "
                    + "   FROM produtos";
            
            // para mandar como uma instrução, precisa usar o PreparedStatement
            // traduz o comando SQL para execução
            ps = dataSource.getConnection().prepareStatement(SQL);

            // executa a consulta no banco
            ResultSet rs = ps.executeQuery();
            
            // cria a lista de resultados trazidos da tabela
            ArrayList<Produtos> lista = new ArrayList<Produtos>();
            
            // enquanto tiverem registros no ResultSet (rs), 
            // vai adicionando na lista
            while(rs.next()){
                // cria objeto de municipio
                // cada cidade é um objeto
                Produtos user = new Produtos();

                user.setIdProduto(rs.getInt("IdProduto"));
                user.setDescricao(rs.getString("prod_descricao"));
                user.setQuantidade(rs.getInt("prod_quantidade"));
                user.setIdFornecedor(rs.getInt("idFornecedor"));
                user.setPreco_custo(rs.getFloat("prod_preco_custo"));
                user.setPreco_venda(rs.getFloat("prod_preco_venda"));
               
                // adiciona o objeto (registro) na lista (arraylist)
                lista.add(user);
            }
            
            // fecha o statement e o datasource
            ps.close();
            dataSource.closeDataSource();
            
            // retorna os dados consultados
            return lista;
        }
        catch (SQLException ex){
            System.err.println("Erro ao recuperar dados "+ex.getMessage());
        }
        catch (Exception ex){
            System.err.println("Erro geral "+ex.getMessage());
        }
        
        // fecha o statement e o datasource
        dataSource.closeDataSource();
            
        // caso aconteça alguma coisa
        return null;
    }

    public void createNS(Produtos usu) {
        throw new UnsupportedOperationException("Ainda não suportado."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
        // insere dados
    public void create(Produtos usu){
        Connection con = dataSource.getConnection();
        PreparedStatement ps = null;

        try{
            String SQL = "INSERT INTO produtos "
                    + "              (prod_descricao,"
                    + "               prod_quantidade,"
                    + "               idFornecedor,"
                    + "               prod_preco_custo,"
                    + "               prod_preco_venda) "
                    + "       VALUES (?, ?, ?, ?, ?)";
            
            // para mandar como uma instrução, precisa usar o PreparedStatement
            // traduz o comando SQL para execução
            ps = con.prepareStatement(SQL);
            ps.setString(1,usu.getDescricao());
            ps.setInt(2,usu.getQuantidade());
            ps.setInt(3,usu.getIdFornecedor());
            ps.setFloat(4,usu.getPreco_custo());
            ps.setFloat(5,usu.getPreco_venda());

            // executa a inserção no banco
            ps.executeUpdate();
            ps.close();
            
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!");
        }
        catch (SQLException ex){
            //System.err.println("Erro ao salvar os dados "+ex.getMessage());
            JOptionPane.showMessageDialog(null,"Erro ao salvar!\n"+ex);
        }
        finally{
            // fecha o statement e o datasource
            //ps.close();
            dataSource.closeDataSource();
        }
    }

    // para consultar um registros na tabela de municipios
    public ArrayList<Produtos> readOne(String descricao){

        //Connection con = dataSource.getConnection();
        PreparedStatement ps = null;

        try{
            String SQL = "SELECT * "
                    + "     FROM produtos "
                    + "    WHERE (prod_descricao LIKE ?)";

            // para mandar como uma instrução, precisa usar o PreparedStatement
            // traduz o comando SQL para execução
            ps = dataSource.getConnection().prepareStatement(SQL);
            ps.setString(1,"%"+descricao+"%");
            
            // executa a consulta no banco
            ResultSet rs = ps.executeQuery();
            
            // cria a lista de resultados trazidos da tabela
            ArrayList<Produtos> lista = new ArrayList<Produtos>();
            
            while(rs.next()){
                // instancia um objeto
                Produtos usu = new Produtos();
                
                // joga dados da lista para o objeto
                usu.setIdProduto(rs.getInt("idProduto"));
                usu.setDescricao(rs.getString("prod_descricao")); 
                usu.setQuantidade(rs.getInt("prod_quantidade"));
                usu.setIdFornecedor(rs.getInt("idFornecedor"));
                usu.setPreco_custo(rs.getFloat("prod_preco_custo"));
                usu.setPreco_venda(rs.getFloat("prod_preco_venda"));
                
                // adiciona o objeto (registro) na lista (arraylist)
                lista.add(usu);
            }
            
            // fecha o statement e o datasource
            ps.close();
            dataSource.closeDataSource();
            
            // retorna os dados consultados
            return lista;
        }
        catch (SQLException ex){
            System.err.println("Erro ao recuperar dados "+ex.getMessage());
        }
        catch (Exception ex){
            System.err.println("Erro geral "+ex.getMessage());
        }
        
        // fecha o statement e o datasource
        dataSource.closeDataSource();
            
        // caso aconteça alguma coisa
        return null;
    }
    
     // alterar dados
    public void alterar(Produtos usu){
        Connection con = dataSource.getConnection();
        PreparedStatement ps = null;

        try{
            // monta SQL
            String SQL = "UPDATE produtos "
                    + "      SET prod_descricao=?,"
                    + "          prod_quantidade=?,"
                    + "          idFornecedor=?,"
                    + "          prod_preco_custo=?,"
                    + "          prod_preco_venda=? "
                    + "    WHERE idProduto=?";

            // para mandar como uma instrução, precisa usar o PreparedStatement
            // traduz o comando SQL para execução
            ps = con.prepareStatement(SQL);
            ps.setString(1,usu.getDescricao());
            ps.setInt(2,usu.getQuantidade());
            ps.setInt(3,usu.getIdFornecedor());
            ps.setFloat(4,usu.getPreco_custo());
            ps.setFloat(5,usu.getPreco_venda());
            ps.setInt(6,usu.getIdProduto());

            // executa a inserção no banco
            ps.executeUpdate();
            ps.close();
            
            JOptionPane.showMessageDialog(null,"Alterado com sucesso!");
        }
        catch (SQLException ex){
            //System.err.println("Erro ao salvar os dados "+ex.getMessage());
            JOptionPane.showMessageDialog(null,"Erro ao alterar!\n"+ex);
        }
        finally{
            // fecha o statement e o datasource
            dataSource.closeDataSource();
        }
    }
    
    // excluir registro
    public void excluir(int codigo){
        Connection con = dataSource.getConnection();
        PreparedStatement ps = null;

        try{
            String SQL = "DELETE "
                    + "     FROM produtos "
                    + "    WHERE (idProduto = ?)";
            
            // para mandar como uma instrução, precisa usar o PreparedStatement
            // traduz o comando SQL para execução
            ps = con.prepareStatement(SQL);
            ps.setInt(1,codigo);

            // executa a inserção no banco
            ps.executeUpdate();
            ps.close();
            
            JOptionPane.showMessageDialog(null,"Excluído com sucesso!");
        }
        catch (SQLException ex){
            //System.err.println("Erro ao salvar os dados "+ex.getMessage());
            JOptionPane.showMessageDialog(null,"Erro ao excluir!\n"+ex);
        }
        finally{
            // fecha o statement e o datasource
            dataSource.closeDataSource();
        }
    }
}