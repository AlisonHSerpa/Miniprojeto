import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //personagens e objetos
        Scanner sc = new Scanner(System.in);
        Character jogador = new Character();
        Character suspeito1 = new Character ("primeiro suspeito");
        Character suspeito2 = new Character("segundo suspeito");
        
        //capituo 1
        String cap1 ="'15 de Setembro, 20 horas, um dia chuvoso, como os meus costumam sempre ser,"
        +"meu primeiro caso está quase no fim, persigo sorrateiramente meu suspeito, "
        +"estou armado so por segurança, ele acaba virando a esquerda na avenida Boulevard, "
        +"conheço esse beco, eh sem saida.'";
        String op1 = "entrar escondido";
        String op2 = "entrar junto";
        Capitulo capitulo1 = new Capitulo(jogador, "perseguir", cap1, op1, op2, 0);

        //caítulo 2
        String cap2 = "'eu entro escondido, esperando alguns segundos encostado na parede, "
        +"vou espiar antes de entrar, vejo o suspeito falando com alguém de sobretudo, "
        +"não consigo ouvir o que estão dizendo, apos agluns segundos,"
        +"vejo os dois sacarem suas armas um contra o outro! preciso agir rapido! "
        +"o que preciso fazer?'";
        String op3 = "atirar no novo suspeito";
        String op4 = "atirar no meu suspeito";
        Capitulo capitulo2 = new Capitulo(jogador, "salve e condene", cap2, op3, op4, 1);

        //final 1
        String end1 = "'Este foi o ultimo registro escrito no caderno do detetive "
        +"falecido, que triste, estava tao confiante e morreu com 2 tiros no peito... "
        +"uma arma normal nao teria feito isso sozinha, pois tinham balas de calibres "
        +"diferentes, provavelmente havia outra pessoa nesse beco... mas quem?'.....fim..?";
        Capitulo final1 = new Capitulo(jogador, "erro de principiante", end1, 3);

        //final 2
        String end2 = "'apos conversar com meu primeiro suspeito"
        +" depois de salva-lo, conclui sua inocencia, pois o homem que atirei "
        +"tinha consigo provas de que estava chantageando meu suspeito para que ele "
        +"cometesse atos ilicitos, que bom que tomei a decisao certa, mais uma vez "
        +"a justica vence... mas...foi pura sorte...preciso melhorar como detetive'....fim.";
        Capitulo final2 = new Capitulo(jogador, "instinto natural" , end2, 0);

        //final 3
        String end3 = "'como pude cometer um erro desses? o novo suspeito"
        +" fugiu, mas deixou na cena do "
        +"crime uma foto que comprova que meu suspeito estava sendo chantageado...droga "
        +"essas coisas nao ensinam na academia... o capitao deixou meu erro passar com "
        +"um simples afastamento de 1 semana... eu deveria perder meu distintivo... mas "
        +"o capitao me disse para nao perder a fe e melhorar como detetive, preciso "
        +"compensar com trabalho esse erro grotesco' registro final";
        Capitulo final3 = new Capitulo(jogador, "eu estava errado" ,end3, 2);


        //executar o livro
        System.out.println("esse registro esta no nome de:");
        jogador.nome = sc.nextLine();

        if (capitulo1.escolher() == 2){
            suspeito1.atirar(jogador);
            suspeito2.atirar(jogador);
            final1.anunciar();
        }
        else {
            if (capitulo2.escolher() == 1){
                jogador.atirar(suspeito2);
                suspeito1.atirar(suspeito2);
                final2.anunciar();
            }
            else {
                jogador.atirar(suspeito1);
                suspeito2.atirar(suspeito1);
                final3.anunciar();
            }
        }
        sc.close();
    }
}
