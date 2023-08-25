public class RedeSocial {
    public static void main(String[] args) {
        Post post = new Post(3, "Hello World", Status.DRAFT);

        post.validate();
        System.out.println("Post publicado com Sucesso!");
    }
}
