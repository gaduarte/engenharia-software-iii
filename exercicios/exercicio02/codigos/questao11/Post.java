package questao11;


public class Post {
    private int id;
    private String text;

    public Post(int id, String text){
        this.id=id;
        this.text=text;
    }

    public int getId(){
        return id;
    }

    public String getData(){
        return text;
    }

}
