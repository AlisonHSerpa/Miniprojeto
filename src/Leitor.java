import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Leitor 
{
    public HashMap<String, Character> lerPersonagens (String indexPersonagens)
    {
        HashMap<String, Character> personagens = new HashMap<String, Character>();
        File SalvarPersonagens = new File(indexPersonagens);

        try
        {
            Scanner sc = new Scanner(SalvarPersonagens, "UTF-8");

            String nomeCharacter = "";
            String linha = "";

            while (sc.hasNextLine())
            {
                while(!linha.equals("PERSONAGEM"))
                {
                    linha = sc.nextLine();
                }
                nomeCharacter = sc.nextLine();
                personagens.put(nomeCharacter, new Character(nomeCharacter));
            }
            sc.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return personagens;
    }

    public HashMap<String, Capitulo> lerCapitulos (String indexCapitulos,
    HashMap<String, Character> personagens, Scanner ScannerMain)
    {
        HashMap<String, Capitulo> capitulos = new HashMap<String, Capitulo>();
        File SaveCapitulos = new File(indexCapitulos);

        try
        {
            Scanner sc = new Scanner(SaveCapitulos, "UTF-8");
            String linha = "";

            while(sc.hasNextLine())
            {
                while(!linha.equals("CAPITULO") &&
                !linha.equals("ESCOLHAS"))
                {
                    linha = sc.nextLine();
                }

                if (linha.equals("CAPITULO"))
                {
                    lerCapitulos(personagens, ScannerMain, capitulos, sc);
                    linha = "";
                }
                else if (linha.equals("ESCOLHAS"))
                {
                    lerEscolhas(capitulos, sc);
                    linha = "";
                }
            }
            sc.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        
        return capitulos;
    }

    private void lerCapitulos (HashMap<String,Character> personagens,
    Scanner ScanerMain, HashMap<String, Capitulo> capitulos, Scanner sc)
    {
        String CapituloNome;
        String TextoCapitulo;
        String CharacterNome;
        int folego;
        String linha;
        linha = sc.nextLine();
        CapituloNome = sc.nextLine();
        linha = sc.nextLine();
        TextoCapitulo = sc.nextLine();
        linha = sc.nextLine();
        CharacterNome = sc.nextLine();
        linha = sc.nextLine();
        folego = Integer.parseInt(sc.nextLine());

        capitulos.put(CapituloNome, new Capitulo(personagens.get(CharacterNome),
        CapituloNome, TextoCapitulo, folego));
    }

    private void lerEscolhas (HashMap<String,Capitulo> capitulos,
    Scanner sc)
    {
        String NomeCapitulo;
        String textoEscolha;
        String ProximoCapitulo;
        String linha;
        linha = sc.nextLine();
        NomeCapitulo = sc.nextLine();
        linha = sc.nextLine();
        textoEscolha = sc.nextLine();
        linha = sc.nextLine();
        ProximoCapitulo = sc.nextLine();
    
        Capitulo CapituloOrigem = capitulos.get(NomeCapitulo);
        Capitulo CapituloProximo = capitulos.get(ProximoCapitulo);
        CapituloOrigem.adicionarEscolha(new Escolha(textoEscolha, CapituloProximo));
    }
}
