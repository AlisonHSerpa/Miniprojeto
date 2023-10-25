import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Historia: investigação
        Scanner sc = new Scanner(System.in);
        
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
        int endcap = escolher(sc,cap1,op1,op2);
        if (endcap == 2){
            String end1 = "Este foi o ultimo registro escrito no caderno desse detetive "
            +"novato, que triste, estava tao confiante e morreu com 6 tiros no peito... "
            +"uma arma normal nao teria feito isso sozinha pois tinham balas de calibres "
            +"diferentes, provavelmente havia outra pessoa nesse beco... mas quem?.....fim..?";
            System.out.println(end1);
        }
        else {
            endcap = escolher(sc,cap2,op3,op4);
            if (endcap == 1){
                String end2 = "'nao tenho tempo! se eu atirar no meu suspeito agora nao "
                +"poderei interroga-lo depois, tenho que salva-lo!'...'apos conversar com "
                +"meu suspeito depois de salva-lo, conclui sua inocencia, o homem que atirei "
                +"tinha consigo provas de que estava chantageando meu suspeito para que ele "
                +"cometesse atos ilicitos, que bom que tomei a decisao certa, mais uma vez "
                +"a justica vence... mas...foi pura sorte...preciso melhorar como detetive'....fim.";
                System.out.println(end2);
            }
            else {
                String end3 = "'acredito nos meus instintos! meu suspeito deve ser o culpado!'... "
                +"'como pude cometer um erro desses? o novo suspeito fugiu, mas deixou na cena do "
                +"crime uma foto que comprova que meu suspeito estava sendo chantageado...droga "
                +"essas coisas nao ensinam na academia... o capitao deixou meu erro passar com "
                +"um simples afastamento de 1 semana... eu deveria perder meu distintivo... mas "
                +"o capitao me disse para nao perder a fe e melhorar como detetive, preciso "
                +"compensar com trabalho esse erro grotesco'...fim.";
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
            
            //devolver 1 se for a primeira opcao, 2 se for a segunda, repetir se n for nenhuma
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
