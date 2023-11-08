import java.util.Scanner;
public class Capitulo {
    Character protag;
    String nome;
    String texto;
    String escolha01;
    String escolha02;
    int penalidade;

    Scanner sc = new Scanner(System.in);

    //construtor de capitulos
    Capitulo(Character protag, String nome, String texto, String escolha01, String escolha02, int penalidade) {
        this.protag = protag;
        this.nome = nome;
        this.texto = texto;
        this.escolha01 = escolha01;
        this.escolha02 = escolha02;
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
         while(true){
            anunciar ();
            System.out.println(this.escolha01 + " / " + this.escolha02);
            String escolhafinal = this.sc.nextLine();
            
            if (escolhafinal .equals(this.escolha01)){
                return 1;
            }
            else if (escolhafinal .equals(this.escolha02)) {
                return 2;
            }
            else {
                System.out.println("voce digitou incorretamente, tente de novo:" + escolhafinal);
            }
        }
    }
}
