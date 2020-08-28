public class Conexion {
    Connection conexion;
    public Conexion()¨{
        conexion = null ;

    }
    public String conectar() thrwos ClassNotFoundException, SQLException{
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE" , "User" , "pass" );
        if (conexion != null {
            return " Recien Conectado " ;

        }else {
            return "Sin conexion";


        }
    }
}