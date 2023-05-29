
public class App {
    public static void main(String[] args) throws Exception {

        double pi = Math.PI;
        double raiz = Math.sqrt(2);
        double potencia = Math.pow(2, 3);
        System.out.println(pi);
        System.out.println(raiz);
        System.out.println(potencia);

        int valor = Integer.parseInt("21");
        System.out.println(valor);

        double v1 = Double.parseDouble("21.2");
        float v2 = Float.parseFloat("22.25");
        System.out.println(v1);
        System.out.println(v2);

        String nome = "Isabella";
        int novoNome = nome.length();
        novoNome = "Michael".length();
        novoNome = new String("Marco").length();

        System.out.println(nome);
        System.out.println(novoNome);

        if (nome.equals("isabella")) {
            System.out.println("Verdade equals");
        }
        if (nome.equalsIgnoreCase("ISABELLA")) {
            System.out.println("Verdade equalsIgnoreCase");
        }

       System.out.println('c'=='d');
       System.out.println("c"=="c");

    }

}
