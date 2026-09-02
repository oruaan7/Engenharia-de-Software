package Exercicios;

public class TesteAnimais {
    public static void main(String[] args) {

        System.out.println("==== Polimorfismo ====");
        Animal animal1 = new Cachorro("Rex", 5);
        Animal animal2 = new Gato("Asteroid", 2);
        PodeNadar cachorro = new Cachorro("Rex", 5);

        animal1.emitirSom();

        animal2.emitirSom();

        System.out.println("=== Usando contrutores e arrays ====");
        Animal[] animais = {
                new Cachorro("Rex", 5),
                new Cachorro("Bolt", 3),
                new Gato("Asteroid", 2),
                new Gato("Mingau", 4)
        };

        for (Animal animal : animais) {
            animal.emitirSom();
            animal.comer();
            animal.dormir();
        }

        cachorro.nadar();
    }
}
