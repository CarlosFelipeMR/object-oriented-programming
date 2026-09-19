public class ContaCorrente {

    private String cliente;
    private int numero;
    private int senha;
    private double saldo;

    public ContaCorrente(String cliente, int numero) {
        this.cliente = cliente;
        this.numero = numero;
        this.senha = 0;
        this.saldo = 0;
    }

    public boolean cadastrarSenha(int senha) {

        if (this.senha == 0 && senha > 0) {
            setSenha(senha);
            return true;
        } else {
            return false;
        }
    }

    public boolean alterarSenha(int senha, int novaSenha) {

        if (senha == this.senha && senha != 0
                && novaSenha > 0 && novaSenha != senha) {

            setSenha(novaSenha);
            return true;

        } else {
            return false;
        }
    }

    public boolean debitar(int senha, double valor) {

        if (senha == this.senha && senha > 0
                && valor > 0 && valor <= this.saldo) {

            setSaldo(getSaldo() - valor);
            return true;

        } else {
            return false;
        }
    }

    public boolean creditar(int senha, double valor) {

        if (senha == this.senha && senha > 0
                && valor > 0) {

            setSaldo(getSaldo() + valor);
            return true;

        } else {
            return false;
        }
    }

    public String consultaSaldo(int senha) {

        if (senha == this.senha) {
            return "CLIENTE: " + this.cliente
                    + " SALDO: " + this.saldo;
        } else {
            return "SENHA INVÁLIDA";
        }
    }

    public String getCliente() {
        return this.cliente;
    }

    public int getNumero() {
        return this.numero;
    }

    public int getSenha() {
        return this.senha;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
