public class Operadores {
    public static void main (String [] args){
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);
        int num = 5;
        num++;;
        System.out.println(num);

        //Ternário
        int a, b;
        a = 6;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "falso";
        int res = a==b ? 1 : 0;
        System.out.println(resultado);
        System.out.println(res);
    }
    
}
