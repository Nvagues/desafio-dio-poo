package one.digitalinnovation.basecamp;

public class Treinamento{

    public static void main(String[]args){


        int i;
        //int i;Não se pode criatr variaveis com o mesmo nome
        int I;
        //int 1a;// Não se pode começar variavel com numero
        //int_1a;
        //int $aq;// Não da erro no codigo mas não é uma boa pratica

        i=5;
        I=10;
        //_1a=20;
        //$aq=25;

        final int j =10;
        //j=15//Não se pode mudar o valor da variavel J
        int asrn24678md;
        //int asrn2468 md;//Não se pode ter espaço;
        //int asrn2468_78%12//Não incluir caracter especial;
        int asrn$4678_md;



        asrn24678md = 21;
        asrn$4678_md = 29;
        int quantidadeProduto=100;
        //int QuantidadeProduto;//não iniciar com letra maiscula
        final int NUMERO_TENTATIVAS = 150;
        //final int numeroTentativas = 150;
        int QUANTIDADE_OPCOES = 28;
        //int qtdProd; inexpressiva

        System.out.println(i);
        System.out.println(I);


        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn$4678_md);


        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS );
        System.out.println(QUANTIDADE_OPCOES);





    }
}
