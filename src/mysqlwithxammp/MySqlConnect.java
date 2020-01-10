
package mysqlwithxammp;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class MySqlConnect {
    
     Connection conn = null;
    
    public static Connection ConnectDB() {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");                                    
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/infromationRecord","root","");
                                                                                          //DatabaseName
            return connection;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
        
    }
    
    
    public static void main(String[] args) {
        //DicUI zDicUI=new DicUI();
        //zDicUI.show();
    }
}
