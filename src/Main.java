
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Cadastro cadastrar = new Cadastro();
        Scanner scan = new Scanner(System.in);
        int escolha;
        do {
            System.out.println("-------------------------------------");
            System.out.println("1-Cadastrar usuário\n2-Listar usuários\n3-Sair");
            System.out.println("");
            System.out.print("Digite aqui: ");
            escolha = scan.nextInt();
            
            System.out.println("");

            switch (escolha) {
                case 1:
                    cadastrar.cadastrar();
                    break;
                case 2:
                    cadastrar.listar();
                    break;
                case 3:
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Número inválido");
            }
        } while (escolha != 3);

    }
}
