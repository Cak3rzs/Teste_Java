package br.com.controle;
public class Controle {
    private double custo_de_fabrica;

    public double getCusto_de_fabrica() {
        return custo_de_fabrica;
    }

    public void setCusto_de_fabrica(double custo_de_fabrica) {
        this.custo_de_fabrica = custo_de_fabrica;
    }

    public double calcularCustoConsumidor(boolean necessidadesEspeciais) {
        double custoConsumidor = getCusto_de_fabrica();
        
        if (necessidadesEspeciais) {
            custoConsumidor *= 0.8;
        }
        
        double impostos = 0.45 * getCusto_de_fabrica();
        custoConsumidor += impostos;

        double percentagemDistribuidor = 0.28 * getCusto_de_fabrica();
        custoConsumidor += percentagemDistribuidor;

        return custoConsumidor;
    }
}
