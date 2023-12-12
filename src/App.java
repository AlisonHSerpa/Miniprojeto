import java.util.HashMap;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Leitor leitor = new Leitor();
        HashMap<String,Character> personagens = leitor.lerPersonagens(
        "C:\\Users\\aliso\\Desktop\\Faculdade\\Facul programas\\Miniprojeto\\src\\Personagens");
        HashMap<String,Capitulo> capitulos = leitor.lerCapitulos(
        "C:\\Users\\aliso\\Desktop\\Faculdade\\Facul programas\\Miniprojeto\\src\\Capitulos", personagens, sc);

        Capitulo raiz = capitulos.get("perseguir");

        //executando livro interativo
        raiz.executar(sc);
        sc.close();
    }
}
