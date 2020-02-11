package k16;

public class Application {
    public static void main(String... args) {
        User uploadUser = new User("Uploader");
        
        User sub1 = new User("Subscriber 1");
        User sub2 = new User("Subscriber 2");
        

        uploadUser.addListener(sub1);
        uploadUser.addListener(sub2);

        IEncryption encryption = new AES();
        
        uploadUser.uploadFile(uploadUser, "datei.txt", encryption);
    }
}