
public class Main {
    public static void main(String[] args) {
        
        Jogo jogo1 = new Jogo(1, "Super Game", "Jogo de aventura", "Aventura");
        
        System.out.println("Jogo cadastrado com sucesso:");
        System.out.println("ID: " + jogo1.getIdJogo());
        System.out.println("Nome: " + jogo1.getNome());
        System.out.println("Descrição: " + jogo1.getDescricao());
        System.out.println("Gênero: " + jogo1.getGenero());
        
        new TelaLogin().setVisible(true);
    }
    
    public class TesteConexao {
    public static void main(String[] args) {
        if (Conexao.conectar() != null) {
            System.out.println("Conectado com sucesso!");
        } else {
            System.out.println("Falha na conexão.");
        }
    }
}
}

