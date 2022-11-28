package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author laisp
 */
public class ConexaoBanco {
    //Atributos estÃ¡ticos com os dados do Banco de Dados
    private static final String URL = "jdbc:mysql://localhost:3306/gerclinica";
    private static final String USUARIO = "root";
    private static final String SENHA = "laisp2440";

    //Método que efetua a conexÃ£o com o MySQL
    public static Connection getConexao() throws SQLException {
        Connection c = null;
        try {
            c = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException se) {
            throw new SQLException("Erro ao conectar! " + se.getMessage());
        }//fecha catch
        return c;
    }//fecha metodo
}
