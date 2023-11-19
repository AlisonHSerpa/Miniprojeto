import java.util.Scanner;
public class Capitulo {
    Character protag;
    String nome;
    String texto;
    Escolha[] escolhas;
    int penalidade;

    //construtor de capitulos
    Capitulo(Character protag, String nome, String texto, int penalidade) {
        this.protag = protag;
        this.nome = nome;
        this.texto = texto;
        this.penalidade = penalidade;
    }

    public void executar(Capitulo capitulo, Scanner sc) {
        mostrar(capitulo);

        if (capitulo.escolhas != null){
            executar(escolher(sc), sc);
        }
    }

    public void mostrar (Capitulo capitulo){
        capitulo.protag.agir(capitulo.penalidade);
        System.out.println("------" +capitulo.nome+ "------");
        System.out.println(capitulo.texto);
    }

    public Capitulo escolher (Scanner sc){
            while(true){
                for(int i=0 ; i<this.escolhas.length ;i++){
                System.out.println(this.escolhas[i].escolha);
                }
                String escolhafinal = sc.nextLine();

                for (int i=0 ; i<this.escolhas.length ; i++){
                    if (escolhafinal.equals(this.escolhas[i].escolha)){
                        return this.escolhas[i].proximocapitulo;
                    }
                }
                System.out.println("voce digitou " +escolhafinal+ ", digite corretamente.");

                }
            }
    }
