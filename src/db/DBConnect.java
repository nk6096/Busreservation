package db;
import java.sql.*;
public class DBConnect {
    static public Connection con;
    static public Statement st;
    static public PreparedStatement checkLogin;
    static public PreparedStatement addUser,user;
    static public PreparedStatement getUserLike,getUserLike1;
    static public PreparedStatement deleteUser;
    static public PreparedStatement UpdateUser;

    static{
        try{
//Class.forName("com.mysql.jdbc.Driver");
//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/regdb12","root","incapp");
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","busr","busr"); 
st=con.createStatement();
checkLogin=con.prepareStatement(
        "select * from Admin_Login where aid=? and pass=?");
addUser=con.prepareStatement(
 "insert into passanger (source,destination,doj,bus_timing,total_dist,total_time,total_cost,bus_id,seat_no,name,mobile) "
         + "values(?,?,?,?,?,?,?,?,?,?,?)");
  getUserLike=con.prepareStatement(
          "select * from passanger");
  user=con.prepareStatement(
 "insert into busmng (bus_id,bus_name,source,destination,timing) "
         + "values(?,?,?,?,?)");
  getUserLike1=con.prepareStatement(
          "select * from busmng");
  deleteUser=con.prepareStatement(
          "delete from busmng where cid=?");
  UpdateUser=con.prepareStatement("update busmng set bus_id=?,bus_name=?,source=?,destination=?,timing=? where cid=?");
        }catch(Exception ex){
            ex.printStackTrace();  
        }
    }
}
