
package conectividade2;
import java.sql.*;




public class Conectividade2 {

    
    public static void main(String[] args) {
        
        String servidor = "jdbc:sqlserver://localhost:1433;databaseName=teste2";
        String usuario = "sa";
        String senha = " ";
        
        Connection conexao;
        Statement instrucaoSQL;
        ResultSet resultados;
        
        try{
            
            conexao=DriverManager.getConnection(servidor,usuario,senha);
        }catch(SQLException erro){
            System.out.println(erro.getMessage());
        }
    }
    
}
