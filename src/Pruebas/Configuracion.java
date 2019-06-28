package Pruebas;

public class Configuracion {

    private String UserDDBB;
    private String PassDDBB;
    private String LocalServer;
    private String RemoteServer;
    private String RemoteServer2;
    private String DDBB;
    private String Puerto;

    public Configuracion() {
        UserDDBB = "cristhian";
        PassDDBB = "cristhian";
        LocalServer = "192.168.1.20";
        RemoteServer = "89.129.146.6";
        RemoteServer2 = "192.168.1.21";
        DDBB = "Gea";
        Puerto = "3306";
    }

    public String DameDatos() {
        this.UserDDBB = UserDDBB;
        this.PassDDBB = PassDDBB;
        this.LocalServer = LocalServer;
        this.RemoteServer = RemoteServer;
        this.RemoteServer2 = RemoteServer2;
        this.DDBB = DDBB;
        this.Puerto = Puerto;
        return "UserDDBB= " + UserDDBB + "\n"
                + "PassDDBB= " + PassDDBB + "\n"
                + "LocalServer= " + LocalServer + "\n"
                + "RemoteServer= " + RemoteServer + "\n"
                + "RemoteServer2= " + RemoteServer2 + "\n"
                + "DDBB= " + DDBB + "\n"
                + "Puerto= " + Puerto + "\n";
    }
    
    public String DimeUserDDBB(){
        this.UserDDBB = UserDDBB;
        
        return UserDDBB;
    }
}
