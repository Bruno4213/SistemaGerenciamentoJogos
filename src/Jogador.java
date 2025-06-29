
public class Jogador {
    private int idJogador;
    private String nome;
    private String email;
    private String senha;

    public Jogador(int idJogador, String nome, String email, String senha) {
        this.idJogador = idJogador;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public int getIdJogador() { return idJogador; }
    public void setIdJogador(int idJogador) { this.idJogador = idJogador; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
}

