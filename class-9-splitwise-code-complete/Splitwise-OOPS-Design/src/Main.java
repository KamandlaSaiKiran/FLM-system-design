//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Splitwise app = new Splitwise();

    User Arjun = app.createUser("u1", "Arjun");
    User Amruta = app.createUser("u2", "Amruta");
    User Rajesh = app.createUser("u3", "Rajesh");

    Group trip = app.createGroup("g1", "Goa trip");
    trip.addMember(Amruta);
    trip.addMember(Rajesh);
    trip.addMember(Arjun);


    // equal expense
    Expense hotel = new EqualExpense("hotel", Arjun, 3000);

    List<User> hotelParticipants = new ArrayList<>();
    hotelParticipants.add(Amruta);
    hotelParticipants.add(Rajesh);

    trip.addExpense(hotel, hotelParticipants, null);


    // percentage expense

    Expense cab = new PercentageExpense("cab", Amruta, 1000);

    List<User> cabParticipants = new ArrayList<>();
    cabParticipants.add(Arjun);
    cabParticipants.add(Rajesh);

    trip.addExpense(cab, cabParticipants, List.of(60.0,40.0));


    double amrutaBalance = trip.getBalance("u2");
    System.out.println(amrutaBalance); // needs to give 1500 but will get 1000 -> so needs to pay 500 -> -500


    double arjunBalance = trip.getBalance("u1");
    System.out.println(arjunBalance); // needs to give 600 but will get 3000 -> so gets 2400 -> +2400

    double rajeshBalance = trip.getBalance("u3");
    System.out.println(rajeshBalance); //-> -1900



}
