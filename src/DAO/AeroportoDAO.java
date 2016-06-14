package DAO;

import java.sql.*;
import java.util.ArrayList;

import controleAereoFinal.Aeroporto;
import controleAereoFinal.Cliente;

public class AeroportoDAO {
    private Connection con;
    private Statement stm;
    Conexao bancoDeDados = Conexao.getInstance();
    
    public AeroportoDAO() {
        con = bancoDeDados.iniciaBanco();
    }
	
    public void inserirNoBanco(Aeroporto aero) {
        try {

        	PreparedStatement pst = con.prepareStatement("INSERT INTO aeroporto "
                    + "VALUES (?,?,?,?,?)");
            
            pst.setString(1, aero.getIdentificacao());
            pst.setString(2, aero.getNome());
            pst.setString(3, aero.getMunicipio());
            pst.setString(4, aero.getEstado());
            pst.setString(5, aero.getPais());

        } catch (SQLException ex) {
            System.out.println("Erro : " + ex);
        }
    }
    
    public void excluirDoBanco(Aeroporto aero) {
        try {
            
            PreparedStatement pst = con.prepareStatement("DELETE FROM aeroporto WHERE idaeroporto = ?");
            pst.setString(1, aero.getIdentificacao()); 
            pst.execute();  
      
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        }
    }
    
    public void alterarNoBanco(Aeroporto aero) {
        try {
            PreparedStatement pst = con.prepareStatement("UPDATE aeroporto SET nome = ?,"
                    + "municipio = ?,estado = ?,estado = ?,pais = ?," + " WHERE idaerporto = ?");

            pst.setString(1, aero.getIdentificacao());
            pst.setString(2, aero.getNome());
            pst.setString(3, aero.getMunicipio());
            pst.setString(4, aero.getEstado());
            pst.setString(5, aero.getPais());
            pst.executeUpdate();
            pst.close();
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        }
    }
    
    
    public Aeroporto consultar(long cod) {
        Aeroporto aero;
        ResultSet rs;
        
        try {
            PreparedStatement pst = con.prepareStatement("SELECT identificacao, nome, municipio, estado, pais "
                    + "FROM aeroporto"
                    + " WHERE identificacao = ? ");
            
            pst.setInt(1, (int) cod);
            rs= pst.executeQuery(); 
            
            if (rs.next()) {
                aero = new Aeroporto(rs.getString("identificacao"), rs.getString("nome"),rs.getString("municipio"),
                        rs.getString("estado"), rs.getString("pais"));

                
                return aero; 
            } else {
                return null; 
            }

        } catch (SQLException ex) {
            System.out.println("Erro: " + ex); 
            return null;
        }
    }

    public ArrayList relatorio() {
        ArrayList<Aeroporto> aeroporto;
        ResultSet rs;
       
        try {
            aeroporto = new ArrayList<>();

            PreparedStatement pst = con.prepareStatement("SELECT * FROM aeroporto");
            rs = pst.executeQuery();
       
            while (rs.next()) {
                
                aeroporto.add(new Aeroporto(rs.getString("identificacao"), rs.getString("nome"),rs.getString("municipio"),
                        rs.getString("estado"), rs.getString("pais")));
            }

            return aeroporto; 

        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
            return null;
        }
    }
    
}
