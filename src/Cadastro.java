import java.util.ArrayList;
import java.util.Scanner;
public class Cadastro {
   ArrayList<Cadastro> lista = new ArrayList<>(); 
    private String nome;
    private int idade;
    private String cpf;

    // funções 
    public void listar(){
      if (lista.isEmpty()){
          System.out.println("Não há nenhum Cadastro: ");
          
      }else{
          System.out.println("Lista de Cadastro: ");
          
      }
     
    }
     public void cadastrar(){
         Scanner s = new Scanner(System.in);
         System.out.println("Digite o seu nome:");
         String nome;
         nome = s.nextLine();
         System.out.println("Digite sua idade:");
         int idade;
         idade = s.nextInt();
         System.out.println("Digite seu cpf: ");
         String cpf;
         cpf = s.nextLine();
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
