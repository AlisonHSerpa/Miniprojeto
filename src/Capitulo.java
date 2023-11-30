import java.util.Scanner;
public class Capitulo {
    private Character protag;
    private String nome;
    private String texto;
    private Escolha[] escolhas;
    private int penalidade;

    //construtor de capitulos
    Capitulo(Character protag, String nome, String texto, int penalidade) {
        this.protag = protag;
        this.nome = nome;
        this.texto = texto;
        this.penalidade = penalidade;
    }
    
    //metodos
    public void executar(Scanner sc) {
        mostrar();

        if (this.escolhas != null){
            escolher(sc).executar(sc);
        }
    }

    public void mostrar (){
        this.protag.agir(this.penalidade);
        System.out.println("------" +this.nome+ "------");
        System.out.println(this.texto);
    }

    public Capitulo escolher (Scanner sc){
            while(true){
                for(int i=0 ; i<this.escolhas.length ;i++){
                System.out.println(this.escolhas[i].getEscolha());
                }
                String escolhafinal = sc.nextLine();

                for (int i=0 ; i<this.escolhas.length ; i++){
                    if (escolhafinal.equals(this.escolhas[i].getEscolha())){
                        return this.escolhas[i].getProximoCapitulo();
                    }
                }
                System.out.println("voce digitou " +escolhafinal+ 
                ", digite corretamente.");

                }
            }

            public void setEscolhas(Escolha[] escolhas){
                this.escolhas = escolhas;
            }
    }
