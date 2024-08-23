package Interfaces;

public abstract class PessoaFisica extends Pessoa {
    private String cpf;
    private String rg;

    public PessoaFisica(String nome, String endereco, String telefone, String cpf, String rg) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
    }
}