package k44;

import java.util.List;

public class Koffer {
	
	private List<Fach> faecher;
	private boolean open = true;

	public Koffer(List<Fach> faecher) {
		this.faecher = faecher;
		this.open = true;
	}

	public List<Fach> getFaecher() {
		return faecher;
	}

	public void setFaecher(List<Fach> faecher) {
		this.faecher = faecher;
	}

	public boolean isOpen() {
		return open;
	}
	
	public void openKoffer(IKeyType key) {
		key.open();
		open = true;
	}
	
	public void closeKoffer(IKeyType key) {
		key.close();
		open = false;
	}
	
}
