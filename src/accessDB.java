import java.sql.*;

public class accessDB {

    static final String  JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/kailua_rental?serverTimezone=UTC";
    static Connection con;

    public static void main(String[] args) throws SQLException {
        try{
            con = null;
            Statement s = null;
            Class.forName(JDBC_DRIVER);

            con = DriverManager.getConnection(DATABASE_URL,"root","minsqlkode");

            s = con.createStatement();

            ResultSet rs = s.executeQuery("SELECT car_id, brand FROM car");

            if(rs != null){
                while(rs.next()){
                    System.out.println(rs.getString("car_id")+rs.getString("brand"));
                }
            }
            s.close();
            con.close();
        }
        catch(SQLException sqlex){
            try{
                System.out.println(sqlex.getMessage());
                con.close();
                System.exit(1);
            }
            catch(SQLException sql){

            }
        }
        catch(ClassNotFoundException noClass){
            System.err.println("Driver Class not found");
            System.out.println(noClass.getMessage());
            System.exit(1);
        }
    }
}