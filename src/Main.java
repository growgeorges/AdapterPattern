public class Main {

    public static void main(String[] args) {
        //le main va jouer le role de mon client !
        //On a un cable d'alimentation en prise EU qu'on veut brancher sur une source de courant UK
        ITarget target = new AdapterEUUK(new AdapteeUK());
        System.out.println(target.requestCourant());

        //on a un cable d'alimentation en prise UK qu'on veut brancher sur une source de courant EU
        ITarget target2 = new AdapterUKEU(new AdapteeEU());
        System.out.println(target2.requestCourant());
    }
}
