public class Main {
    public static void main(String[] args) {
        String greeting = System.getenv("GREETING");
        String name = "World";
        if (args.length > 0)
            name = args[0];
        System.out.println(greeting+" " +name+ "!");
    }
}
//comment