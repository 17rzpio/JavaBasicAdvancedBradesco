package conectividade3;
import java.sql.*;
import javax.swing.*;
public class Conectividade3 {
    public static void main(String[] args) {
        String servidor = "jdbc:mysql://localhost:3306/cadastrodois?useTimezone=true&serverTimezone=UTC";
        String usuario = "root";
        String senha = "";
        Connection conexao;
        Statement instrucaoSQL;
        ResultSet resultados;
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
            conexao=DriverManager.getConnection(servidor,usuario,senha);
            instrucaoSQL = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultados=instrucaoSQL.executeQuery("SELECT * FROM cursos");
            while(resultados.next()){
                int idcurso = resultados.getInt("idcurso");
                String nome = resultados.getString("nome");
                String descricao = resultados.getString("descricao");
                int carga = resultados.getInt("carga");
                int totaulas = resultados.getInt("totaulas");
                int ano = resultados.getInt("ano");
                System.out.println("id: "+idcurso);
                System.out.println("nome: "+nome);
                System.out.println("des: "+descricao);
                System.out.println("qnt: "+carga);
                System.out.println("total: "+ totaulas);
                System.out.println("ano: "+ano);
                System.out.println("=============");
            }
        }catch(SQLException erro){
            System.out.println(erro.getMessage());
        }catch (Exception e){
        	System.out.println("nao foi possivel conectar ao banco");
        }
    }
}
    

