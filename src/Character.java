public class Character {
        //caracteristicas
        private String nome;
        private int sanidade = 3;

        //construtores
        Character(String nome){
            this.nome = nome;
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
