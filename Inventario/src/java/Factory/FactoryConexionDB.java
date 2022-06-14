package Factory;


public class FactoryConexionDB {
    //Podemos definir la configuracion para diferentes BD
    public static final int MySQL = 1; //Para conectar a MySQL
    public static String[] configMySQL = {"bd-inventario", "root",""};
    
    public static ConexionDB open(int tipoBD){
        switch(tipoBD){
            case FactoryConexionDB.MySQL:
            return new MySQLConexionFactory(configMySQL);
            default:
               return null;
        }
    }
    public static void main(String[] args){
     FactoryConexionDB objeto = new FactoryConexionDB();
     open(1);
    } 
}
