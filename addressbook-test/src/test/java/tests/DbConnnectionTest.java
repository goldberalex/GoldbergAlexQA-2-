package tests;

import model.GroupData;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbConnnectionTest {
    @Test
            public void testDbConnnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/addressbook?user=root&password=&serverTimezone=UTC");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select group_id, group_name, group_header, group_footer from group_list");
            List<GroupData> groups = new ArrayList<>();
            while (rs.next()){
                groups.add(new GroupData()
                        .wihtId(rs.getInt("group_id"))
                        .wihtName(rs.getString("group_name")));
            }
            rs.close();
            st.close();
            conn.close();
            System.out.println(groups);

            // Do something with the Connection
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

}
