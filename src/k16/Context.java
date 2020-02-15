package k16;

public class Context {
	
	private IEncryptionStrategy strategy;
	
	public Context(IEncryptionStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void executeStrategyEncrypt(Document document) {
		strategy.encrypt(document);
	}
	
	public void executeStrategyDecrypt(Document document) {
		strategy.decrypt(document);
	}
	
}
