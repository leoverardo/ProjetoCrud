package br.ulbra.entilty;

public class Usuario {

    private int idUsu;
    private String nomeUsu;
    private String emailUsu;
    private String senhaUsu;
    private String foneUsu;
    private String sexoUsu;

    public Usuario() {
    }

    public Usuario(int idUsu, String nomeUsu, String emailUsu,
            String senhaUsu, String foneUsu, String sexoUsu) {
        this.idUsu = idUsu;
        this.nomeUsu = nomeUsu;
        this.emailUsu = emailUsu;
        this.senhaUsu = senhaUsu;
        this.foneUsu = foneUsu;
        this.sexoUsu = sexoUsu;
    }
    public String toString(){
        return "ID: "+this.idUsu+" Nome: "+this.nomeUsu+" E-mail: "+this.emailUsu+" Senha: "+this.senhaUsu+" Fone: "+this.foneUsu+" Sexo: "+this.sexoUsu;
    }

    public int getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }

    public String getNomeUsu() {
        return nomeUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }

    public String getEmailUsu() {
        return emailUsu;
    }

    public void setEmailUsu(String emailUsu) {
        this.emailUsu = emailUsu;
    }

    public String getSenhaUsu() {
        return senhaUsu;
    }

    public void setSenhaUsu(String senhaUsu) {
        this.senhaUsu = senhaUsu;
    }

    public String getFoneUsu() {
        return foneUsu;
    }

    public void setFoneUsu(String foneUsu) {
        this.foneUsu = foneUsu;
    }

    public String getSexoUsu() {
        return sexoUsu;
    }

    public void setSexoUsu(String sexoUsu) {
        this.sexoUsu = sexoUsu;
    }
    
}
