public class Exemplo {
    public static void main(String[] args) {
        String s = "ifsp";
        String t = "IFSP";
        String u = " 1 IFSP";

        System.out.println(s.charAt(1));
        //Saída: f

        System.out.println(s.concat(" 2024"));
        //Saída: ifsp 2024

        if(s.equals(t)){
            System.out.println("s e t são Iguais!");
        }else{
            System.out.println("s e t NÃO são Iguais!");
        }
        //Saída: s e t NÃO são Iguais!
        
        if(s.equalsIgnoreCase(t)){
            System.out.println("s e t são Iguais!");
        }else{
            System.out.println("s e t NÃO são Iguais!");
        }
        //Saída: s e t são Iguais!

        System.out.println(s.length());
        //Saída: 4

        System.out.println(s.replace("sp", "rs"));
        //Saída: ifrs

        System.out.println(s.substring(1));
        //Saída: fsp

        //Observe que a substring inicia no índice 1 e segue até o final da String
        System.out.println(s.substring(1, 3));
        //Saída: fs

        //Observe que a substring inicia no índice 1 e termina no índice 3 (sem incluir o 3)
        System.out.println(t.toLowerCase());
        //Saída: ifsp

        System.out.println(s.toUpperCase());
        //Saída: IFSP

        System.out.println(u.trim());
        //Saída: 1 IFSP
    }
}
