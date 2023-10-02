import java.util.Date;

public class TestePosts {
    public static void main(String[] args){
        Autor autor = new Autor(1, "autor01", "autor01@mail.com");
        Post post = new Post(1, "post 01", autor, new Date(), "post.txt");
        RepositorioDePosts repositorio = new RepositorioDePosts();

        repositorio.savetoFile(post);
    }
}
