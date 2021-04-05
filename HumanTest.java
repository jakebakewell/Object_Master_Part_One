public class HumanTest {
    public static void main(String[] args) {
        Human jeff = new Human();
        Human nick = new Human();
        jeff.displayHealth();
        nick.attackHuman(jeff);
        jeff.displayHealth();
    }
}
