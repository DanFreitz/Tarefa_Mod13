package Interfaces;

public abstract class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String nomeFantasia;

    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String nomeFantasia) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Nome Fantasia: " + nomeFantasia);
    }
}