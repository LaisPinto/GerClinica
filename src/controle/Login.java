
package controle;

import modelo.Pessoa;
import persistencia.ConexaoBanco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author laisp
 */
/*public class Login {
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
            //ResultSet rs = stat.executeQuery(sql);

            /* Enquanto houver uma proxima linha no
             banco de dados o while roda */
           /* while (rs.next()) {
                p.setLogin(rs.getString("login"));
                p.setSenha(rs.getString("cast(aes_decrypt(senha,'321') as char(50))"));
                p.setTipo(rs.getInt("pessoa_TIPO"));
            }//fecha while

        }
    }
}*/