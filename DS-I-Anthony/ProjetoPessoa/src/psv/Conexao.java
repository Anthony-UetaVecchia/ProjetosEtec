//pacote Java
package psv;

//importação do sql Java para conexão com o banco de dados
import java.sql.*;

//classe que irá estabelecer a conexão com o Banco de dados
public class Conexao {

    //método que conecta com o Banco de Dados
    public static Connection abrirConexao() {
        Connection con = null;

        //Parte onde ele vai ligar ao banco de dados e tentar fazer a conexão
        try {
            //Registro do Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            //Ja que utilizamos o wamp, esse é o caminho do Banco de Dados
            String url = "";
            url += "jdbc:mysql://127.0.0.1/projetopessoa?";
            url += "user=root&password=";

            con = DriverManager.getConnection(url);//variável com o código que realiza a conexão, utilizando o caminho passado
            System.out.println("Conexão Aberta");

            //Mensagens de "erro"
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Retorna a variável que faz a conexão
        return con;
    }

    //método que fecha a conexão com o Banco de Dados
    public static void fecharConexao(Connection con) {

        /*Vai encerrar a conecão com o Banco de Dados*/
        try {
            con.close();//código que fecha a conexão
            System.out.println("Conexão Fechada");

            //Mensagens de "erro"
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
