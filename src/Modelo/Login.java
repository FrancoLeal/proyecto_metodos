package Modelo;
public class Login{  
    private String usuario;
    private String password;
    public Login(String usuario, String password){
        this.usuario = usuario;
        this.password = password;
    }
    public boolean existeUsuario(String username){
        if (username.equals(this.usuario)){
           return true;
        }
        else{
            return false;
        }
    }
    public int verificarDatos(String username, String password){
        if (username.equals(this.usuario)){ 
                if (password.equals(this.password)){
                    return 0;
                }
                else{
                    return 1;
                }
        }
        else{
           return 2; 
        }
    } 
    public String getUsuario(){
        return this.usuario;
    }
    public String getPassword(){
        return this.password;
    }
    public void setUsuario(String usuario){
        this.usuario=usuario;
    }
    public void setPassword(String password){
        this.password=password;
    }
}