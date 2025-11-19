// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class Main {
    public static void main(String[] args) {
        
        String cadena = "musculo";
        cadena = cadena.toLowerCase(); //Vuelve la cadena en minúscula
        
        //Resultado
        System.out.println("Numero de vocales en " + cadena + ": " + countVowels(cadena));
    }
    
    public static int countVowels(String text){
        
        char[] vocales = new char[]{'a','e','i','o','u'};
        int conteo = 0;
        
        // Recorre todos los carácteres de la cadena
        for(char c : text.toCharArray()){
            
            // En el carácter respectivo, revisa si es vocal
            for(char v : vocales){
                
                if(c == v){
                    
                    conteo++;
                }
            }
        }
        
        return conteo;
    }
}