## SCREENMATCH

Projeto de estudo do curso Java: aplicando a Orientação a Objetos, da Alura.

## Personal Notes

A Classe é um molde que contém os atributos(caracteristicas) e os métodos(comportamentos).

O Objeto é uma instância de uma classe, no caso -> Filme meuFilme = new Filme();

São 4 modificadores de acesso:

Public: é o mais permissivo, pode ser acessado em todo lugar, até mesmo em outro pacote.

Default: pode ser acessado apenas por classes/atributos/métodos no mesmo pacote.

Private: só pode ser acessado dentro da própria classe.

Protected: os atributos podem ser acessados por classes dentro do mesmo pacote e suas respectivas subclasses em qualquer pacote.

Encapsulamento: controlar o acesso aos atributos/métodos da classe.

Herança: para que a classe filha receba as informações da classe principal/pai. É necessário usar o termo EXTENDS -> public class Filme extends Titulo {} -> Titulo é a classe principal/pai.

Para sobrescrever um método é utilizada a anotação @Override e o método na classe filha deve ter o mesmo nome que na classe principal/pai.

Sobrecarga de método: quando utiliza o mesmo nome em mais de um método.

Interfaces: são contratos, a classe que for usar deve usar o termo implements, e deve implementar todos os métodos da interface. Todos os métodos da interface devem ser públicos.
