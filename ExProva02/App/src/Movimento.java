public class Movimento {
    private String data;
    private Conta conta;
    private String historico;
    private float valor;
    private int operacao;
    private float saldoAnterior;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getOperacao() {
        return operacao;
    }

    public void setOperacao(int operacao) {
        this.operacao = operacao;
    }

    public float getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(float saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public static final int SACAR = 0;
    public static final int DEPOSITAR = 1;

    public Movimento(String data, Conta conta, String historico, float valor, int operacao) {
        this.data = data;
        this.conta = conta;
        this.historico = historico;
        this.valor = valor;
        this.operacao = operacao;
    }
   
    public boolean movimentar() {
        saldoAnterior = conta.getSaldo();   
        try {
            if (operacao == SACAR) {
                conta.sacar(valor);
            } else if (operacao == DEPOSITAR) {
                conta.depositar(valor);
            }
            return true;
        } catch (Restricoes e) {
            System.err.println("Erro ao movimentar: " + e.getMessage());
            return false;
        }
    }
}
// data(String), conta(Conta), historico(String),
// valor(float), operação(int) e saldoAnterior(float).