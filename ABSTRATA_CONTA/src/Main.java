class ContaPoupanca {
    private double saldo;

    public ContaPoupanca(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void saque(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque não permitido. Saldo insuficiente.");
        }
    }

    public void deposito(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
    }

    public void consulta() {
        System.out.println("Saldo da Conta Poupança: R$ " + saldo);
    }
}

// classe contaCorrente
class ContaCorrente {
    private double saldo;
    private double limite;

    public ContaCorrente(double saldoInicial, double limite) {
        this.saldo = saldoInicial;
        this.limite = limite;
    }

    public void saque(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque não permitido. Saldo insuficiente.");
        }
    }

    public void deposito(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
    }

    public void consulta() {
        System.out.println("Saldo da Conta Corrente: R$ " + saldo);
    }
}

// classe principal que vai estar executando o codigo
public class Main {
    public static void main(String[] args) {
        // Criando uma conta poupança e uma conta corrente
        ContaPoupanca contaPoupanca = new ContaPoupanca(2000);
        ContaCorrente contaCorrente = new ContaCorrente(1000, 500);

        // Vai estar fazendo as trasaçoes da conta e os calculos
        contaPoupanca.consulta();
        contaPoupanca.deposito(100);
        contaPoupanca.saque(2600); // Deve falhar
        contaPoupanca.saque(1000); // Deve ser bem-sucedido
        contaPoupanca.consulta();

        // Vai estar fazendo as trasaçoes da conta e os calculos
        contaCorrente.consulta();
        contaCorrente.deposito(100);
        contaCorrente.saque(1200); // Deve ser bem-sucedido por causa do limite
        contaCorrente.consulta();
    }
}
