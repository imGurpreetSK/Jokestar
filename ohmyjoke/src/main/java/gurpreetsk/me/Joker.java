package gurpreetsk.me;

import java.util.Random;

public class Joker {

    private final String[] joke = {
            "Can a kangaroo jump higher than a house? Of course, a house doesn’t jump at all.",
            "Doctor: \"I'm sorry but you suffer from a terminal illness and have only 10 to live.\"\n" +
                    "\n" +
                    "Patient: \"What do you mean, 10? 10 what? Months? Weeks?!\"\n" +
                    "\n" +
                    "Doctor: \"Nine.\"",
            "Anton, do you think I’m a bad mother?\n" +
                    "My name is Paul.",
            "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.",
            "What is the difference between a snowman and a snowwoman?\n" +
                    "Snowballs.",
            "Scientists have now discovered how women keep their secrets. They do so within groups of 40.",
            "My wife’s cooking is so bad we usually pray after our food.",
            "Why is it a bad idea for two butt cheeks to get married? Because they part for every little shit.",
            "I'd like to buy a new boomerang please. Also, can you tell me how to throw the old one away?",
            "Coco Chanel once said that you should put perfume on places where you want to be kissed by a man. But hell does that burn!"
    };

    public String getJoke() {
        return joke[new Random().nextInt(10)];
    }

}
