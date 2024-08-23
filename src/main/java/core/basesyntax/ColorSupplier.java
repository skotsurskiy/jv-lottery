package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(BallColors.values().length);
        return BallColors.values()[index].toString();
    }
}
