// Classe principal do programa
public class exemplo_class {
    public static void main(String[] args) {
        System.out.println("=== Demonstração de Classes em Java ===\n");
        
        // Testando classe simples
        ClasseSimples obj1 = new ClasseSimples();
        obj1.metodoSimples();
        
        // Testando classe com construtor
        ClasseComConstrutor obj2 = new ClasseComConstrutor("João", 25);
        obj2.exibirInfo();
        
        // Testando classe com métodos estáticos
        ClasseEstatica.metodoEstatico();
        System.out.println("Contador: " + ClasseEstatica.getContador());
        
        // Testando herança
        Animal animal = new Animal("Rex");
        animal.emitirSom();
        
        Cachorro cachorro = new Cachorro("Buddy", "Golden Retriever");
        cachorro.emitirSom();
        cachorro.latir();
        
        // Testando classe abstrata e interface
        Carro carro = new Carro("Toyota", 4);
        carro.acelerar();
        carro.ligar();
        
        // Testando enum
        System.out.println("\nTestando Enum:");
        for (DiaSemana dia : DiaSemana.values()) {
            System.out.println(dia + " - " + dia.getTipo());
        }
    }
}

// 1. Classe Simples - sem construtor, apenas métodos
class ClasseSimples {
    private String mensagem = "Olá da classe simples!";
    
    public void metodoSimples() {
        System.out.println(mensagem);
    }
    
    public String getMensagem() {
        return mensagem;
    }
    
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}

// 2. Classe com Construtor e Atributos
class ClasseComConstrutor {
    private String nome;
    private int idade;
    
    // Construtor
    public ClasseComConstrutor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    // Construtor padrão
    public ClasseComConstrutor() {
        this.nome = "Sem nome";
        this.idade = 0;
    }
    
    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
    
    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
}

// 3. Classe com Métodos e Atributos Estáticos
class ClasseEstatica {
    private static int contador = 0;
    public static final String CONSTANTE = "Valor constante";
    
    static {
        System.out.println("Bloco estático executado!");
        contador = 10;
    }
    
    public static void metodoEstatico() {
        contador++;
        System.out.println("Método estático executado. Contador: " + contador);
    }
    
    public static int getContador() {
        return contador;
    }
}

// 4. Herança - Classe Pai
class Animal {
    protected String nome;
    
    public Animal(String nome) {
        this.nome = nome;
    }
    
    public void emitirSom() {
        System.out.println(nome + " faz algum som...");
    }
    
    public String getNome() {
        return nome;
    }
}

// 5. Herança - Classe Filha
class Cachorro extends Animal {
    private String raca;
    
    public Cachorro(String nome, String raca) {
        super(nome); // Chama construtor da classe pai
        this.raca = raca;
    }
    
    @Override
    public void emitirSom() {
        System.out.println(nome + " late: Au au!");
    }
    
    public void latir() {
        System.out.println(nome + " está latindo alto!");
    }
    
    public String getRaca() {
        return raca;
    }
}

// 6. Classe Abstrata
abstract class Veiculo {
    protected String marca;
    protected int numeroRodas;
    
    public Veiculo(String marca, int numeroRodas) {
        this.marca = marca;
        this.numeroRodas = numeroRodas;
    }
    
    // Método abstrato - deve ser implementado pelas classes filhas
    public abstract void acelerar();
    
    // Método concreto
    public void exibirInfo() {
        System.out.println("Marca: " + marca + ", Rodas: " + numeroRodas);
    }
}

// 7. Interface
interface Ligavel {
    void ligar();
    void desligar();
    
    // Método default (Java 8+)
    default void status() {
        System.out.println("Status do dispositivo");
    }
}

// 8. Classe que herda de abstrata e implementa interface
class Carro extends Veiculo implements Ligavel {
    private boolean ligado = false;
    
    public Carro(String marca, int numeroRodas) {
        super(marca, numeroRodas);
    }
    
    @Override
    public void acelerar() {
        if (ligado) {
            System.out.println("Carro " + marca + " acelerando...");
        } else {
            System.out.println("Ligue o carro primeiro!");
        }
    }
    
    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Carro " + marca + " ligado!");
    }
    
    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Carro " + marca + " desligado!");
    }
}

// 9. Enum
enum DiaSemana {
    SEGUNDA("Útil"),
    TERCA("Útil"),
    QUARTA("Útil"),
    QUINTA("Útil"),
    SEXTA("Útil"),
    SABADO("Final de semana"),
    DOMINGO("Final de semana");
    
    private String tipo;
    
    DiaSemana(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }
}

// 10. Classe Interna
class ClasseExterna {
    private String dadoExterno = "Dado da classe externa";
    
    // Classe interna não estática
    class ClasseInterna {
        public void acessarDadoExterno() {
            System.out.println("Acessando: " + dadoExterno);
        }
    }
    
    // Classe interna estática
    static class ClasseInternaEstatica {
        public void metodo() {
            System.out.println("Método da classe interna estática");
        }
    }
}