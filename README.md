# 📚 Guia Completo de Programação Orientada a Objetos em Java do Nicolau

## 🚀 **Introdução: O que é uma Classe?**

Imagine que você quer construir carros. Antes de construir, você precisa de um **projeto** (plantas, especificações). Em programação:

- **🏗️ Classe** = O projeto/molde (como construir)
- **🚗 Objeto** = O carro real construído a partir do projeto

**Exemplo do mundo real:**
```
Projeto de Casa (Classe) → Casa Real (Objeto)
Receita de Bolo (Classe) → Bolo Pronto (Objeto)
Planta de Carro (Classe) → Carro Fabricado (Objeto)
```

---

## 📋 **Estrutura Básica de um Programa Java**

Todo programa Java segue esta estrutura obrigatória:

```java
public class NomeDaClasse {
    public static void main(String[] args) {
        // Aqui vai o código que será executado
    }
}
```

**Por que essa estrutura?**
- `public class` = Declara uma classe pública
- `main` = Método especial onde o programa começa
- `String[] args` = Permite receber dados externos

---

## 🎓 **Conceitos Fundamentais da POO**

### **1. Encapsulamento** 🔒
"Esconder os detalhes internos e mostrar apenas o necessário"

**Analogia:** Como um carro - você não precisa saber como o motor funciona internamente para dirigir.

### **2. Herança** 👨‍👩‍👧‍👦
"Uma classe filha herda características da classe pai"

**Analogia:** Filhos herdam características dos pais (cor dos olhos, altura).

### **3. Polimorfismo** 🎭
"Mesmo método, comportamentos diferentes"

**Analogia:** A palavra "correr" - uma pessoa corre diferente de um cachorro.

### **4. Abstração** 🎨
"Focar no que é importante, ignorar detalhes complexos"

**Analogia:** Quando você liga a TV, não pensa nos circuitos internos.

---

## 📖 **Explicação Detalhada de Cada Tipo de Classe**

### **1. 🏠 Classe Principal (Ponto de Entrada)**

```java
public class exemplo_class {
    public static void main(String[] args) {
        System.out.println("=== Demonstração de Classes em Java ===\n");
        // Todo o código de demonstração fica aqui
    }
}
```

**📝 Explicação Palavra por Palavra:**

- **`public`** = "Qualquer um pode ver/usar esta classe"
- **`class`** = "Estou criando uma classe"
- **`exemplo_class`** = Nome da nossa classe (deve ser igual ao nome do arquivo)
- **`{}`** = Delimita o início e fim da classe
- **`public static void main`** = Método especial que roda primeiro
- **`String[] args`** = Lista de textos que podem ser passados para o programa
- **`System.out.println`** = Comando para mostrar texto na tela

**🎯 Quando usar:** Toda aplicação Java precisa de uma classe principal com método main.

---

### **2. 🧱 Classe Simples (Fundamentos)**

```java
class ClasseSimples {
    // ATRIBUTO (característica da classe)
    private String mensagem = "Olá da classe simples!";
    
    // MÉTODO (ação que a classe pode fazer)
    public void metodoSimples() {
        System.out.println(mensagem);
    }
    
    // GETTER (método para LER o atributo)
    public String getMensagem() {
        return mensagem;  // retorna o valor da mensagem
    }
    
    // SETTER (método para MODIFICAR o atributo)
    public void setMensagem(String novaMensagem) {
        this.mensagem = novaMensagem;  // this = "este objeto"
    }
}
```

**📝 Explicação Detalhada:**

**🔹 Atributos (Variáveis da Classe):**
- **`private`** = "Apenas esta classe pode ver este dado"
- **`String mensagem`** = Variável que guarda texto
- **Inicialização** = `= "Olá..."` define valor inicial

**🔹 Métodos (Funções da Classe):**
- **`public void`** = "Todos podem usar, não retorna nada"
- **`return`** = Devolve um valor para quem chamou o método
- **`this.`** = Referência ao objeto atual (diferencia atributo de parâmetro)

**🔹 Getters e Setters:**
- **Getter** = Método para LER dados privados (get + NomeDoAtributo)
- **Setter** = Método para ALTERAR dados privados (set + NomeDoAtributo)

**🎯 Por que usar private + getters/setters?**
- **Segurança:** Controla como os dados são acessados
- **Validação:** Pode verificar se os dados são válidos antes de alterar
- **Flexibilidade:** Pode mudar implementação interna sem afetar quem usa

**📱 Como usar:**
```java
ClasseSimples obj = new ClasseSimples();  // Cria objeto
obj.metodoSimples();                       // Chama método
obj.setMensagem("Nova mensagem");          // Altera valor
String texto = obj.getMensagem();          // Lê valor
```

---

### **3. 🏗️ Classe com Construtores (Inicialização)**

```java
class ClasseComConstrutor {
    // ATRIBUTOS da classe
    private String nome;
    private int idade;
    
    // CONSTRUTOR PARAMETRIZADO (recebe valores)
    public ClasseComConstrutor(String nome, int idade) {
        this.nome = nome;    // this.nome = atributo da classe
        this.idade = idade;  // nome = parâmetro recebido
    }
    
    // CONSTRUTOR PADRÃO (sem parâmetros)
    public ClasseComConstrutor() {
        this.nome = "Sem nome";  // Valores padrão
        this.idade = 0;
    }
    
    // MÉTODO para mostrar informações
    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
    
    // GETTERS E SETTERS
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { 
        if (idade >= 0) {  // Validação simples
            this.idade = idade; 
        }
    }
}
```

**📝 O que é um Construtor?**

Um construtor é um método especial que roda automaticamente quando você cria um objeto. É como "configurar" o objeto no momento da criação.

**🔹 Características dos Construtores:**
- **Nome igual à classe:** `ClasseComConstrutor()`
- **Sem tipo de retorno:** Nem `void`, nem outro tipo
- **Executado automaticamente:** Quando você usa `new`
- **Pode ter vários:** Sobrecarga de construtores

**🔹 Sobrecarga de Construtores:**
"Ter múltiplos construtores com parâmetros diferentes"

```java
// Construtor 1: Sem parâmetros
public ClasseComConstrutor() { ... }

// Construtor 2: Com parâmetros
public ClasseComConstrutor(String nome, int idade) { ... }
```

**📱 Como usar:**
```java
// Usando construtor padrão
ClasseComConstrutor pessoa1 = new ClasseComConstrutor();

// Usando construtor com parâmetros
ClasseComConstrutor pessoa2 = new ClasseComConstrutor("João", 25);

pessoa1.exibirInfo();  // Nome: Sem nome, Idade: 0
pessoa2.exibirInfo();  // Nome: João, Idade: 25
```

**🎯 Quando usar cada construtor?**
- **Sem parâmetros:** Quando você quer criar objeto vazio e definir dados depois
- **Com parâmetros:** Quando você já sabe os dados iniciais

---

### **4. ⚡ Classe com Elementos Estáticos (Compartilhados)**

```java
class ClasseEstatica {
    // ATRIBUTO ESTÁTICO (pertence à CLASSE, não ao objeto)
    private static int contador = 0;
    
    // CONSTANTE (valor que nunca muda)
    public static final String CONSTANTE = "Valor constante";
    
    // BLOCO ESTÁTICO (executa UMA VEZ quando classe é carregada)
    static {
        System.out.println("Bloco estático executado!");
        contador = 10;  // Inicialização especial
    }
    
    // MÉTODO ESTÁTICO (pode ser chamado sem criar objeto)
    public static void metodoEstatico() {
        contador++;  // Incrementa contador
        System.out.println("Método estático executado. Contador: " + contador);
    }
    
    // GETTER ESTÁTICO para o contador
    public static int getContador() {
        return contador;
    }
}
```

**📝 O que significa "STATIC"?**

**🔹 Sem static (normal):**
- Pertence ao **OBJETO**
- Cada objeto tem sua própria cópia
- Precisa criar objeto para usar

**🔹 Com static:**
- Pertence à **CLASSE**
- Compartilhado entre todos os objetos
- Pode usar sem criar objeto

**📊 Exemplo Visual:**
```
Classe: Pessoa
├── static contador = 5        ← UMA cópia para toda a classe
├── Object pessoa1:
│   ├── nome = "João"         ← Cópia individual
│   └── idade = 25            ← Cópia individual  
├── Object pessoa2:
│   ├── nome = "Maria"        ← Cópia individual
│   └── idade = 30            ← Cópia individual
└── contador = 5               ← MESMA para todos
```

**🔹 Tipos de Elementos Estáticos:**

1. **Atributo Static:** Uma variável compartilhada
2. **Método Static:** Função que não precisa de objeto
3. **Bloco Static:** Código que roda uma vez quando classe é carregada
4. **Constante (final):** Valor que nunca muda

**📱 Como usar:**
```java
// Chamando método estático (SEM criar objeto)
ClasseEstatica.metodoEstatico();           // ✅ Correto
int valor = ClasseEstatica.getContador();  // ✅ Correto

// ERRO: Não funciona porque precisa de objeto
// ClasseEstatica obj = new ClasseEstatica();
// obj.metodoEstatico();  // ❌ Funciona mas não é recomendado
```

**🎯 Quando usar static?**
- **Utilidades gerais:** Métodos matemáticos, conversões
- **Contadores globais:** Quantos objetos foram criados
- **Constantes:** Valores que nunca mudam (PI, configurações)
- **Factory methods:** Métodos que criam objetos

---

### **5. 👨‍👩‍👧‍👦 Herança (Relacionamento "É UM")**

#### **🐾 Classe Pai (Superclasse)**

```java
class Animal {
    // ATRIBUTO PROTEGIDO (classes filhas podem acessar)
    protected String nome;
    
    // CONSTRUTOR da classe pai
    public Animal(String nome) {
        this.nome = nome;
        System.out.println("Animal " + nome + " foi criado!");
    }
    
    // MÉTODO que pode ser sobrescrito
    public void emitirSom() {
        System.out.println(nome + " faz algum som...");
    }
    
    // MÉTODO que será herdado
    public void dormir() {
        System.out.println(nome + " está dormindo...");
    }
    
    // GETTER
    public String getNome() {
        return nome;
    }
}
```

#### **🐕 Classe Filha (Subclasse)**

```java
class Cachorro extends Animal {
    // ATRIBUTO ESPECÍFICO da classe filha
    private String raca;
    
    // CONSTRUTOR da classe filha
    public Cachorro(String nome, String raca) {
        super(nome);    // Chama construtor da classe PAI
        this.raca = raca;
        System.out.println("Cachorro da raça " + raca + " foi criado!");
    }
    
    // SOBRESCRITA de método (comportamento específico)
    @Override
    public void emitirSom() {
        System.out.println(nome + " late: Au au!");
    }
    
    // MÉTODO ESPECÍFICO da classe filha
    public void latir() {
        System.out.println(nome + " está latindo alto!");
    }
    
    public void buscarOsso() {
        System.out.println(nome + " está procurando um osso!");
    }
    
    // GETTER específico
    public String getRaca() {
        return raca;
    }
}
```

**📝 Explicação Detalhada da Herança:**

**🔹 `extends` - Palavra Mágica:**
```java
class Cachorro extends Animal
```
Significa: "Cachorro É UM Animal" + características extras

**🔹 O que a classe filha GANHA:**
- ✅ Todos os atributos public/protected do pai
- ✅ Todos os métodos public/protected do pai  
- ✅ Pode adicionar seus próprios atributos/métodos
- ✅ Pode modificar comportamento (override)

**🔹 `super()` - Chamando o Pai:**
```java
super(nome);  // Chama construtor do pai
super.metodo();  // Chama método do pai
```

**🔹 `@Override` - Modificando Comportamento:**
```java
@Override  // Anotação que indica sobrescrita
public void emitirSom() {
    // Novo comportamento específico para Cachorro
}
```

**🔹 Modificadores de Acesso em Herança:**

| Modificador | Classe Pai | Classe Filha | Outras Classes |
|-------------|------------|--------------|----------------|
| `private`   | ✅         | ❌           | ❌             |
| `protected` | ✅         | ✅           | ❌             |
| `public`    | ✅         | ✅           | ✅             |

**📱 Como usar Herança:**
```java
// Criando objetos
Animal animal = new Animal("Rex");
Cachorro dog = new Cachorro("Buddy", "Golden Retriever");

// Métodos herdados
animal.emitirSom();    // "Rex faz algum som..."
dog.emitirSom();       // "Buddy late: Au au!" (sobrescrito)

// Métodos específicos
dog.latir();           // Só Cachorro tem este método
dog.dormir();          // Herdado de Animal

// Polimorfismo (Animal pode "virar" Cachorro)
Animal animalGenerico = new Cachorro("Max", "Beagle");
animalGenerico.emitirSom();  // "Max late: Au au!"
```

**🎯 Quando usar Herança?**
- **Relação "É UM":** Cachorro É UM Animal
- **Reutilização de código:** Evita repetir código comum
- **Hierarquias:** Veiculo → Carro, Moto / Pessoa → Funcionario, Cliente

---

### **6. 🎨 Classe Abstrata (Template/Modelo)**

```java
abstract class Veiculo {
    // ATRIBUTOS comuns a todos os veículos
    protected String marca;
    protected int numeroRodas;
    
    // CONSTRUTOR (mesmo sendo abstrata, pode ter construtor)
    public Veiculo(String marca, int numeroRodas) {
        this.marca = marca;
        this.numeroRodas = numeroRodas;
        System.out.println("Veículo " + marca + " criado!");
    }
    
    // MÉTODO ABSTRATO (OBRIGATÓRIO implementar nas filhas)
    public abstract void acelerar();
    public abstract void frear();
    
    // MÉTODO CONCRETO (já implementado, pode ser usado)
    public void exibirInfo() {
        System.out.println("Marca: " + marca + ", Rodas: " + numeroRodas);
    }
    
    public void ligarFarol() {
        System.out.println("Faróis ligados!");
    }
    
    // GETTERS
    public String getMarca() { return marca; }
    public int getNumeroRodas() { return numeroRodas; }
}
```

**📝 O que é uma Classe Abstrata?**

Uma classe abstrata é como um **modelo incompleto** que define:
- ✅ O que TODAS as classes filhas devem ter (métodos abstratos)
- ✅ Código comum que pode ser reutilizado (métodos concretos)
- ❌ **NÃO pode ser instanciada** diretamente

**🔹 Características:**
- **`abstract class`** = Declara classe abstrata
- **`abstract method`** = Método sem implementação (só assinatura)
- **Métodos concretos** = Métodos normais com implementação
- **Construtor** = Pode ter (para inicializar atributos comuns)

**🎯 Analogia:**
Imagine uma "Receita de Bolo Abstrata":
- ✅ Define passos obrigatórios: misturar, assar, decorar
- ✅ Tem instruções comuns: pré-aquecer forno a 180°C
- ❌ Não especifica sabor (cada bolo decide: chocolate, morango)

**📱 Implementação obrigatória na classe filha:**
```java
class Motocicleta extends Veiculo {
    public Motocicleta(String marca) {
        super(marca, 2);  // Sempre 2 rodas
    }
    
    // OBRIGATÓRIO implementar métodos abstratos
    @Override
    public void acelerar() {
        System.out.println("Motocicleta acelerando com guidão!");
    }
    
    @Override
    public void frear() {
        System.out.println("Freando com punho!");
    }
}
```

---

### **7. 📋 Interface (Contrato)**

```java
interface Ligavel {
    // CONSTANTES (automaticamente public static final)
    String STATUS_LIGADO = "LIGADO";
    String STATUS_DESLIGADO = "DESLIGADO";
    
    // MÉTODOS ABSTRATOS (automaticamente public abstract)
    void ligar();
    void desligar();
    boolean estaLigado();
    
    // MÉTODO DEFAULT (implementação padrão - Java 8+)
    default void status() {
        System.out.println("Status: " + (estaLigado() ? STATUS_LIGADO : STATUS_DESLIGADO));
    }
    
    // MÉTODO ESTÁTICO (Java 8+)
    static void informacoesSistema() {
        System.out.println("Sistema de controle de energia v1.0");
    }
}
```

**📝 O que é uma Interface?**

Uma interface é um **CONTRATO** que define:
- ✅ O que uma classe DEVE fazer (métodos obrigatórios)
- ✅ Não diz COMO fazer (sem implementação)
- ✅ Uma classe pode implementar VÁRIAS interfaces

**🔹 Diferenças Interface vs Classe Abstrata:**

| Aspecto              | Interface           | Classe Abstrata     |
|---------------------|---------------------|---------------------|
| **Herança**         | Múltipla (várias)   | Simples (uma só)    |
| **Métodos**         | Abstratos + default | Abstratos + concretos |
| **Atributos**       | Só constantes       | Qualquer tipo       |
| **Construtor**      | ❌ Não              | ✅ Sim              |
| **Palavra-chave**   | `implements`        | `extends`           |

**🎯 Analogia:**
- **Interface** = Carteira de Habilitação (define que você PODE dirigir, não COMO)
- **Classe Abstrata** = Curso de Direção (ensina métodos básicos + você adapta)

**📱 Implementação da Interface:**
```java
class Smartphone implements Ligavel {
    private boolean ligado = false;
    
    @Override
    public void ligar() {
        ligado = true;
        System.out.println("📱 Smartphone ligado!");
    }
    
    @Override
    public void desligar() {
        ligado = false;
        System.out.println("📱 Smartphone desligado!");
    }
    
    @Override
    public boolean estaLigado() {
        return ligado;
    }
    
    // Método específico do smartphone
    public void fazerLigacao(String numero) {
        if (estaLigado()) {
            System.out.println("📞 Ligando para " + numero);
        } else {
            System.out.println("❌ Ligue o aparelho primeiro!");
        }
    }
}
```

---

### **8. 🚗 Implementação Múltipla (Herança + Interface)**

```java
class Carro extends Veiculo implements Ligavel {
    private boolean ligado = false;
    private String combustivel;
    
    public Carro(String marca, String combustivel) {
        super(marca, 4);  // Carro sempre tem 4 rodas
        this.combustivel = combustivel;
    }
    
    // Implementando métodos ABSTRATOS de Veiculo
    @Override
    public void acelerar() {
        if (ligado) {
            System.out.println("🚗 Carro " + marca + " acelerando com " + combustivel + "!");
        } else {
            System.out.println("❌ Ligue o carro primeiro!");
        }
    }
    
    @Override
    public void frear() {
        System.out.println("🛑 Carro freando com pedal!");
    }
    
    // Implementando métodos da INTERFACE Ligavel
    @Override
    public void ligar() {
        ligado = true;
        System.out.println("🔑 Carro " + marca + " ligado!");
    }
    
    @Override
    public void desligar() {
        ligado = false;
        System.out.println("🔑 Carro " + marca + " desligado!");
    }
    
    @Override
    public boolean estaLigado() {
        return ligado;
    }
}
```

**📝 Herança Múltipla em Java:**

Java não permite herdar de múltiplas CLASSES, mas permite implementar múltiplas INTERFACES:

```java
// ✅ PERMITIDO: Uma classe + várias interfaces
class MinhaClasse extends UmaClasse implements Interface1, Interface2, Interface3

// ❌ NÃO PERMITIDO: Múltiplas classes
class MinhaClasse extends Classe1, Classe2  // ERRO!
```

**🎯 Vantagens desta abordagem:**
- **Herança de código:** Reutiliza código da classe pai
- **Contratos múltiplos:** Pode implementar vários "contratos"
- **Flexibilidade:** Adapta comportamento conforme necessário

---

### **9. 🏷️ Enum (Constantes Inteligentes)**

```java
enum DiaSemana {
    // CONSTANTES do enum (cada uma é um objeto DiaSemana)
    SEGUNDA("Segunda-feira", "Útil", 1),
    TERCA("Terça-feira", "Útil", 2),
    QUARTA("Quarta-feira", "Útil", 3),
    QUINTA("Quinta-feira", "Útil", 4),
    SEXTA("Sexta-feira", "Útil", 5),
    SABADO("Sábado", "Final de semana", 6),
    DOMINGO("Domingo", "Final de semana", 7);
    
    // ATRIBUTOS de cada constante
    private final String nomeCompleto;
    private final String tipo;
    private final int numero;
    
    // CONSTRUTOR (sempre private em enums)
    DiaSemana(String nomeCompleto, String tipo, int numero) {
        this.nomeCompleto = nomeCompleto;
        this.tipo = tipo;
        this.numero = numero;
    }
    
    // MÉTODOS para acessar os atributos
    public String getNomeCompleto() { return nomeCompleto; }
    public String getTipo() { return tipo; }
    public int getNumero() { return numero; }
    
    // MÉTODO para verificar se é dia útil
    public boolean isDiaUtil() {
        return tipo.equals("Útil");
    }
    
    // MÉTODO estático para buscar por número
    public static DiaSemana porNumero(int numero) {
        for (DiaSemana dia : values()) {
            if (dia.numero == numero) {
                return dia;
            }
        }
        throw new IllegalArgumentException("Número inválido: " + numero);
    }
}
```

**📝 O que é um Enum?**

Um enum é uma classe especial que representa um **conjunto fixo de constantes**. É como ter uma lista de opções pré-definidas.

**🔹 Características dos Enums:**
- **Valores fixos:** Definidos na compilação, não mudam
- **Type Safety:** Garante que só valores válidos sejam usados
- **Podem ter atributos:** Cada constante pode ter dados associados
- **Podem ter métodos:** Comportamentos específicos
- **Herdam de Enum:** Automaticamente têm métodos como `values()`, `valueOf()`

**🎯 Analogias:**
- **Tamanhos de roupa:** P, M, G, GG (valores fixos)
- **Estados brasileiros:** SP, RJ, MG, etc. (conjunto limitado)
- **Status de pedido:** PENDENTE, PROCESSANDO, ENTREGUE

**📱 Como usar Enums:**
```java
// Usando constantes diretamente
DiaSemana hoje = DiaSemana.SEGUNDA;
System.out.println(hoje.getNomeCompleto());  // "Segunda-feira"

// Iterando sobre todos os valores
for (DiaSemana dia : DiaSemana.values()) {
    System.out.println(dia + " - " + dia.getTipo());
}

// Usando métodos específicos
if (DiaSemana.SABADO.isDiaUtil()) {
    System.out.println("Preciso trabalhar!");
} else {
    System.out.println("É fim de semana! 🎉");
}

// Comparando enums
DiaSemana dia1 = DiaSemana.SEGUNDA;
DiaSemana dia2 = DiaSemana.SEGUNDA;
if (dia1 == dia2) {  // ✅ Pode usar == com enums
    System.out.println("São o mesmo dia!");
}

// Usando em switch
switch (hoje) {
    case SEGUNDA:
        System.out.println("Começando a semana!");
        break;
    case SEXTA:
        System.out.println("Quase fim de semana!");
        break;
    default:
        System.out.println("Dia normal");
}
```

**🎯 Quando usar Enums?**
- **Conjuntos fixos:** Dias da semana, meses, cores básicas
- **Status/Estados:** Status de pedido, estado de conexão
- **Tipos/Categorias:** Tipos de usuário, categorias de produtos
- **Configurações:** Níveis de log (DEBUG, INFO, ERROR)

---

### **10. 🪆 Classes Internas (Classes dentro de Classes)**

```java
class ClasseExterna {
    private String dadoExterno = "Informação da classe externa";
    private static String dadoEstatico = "Dado estático compartilhado";
    
    // CLASSE INTERNA NÃO-ESTÁTICA (Inner Class)
    class ClasseInterna {
        private String dadoInterno = "Informação da classe interna";
        
        public void acessarDadoExterno() {
            // Pode acessar TODOS os membros da classe externa
            System.out.println("Acessando: " + dadoExterno);
            System.out.println("Acessando estático: " + dadoEstatico);
            
            // Também pode chamar métodos da classe externa
            metodoExterno();
        }
        
        public void mostrarRelacao() {
            System.out.println("Classe interna tem acesso total à externa!");
            System.out.println("Dado interno: " + dadoInterno);
        }
    }
    
    // CLASSE INTERNA ESTÁTICA (Static Nested Class)
    static class ClasseInternaEstatica {
        private String dadoEstaticInterno = "Dado da classe estática interna";
        
        public void metodo() {
            // Só pode acessar membros ESTÁTICOS da classe externa
            System.out.println("Acessando: " + dadoEstatico); // ✅ OK
            // System.out.println(dadoExterno);                // ❌ ERRO!
        }
        
        public void mostrarLimitacao() {
            System.out.println("Classe estática interna só acessa estáticos da externa");
            System.out.println("Meu dado: " + dadoEstaticInterno);
        }
    }
    
    // MÉTODO LOCAL (dentro de um método)
    public void metodoComClasseLocal() {
        final String variavelLocal = "Variável local";
        
        // CLASSE LOCAL (só existe dentro deste método)
        class ClasseLocal {
            public void acessarVariavelLocal() {
                // Pode acessar variáveis final/effectively final do método
                System.out.println("Acessando: " + variavelLocal);
                System.out.println("Acessando externo: " + dadoExterno);
            }
        }
        
        // Usando a classe local
        ClasseLocal objLocal = new ClasseLocal();
        objLocal.acessarVariavelLocal();
    }
    
    // CLASSE ANÔNIMA (para implementações rápidas)
    public void exemploClasseAnonima() {
        // Implementando interface Runnable de forma anônima
        Runnable tarefa = new Runnable() {
            @Override
            public void run() {
                System.out.println("Executando tarefa anônima!");
                System.out.println("Acesso ao externo: " + dadoExterno);
            }
        };
        
        // Executando
        tarefa.run();
    }
    
    // Método da classe externa
    private void metodoExterno() {
        System.out.println("Método da classe externa chamado!");
    }
    
    // Método para demonstrar uso das classes internas
    public void demonstrarClassesInternas() {
        System.out.println("=== Demonstração de Classes Internas ===");
        
        // Usando classe interna não-estática
        ClasseInterna objInterno = new ClasseInterna();
        objInterno.acessarDadoExterno();
        objInterno.mostrarRelacao();
        
        // Usando classe interna estática
        ClasseInternaEstatica objEstatico = new ClasseInternaEstatica();
        objEstatico.metodo();
        objEstatico.mostrarLimitacao();
        
        // Usando método com classe local
        metodoComClasseLocal();
        
        // Usando classe anônima
        exemploClasseAnonima();
    }
}
```

**📝 Tipos de Classes Internas:**

#### **🔹 1. Classe Interna Não-Estática (Inner Class)**
```java
class Externa {
    class Interna { ... }  // Tem acesso total à classe externa
}
```

**Características:**
- ✅ Acessa TODOS os membros da classe externa
- ✅ Pode acessar membros private da externa
- ❌ Precisa de uma instância da classe externa para existir

**Como criar:**
```java
ClasseExterna externa = new ClasseExterna();
ClasseExterna.ClasseInterna interna = externa.new ClasseInterna();
```

#### **🔹 2. Classe Interna Estática (Static Nested Class)**
```java
class Externa {
    static class InternaEstatica { ... }  // Independente da externa
}
```

**Características:**
- ✅ Não precisa de instância da classe externa
- ❌ Só acessa membros estáticos da externa
- ✅ Mais eficiente em memória

**Como criar:**
```java
ClasseExterna.ClasseInternaEstatica obj = new ClasseExterna.ClasseInternaEstatica();
```

#### **🔹 3. Classe Local (dentro de método)**
```java
public void metodo() {
    class ClasseLocal { ... }  // Só existe neste método
}
```

**Características:**
- ✅ Acessa variáveis final/effectively final do método
- ✅ Acessa membros da classe externa
- ❌ Só existe dentro do método

#### **🔹 4. Classe Anônima (implementação rápida)**
```java
Interface obj = new Interface() {
    @Override
    public void metodo() { ... }  // Implementação inline
};
```

**Características:**
- ✅ Implementação rápida de interfaces/classes abstratas
- ✅ Não precisa criar arquivo separado
- ❌ Não pode ser reutilizada

**🎯 Quando usar Classes Internas?**

| Tipo | Quando Usar | Exemplo |
|------|-------------|---------|
| **Interna** | Classe auxiliar específica | Nó em lista ligada |
| **Estática** | Classe relacionada mas independente | Builder pattern |
| **Local** | Lógica específica de um método | Comparadores temporários |
| **Anônima** | Implementações simples e únicas | Event listeners |

---

## 🎯 **Resumo Visual dos Conceitos**

### **📊 Hierarquia de Classes**
```
Object (raiz de tudo em Java)
├── Animal
│   ├── Cachorro
│   ├── Gato
│   └── Pássaro
├── Veiculo (abstrata)
│   ├── Carro
│   ├── Moto
│   └── Bicicleta
└── ClasseSimples
```

### **🔗 Relacionamentos**
```
Herança:     Cachorro "É UM" Animal
Interface:   Carro "PODE SER" Ligavel
Composição:  Carro "TEM UM" Motor
Agregação:  Escola "TEM" Alunos
```

### **⚡ Modificadores de Acesso**
```
private    [-] Só a própria classe
default    [~] Só o mesmo pacote  
protected  [#] Classe + filhas + pacote
public     [+] Todos podem acessar
```

---

## 🚀 **Como Executar o Projeto**

### **1. Pré-requisitos**
- ☕ Java JDK 8 ou superior instalado
- 💻 Terminal/Prompt de comando
- 📝 Editor de texto ou IDE

### **2. Compilação**
```bash
# No diretório do projeto
javac exemplo_class.java
```

### **3. Execução**
```bash
java exemplo_class
```

### **4. Saída Esperada**
O programa vai mostrar demonstrações de:
- ✅ Criação de objetos
- ✅ Herança e polimorfismo  
- ✅ Métodos estáticos
- ✅ Implementação de interfaces
- ✅ Uso de enums
- ✅ Classes internas

---

## 📚 **Glossário de Termos**

| Termo | Significado | Exemplo |
|-------|-------------|---------|
| **Classe** | Modelo/template para criar objetos | `class Pessoa { }` |
| **Objeto** | Instância criada a partir de uma classe | `new Pessoa()` |
| **Atributo** | Característica/variável da classe | `private String nome` |
| **Método** | Ação/função que a classe pode executar | `public void falar()` |
| **Construtor** | Método especial para inicializar objetos | `public Pessoa() { }` |
| **Encapsulamento** | Esconder detalhes internos | `private` + getters/setters |
| **Herança** | Classe filha herda da classe pai | `extends` |
| **Polimorfismo** | Mesmo método, comportamentos diferentes | `@Override` |
| **Abstração** | Classe/método sem implementação completa | `abstract` |
| **Interface** | Contrato que define métodos obrigatórios | `implements` |
| **Static** | Pertence à classe, não ao objeto | `static void metodo()` |
| **Final** | Não pode ser alterado/sobrescrito | `final String CONSTANTE` |
| **Override** | Sobrescrever método da classe pai | `@Override` |
| **Super** | Referência à classe pai | `super.metodo()` |
| **This** | Referência ao objeto atual | `this.atributo` |

---

## 🎓 **Próximos Passos para Aprender**

### **📈 Nível Iniciante → Intermediário**
1. **Collections:** ArrayList, HashMap, Set
2. **Exceções:** try/catch, throws, custom exceptions
3. **Generics:** `<T>` para type safety
4. **Streams:** Programação funcional com Java 8+

### **📈 Nível Intermediário → Avançado**
1. **Multithreading:** Threads, synchronized, concurrent
2. **Design Patterns:** Singleton, Factory, Observer
3. **Annotations:** @Override, @Deprecated, custom annotations
4. **Reflection:** Análise de classes em tempo de execução

### **📈 Frameworks e Tecnologias**
1. **Spring Framework:** Injeção de dependência, Spring Boot
2. **Hibernate/JPA:** Mapeamento objeto-relacional
3. **Maven/Gradle:** Gerenciamento de dependências
4. **JUnit:** Testes automatizados

---

## ❓ **Perguntas Frequentes**

### **Q: Qual a diferença entre classe e objeto?**
**A:** Classe é o projeto/molde. Objeto é a "coisa real" criada a partir desse projeto.

### **Q: Quando usar herança vs interface?**
**A:** 
- **Herança:** Quando existe relação "É UM" (Cachorro é Animal)
- **Interface:** Quando você quer definir "O QUE" algo pode fazer, não "COMO"

### **Q: Por que usar getters/setters em vez de atributos public?**
**A:** 
- **Controle:** Você controla como os dados são acessados/modificados
- **Validação:** Pode verificar se os dados são válidos
- **Flexibilidade:** Pode mudar implementação sem afetar quem usa

### **Q: Quando usar static?**
**A:** 
- Quando algo pertence à CLASSE, não ao objeto individual
- Métodos utilitários (Math.sqrt(), String.valueOf())
- Contadores globais, constantes

---

## 🏆 **Resumo dos Benefícios da POO**

### **🔒 Encapsulamento**
- **Segurança:** Dados protegidos contra acesso indevido
- **Manutenção:** Mudanças internas não afetam código externo
- **Clareza:** Interface clara de uso

### **👨‍👩‍👧‍👦 Herança**
- **Reutilização:** Evita código duplicado
- **Organização:** Hierarquia lógica de classes
- **Extensibilidade:** Fácil adicionar novas funcionalidades

### **🎭 Polimorfismo**
- **Flexibilidade:** Mesmo código funciona com objetos diferentes
- **Manutenibilidade:** Fácil adicionar novos tipos
- **Elegância:** Código mais limpo e expressivo

### **🎨 Abstração**
- **Simplicidade:** Esconde complexidade desnecessária
- **Foco:** Concentra no que é importante
- **Padronização:** Define interfaces consistentes

---

**🎯 Este guia fornece uma base sólida para dominar classes em Java. Pratique criando seus próprios exemplos e experimentando diferentes combinações desses conceitos!**