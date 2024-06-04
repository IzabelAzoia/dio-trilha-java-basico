public class Conta {
    double saldo = 10.0;

    public void sacar(Double valor) {
        double novoSaldo = saldo - valor;
        saldo = novoSaldo;
    }

    public void imprimirSaldo() {
       System.out.println(saldo); 
    }

    public double calcularDividaEsponencial() {
        double valorParcela = 50.0;
        double valorMontante = 0.0;
        double taxaJurosMensal = 0.02;
        for(int x = 1; x<= 5; x++) {
            double valorJuros = valorMontante * taxaJurosMensal;
            double valorParcelaComJuros = valorParcela + valorJuros;
            valorMontante = valorMontante + valorParcelaComJuros;
        }
        return valorMontante;
    }


}



