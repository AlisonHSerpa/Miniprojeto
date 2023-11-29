public class Escolha {
    private String escolha;
    private Capitulo proximocapitulo;
    
    Escolha (String escolha, Capitulo capitulo){
        this.escolha = escolha;
        this.proximocapitulo = capitulo;
    }

    public Capitulo getProximoCapitulo (){
        return this.proximocapitulo;
    }

    public String getEscolha(){
        return this.escolha;
    }
}