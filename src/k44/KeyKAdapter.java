package k44;

public class KeyKAdapter extends KeyK implements IKeyType {

	@Override
	public void open() {
		generalKeyOpen();
	}

	@Override
	public void close() {
		generalKeyClose();
	}

}
