# 1 Defina e  dê  um  exemplo  para  cada  um  dos  conceitos de  Orientação  a  Objetos listados  a seguir (Inserir Referências utilizadas)

a) Classes:
é um modelo de objeto. Consiste de descrições de estado e métodos.
exemplo:
A classe é um modelo, um planejamento, tal como a maquete de uma casa. Essa casa tem diversas características que não estão expressas no modelo (classe) tais como cor, se é sobrado ou não, se tem garagem ou não, quando foi construída, qual o valor venal, qual a área construída, etc. 

b) Objetos:
É uma instância de uma classe.
capaz de:
armazenar seu estado através dos atributos;
Responder mensagens recebidas através de seus métodos;
Enviar mensagens a outros objetos.
exemplo:
O objeto seria a classe materializada, ou seja, um objeto com os devidos atributos qualificados: uma casa azul, térrea, com garagem, construída em 2015, com valor venal de $ 100.000,00, com área construída de 60m2, etc. Isso é objeto, também conhecida como instância da classe. 

c) Atributos:
Propriedade de uma classe que definem as características
do objeto.
o conjunto de atributos de um objeto é chamado de
estado do objeto.

- Os atributos podem ser de *instância* ou de *classe*
* Atributos de classe: são constantes com valores
pré definidos e que não sofrem alteração ao longo da execução

*Atributos de instância: Determinam o estado de cada objeto
e sofrem alteração ao longo da execução do programa(variáveis)
exemplo: uma casa pode ter os seguintes atributos: cor, tamanho, valor, construída em, quantidade de cômodos.

d) Métodos:
Ações ou comportamentos de uma classe, os métodos são capazes de manipular os atributos(caracteristicas) e devolver uma determinada ação.
exemplo:
Uma caneta tem alguma ações possíveis como: destampar, tampar e escrever


e) abstrações:
Abstração é o processo de simplificar um conceito ou objeto complexo, identificando as características essenciais e ignorando as não essenciais.

exemplo:

A classe Livro pode ter vários atributos, como título, autor, editora, número de páginas, data de publicação, entre outros.
No entanto, para simplificar o uso dessa classe e torná-la mais abstrata, podemos definir uma interface pública que exponha apenas os atributos essenciais, como título e autor. Dessa forma, os usuários do sistema podem interagir com os livros sem se preocupar com os outros atributos, que são detalhes internos da implementação da classe.


f) encapsulamento:
Ocultar partes independentes da implementação, permitindo construir partes invisíveis ao mundo exterior.

ou seja, ocultar do usuário partes que não importam para a funcionalidade básica do software
ex:
Em um controle remoto não sabemos como ele funciona, qual a lógica de comandos etc. Eu enquanto usuário só preciso saber que ao apertar o botão vermelho escrito powerOff(desligar) a minha Tv desliga imediatamente.

g) Herança:
Permite que uma classe herde propriedades e comportamentos de outra classe. Isso evita a duplicação de código e permite que as classes sejam organizadas em uma hierarquia.
exemplo:
Podemos criar a superclasse Pessoa com os atributos e métodos que toda pessoa do meu sistema terá como: nome,idade. com os métodos getters e setters.
Em seguida podemos criar subclasses como Professor,Aluno,Segurancas.
essas três classes herdarão os atributos de Pessoas e seus métodos. Assim devo criar apenas os atributos e métodos específicos de cada classe.


h) Polimorfismo:
Polimorfismo é a capacidade de um objeto ser usado de várias maneiras diferentes. Isso significa que o mesmo método pode ser usado em diferentes objetos, mesmo que esses objetos sejam de classes diferentes.
exemplo:
//Primeiro Método
public float calcMedia(float n1, float n2){
	return float (n1 + n2) / 2
}

//Segundo método
public int calcMedia(float v1, float v2){
	return int (v1 + v2) / 2
}

//Estes métodos apesar de retornarem parâmetros diferentes, 
//Possuem a mesma quantidade e tipos de parâmetros:
// 2 n°s reais

### Referência: Gamma, E., Helm, R., Johnson, R., Vlissides, J., & Costa, R. L. (2000). Padrões de Projeto: Soluções Reutilizáveis de Software Orientado a Objetos. Porto Alegre: Bookman.


