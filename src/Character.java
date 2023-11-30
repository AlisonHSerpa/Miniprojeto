import java.util.Scanner;
public class Character {
        //caracteristicas
        private String nome;
        private int sanidade = 3;

        //construtores
        Character(Scanner sc){
            System.out.println("Esse registro esta no nome de:");
            this.nome = sc.nextLine();
        }

        //metodos
        public void agir(int penalidade){
            this.sanidade += penalidade;

            System.out.println("detetive " +this.nome+ " recebeu " +penalidade+ 
            " de sanidade, agora restam " +this.sanidade);
        }

        public String getName(){
            return this.nome;
        }
    }
