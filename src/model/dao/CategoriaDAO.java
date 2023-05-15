/*
package model.dao;

import Connection.ConnectionFactory;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.Categoria;


public class CategoriaDAO {
    
    private Connection con = null;

    public CategoriaDAO() {
        con = ConnectionFactory.getConnection();
    }
    
    public boolean save(Categoria categoria){
        
        String sql = "INSERT INTO categoria(descricao) VALUES(?)";
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, categoria.getDescricao());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
    }
    
    public List<Categoria> findAll(){ 
        
        String sql = "select * from categoria";
        
        PreparedStatement stmt = null;
        //ResultS rs = null;
        
        List<Categoria> categorias = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(sql);
        //    rs = stmt.executeQuery();
            
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            
        }
}
        */