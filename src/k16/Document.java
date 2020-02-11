package k16;

public class Document {
    private User user;
    private String fileName;
    
	public Document(User user, String fileName) {
		this.user = user;
		this.fileName = fileName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

    
}