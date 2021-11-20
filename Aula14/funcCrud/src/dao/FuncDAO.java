/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Funcionario;
import view.FuncUpdate;

/**
 *
 * @author Yago
 */
public class FuncDAO {
    private Connection con;

    public FuncDAO(Connection con) {
        this.con = con;
    }
    
    public void inserir(Funcionario func) throws SQLException{
        String sql = "INSERT INTO funcionarios(usuario, nome, funcional) VALUES (?, ?, ?)";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setString(1, func.getUsuario());
        statement.setString(2, func.getNome());
        statement.setString(3, func.getFuncional());
        statement.execute();
        con.close();
    }
    
    public ResultSet consultar(Funcionario func) throws SQLException{
       String sql = "SELECT * FROM funcionarios WHERE usuario = ? AND funcional = ?";
       PreparedStatement statement = con.prepareStatement(sql);
       statement.setString(1, func.getUsuario());
       statement.setString(2, func.getFuncional());
       statement.execute();
       ResultSet resultado = statement.getResultSet();
       con.close();
       return resultado;
    }
    
    public void excluir(String usuario, String funcional)throws SQLException{
        String sql = "DELETE FROM funcionarios WHERE usuario = ? AND funcional = ?";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setString(1, usuario);
        statement.setString(2, funcional);
        statement.execute();
        con.close();
    }
    
    public void update(FuncUpdate funcUpdate, int opcao, String valor, String usuario, String funcional) throws SQLException{
        String sql="";
        switch(opcao){
            case 0:
                sql = "UPDATE funcionarios SET usuario = ? WHERE usuario = ? AND funcional = ?";
                funcUpdate.setLoginUsuario(valor);
                break;
            case 1:
                sql = "UPDATE funcionarios SET nome = ? WHERE usuario = ? AND funcional = ?";
                break;
            case 2:
                sql = "UPDATE funcionarios SET funcional = ? WHERE usuario = ? AND funcional = ?";
                funcUpdate.setLoginFunc(valor);
                break;
        }

        PreparedStatement statement = con.prepareStatement(sql);
        statement.setString(1, valor);
        statement.setString(2, usuario);
        statement.setString(3, funcional);
        statement.execute();
        con.close();
    }
    

    
}
