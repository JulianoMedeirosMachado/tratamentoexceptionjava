public class Conta {

    private double saldo;
    void deposita() throws MinhaException {
        // código omitido
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor){
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

}
