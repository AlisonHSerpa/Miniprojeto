public class Character {
        //caracteristicas
        private String nome;
        private int folego;

        //construtores
        Character(String nome, int folego){
            this.nome = nome;
            this.folego = folego;
        }

        //metodos
        public void agir(int penalidade){
            this.folego -= penalidade;

            System.out.println(this.nome+ " perdeu " +penalidade+
            " de folego, agora restam " +this.folego);
        }

        public void morrer(){
            if (this.folego <= 0){
                System.out.println(this.nome + " chegou a 0 de folego, "
                +this.nome+ " colapsou e morreu." );
            }
        }

        public String getName(){
            return this.nome;
        }
    }
