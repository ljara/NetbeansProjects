
package jufroweb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Content {

  private String content="";
  private int idc =-1;
  private int id = 0;
  private String type="";
  private String error="";
  
  public void Content () {
      //this.load(id);
   
}
  
  public String getContent() {
      return this.content;
  }
  
  public boolean load(int id)  {
      boolean ret = false;
      try {
          JufroCMSConnection c = new JufroCMSConnection();
          Statement s = c.createStatement();
          s.execute("Select idc,content,type from Content where idc="+id);
          ResultSet r = s.getResultSet();
          if (r!=null){
          if (r.next()){
              this.idc=id;
              this.content=r.getString("content");
              this.type=r.getString("type");
              ret = true;
          }
          else {
              this.tonull(-1);
          }}
          else this.tonull(-1);
          
      }
      catch (SQLException e){
          this.tonull(-2);
          this.error = e.getMessage();
      }
      catch (ClassNotFoundException e){
          this.tonull(-3);
      }
      return ret;
  }
  
  /*public boolean loadUser(int id)  {
      boolean ret = false;
      try {
          JufroCMSConnection c = new JufroCMSConnection();
          Statement s = c.createStatement();
          s.execute("Select USERNAME,PASS,EMAIL from USUARIO where id="+id);
          ResultSet r = s.getResultSet();
          if (r!=null){
          if (r.next()){
              this.id=id+1;
              this.content=r.getString("USERNAME");
              this.type=r.getString("EMAIL");
              ret = true;
          }
          else {
              this.tonull(-1);
          }}
          else this.tonull(-1);
          
      }
      catch (SQLException e){
          this.tonull(-2);
          this.error = e.getMessage();
      }
      catch (ClassNotFoundException e){
          this.tonull(-3);
      }
      return ret;
  }
   * 
   */
  public String allToHtml()  {
      String ret = "<table border='1'>";
      String con;
      try {
          JufroCMSConnection c = new JufroCMSConnection();
          Statement s = c.createStatement();
          s.execute("Select idc,content,type from Content");
          ResultSet r = s.getResultSet();
          if (r!=null){
          while (r.next()){
              ret+="\n<tr>\n<td>"+r.getInt("idc")+"</td>";
              con = r.getString("content");
              //if (con.length()>15) con = con.substring(1,14)+"...";
              ret+="\n<td>"+con+"...</td>";
              ret+="\n<td>"+r.getString("type")+"...</td></tr>";          }
        }
          ret+="</table>";
      }
      catch (SQLException e){
          this.tonull(-2);
          this.error = e.getMessage();
      }
      catch (ClassNotFoundException e){
          this.tonull(-3);
      }
      return ret;
  }
  //Para mostrar datos de los usuarios en BD
  /*
   * Muestra los usuarios de la BD, 
   * EN TU CASO ZIZI 'USERNAME' ES 'USER'
   */
   public String allUserToHtml()  {
      String ret = "<table border='1'>";
      String con;
      try {
          JufroCMSConnection c = new JufroCMSConnection();
          Statement s = c.createStatement();
          s.execute("Select USERNAME,PASS,EMAIL from USUARIO");
          ResultSet r = s.getResultSet();
          if (r!=null){
          while (r.next()){
              ret+="\n<tr>\n<td>"+r.getString( "USERNAME" )+"</td>";
              con = r.getString( "PASS" );
              ret+="\n<td>"+con+"...</td>";
              ret+="\n<td>"+r.getString( "EMAIL" )+"...</td></tr>";          }
        }
          ret+="</table>";
      }
      catch (SQLException e){
          this.tonull(-2);
          this.error = e.getMessage();
      }
      catch (ClassNotFoundException e){
          this.tonull(-3);
      }
      return ret;
  }
  
  
      public void tonull(int id){
          if (id>=0) id=id*-1;
          this.idc = id;
          this.content="";
          this.type="";  
      }
      
      public int currentId(){
          return this.idc;
      }
      
      public String error() {
          return this.error;
      }
}
