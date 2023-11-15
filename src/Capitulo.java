import java.util.Scanner;
public class Capitulo {
    Character protag;
    String nome;
    String texto;
    String[] escolhas;
    int penalidade;

    Scanner sc = new Scanner(System.in);

    //construtor de capitulos
    Capitulo(Character protag, String nome, String texto, String[] escolhas, int penalidade) {
        this.protag = protag;
        this.nome = nome;
        this.texto = texto;
        this.escolhas = escolhas;
        this.penalidade = penalidade;
    }
    //construtor de finais
    Capitulo(Character protag, String nome, String texto, int penalidade){
        this.protag= protag;
        this.nome = nome;
        this.texto = texto;
        this.penalidade = penalidade;
    }

    public void anunciar (){
        this.protag.agir(this.penalidade);
        System.out.println("------" +this.nome+ "------");
        System.out.println(this.texto);
    }

    public int escolher (){
            anunciar ();
            while(true){
                for(int i=0 ; i<this.escolhas.length ;i++){
                System.out.println(this.escolhas[i]);
                }

                String escolhafinal = this.sc.nextLine();

                for (int i=0 ; i<this.escolhas.length ; i++){
                    if (escolhafinal.equals(this.escolhas[i])){
                        return i;
                    }
                }
                System.out.println("voce digitou " +escolhafinal+ ", digite corretamente.");

                }
            }
    }
