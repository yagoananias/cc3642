/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ConexaoDB;
import dao.FuncDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Funcionario;
import view.FuncForm;
import view.FuncLogin;
import view.FuncUpdate;

/**
 *
 * @author Yago
 */
public class Controller {
    
    private FuncForm funcForm;
    private FuncLogin funcLogin;
    private FuncUpdate funcUpdate;
    
    public FuncLogin getJanelaLogin() {
        return funcLogin;
    }
    
    public Controller(FuncForm funcForm) {        
        this.funcForm = funcForm;
        this.funcForm.setVisible(true);
    }
    
    public void showFuncForm(){
        try{
            funcLogin.dispose();
        }catch(Exception e){}
        try{
            funcUpdate.dispose();
        }catch(Exception e){}

        FuncForm funcForm = new FuncForm();
        funcForm.setVisible(true);
    }
    
    public Controller(FuncLogin funcLogin) {        
        this.funcLogin = funcLogin;
        this.funcLogin.setVisible(true);
    }
    
    public void showLogin() {
        try{
            this.funcForm.dispose();
        }catch(Exception e){}
        try{
            funcUpdate.dispose();
        } catch(Exception e){}
        
        FuncLogin funcLogin = new FuncLogin();
        funcLogin.setVisible(true);
    }
    
    public Controller(FuncUpdate funcUpdate) {        
        this.funcUpdate = funcUpdate;
        this.funcUpdate.setVisible(true);
    }
    
    public void showModificar(String loginUsuario, String loginNome ,String loginFunc) {
        try{
            funcLogin.dispose();
        }catch(Exception e){}
        try{
            funcForm.dispose();
        } catch(Exception e){}
        
        FuncUpdate funcUpdate = new FuncUpdate(loginUsuario, loginNome, loginFunc);
        funcUpdate.setVisible(true);
    }
    
    public void cadastrarFunc(){
        ConexaoDB con = new ConexaoDB();
        Funcionario func = new Funcionario();
        
        func.setUsuario(funcForm.getUsuario().getText());
        func.setNome(funcForm.getNome().getText());
        func.setFuncional(funcForm.getFuncional().getText());
        
        try{
            FuncDAO funcDAO = new FuncDAO(con.getConnecction());
            funcDAO.inserir(func);
            
            funcForm.getUsuario().setText("");
            funcForm.getNome().setText("");
            funcForm.getFuncional().setText("");
            
            JOptionPane.showMessageDialog(funcForm, "Cadastrado", "OK!", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(funcForm, "Erro: \n  "
                    + e, "Tente novamente", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void logarFunc(){
            ConexaoDB con = new ConexaoDB();
            Funcionario funcionario = new Funcionario();
            funcionario.setUsuario(funcLogin.getLoginUsuario().getText());
            funcionario.setFuncional(funcLogin.getLoginFuncional().getText());
            
            try{
                FuncDAO funcDAO = new FuncDAO(con.getConnecction());
                ResultSet resultado = funcDAO.consultar(funcionario);
                
                if(!resultado.isBeforeFirst()){
                    JOptionPane.showMessageDialog(funcLogin, "Digite novamente!", "Erro!", JOptionPane.INFORMATION_MESSAGE);
                }else{
                while(resultado.next()){
                    funcLogin.getLoginUsuario().setText("");
                    funcLogin.getLoginFuncional().setText("");

                    JOptionPane.showMessageDialog(funcLogin, "Login: " +
                            resultado.getString(1)+ ", nome: " +
                            resultado.getString(2)+ ", foi autenticado", "Login ok!", JOptionPane.INFORMATION_MESSAGE);
                    
                    showModificar(funcionario.getUsuario(),resultado.getString(2),funcionario.getFuncional());
                }}
            }    
            catch(SQLException e){
                JOptionPane.showMessageDialog(funcLogin, "Erro: \n  "
                        + e, "Tente novamente", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    
    public void alterarFunc() throws SQLException{
        ConexaoDB con = new ConexaoDB();
        FuncDAO funcDAO = new FuncDAO(con.getConnecction());
        
        try{
            funcDAO.update(this.funcUpdate,funcUpdate.getCampoAlterado().getSelectedIndex(),
                    funcUpdate.getNovoValor().getText(),funcUpdate.getLoginUsuario(), funcUpdate.getLoginFunc());
            
            funcUpdate.getNovoValor().setText("");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(funcUpdate, "Houve uma falha ao realizar sua alteração, erro: \n  "
                    + e, "Alteração imcompleta", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void deletarFunc() throws SQLException{
            ConexaoDB con = new ConexaoDB();
            FuncDAO funcDAO = new FuncDAO(con.getConnecction());
            
            try{
            funcDAO.excluir(funcUpdate.getLoginUsuario(), funcUpdate.getLoginFunc());
            
            JOptionPane.showMessageDialog(funcUpdate, "OK"
                    , "Deletado", JOptionPane.INFORMATION_MESSAGE);
            
            showLogin();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(funcUpdate, "Erro: \n  "
                    + e, "Tente novamente", JOptionPane.INFORMATION_MESSAGE);
        }

    }
        
}
