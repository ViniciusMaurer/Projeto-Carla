package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Caderno;

public class daoCaderno {
    
    // variavel de datasource para a conexão
    private DataSource dataSource;
    
    // método construtor para passar o dataSource
    public daoCaderno(DataSource dataSource){
        this.dataSource = dataSource;
    }

    // para popular os dados no arraylist de acordo com a quantidade de 
    // registros na tabela de fornecedores

    public ArrayList<Caderno> readAll(){

        //Connection con = dataSource.getConnection();
        PreparedStatement ps = null;

        try{
            String SQL = "SELECT * "
                    + "     FROM caderno";
            
            // para mandar como uma instrução, precisa usar o PreparedStatement
            // traduz o comando SQL para execução
            ps = dataSource.getConnection().prepareStatement(SQL);

            // executa a consulta no banco
            ResultSet rs = ps.executeQuery();
            
            // cria a lista de resultados trazidos da tabela
            ArrayList<Caderno> lista = new ArrayList<Caderno>();
            
            // enquanto tiverem registros no ResultSet (rs), 
            // vai adicionando na lista
            while(rs.next()){
                // cria objeto de municipio
                // cada cidade é um objeto
                Caderno user = new Caderno();

                user.setIdCaderno(rs.getInt("idCaderno"));
                user.setIdAluno(rs.getInt("idAluno"));
                user.setData(rs.getDate("cad_data"));
                user.setValor(rs.getFloat("cad_valor"));
                user.setDescricao(rs.getString("cad_descricao"));
                user.setQuantidade(rs.getInt("cad_quantidade"));
                user.setIdProduto(rs.getInt("idProduto"));
                
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

    public void createNS(Caderno usu) {
        throw new UnsupportedOperationException("Ainda não suportado."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    // insere dados
    public void create(Caderno usu){
        Connection con = dataSource.getConnection();
        PreparedStatement ps = null;

        try{
            String SQL = "INSERT INTO caderno "
                    + "              (idAluno, "
                    + "               cad_data, "
                    + "               cad_valor, "
                    + "               cad_descricao, "
                    + "               cad_quantidade, "
                    + "               idProduto) "
                    + "       VALUES (?, ?, ?, ?, ?, ?)";

            // para mandar como uma instrução, precisa usar o PreparedStatement
            // traduz o comando SQL para execução
            ps = con.prepareStatement(SQL);
            ps.setInt(1,usu.getIdAluno());
            ps.setDate(2, new Date(usu.getData().getTime()));
            ps.setFloat(3,usu.getValor());
            ps.setString(4,usu.getDescricao());
            ps.setInt(5,usu.getQuantidade());
            ps.setInt(6,usu.getIdProduto());
            
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
    public ArrayList<Caderno> readOne(String descricao){

        //Connection con = dataSource.getConnection();
        PreparedStatement ps = null;

        try{
            String SQL = "SELECT * "
                    + "     FROM caderno "
                    + "    WHERE (cad_descricao LIKE ?)";

            // para mandar como uma instrução, precisa usar o PreparedStatement
            // traduz o comando SQL para execução
            ps = dataSource.getConnection().prepareStatement(SQL);
            ps.setString(1,"%"+descricao+"%");
            
            // executa a consulta no banco
            ResultSet rs = ps.executeQuery();
            
            // cria a lista de resultados trazidos da tabela
            ArrayList<Caderno> lista = new ArrayList<Caderno>();
            
            while(rs.next()){
                // instancia um objeto
                Caderno usu = new Caderno();
                
                // joga dados da lista para o objeto
                usu.setIdCaderno(rs.getInt("idCaderno"));
                usu.setIdAluno(rs.getInt("idAluno"));
                usu.setData(rs.getDate("cad_data"));
                usu.setValor(rs.getFloat("cad_valor"));
                usu.setDescricao(rs.getString("cad_descricao"));
                usu.setQuantidade(rs.getInt("cad_quantidade"));
                usu.setIdProduto(rs.getInt("idProduto"));
                
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
    // excluir registro
    public void excluir(int codigo){
        Connection con = dataSource.getConnection();
        PreparedStatement ps = null;

        try{
            String SQL = "DELETE "
                    + "     FROM CADERNO "
                    + "    WHERE (idCaderno = ?)";
            
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
    
    // alterar dados
    public void alterar(Caderno usu){
        Connection con = dataSource.getConnection();
        PreparedStatement ps = null;

        try{
            // monta SQL
            String SQL = "UPDATE caderno "
                    + "      SET idAluno = ?,"
                    + "          cad_valor = ?,"
                    + "          cad_descricao = ?,"
                    + "          cad_quantidade = ?,"
                    + "          idProduto = ?"
                    + "    WHERE idCaderno=?";

            // para mandar como uma instrução, precisa usar o PreparedStatement
            // traduz o comando SQL para execução
            ps = con.prepareStatement(SQL);
            ps.setInt(1,usu.getIdAluno());
            ps.setFloat(2,usu.getValor());
            ps.setString(3,usu.getDescricao());
            ps.setInt(4,usu.getQuantidade());
            ps.setInt(5,usu.getIdProduto());
            ps.setInt(6,usu.getIdCaderno());
            
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
}