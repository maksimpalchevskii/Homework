package homework.hw7;

/**
 * Created by Maksim_Palchevskii on 10/13/2015.
 */
public class GoodMood implements BrainState {

    private static final int MAX_STROKES = 3;
    int count;

    @Override
    public void feed(Dog dog) {
        dog.eat();
        dog.wag();
    }

    @Override
    public void stroke(Dog dog) {
        dog.wag();
        dog.bark();
        count++;
        if (count >= MAX_STROKES) {
            dog.brainState = new BadMood();
        }
    }
}
