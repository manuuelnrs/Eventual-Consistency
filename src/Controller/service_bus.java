package Controller;

import Model.cluster;
import javax.swing.table.DefaultTableModel;

public class service_bus {
    
    public static DefaultTableModel adjustModel(int database, String user, int row, int col){
        DefaultTableModel dtmData = new DefaultTableModel();
        DefaultTableModel dtmData2 = new DefaultTableModel();
        DefaultTableModel dtmData3 = new DefaultTableModel();
        
        switch (database) {
            case 1:
                String [][] temp = cluster.databaseEEUU;
                if( user.length() != 0 )
                    temp[row][col] = user;
                
                dtmData.setDataVector(temp, cluster.FamilyColumns);
                return dtmData;
            case 2:
                String [][] temp2 = cluster.databaseMX;
                if( user.length() != 0 )
                    temp2[row][col] = user;
                
                dtmData2.setDataVector(temp2, cluster.FamilyColumns);
                return dtmData2;
            case 3:
                String [][] temp3 = cluster.databaseESP;
                if( user.length() != 0 )
                    temp3[row][col] = user;
                
                dtmData3.setDataVector(temp3, cluster.FamilyColumns);
                return dtmData3;
            default:
                DefaultTableModel dtmEmpty = new DefaultTableModel();
                return dtmEmpty;
        }
    }
    
}