public class Cliente {


    private String nome;
    private String cpf;
    private Computador[] compra;
    private int TotalComprados; // promoçoes escolhidas pelo usuario

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.compra = new Computador[10];
        this.TotalComprados = 0;
    }

    public void compraComputador(Computador pc) {
        if (TotalComprados < compra.length) {
            compra[TotalComprados] = pc;
            TotalComprados++;
        }
    }

    public float calculaTotalCompra() {
        System.out.println("Sua Compra");
        System.out.println("Cliente: " + nome + " | CPF: " + cpf);

        float total = 0;
        for (int i = 0; i < TotalComprados; i++) {
            compra[i].mostraPcConfigs();
            total += compra[i].getPreco(); //valor final da compra
        }
        System.out.println("Valor Final da Compra: R$" + total);
        return total;
    }
}