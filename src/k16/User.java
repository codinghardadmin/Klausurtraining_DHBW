package k16;

import java.util.ArrayList;

public class User implements IUploadListener {
	
    private ArrayList<IUploadListener> listeners;
    private String name;

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String name) {
        listeners = new ArrayList<>();
        this.name = name;
    }

    public void uploadFile(User uploadUser, String fileName, Context context) {
    	Document doc = new Document(uploadUser, fileName);
    	
    	context.executeStrategyEncrypt(doc);
    	
        for (IUploadListener listener : listeners)
            listener.upload(doc);
    }

    public void addListener(IUploadListener listener) {
        listeners.add(listener);
    }

    public void removeListener(IUploadListener listener) {
        listeners.remove(listener);
    }

	@Override
	public void upload(Document doc) {
		System.out.println("Info an " + getName() + ": " + doc.getFileName() + " wurde von " + doc.getUser().getName() + " hochgeladen!");
	}
}