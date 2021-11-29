package main.HW8.Animals;

public abstract class AnimalsVoice {

   protected final String view;



    public AnimalsVoice(String view) {
        this.view = view;
    }
    public abstract void voice();

}
