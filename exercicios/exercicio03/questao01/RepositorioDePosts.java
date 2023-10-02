import java.io.FileWriter;
import java.io.IOException;

public class RepositorioDePosts {
    public void savetoFile(Post post){
        try (FileWriter writer = new FileWriter(post.getFilepath())) {
            writer.write("ID: " + post.getId() + "\n");
            writer.write("Texto: " + post.getTexto() + "\n");
            writer.write("Autor: " + post.getAutor().getNome() + "\n");
            writer.write("Data: " + post.getData() + "\n");
            writer.write("Quantidade de Likes: " + post.getQuantidadeDeLikes() + "\n");
        } catch (IOException e) {
        e.printStackTrace();
}
}

    }
 
