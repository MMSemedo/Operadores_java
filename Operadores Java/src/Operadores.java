public class Operadores {
    public static void main(String[] args) throws Exception {

        // Uso de concatenação simples {String nomeCompleto = "Linguagem" + "Java";}

        //String nomeCompleto = "Linguagem" + "Java";
        //System.out.println(nomeCompleto);

        String Concatenacao = "?";
        
        System.out.println(Concatenacao);

        Concatenacao = 1 + 1 + 1 + "1";
        
        System.out.println(Concatenacao);

        Concatenacao = 1 + "1" + 1 + 1;

        System.out.println(Concatenacao);


        Concatenacao = 1 + "1" + 1 + "1";

        System.out.println(Concatenacao);


        Concatenacao = "1" + 1 + 1 + 1;

        System.out.println(Concatenacao);


        Concatenacao = "1" + (1 + 1 + 1);

        System.out.println(Concatenacao);
        
    }
}
