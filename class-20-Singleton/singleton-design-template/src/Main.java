//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Singleton s1 = Singleton.getInstance();
    System.out.println(s1);
    Singleton s2 = Singleton.getInstance();
    System.out.println(s2);
}
