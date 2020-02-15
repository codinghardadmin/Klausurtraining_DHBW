package k16;

public class AES implements IEncryptionStrategy {

	@Override
	public void encrypt(Document document) {
		System.out.println(document.getFileName() + " wurde mit AES verschl�sselt!");
	}

	@Override
	public void decrypt(Document document) {
		System.out.println(document.getFileName() + " wurde mit AES entschl�sselt!");
	}
	
}
