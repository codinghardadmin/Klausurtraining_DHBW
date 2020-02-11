package k16;

public class RSA implements IEncryption {

	@Override
	public void encrypt(Document document) {
		System.out.println(document.getFileName() + " wurde mit RSA verschl�sselt!");
	}

	@Override
	public void decrypt(Document document) {
		System.out.println(document.getFileName() + " wurde mit RSA entschl�sselt!");
	}

}
