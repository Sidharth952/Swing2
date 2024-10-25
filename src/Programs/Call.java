/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programs;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import short_cut.*;

public class Call {

    public static void main(String[] args) throws SQLException{
        Connect C=new Connect();
        Connection con=C.getConnection();
        CallableStatement st= con.prepareCall("{call details(?)}");
        st.setString(1,"Aromal");
        st.execute();
        System.out.println("Success");
    }
}
