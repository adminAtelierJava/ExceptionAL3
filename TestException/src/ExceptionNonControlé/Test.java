package ExceptionNonControlé;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("nom");
        }catch (IOException e)
        {
            System.out.println(e);
        }

        try {
            test2();
        }catch (IOException e)
        {
            System.out.println(e);
        }
        catch (SQLException e)
        {}
    }


    public static void test() throws IOException, SQLException
    {
        FileWriter fw1 = new FileWriter("nom");
        Connection con= DriverManager.getConnection("");
    }

    public static void test2() throws IOException,SQLException
    {
        test();
    }
}
