/* Pessoa com os atributos Nome, Data de Nascimento e Idade.
 Crie no mínimo três Construtores e métodos (getters e setters).
 Crie um repositório público (preferencialmente GitHub) e adicione o link na resposta.
 */

import entities.Person;
public class Main {
    public static void main(String[] args) {
 
        Person person = new Person();
     
        person.setName("Vinicius Vilela");
        person.setAge(19);
        person.setDateOfBirth("22/01/2004");
     
        System.out.println(person.getName());
        System.out.println(person);
     
    }
}
