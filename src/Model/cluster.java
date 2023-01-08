package Model;

public class cluster {
    
    /* DESIGN DATA -- STYLE -- APACHE CASSANDRA (MANUAL) */
    public static String[] FamilyColumns = {"Location", "Node", "Username", "Email", "Slug", "Telephone"};
    
    // Location EEUU
    public static String[][] databaseEEUU = {
        {"EEUU", "1", "Usuario 1" , "u1@dom.eu" , "/user1",  "00001"},
        {"EEUU", "2", "Usuario 10", "u10@dom.eu", "/user10", "00010"},
        {"EEUU", "2", "Usuario 11", "u11@dom.eu", "/user11", "00011"}
    };
    
    // Location MX
    public static String[][] databaseMX = {
        {"México", "1", "Usuario 1", "u1@dom.eu", "/user1",   "00001"},
        {"México", "1", "Usuario 2", "a2@dom.mx", "/user2mx", "10002"},
        {"México", "2", "Usuario 3", "a3@dom.mx", "/user3mx", "10003"}
    };
    
    // Location ESP
    public static String[][] databaseESP = {
        {"España", "1", "Usuario 2",  "a2@dom.mx",  "/user2mx", "10002"},
        {"España", "1", "Usuario 10", "u10@dom.eu", "/user10",  "00010"},
        {"España", "1", "Usuario 3",  "a3@dom.mx",  "/user3mx", "10003"}
    };
    
}