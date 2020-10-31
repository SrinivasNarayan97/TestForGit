package basicsOfJava;

import java.util.Base64;

public class EncryptionAndDecryption {

    public static void main(String[] args) {
        String name ="Srinivas Narayan";
        String encryptname = Encryptname(name);
        System.out.println(encryptname); //U3Jpbml2YXMgTmFyYXlhbg==
        
        String ename="U3Jpbml2YXMgTmFyYXlhbg==";
        String decryption = Decryption(ename);
        System.out.println(decryption);
    }
    
    public static String Decryption(String e){
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decode = decoder.decode(e.getBytes());
        return new String(decode);
    }

    public static String Encryptname(String n){
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] encode = encoder.encode(n.getBytes());
        return new String(encode);
    }
}
