public class TabelaRecordes {
    public String nome;
    public long tempo;

    public TabelaRecordes(String nome, long tempo) {
        this.nome = "Anónimo";
        this.tempo = 9999999;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTempo(long tempo) {
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public long getTempo() {
        return tempo;
    }

    public void setRecorde(String nome, long tempo) {
        this.nome = nome;
        this.tempo = tempo;
    }
}
