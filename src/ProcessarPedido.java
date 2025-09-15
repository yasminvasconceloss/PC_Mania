public class ProcessarPedido {

    public static void enviar(Cliente cliente) {
        System.out.println("Pedido enviado!");
        cliente.calculaTotalCompra();
    }
}