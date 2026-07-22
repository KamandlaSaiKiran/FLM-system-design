//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    // I want to support different discount options in my system
    //

    IDiscount ds = new MembershipDiscount();// toggle between any child class of IDiscount
    ds.getDiscount();
}
