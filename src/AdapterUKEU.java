public class AdapterUKEU implements ITarget {
    //ceci est un adapteur de cable d'alimentation UK pour brancher sur prise EU
    AdapteeEU adapteeEU;

    public AdapterUKEU(AdapteeEU adapteeEU){
        this.adapteeEU = adapteeEU;
    }

    @Override
    public String requestCourant() {
        return adapteeEU.requestCourant();
    }
}
