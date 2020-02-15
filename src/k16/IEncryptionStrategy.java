package k16;

public interface IEncryptionStrategy {
	public void encrypt(Document document);
	public void decrypt(Document document);
}
