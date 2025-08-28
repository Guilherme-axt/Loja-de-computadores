/**
 * classe Notebook(filha)
 * @author GuilhermeMachadoMore
 */

import java.util.Scanner;

public class Notebook extends Computador {

    @Override
    public void cadastrar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Cadastro de Notebook ---");

        // Dados Básicos
        System.out.print("Marca: ");
        setMarca(scanner.nextLine());
        System.out.print("Preço: R$ ");
        setPreco(scanner.nextDouble());
        System.out.print("Quantidade: ");
        setQuantidade(scanner.nextInt());
        scanner.nextLine();

        // Memória
        System.out.print("Tipo da Memória: ");
        setTipoMemoria(scanner.nextLine());
        System.out.print("Marca da Memória: ");
        setMarcaMemoria(scanner.nextLine());
        System.out.print("Slots de Memória: ");
        setNumeroSlotsMemoria(scanner.nextInt());
        scanner.nextLine();

        // HD
        System.out.print("Tipo do HD: ");
        setTipoHD(scanner.nextLine());
        System.out.print("Marca do HD: ");
        setMarcaHD(scanner.nextLine());
        System.out.print("Capacidade do HD (GB): ");
        setCapacidadeHD(scanner.nextInt());
        scanner.nextLine();

        // Monitor
        System.out.print("Tipo do Monitor: ");
        setTipoMonitor(scanner.nextLine());
        System.out.print("Marca do Monitor: ");
        setMarcaMonitor(scanner.nextLine());
        System.out.print("Resolução do Monitor (p): ");
        setResolucaoMonitor(scanner.nextInt());
        scanner.nextLine();

        // Fonte
        System.out.print("Tipo da Fonte: ");
        setTipoFonte(scanner.nextLine());
        System.out.print("Marca da Fonte: ");
        setMarcaFonte(scanner.nextLine());
        System.out.print("Potência da Fonte (W): ");
        setPotenciaFonte(scanner.nextInt());
        scanner.nextLine();
    }

    @Override
    public void imprimir() {
        System.out.println("\n----------[ NOTEBOOK ]----------");
        System.out.println("Marca: " + getMarca());
        System.out.println("Preço: R$ " + String.format("%.2f", getPreco()));
        System.out.println("Estoque: " + getQuantidade());
        System.out.println("Memória: " + getTipoMemoria() + " " + getMarcaMemoria() + " (" + getNumeroSlotsMemoria() + " slots)");
        System.out.println("Armazenamento: " + getTipoHD() + " " + getMarcaHD() + " (" + getCapacidadeHD() + " GB)");
        System.out.println("Monitor: " + getTipoMonitor() + " " + getMarcaMonitor() + " (" + getResolucaoMonitor() + "p)");
        System.out.println("Fonte: " + getTipoFonte() + " " + getMarcaFonte() + " (" + getPotenciaFonte() + "W)");
        System.out.println("--------------------------------");
    }
}
