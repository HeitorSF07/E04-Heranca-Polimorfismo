public class PessoaJuridica extends Cliente{
    private String cnpj;
    private String setor;
    private int quantFuncionarios;
    public PessoaJuridica (String nome, String endereco, String cnpj, String setor, int quantFuncionarios){
        super(nome, endereco);
        this.cnpj = cnpj;
        this.setor = setor;
        this.quantFuncionarios = quantFuncionarios;

    }
    void imprimir(){
        System.out.println("Nome: "+ getNome());
        System.out.println("CNPJ: "+ cnpj);
        System.out.println("Endereço: "+ getEndereco());
        System.out.println("Setor: "+ setor);
        System.out.println("Quantidade de Funcionários: "+ quantFuncionarios);
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public void setSetor(String setor){
        this.setor = setor;
    }

    public void setQuantFuncionarios(int quantFuncionarios){
        this.quantFuncionarios = quantFuncionarios;
    }

    //getters
    public String getCnpj(){
        return cnpj;
    }

    public String getSetor(){
        return setor;
    }

    public int getQuantFuncionarios(){
        return quantFuncionarios;
    }
}


