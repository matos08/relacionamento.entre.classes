public class Contato {

    //ATRIBUTOS
    private String nome;
    private Endereco endereco;
    private Telefone[] telefone;

    //GETTERS
    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }


    public Telefone[] getTelefone() {
        return telefone;
    }

    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(Telefone[] telefone) {
        this.telefone = telefone;
    }
}