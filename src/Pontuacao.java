
public class Pontuacao {
    private int idPontuacao;
    private int idJogador;
    private int idJogo;
    private int pontuacao;

    public Pontuacao(int idPontuacao, int idJogador, int idJogo, int pontuacao) {
        this.idPontuacao = idPontuacao;
        this.idJogador = idJogador;
        this.idJogo = idJogo;
        this.pontuacao = pontuacao;
    }

    public int getIdPontuacao() { return idPontuacao; }
    public void setIdPontuacao(int idPontuacao) { this.idPontuacao = idPontuacao; }

    public int getIdJogador() { return idJogador; }
    public void setIdJogador(int idJogador) { this.idJogador = idJogador; }

    public int getIdJogo() { return idJogo; }
    public void setIdJogo(int idJogo) { this.idJogo = idJogo; }

    public int getPontuacao() { return pontuacao; }
    public void setPontuacao(int pontuacao) { this.pontuacao = pontuacao; }
}

