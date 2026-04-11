
import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {

    ArrayList<Cadastro> lista = new ArrayList<>();

    private String nome;
    private int idade;
    private String cpf;
    public int cont=0;

    public void listar() {
        if (lista.isEmpty()) {
            System.out.println("Não há nenhum Cadastro: ");
        } else {
            System.out.println("Quantidade de pessoas cadastradas: "+cont);
            System.out.println("Lista de Cadastro: ");
            for (Cadastro u : lista) {
                exibir(u);
            }
        }
    }
    public void cadastrar() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String nome = s.nextLine();

        System.out.println("Digite seu cpf: ");
        String cpf = s.nextLine();

        System.out.println("Digite sua idade:");
        setIdade(s.nextInt());

        System.out.println("");

        Cadastro u = new Cadastro(nome, getIdade(), cpf);
        lista.add(u);
        cont++;
    }

    public Cadastro(String nome, int idade, String cpf) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setCpf(cpf);

    }

    public Cadastro() {
    }

    public void exibir(Cadastro u) {
        System.out.println(u.getNome());
        System.out.println(u.getIdade());
        System.out.println(u.getCpf());
        System.out.println("");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;

    }
    public void setIdade(int idade) {
        do {
            Scanner s = new Scanner(System.in);
            if (idade >= 1 && idade <= 150) {
                this.idade = idade;
            } else {
                System.out.println("Idade inválida: ");

                System.out.println("Digite sua idade:");
                idade = s.nextInt();
            }
        } while (idade < 1 || idade > 150);
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
