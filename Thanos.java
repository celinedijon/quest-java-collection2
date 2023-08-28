import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Thanos {

    public static void main(String[] args) {

        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Thor", 1501));

        
        Collections.sort(heroes); 

        System.out.println("\nOrder by name:");
        showList(heroes);

    
        Comparator<Hero> ageComparator = new Comparator<Hero>() {
            @Override
            public int compare(Hero h1, Hero h2) {
                return Integer.compare(h2.getAge(), h1.getAge()); 
            }
        };
        Collections.sort(heroes, ageComparator);

        System.out.println("\nOrder by age:");
        showList(heroes);
    }

    private static void showList(List<Hero> heroes) {
        for (Hero hero : heroes) {
            System.out.println(hero.getName() + ", " + hero.getAge());
        }
    }
}
