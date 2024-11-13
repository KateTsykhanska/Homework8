//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean catDog(String animal) {
        int cat = 0;
        int dog = 0;

        for (int i = 0; i < animal.length() - 2; i++) {
            if (animal.substring(i, i + 3).equals("cat")) {
                cat++;
            }
            if (animal.substring(i, i + 3).equals("dog")) {
                dog++;
            }
        }
        return cat == dog;
    }

    public static void main(String[] args) {
        System.out.println(catDog("catdog"));
        System.out.println(catDog("catcat"));
        System.out.println(catDog("323catsdsdog"));
    }
}
