package dev.lauracristina.exercicio10;

public class Fazenda {

    public void alimentarAnimais(Animal[] animais){
        for (Animal animal: animais){
            animal.comer();
        }
    }

}
