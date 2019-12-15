public class AdapterEUUK implements ITarget {
    //ceci est un adapteur de cable d'alimentation EU pour brancher sur prise UK
    AdapteeUK adapteeUK;

    public AdapterEUUK(AdapteeUK adapteeUK){
        this.adapteeUK = adapteeUK;
    }

    @Override
    public String requestCourant() {
        return adapteeUK.requestCourant();
    }
}
