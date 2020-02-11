package k44;

public class KeyN implements IKeyType {

	@Override
	public void open() {
		System.out.println("Koffer wurde mit Schlüssel vom Typ N aufgeschlossen");
	}

	@Override
	public void close() {
		System.out.println("Koffer wurde mit Schlüssel vom Typ N abgeschlossen");
	}

}
