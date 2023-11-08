public class Character {
        //caracteristicas
        String nome;
        int vida = 2;
        int municoes = 6;
        int folego = 3;

        //construtores
        Character(){
        }
        Character(String nome){
            this.nome = nome;
        }

        //metodos
        void atirar (Character alvo){
            this.municoes -=1;
            alvo.vida -=1;

            if (alvo.vida == 0){
                System.out.println(this.nome + " atirou em " + alvo.nome+ ", "
                +alvo.nome + " perdeu 1 de vida e foi eliminado...");
            }
            else{
                System.out.println(this.nome + " atirou em " + alvo.nome+ ", "
                +alvo.nome + " perdeu 1 de vida");
            }
        }
        void agir(int penalidade){
            folego -= penalidade;

            System.out.println("detetive " +this.nome+ " perdeu -" +penalidade+ " de folego, agora restam " +this.folego);
        }
    }
