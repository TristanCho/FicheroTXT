package Variables;


import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.security.Principal;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
//import ficherotxt.Network;
//import java.awt.TextField;
//import java.io.OutputStream;

public class VariablesConfig {
   public String DDBB;
   public String UserDDBB;
   public String PassDDBB;
   public String LocalServer;
   public String RemoteServer;
   public String RemoteServer2;
   public String Puerto;
   public String NuevoPuerto;
   

   Properties Propiedades = new Properties();
 public VariablesConfig(){
     
         //Declara objeto para las Propiedades
        

        //Declara objeto lectura de Archivo
        InputStream Archivo;
       
        try {
            Archivo = new FileInputStream("src/Archivador/ArchivoPropiedades.properties");
            Propiedades.load(Archivo);

        } catch (IOException ex) {
            System.out.println("Revisar la ruta del Archivo de propiedades");
        }
        
         //Despliega cada una de las Propiedades
         DDBB = Propiedades.getProperty("DDBB");
         UserDDBB = Propiedades.getProperty("UserDDBB");
         PassDDBB = Propiedades.getProperty("PassDDBB");
         LocalServer = Propiedades.getProperty("LocalServer");
         RemoteServer = Propiedades.getProperty("RemoteServer");
         RemoteServer2 = Propiedades.getProperty("RemoteServer2");
         Puerto = Propiedades.getProperty("Puerto");
         System.out.println("Puerto Desde VariablesConfig="+Puerto);
         
          /*    
         try {
            //Graba el Archivo con las modificaciones realizadas
            Propiedades.store(new FileWriter("src/Archivador/ArchivoPropiedades.properties"), "Propiedades Actualizadas Correctamente");
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

     */
 }
public String dimeUser(){
     return UserDDBB;
 } 
public void setFormulario(String UserDDBB, String PassDDBB,String DDBB,String Puerto,String LocalServer,String RemoteServer,String RemoteServer2){
     
    this.UserDDBB=UserDDBB;
    this.PassDDBB=PassDDBB;
    this.DDBB=DDBB;
    this.Puerto=Puerto;
    this.LocalServer=LocalServer;
    this.RemoteServer=RemoteServer;
    this.RemoteServer2=RemoteServer2;
    
     try {
         
         //Despliega cada una de las Propiedades
         System.out.println("Usuario antes de Grabar: "+UserDDBB);
        Propiedades.setProperty("UserDDBB",UserDDBB);
        Propiedades.setProperty("PassDDBB",PassDDBB);
        Propiedades.setProperty("DDBB",DDBB);
        Propiedades.getProperty("Puerto",Puerto);
        Propiedades.getProperty("LocalServer",LocalServer);
        Propiedades.getProperty("RemoteServer",RemoteServer);
        Propiedades.getProperty("RemoteServer2",RemoteServer2);
            //Graba el Archivo con las modificaciones realizadas
            Propiedades.store(new FileWriter("src/Archivador/ArchivoPropiedades.properties"), "Propiedades Actualizadas Correctamente");
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    //                  !!!!!!!!!!!    Reflejar los cambios de usuario en Properties desde boton guardar.. 
    
    System.out.println("User desde el formulario: "+UserDDBB);
 } 
 
public String dimePass(){
     return PassDDBB;
 } 
public String dimeDDBB(){
     return DDBB;
 } 
  public String dimePuerto(){
     return Puerto;
 } 
 public String dimeLocalServer(){
     return LocalServer;
 } 
 
 public String dimeRemoteServer(){
     return RemoteServer;
 } 
 
 public String dimeRemoteServer2(){
     return RemoteServer2;
 } 
 
 public void Guardar(String UserDDBB){
     this.UserDDBB=UserDDBB;
            System.out.println("Boton Guardar Presionado= "+UserDDBB);
       }
 
 
//public class Guardar{
      // public Guardar(String UserDDBB){
          //  System.out.println("Boton Guardar Presionado= "+UserDDBB);
      // }
   // }
 
 /*
    public void Lectura(Network nw) {
        //Declara objeto para las Propiedades
        Properties Propiedades = new Properties();

        //Declara objeto lectura de Archivo
        InputStream Archivo;

        try {
            Archivo = new FileInputStream("src/Archivador/ArchivoPropiedades.properties");
            Propiedades.load(Archivo);

        } catch (IOException ex) {
            System.out.println("Revisar la ruta del Archivo de propiedades");
        }

        //Despliega cada una de las Propiedades
         DDBB = Propiedades.getProperty("DDBB");
         UserDDBB = Propiedades.getProperty("UserDDBB");
         PassDDBB = Propiedades.getProperty("PassDDBB");
         LocalServer = Propiedades.getProperty("LocalServer");
         RemoteServer = Propiedades.getProperty("RemoteServer");
         RemoteServer2 = Propiedades.getProperty("RemoteServer2");
         Puerto = Propiedades.getProperty("Puerto");
         System.out.println("PuertoDesdeLEctura="+Puerto);
                
        nw.jtf_UserDDBB.setText(UserDDBB);
        nw.jtf_PassDDBB.setText(PassDDBB);
        nw.jtf_LocalServer.setText(LocalServer);
        nw.jtf_RemoteServer.setText(RemoteServer);
        nw.jtf_RemoteServer2.setText(RemoteServer2);
        nw.jtf_DDBB.setText(DDBB);
        nw.jtf_Puerto.setText(Puerto);
        
    }  //  NO funcionales de momento
    public void Escritura(Network nw) {
        //Declara objeto para las Propiedades
        Properties PropiedadesEscritura = new Properties();

        //Declara objeto lectura de Archivo
        InputStream Archivo;
/*
        try {

            Archivo = new FileInputStream("src/Archivador/ArchivoPropiedades.properties");
            PropiedadesEscritura.load(Archivo);

        } catch (IOException ex) {
            System.out.println("Revisar la ruta del Archivo de propiedades");
        }
*/      
/* 
        UserDDBB=nw.jtf_UserDDBB.getText();
        PassDDBB=nw.jtf_PassDDBB.getText();
        LocalServer=nw.jtf_LocalServer.getText();
        RemoteServer=nw.jtf_RemoteServer.getText();
        RemoteServer2=nw.jtf_RemoteServer2.getText();
        DDBB=nw.jtf_DDBB.getText();
        Puerto=nw.jtf_Puerto.getText();         

        //Reconfiguracion 
        
        PropiedadesEscritura.setProperty( "UserDDBB",UserDDBB.toString());
        PropiedadesEscritura.setProperty( "PassDDBB",PassDDBB.toString());
        PropiedadesEscritura.setProperty( "LocalServer",LocalServer.toString());
        PropiedadesEscritura.setProperty( "RemoteServer",RemoteServer.toString());
        PropiedadesEscritura.setProperty( "RemoteServer2",RemoteServer2.toString());
        PropiedadesEscritura.setProperty( "DDBB",DDBB.toString());
        
         System.out.println("Puerto Desde Escritura="+Puerto);
        
        try {
            //Graba el Archivo con las modificaciones realizadas
            PropiedadesEscritura.store(new FileWriter("src/Archivador/ArchivoPropiedades.properties"), "Propiedades Actualizadas Correctamente");
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//  NO funcionales de momento
*/


}//Fin de la Clase VariablesConfig
