package atm.stimulator;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            c=DriverManager.getConnection("jdbc:mysql:///atmstimulator","root","kriti@6188");
            s=c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
