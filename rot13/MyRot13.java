package rot13;
import java.util.ArrayList;
import java.util.Random;


public class MyRot13 {
    public static void main(String[] args) {

        String[] chaves = {
            createPar(),
            createPar(),
            createPar(),
            createPar(),
            createPar(),
        };

        for (String chave : chaves) {
            System.out.println(chave);
        }

        String text = "Oi, meu nome é Lunna e eu sou dev ^^, eu comecei a estudar criptografia agora";
        text = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String encripted = encript(chaves[0], text);
        System.out.println(encripted);
        String decripted = decript(chaves[0], encripted);
        System.out.println(decripted);

        System.out.println("----");

        for (String chave : chaves) {
            System.out.println(decript(chave, encripted));
        }
    
    
    }

    public static String encript(String chave, String text) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String result = chave;

        String response = "";
        for (int i = 0; i < text.length(); i++) {
            char letra = text.charAt(i);
            int index = str.indexOf(letra);
            
            if (index != -1) {
                response += result.charAt(index);
            } else {
                response += letra;
            }
        }
        

        return response;
    
    }

    public static String decript(String chave, String text) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String result = chave;

        String response = "";
        for (int i = 0; i < text.length(); i++) {
            char letra = text.charAt(i);
            int index = result.indexOf(letra);
            
            if (index != -1) {
                response += str.charAt(index);
            } else {
                response += letra;
            }
        }
        

        return response;
    }

    
   

    public static String createPar() {
        /*
         * str : result
         * ??? : ????
         * kkkkk sim, ele é gerado aleatoriamente
         */

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        ArrayList<Character> letras = new ArrayList<>();
        //letras.addAll(str.toCharArray());     <- não funciona
        for (char ch : str.toCharArray()) {
            letras.add(ch);
        }
        

        StringBuilder result = new StringBuilder();  // StringBuilder é mais eficiente para concatenação de strings
        Random random = new Random();
        int strLength = str.length();  // só pra aplicar a logica de forma mais eficiente
        

        for (int i = 0; i < strLength; i++) {
            int index = random.nextInt(letras.size());
            char letra = letras.get(index);  // Pega o caractere aleatório

            result.append(letra);
            letras.remove(index);  // Remove o caractere para evitar duplicatas
        }
        
        return result.toString(); // converte o StringBuilder para String

    }
}

