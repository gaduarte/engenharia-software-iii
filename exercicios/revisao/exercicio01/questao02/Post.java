
public class Post {
    private int id;
    private String text;
    private Status status;

    Post(int id, String text, Status status) {
        this.setId(id);
        this.setText(text);
        this.setStatus(status);
    }

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void validate(){
		if(this.getStatus() != Status.DRAFT){
			throw new RuntimeException("O post deve conter pelo menos um caracter.");
		}
		if(this.getText().trim().length() == 0){
			throw new RuntimeException("Apenas rascunhos podem ser postados.");
		}

		this.setStatus(Status.PUBLISHED);
	}
    
}
