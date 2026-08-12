//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    YouTubeChannel channel = new YouTubeChannel("Study with Mainak");

    ISubscriber mainak = new EmailSubscriber("mg@gmail.com");
    ISubscriber kotari = new SMSSubscriber("9191919191");
    ISubscriber rajesh = new EmailSubscriber("RJ@gmail.com");

    channel.subscribe(mainak);
    channel.subscribe(kotari);
    channel.subscribe(rajesh);

    channel.uploadVideo("https://www.youtubeS3.com/mainak/Observerpattern");


}
