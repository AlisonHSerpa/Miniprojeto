import java.util.ArrayList;
import java.util.Scanner;

public class Capitulo
{
    private Character personagem;
    private String nome;
    private String texto;
    private ArrayList<Escolha> escolhas = new ArrayList<Escolha>();
    private int penalidade;

    //construtor de capitulos
    Capitulo(Character personagem, String nome, String texto, int penalidade)
    {
        this.personagem = personagem;
        this.nome = nome;
        this.texto = texto;
        this.penalidade = penalidade;
    }
    
    //metodos
    public void executar(Scanner sc)
    {
        mostrar();

        if (this.escolhas.size() != 0)
        {
            escolher(sc).executar(sc);
        }
    }

    public void mostrar ()
    {
        this.personagem.agir(this.penalidade);
        this.personagem.morrer();
        System.out.println("------" +this.nome+ "------");
        System.out.println(this.texto);
    }

    public Capitulo escolher (Scanner sc)
    {
            while(true)
            {
                for(int i=0 ; i<this.escolhas.size() ;i++)
                {
                System.out.println(this.escolhas.get(i).getEscolha());
                }
                String escolhafinal = sc.nextLine();

                for (int i=0 ; i<this.escolhas.size() ; i++)
                {
                    if (escolhafinal.equals(this.escolhas.get(i).getEscolha()))
                    {
                        return this.escolhas.get(i).getProximoCapitulo();
                    }
                }
                System.out.println("voce digitou " +escolhafinal+
                ", digite corretamente.");

                }
            }

    public void adicionarEscolha (Escolha a)
    {
        this.escolhas.add(a);
    }
}
