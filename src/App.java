public class App {
    public static void main(String[] args) throws Exception {
        String secretKey = "TVD";
        String originalString = "teamvietdev.com";

        TestAES testAES = new TestAES();
        String encryptedString = testAES.encrypt(originalString, secretKey);
        System.out.println("Encrypt: " + encryptedString);
        String decryptedString = testAES.encrypt(encryptedString, secretKey);
        System.out.println("Decrypt: " + decryptedString);
    }
}
