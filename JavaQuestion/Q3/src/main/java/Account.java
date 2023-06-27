@SuppressWarnings("FieldMayBeFinal")
public class Account implements OnlineAccount, Comparable<Account> {
    private Integer noOfRegularMovies;
    private Integer noOfExclusiveMovies;
    private String ownerName;

    public Account(Integer noOfRegularMovies, Integer noOfExclusiveMovies, String ownerName) {
        this.noOfRegularMovies = noOfRegularMovies;
        this.noOfExclusiveMovies = noOfExclusiveMovies;
        this.ownerName = ownerName;
    }

    public Double monthlyCost() {
        return basePrice + this.noOfRegularMovies * regularMoviePrice +
                this.noOfExclusiveMovies * exclusiveMoviePrice;
    }

    @Override
    public String toString() {
        return "Owner is " + ownerName + " and monthly cost is " + monthlyCost() + " USD.";
    }

    @Override
    public int compareTo(Account o) {
        return Double.compare(monthlyCost(), o.monthlyCost());
    }
}
