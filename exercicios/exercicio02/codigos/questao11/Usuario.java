package questao11;

import java.util.List;
import java.util.ArrayList;

public class Usuario implements CriarPosts {
    private List<Post> posts;
    private List<Comentario> comentarios;

    public Usuario() {
        this.posts = new ArrayList<>();
        this.comentarios = new ArrayList<>();
    }

    public List<Post> getPosts(){
        return posts;
    }

    public List<Comentario> getComentarios(){
        return comentarios;
    }

    public void criarPost(String conteudo, int id) {
        Post novoPost = new Post(id,conteudo);
        Comentario novoComentario = new Comentario(conteudo);

        registrarPosts(novoPost, novoComentario);
    }

    @Override
    public void registrarPosts(Post post, Comentario comentario) {
       
        posts.add(post);
        comentarios.add(comentario);
    }
}
