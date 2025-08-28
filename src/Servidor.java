/**
 * classe Servidor(filha)
 * @author GuilhermeMachadoMore
 */

import java.util.Scanner;

public class Servidor extends Computador {

    @Override
    public void cadastrar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Cadastro de Servidor ---");

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
        System.out.print("Número máximo de HDs: ");
        setNumeroMaxHD(scanner.nextInt());
        scanner.nextLine();

        // Fonte
        System.out.print("Tipo da Fonte: ");
        setTipoFonte(scanner.nextLine());
        System.out.print("Marca da Fonte: ");
        setMarcaFonte(scanner.nextLine());
        System.out.print("Potência da Fonte (W): ");
        setPotenciaFonte(scanner.nextInt());
        scanner.nextLine();
        
        // Gabinete
        System.out.print("Tipo do Gabinete: ");
        setTipoGabinete(scanner.nextLine());
        System.out.print("Marca do Gabinete: ");
        setMarcaGabinete(scanner.nextLine());
    }

    @Override
    public void imprimir() {
        System.out.println("\n----------[ SERVIDOR ]----------");
        System.out.println("Marca: " + getMarca());
        System.out.println("Preço: R$ " + String.format("%.2f", getPreco()));
        System.out.println("Estoque: " + getQuantidade());
        System.out.println("Memória: " + getTipoMemoria() + " " + getMarcaMemoria() + " (" + getNumeroSlotsMemoria() + " slots)");
        System.out.println("Armazenamento: " + getTipoHD() + " " + getMarcaHD() + " (" + getCapacidadeHD() + " GB)");
        System.out.println("Fonte: " + getTipoFonte() + " " + getMarcaFonte() + " (" + getPotenciaFonte() + "W)");
        System.out.println("Gabinete: " + getTipoGabinete() + " " + getMarcaGabinete());
        System.out.println("Capacidade de HDs: " + getNumeroMaxHD() + " slots");
        System.out.println("--------------------------------");
    }
}
