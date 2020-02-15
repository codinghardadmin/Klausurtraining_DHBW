package k16;

public class Application {
    public static void main(String... args) {
        User uploadUser = new User("Uploader");
        
        User sub1 = new User("Subscriber 1");
        User sub2 = new User("Subscriber 2");
        

        uploadUser.addListener(sub1);
        uploadUser.addListener(sub2);

        Context context = new Context(new AES());
        uploadUser.uploadFile(uploadUser, "datei1.txt", context);
        
        context = new Context(new RSA());
        uploadUser.uploadFile(uploadUser, "datei2.txt", context);
    }
}