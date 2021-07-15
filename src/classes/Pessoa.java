package classes;

public abstract class Pessoa {
    private String nome;
    private String cpf;
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString(){
        return "Nome: " + getNome() + " CPF: " + getCpf();
    }

    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract void cadastrarPessoa();

    public Pessoa(){

    }
}
