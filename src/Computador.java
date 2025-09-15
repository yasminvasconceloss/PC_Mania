public class Computador {

    private String marca;
    private float preco;
    private SistemaOperacional sistema;
    private HardwareBasico[] hardwares;
    private MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco, SistemaOperacional sistema, HardwareBasico[] hardwares, MemoriaUSB memoriaUSB) {
        this.marca = marca;
        this.preco = preco;
        this.sistema = sistema;
        this.hardwares = hardwares;
        this.memoriaUSB = memoriaUSB;
    }

    public void mostraPcConfigs() {
        System.out.println("------- Informações Gerais do produto -------");
        System.out.println("Marca do PC: " + marca);
        System.out.println("Valor: R$ " + preco + "0");

        for (HardwareBasico hardware : hardwares) {
            if (hardware != null) {
                System.out.println("Hardware: " + hardware.getNome() + " / " + hardware.getCapacidade());
            }
        }

        System.out.println("Sistema Operacional: " + sistema.getNome() + " / " + sistema.getTipo() + " bits");
        if (memoriaUSB != null) {
            System.out.println("Acompanha: " + memoriaUSB.getNome() + " / " + memoriaUSB.getCapacidade() + "GB");
        }
    }

    public float getPreco() {
        return preco;
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }
}