//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hero hero1= new Hero("Spiderman", 42, "Spider web");
        System.out.println(hero1.name + " "+ hero1.age+ " "+ hero1.power);
        System.out.println("==========toString Method==========");
        // now lets create another hero and use toString method to display
        Hero hero2 = new Hero("Shaktiman", 56, "KundliniPower");
        System.out.println(hero2);
    }

}