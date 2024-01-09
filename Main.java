public class Main {

    public static void main(String[] args) {

        Contato contato = new Contato();

        contato.setNome("Miles Morales");
        //contato.setEndereco("Brooklyn, New York");
        //contato.setTelefone("3749999999");

        //criar objeto endereço - relacionamento tem um endereço
        Endereco end = new Endereco();
        end.setCidade("Brooklyn");
        end.setCep("4002-8922");
        end.setEstado("New York");
        end.setComplemento("n/a");
        end.setNumero("321");
        end.setNomeRua("pesquisa no google");

        //SET PARA VARIÁVEL END
        contato.setEndereco(end);

        //criar objeto endereço - relacionamento tem um endereço
        Telefone tel = new Telefone();
        tel.setDdd("347");
        tel.setNumero("9999999");
        tel.setTipo("fixo");

        //criar objeto telefone - relacionamento tem um telefone
        Telefone tel2 = new Telefone();
        tel2.setDdd("347");
        tel2.setNumero("8888888");
        tel2.setTipo("celular");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = tel;
        telefones[1] = tel2;

        //contato.setTelefone(tel);
        contato.setTelefone(telefones);

        System.out.println(contato.getNome());
        System.out.println(contato.getEndereco().getCidade());

        //Necessário ultilizar o laço for devido as informaçoes estarem em um Array.
        for (Telefone t : contato.getTelefone()) {
            System.out.println(t.getDdd() + " " + t.getNumero());
        }
    }
}
