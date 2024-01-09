public class Endereco {

    //ATRIBUTOS
    private String nomeRua;
    private String numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;

    //GETTERS
    public java.lang.String getNomeRua() {
        return nomeRua;
    }

    public java.lang.String getNumero() {
        return numero;
    }

    public java.lang.String getComplemento() {
        return complemento;
    }

    public java.lang.String getCidade() {
        return cidade;
    }

    public java.lang.String getEstado() {
        return estado;
    }

    //SETTERS
    public void setNomeRua(java.lang.String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }

    public void setComplemento(java.lang.String complemento) {
        this.complemento = complemento;
    }

    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }

    public void setCep(java.lang.String cep) {
        this.cep = cep;
    }

    public java.lang.String getCep() {
        return cep;
    }
}
