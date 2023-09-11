package AtividadeFinal;

public class Chinelo extends Calcado {
    private int tamanho;
    private String cor;

    public Chinelo(String nome, double preco, int tamanho, String cor) {
        super(nome, preco);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    @Override
    String getDescricao() {
        return "Chinelo " + getNome() + " (Tamanho: " + tamanho + ", Cor: " + cor + ")";
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}