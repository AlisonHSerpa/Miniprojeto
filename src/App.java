import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //personagens e objetos
        Scanner sc = new Scanner(System.in);
        Character jogador = new Character();
        Character suspeito1 = new Character ("meu suspeito");
        Character suspeito2 = new Character("suspeito novo");
        
        //capituo 1
        String cap1 ="'15 de setembro, 20 horas, um dia chuvoso, como os meus costumam sempre ser,"
        +"meu primeiro caso está quase no fim, persigo sorrateiramente meu suspeito, "
        +"estou armado so por segurança, ele acaba virando a esquerda na avenida Boulevard, "
        +"conheço esse beco, é sem saida.'";
        String op1 = "entrar escondido";
        String op2 = "entrar junto";

        //caítulo 2
        String cap2 = "'eu entro escondido, esperando alguns segundos encostado na parede, "
        +"vou espiar antes de entrar, vejo o suspeito falando com alguém de sobretudo, "
        +"não consigo ouvir o que estão dizendo, apos agluns segundos,"
        +"vejo os dois sacarem suas armas um contra o outro! preciso agir rapido! "
        +"o que preciso fazer?'";
        String op3 = "atirar no novo suspeito";
        String op4 = "atirar no meu suspeito";

        //executar o livro
        System.out.println("esse registro esta no nome de:");
        jogador.nome = sc.nextLine();

        int endcap = escolher(sc,cap1,op1,op2);
        if (endcap == 2){
            suspeito1.atirar(jogador);
            suspeito2.atirar(jogador);
            String end1 = "'Este foi o ultimo registro escrito no caderno do detetive "
            + jogador.nome + ", que triste, estava tao confiante e morreu com 2 tiros no peito... "
            +"uma arma normal nao teria feito isso sozinha, pois tinham balas de calibres "
            +"diferentes, provavelmente havia outra pessoa nesse beco... mas quem?'.....fim..?";
            System.out.println(end1);
        }
        else {
            jogador.agir();
            endcap = escolher(sc,cap2,op3,op4);
            if (endcap == 1){
                System.out.println("'nao tenho tempo! se eu atirar no meu suspeito agora nao "
                +"poderei interroga-lo depois, tenho que salva-lo!'...");
                jogador.atirar(suspeito2);
                suspeito1.atirar(suspeito2);
                
                String end2 = "'apos conversar com " + suspeito1.nome
                +" depois de salva-lo, conclui sua inocencia, pois o homem que atirei "
                +"tinha consigo provas de que estava chantageando meu suspeito para que ele "
                +"cometesse atos ilicitos, que bom que tomei a decisao certa, mais uma vez "
                +"a justica vence... mas...foi pura sorte...preciso melhorar como detetive'....fim.";
                System.out.println(end2);
            }
            else {
                System.out.println("'acredito nos meus instintos! meu suspeito deve ser o culpado!'... ");
                jogador.atirar(suspeito1);
                suspeito2.atirar(suspeito1);

                String end3 = "'como pude cometer um erro desses? o" + suspeito2.nome
                +" fugiu, mas deixou na cena do "
                +"crime uma foto que comprova que meu suspeito estava sendo chantageado...droga "
                +"essas coisas nao ensinam na academia... o capitao deixou meu erro passar com "
                +"um simples afastamento de 1 semana... eu deveria perder meu distintivo... mas "
                +"o capitao me disse para nao perder a fe e melhorar como detetive, preciso "
                +"compensar com trabalho esse erro grotesco' registro final do detetive " + jogador.nome;
                System.out.println(end3);
            }
        }
        sc.close();
    }

    public static void anunciar (String cap, String op1, String op2){
        System.out.println(cap);
        System.out.println(op1 + " / " + op2);
    }

    public static int escolher (Scanner sc, String cap, String op1, String op2){
         while(true){
            anunciar (cap,op1,op2);
            String escolha1 = sc.nextLine();
            
            if (escolha1 .equals(op1)){
                return 1;
            }
            else if (escolha1 .equals(op2)) {
                return 2;
            }
            else {
                System.out.println("voce digitou incorretamente, tente de novo:" + escolha1);
            }
        }
    }
}
