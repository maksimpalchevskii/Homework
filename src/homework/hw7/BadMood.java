package homework.hw7;

/**
 * Created by Maksim_Palchevskii on 10/13/2015.
 */
public class BadMood implements BrainState {

    @Override
    public void feed(Dog dog) {
        dog.eat();
        dog.brainState = new GoodMood();
    }

    @Override
    public void stroke(Dog dog) {
        dog.bite();
    }

}