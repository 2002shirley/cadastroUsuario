
import java.util.ArrayList;
import java.util.Scanner;


public class Cadastro {
   ArrayList<Cadastro> lista = new ArrayList<>(); 

    private String nome;
    private int idade;
    private String cpf;

    // funções 
    public void listar() {
        if (lista.isEmpty()) {
            System.out.println("Não há nenhum Cadastro: ");
        } else {
            System.out.println("Lista de Cadastro: ");  
                for(Cadastro u : lista){
                    exibir(u);
                }
            }

        }

    public void cadastrar(){
         Scanner s = new Scanner(System.in);
         System.out.println("Digite o seu nome:");
         String nome = s.nextLine();
         
         System.out.println("Digite seu cpf: ");
         String cpf = s.nextLine();
         
         System.out.println("Digite sua idade:");
         int idade = s.nextInt();
         
         
         Cadastro u = new Cadastro(nome, idade, cpf);
         lista.add(u);
     }
     
    public Cadastro(String nome, int idade, String cpf) {
        this.setNome (nome);
        this.setIdade (idade);
        this.setCpf (cpf);
 
    }
    
    public Cadastro() {
        
    }
    
    public void exibir(Cadastro u){
        System.out.println(u.getNome());
        System.out.println(u.getIdade());
        System.out.println(u.getCpf());
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
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}