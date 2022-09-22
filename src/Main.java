public class Main {
    public static void main(String[] args) {

        MagicBox <String> magicBox = new MagicBox<>(2);
        System.out.println(magicBox.add("Hello, dear friend!"));
        System.out.println(magicBox.add("What's up?"));
        System.out.println(magicBox.add("What's your name?"));
        System.out.println(magicBox.add("How old are you?"));

        MagicBox <Integer> magicBox1 = new MagicBox<>(4);
        System.out.println(magicBox.add(String.valueOf(1)));
        System.out.println(magicBox.add(String.valueOf(2)));
        System.out.println(magicBox.add(String.valueOf(3)));
        System.out.println(magicBox.add(String.valueOf(4)));
        System.out.println(magicBox.add(String.valueOf(5)));
        System.out.println(magicBox.add(String.valueOf(6)));
        System.out.println(magicBox.add(String.valueOf(7)));
        System.out.println(magicBox.add(String.valueOf(8)));

    }
}
