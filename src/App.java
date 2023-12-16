import java.util.HashMap;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Leitor leitor = new Leitor();
        HashMap<String,Character> personagens = leitor.lerPersonagens(
        "resource\\Personagens");
        HashMap<String,Capitulo> capitulos = leitor.lerCapitulos(
        "resource\\Capitulos",
        personagens, sc);

        Capitulo raiz = capitulos.get("perseguir");

        //executando livro interativo
        raiz.executar(sc);
        sc.close();
    }
}
