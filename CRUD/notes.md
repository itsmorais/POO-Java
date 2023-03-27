# Orientação a objetos:

### Classe:
é um modelo de objeto. Consiste de descrições de estado e métodos.

- Atributo: 
definem as característica de um objeto. O conjunto de 
atributos de um objeto é chamado de *estado do objeto*

- métodos
é uma descrição da operação de um objeto. define
o *comportamento de um objeto*

### Objeto
é uma instância de uma classe.
capaz de:
armazenar seu estado através dos atributos;
Responder mensagens recebidas através de seus métodos;
Enviar mensagens a outros objetos.

- Atributo
Propriedade de uma classe que definem as características
do objeto.
o conjunto de atributos de um objeto é chamado de
estado do objeto.

- Os atributos podem ser de *instância* ou de *classe*
* Atributos de classe: são constantes com valores
pré definidos e que não sofrem alteração ao longo da execução

*Atributos de instância: Determinam o estado de cada objeto
e sofrem alteração ao longo da execução do programa(variáveis)

![image](https://user-images.githubusercontent.com/53665466/223694637-d829d134-0228-4365-ab01-4908e055bfbb.png)

## Encapsulamento

### Getters
- Objetivo: 
Permitir que o atributo encapsulado seja lido por outra classe;
- Nomenclatura:
Utiliza-se o prefixo get seguido do nome da variável;
- Acesso:
Não privado(mais utilizado como public)
- Tipo de retorno:
O mesmo tipo do atributo encapsulado;
- Parâmetro:
nenhum()

### Setters
- Objetivo:
Permitir que o atributo encapsulado possa ter seu valor modificado por outra classe;
- Nomenclatura:
Utiliza-se o prefixo set seguido do nome da variável;
- Acesso:
Não-privado(mais utilizado como public)
- Tipo de retorno:
Não retorna valor -void;
- Parâmetro:
Apenas um, de mesmo tipo e mesmo nome do atributo encapsulado.
![image](https://user-images.githubusercontent.com/53665466/223703558-98c7d91e-84fc-4c86-a201-9ba588b7e031.png)


