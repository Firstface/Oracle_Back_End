package Configuration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class CoinService {

    private final Configuration configuration;

    public CoinService(Configuration configuration) {
        this.configuration = configuration;
    }

    public List<Double> calculateMinimumCoins(Optional<Double> amountOpt, Optional<List<Double>> denominationsOpt) {
        double amount = amountOpt.orElse(configuration.getDefaultAmount());
        List<Double> denominations = denominationsOpt.orElse(configuration.getDefaultDenominations());

        Collections.sort(denominations, Collections.reverseOrder());
        List<Double> result = new ArrayList<>();
        for (double coin : denominations) {
            while (amount >= coin) {
                amount -= coin;
                result.add(coin);
            }
        }
        return result;
    }
}