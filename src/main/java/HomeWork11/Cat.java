package HomeWork11;

import java.util.ArrayList;
import java.util.List;
    public class Cat {

        ArrayList<Mouse> stomach = new ArrayList<>(5);
        List pooped = new ArrayList();

        void Eat(Mouse eat) {
            System.out.println("Cat eats mouse");
            if (stomach.size() < 5) {
                stomach.add(eat);
            } else
                System.out.println("I'm full");
        }

        void Wetakeouttheoldvictim() {
            stomach.remove(0);
            System.out.println("the cat has done its job");
        }

        void renewal() {
            pooped.addAll(stomach);
            System.out.println("the cat removed all mice from the body");
            stomach.clear();
            for (Object eat : pooped) {
                if (((Mouse) eat).calories == 460) {
                    System.out.println("this mouse contains the most calories" + eat +
                            "index" + pooped.indexOf(eat));
                    break;
                }
            }
        }

        @Override
        public String toString() {
            if (stomach.isEmpty() == true) {
                return "The cat wants to eat";
            } else {
                return "The cat ate" + stomach;
            }
        }
    }

