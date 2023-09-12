package questao11;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();

        // Criar posts e comentários
        usuario.criarPost("Post 1", 1);
        usuario.criarPost("Post 2", 2);
        usuario.criarPost("Post 3", 3);

        // Verificar os posts e comentários registrados
        System.out.println("Posts registrados:");
        for (Post post : usuario.getPosts()) {
            System.out.println("ID: " + post.getId() + ", Conteúdo: " + post.getData());
        }

        System.out.println("Comentários registrados:");
        for (Comentario comentario : usuario.getComentarios()) {
            System.out.println("Texto: " + comentario.getTexto());
        }
    }
}
