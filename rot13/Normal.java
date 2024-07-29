package rot13;

public class Normal {
    public static void main(String[] args) {
        System.out.println(paridade()[1]);
        System.out.println(paridade()[0]);
    
        
    }

    public static char[][] paridade(){

        char[] real = new char[26];
        char[] encriptado = new char[26];
        
        
        for (int i = 0; i < 26; i++) {
            real[i] = (char) (i + 65);
        }

        for (int i = 26; i > 0; i--) {
            encriptado[26 - i] = (char) (i + 64);
        }
        
        



        char[][] par = {real, encriptado};
        return par;
   
    }
}

