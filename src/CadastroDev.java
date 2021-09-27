import java.util.Scanner;

public class CadastroDev {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cabecalho();
        escolhaMenu();

    }

    public static void cabecalho(){
        System.out.println("=============================Seja Bem-vindes! =================================== \n++++++++CADASTRO DEV CAP +++++++++");

    }

    public static void menu(){
        System.out.println("\nEscolha uma opção: \n 1-Cadastrar Desenvolvedor \n 2-Cadastrar Linguagem \n 3-Sair");
    }

    public static void escolhaMenu() {

        boolean invalido = true;
        do {
            menu();
            int opcao = numero("Digite uma opção:");

            switch (opcao){

                case 1:
                    String nome = cadastroDev("Digite o seu nome: ");
                    String sobrenome = cadastroDev("Digite sobrenome: ");
                    String senioridade = cadastroDev("Digite o nível de senioridade: ");
                    int idade = numero("Digite sua idade:");
                    System.out.println("\n---------- Cadastro Finalizado -----------\n" );
                    System.out.printf("Nome: %s %s\n",nome,sobrenome);
                    System.out.printf("Senioridade : %s \n",senioridade);
                    System.out.printf("Idade : %d \n",idade);



                    invalido = true;
                    break;

                case 2 :
                    String Linguagem = linguagem("Linguagem\n Digite dentro destas opções \n Java \n Javascript \n Phyton \n C \n PHP ");
                    String Descricao = cadastroDev("Digite a descrição da linguagem escolhida");
                    String Aplicacao = aplicacoes("Aplicações\n Digite dentro destas opções \n Front-End \n Back-End \n Mobile");
                    System.out.println("\n---------- Cadastro Finalizado -----------\n" );
                    System.out.printf("Linguagem: %s \n",Linguagem);
                    System.out.printf("Descrição: %s \n",Descricao);
                    System.out.printf("Aplicação: %s \n",Aplicacao);
                    invalido = true;
                    break;

                case 3 :
                    invalido = false;
                    System.out.println("Volte sempre!");
                    break;

                default:
                    System.out.println("Opção inválida /digite novamente");
                    invalido = true;
            }


        }while(invalido);



    }

    static String cadastroDev(String entrada){
        String texto;
        boolean valida_texto;
        do {
            System.out.println(entrada);
            texto = sc.nextLine();
            valida_texto = validaTexto(texto);

        }while(valida_texto);
        return texto;
    }

    static String aplicacoes(String entrada){
        boolean valida_aplicacao;
        String texto;

        do{
            System.out.println(entrada);
            texto = sc.nextLine();
            valida_aplicacao = validaAplicacao(texto);

        }while(!valida_aplicacao);
        return texto;


    }

    static String linguagem(String entrada){

        boolean valida_linguagem;
        String texto ;

        do{
            System.out.println(entrada);
            texto = sc.nextLine();
            valida_linguagem = validaLinguagem(texto);
        }while (!valida_linguagem);
        return texto;

    }

    static int numero(String mensagem){
        boolean valida_numero;
        int numero;

        do {
            System.out.println(mensagem);
            numero = Integer.parseInt(sc.nextLine());
            valida_numero = validaNumero(numero);
        } while (!valida_numero);
        return numero;

    }

    static boolean validaTexto(String texto) {
        if (texto.length() < 4) {
            System.out.println("É necessário ter mais que três caracteres");
            return true;
        } else {
            return false;
        }
    }

    static boolean validaLinguagem(String texto){
        if(texto.equals("Java") || texto.equals("Javascript") || texto.equals("Phyton") || texto.equals("C") || texto.equals("PHP")){
            return true;
        }
        System.out.println("Digite corretamente");
        return false;
    }


    static boolean validaAplicacao(String texto){
        if(texto.equals("Front-End") || texto.equals("Back-End") || texto.equals("Mobile")){
            return true;
        }
        System.out.println("Digite corretamente");
        return false;
    }

    static boolean validaNumero(int idade){
        if(idade <= 0){
            System.out.println("Digite um número maior que zero \n Digite novamente \n");
            return false;
        }
        return true;
    }


}

