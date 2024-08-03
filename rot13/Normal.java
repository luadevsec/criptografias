package rot13;

public class Normal {

    public static void main(String[] args) {
        String[] par = createPar();
        String text = "Hello World!";

        String encripted = encript(par, text);
        System.out.println(encripted);
        String decripted = decript(par, encripted);
        System.out.println(decripted);
    

    }

    public static String encript(String[] paridade, String text) {
        String str = paridade[0];
        String result = paridade[1];

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

    public static String decript(String[] paridade, String text) {
        String str = paridade[0];
        String result = paridade[1];

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

    
   

    public static String[] createPar() {
        /*
         * str : result
         * A : N
         * B : O
         * C : P
         * D : Q
         * E : R
         * F : S
         * G : T
         * H : U
         * I : V
         * J : W
         * K : X
         * L : Y
         * M : Z
         * -----
         * N : A
         * O : B
         * P : C
         * Q : D
         * R : E
         * S : F
         * T : G
         * U : H
         * V : I
         * W : J
         * X : K
         * Y : L
         * Z : M
         */

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result = "";

        // Letras maiusculas
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'M') {
                result += (char) (c + 13);
            } else if (c >= 'N' && c <= 'Z') {
                result += (char) (c - 13);
            }
        }
        
        
        String[] response = new String[2];
        response[0] = str + str.toLowerCase();
        response[1] = result + result.toLowerCase();
        

        return response;
    }
}

