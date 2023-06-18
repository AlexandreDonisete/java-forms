package model;

public class CadastroCliente {
    private String nomeCompleto;
    private String email;
    private String sexo;
    private String cpf;
    private String telefone;
    private String nascimento;

    public CadastroCliente() {
    }

    public CadastroCliente(String nomeCompleto, String email, String sexo, String cpf, String telefone, String nascimento) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.sexo = sexo;
        this.cpf = cpf;
        this.telefone = telefone;
        this.nascimento = nascimento;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    



    
    
}
