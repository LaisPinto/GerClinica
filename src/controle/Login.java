
package controle;

import modelo.Pessoa;
import persistencia.ConexaoBanco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import visao.Menu_prin;

/**
 *
 * @author laisp
 */
public class Login {
    public boolean login(String login, String senha) throws SQLException {

        Pessoa p = new Pessoa();
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        Boolean flag = null;
        try {
            String sql = "select login,cast(aes_decrypt(senha,'321') as char(50)),Pessoa_TIPO from pessoa "
                    + "where login like '" + login + "';";

            /* Executando o SQL  e armazenando
             o ResultSet em um objeto do tipo
             ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);

            /* Enquanto houver uma proxima linha no
             banco de dados o while roda */
            while (rs.next()) {
                p.setLogin(rs.getString("login"));
                p.setSenha(rs.getString("cast(aes_decrypt(senha,'321') as char(50))"));
                p.settipo(rs.getInt("pessoa_TIPO"));
            }//fecha while
            if (p.getLogin().equals(login)&& p.getSenha().equals(senha)) {
                if(p.gettipo() == 1){
                    Menu_prin t = new Menu_prin();
                   t.setVisible(true);
                   flag = true;
                }
                return flag;
            } else {
                JOptionPane.showMessageDialog(null, "Usuario ou senha incorreto!");
                return flag;
                }
               
            

        } catch (Exception e) {
            throw new SQLException("Erro! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//login
}