import java.util.Scanner;
public class Character {
        //caracteristicas
        String nome;
        int municoes = 6;
        int sanidade = 3;

        //construtores
        Character(Scanner sc){
            System.out.println("esse registro esta no nome de:");
            this.nome = sc.nextLine();
        }

        //metodos
        void agir(int penalidade){
            sanidade += penalidade;

            System.out.println("detetive " +this.nome+ " recebeu " +penalidade+ " de sanidade, agora restam " +this.sanidade);
        }
    }
