package Factory;

import java.sql.Connection;
import java.sql.DriverManager;


public final class MySQLConexionFactory extends ConexionDB{

    public MySQLConexionFactory(String[]criterios ){
        this.parametros = criterios; // Pasar los criterios al array de la clase padre, parametros
        this.open();//Llamar el metodo open()
    }
//Implementar el metodo open
    @Override
    public Connection open() {
        try{
             Class.forName("com.mysql.jdbc.Driver");
            //En this.parametros[] iran los datos respectivos de nombre de la base de bd, usuario y clave
            this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + this.parametros[0], this.parametros[1], this.parametros[2]); 
            System.out.println("Coneccion satisfactoria");
         }catch(Exception ex){
             System.out.println("Error en la conecion");
            ex.printStackTrace();
       }
            return this.conexion;
       }
    }
    

