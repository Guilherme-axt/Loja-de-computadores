/**
 * Superclasse que contém TODOS os atributos possíveis que podem ser herdados
 * pelas classes Notebook, Desktop e Servidor.
 * @author GuilhermeMachadoMore
 */
public abstract class Computador {

    // Atributos Comuns a todos
    private String marca;
    private double preco;
    private int quantidade;

    // Atributos de Memória e HD (usados por todos)
    private String tipoMemoria;
    private String marcaMemoria;
    private int numeroSlotsMemoria;
    private String tipoHD;
    private String marcaHD;
    private int capacidadeHD;

    // Atributos de Monitor (usados por Notebook e Desktop)
    private String tipoMonitor;
    private String marcaMonitor;
    private int resolucaoMonitor;

    // Atributos de Fonte (usados por todos, mas com variações)
    private String tipoFonte;
    private String marcaFonte;
    private int potenciaFonte;

    // Atributos Específicos de Desktop
    private int placasVideo;
    private String marcaPlacaVideo;

    // Atributos Específicos de Servidor
    private int numeroMaxHD;
    private String tipoGabinete;
    private String marcaGabinete;

    // --- Getters e Setters para TODOS os atributos ---
    // (Necessários para que as classes filhas possam acessá-los)

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    public String getTipoMemoria() { return tipoMemoria; }
    public void setTipoMemoria(String tipoMemoria) { this.tipoMemoria = tipoMemoria; }
    public String getMarcaMemoria() { return marcaMemoria; }
    public void setMarcaMemoria(String marcaMemoria) { this.marcaMemoria = marcaMemoria; }
    public int getNumeroSlotsMemoria() { return numeroSlotsMemoria; }
    public void setNumeroSlotsMemoria(int numeroSlotsMemoria) { this.numeroSlotsMemoria = numeroSlotsMemoria; }
    public String getTipoHD() { return tipoHD; }
    public void setTipoHD(String tipoHD) { this.tipoHD = tipoHD; }
    public String getMarcaHD() { return marcaHD; }
    public void setMarcaHD(String marcaHD) { this.marcaHD = marcaHD; }
    public int getCapacidadeHD() { return capacidadeHD; }
    public void setCapacidadeHD(int capacidadeHD) { this.capacidadeHD = capacidadeHD; }
    public String getTipoMonitor() { return tipoMonitor; }
    public void setTipoMonitor(String tipoMonitor) { this.tipoMonitor = tipoMonitor; }
    public String getMarcaMonitor() { return marcaMonitor; }
    public void setMarcaMonitor(String marcaMonitor) { this.marcaMonitor = marcaMonitor; }
    public int getResolucaoMonitor() { return resolucaoMonitor; }
    public void setResolucaoMonitor(int resolucaoMonitor) { this.resolucaoMonitor = resolucaoMonitor; }
    public String getTipoFonte() { return tipoFonte; }
    public void setTipoFonte(String tipoFonte) { this.tipoFonte = tipoFonte; }
    public String getMarcaFonte() { return marcaFonte; }
    public void setMarcaFonte(String marcaFonte) { this.marcaFonte = marcaFonte; }
    public int getPotenciaFonte() { return potenciaFonte; }
    public void setPotenciaFonte(int potenciaFonte) { this.potenciaFonte = potenciaFonte; }
    public int getPlacasVideo() { return placasVideo; }
    public void setPlacasVideo(int placasVideo) { this.placasVideo = placasVideo; }
    public String getMarcaPlacaVideo() { return marcaPlacaVideo; }
    public void setMarcaPlacaVideo(String marcaPlacaVideo) { this.marcaPlacaVideo = marcaPlacaVideo; }
    public int getNumeroMaxHD() { return numeroMaxHD; }
    public void setNumeroMaxHD(int numeroMaxHD) { this.numeroMaxHD = numeroMaxHD; }
    public String getTipoGabinete() { return tipoGabinete; }
    public void setTipoGabinete(String tipoGabinete) { this.tipoGabinete = tipoGabinete; }
    public String getMarcaGabinete() { return marcaGabinete; }
    public void setMarcaGabinete(String marcaGabinete) { this.marcaGabinete = marcaGabinete; }

    // Métodos abstratos que obrigam as classes filhas a terem sua própria implementação
    public abstract void cadastrar();
    public abstract void imprimir();
}
