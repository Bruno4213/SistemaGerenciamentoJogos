
public class Jogo {
    private int idJogo;
    private String nome;
    private String descricao;
    private String genero;

    
    public Jogo(int idJogo, String nome, String descricao, String genero) {
        this.idJogo = idJogo;
        this.nome = nome;
        this.descricao = descricao;
        this.genero = genero;
    }

   
    public int getIdJogo() { return idJogo; }
    public void setIdJogo(int idJogo) { this.idJogo = idJogo; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
}

