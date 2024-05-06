public class Main {
    public static void main(String[] args) {

        PessoaFisica F1 = new PessoaFisica("João", "Av. Antônio Carlos", "112.345.708-22", 35, 'm');
        Conta contaF1 = new Conta(1234, F1, 5000, 2000);


        contaF1.depositar(3000);
        contaF1.depositar(2000);
        contaF1.depositar(2000);
        contaF1.depositar(2000);
        contaF1.depositar(2000);
        contaF1.depositar(2000);
        contaF1.depositar(2000);
        contaF1.depositar(2000);
        contaF1.depositar(2000);
        contaF1.depositar(2000);
        contaF1.depositar(2000);
        contaF1.depositar(2000);
        contaF1.depositar(2000);
        contaF1.depositar(2000);
        contaF1.depositar(2000);
        contaF1.depositar(2000);
        contaF1.depositar(2000);
        contaF1.sacar(500);

        contaF1.imprimirExtrato();

        int media = Operacao.getTotalOperacoes() / Conta.getTotalContas();
        System.out.println("Média de operações por conta aberta: " + media);

    }
}