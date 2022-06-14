package Factory;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public abstract class ConexionDB {
      protected String[] parametros; //Array que recibe los parametros de la conexion
      protected Connection conexion;
        //El siguiente metodo abstracto no se implementa solamente se declara, se
        //Implementara en la subclase
      abstract Connection open();//metodo abstracto que devuelve un objeto connection
   

         //Crear metodo para las consultas
public ResultSet consultaSQL(String consulta){
        Statement st; //Objeto statement en el encargado de ejecutar las consultas
        ResultSet rs = null; // Tabla temporal donde se almacena los datos
        try{
            st = conexion.createStatement();
            rs = st.executeQuery(consulta);// Se ejecuta la consulta
        }catch(SQLException ex){
             ex.printStackTrace();
        }
         return rs;
}
        //Crear metodo para ejecutar
public boolean ejecutarSQL(String consulta){
            Statement st; //Objeto Statement en el encargado de ejecutar las consultas
            boolean guardar = true;
            try{
                st = conexion.createStatement();
                st.executeUpdate(consulta); //Se ejecuta la consulta
            }catch(SQLException ex){
                 guardar = false;
                 ex.printStackTrace();
            }
            return guardar;
}
public boolean cerrarConexion(){
             boolean ok = true;
             try{
                  conexion.close();
             }catch(Exception ex){
                  ok = false;
                  ex.printStackTrace();
             }
             return ok;
}  
}
