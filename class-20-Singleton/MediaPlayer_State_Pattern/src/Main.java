//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    MediaPlayer player = new MediaPlayer();
    player.play();
    player.stop();
    System.out.println(player.getState());

    player.play();
    player.pause();
    System.out.println(player.getState());


    player.play();
    System.out.println(player.getState());

    player.stop();
    System.out.println(player.getState());


    player.play();
    player.stop();
    System.out.println(player.getState());

    player.play();
    player.pause();
    System.out.println(player.getState());


    player.play();
    System.out.println(player.getState());

    player.stop();
    System.out.println(player.getState());




}
