public class Conta {
    private int numero;
    private Cliente correntista;
    private float saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Cliente correntista) {
        this.correntista = correntista;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Conta() {
    }

    public Conta(int numero, Cliente correntista, float saldo) {
        this.numero = numero;
        this.correntista = correntista;
        this.saldo = saldo;
    }

    public void depositar(float valor){
        saldo += valor;
    }

    public boolean sacar(float valor) throws Restricoes{
        if(valor > saldo){
            throw new Restricoes("Saldo insuficiente");
        } else{
            saldo -= valor;
            return true;
        }
    }

    public boolean movimentar(float valor, int operacao){
        return true;
    }

}
