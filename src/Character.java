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
                System.out.println(alvo.nome + " foi eliminado...");
            }
            else{
                System.out.println(alvo.nome + " levou um tiro");
            }
        }
        void agir(){
            folego --;
            System.out.println("detetive " +this.nome+ " perdeu -1 de folego, agora restam " +this.folego);
        }
}
