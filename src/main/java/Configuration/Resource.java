package Configuration;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;

@Path("/coins")
@Produces(MediaType.APPLICATION_JSON)
public class Resource {

    private final CoinService coinService;

    public Resource(Configuration configuration) {
        this.coinService = new CoinService(configuration);
    }

    @GET
    public List<Double> getMinimumCoins(@QueryParam("amount") Optional<Double> amountOpt, @QueryParam("denominations") List<Double> denominations) {
        Optional<List<Double>> denominationsOpt = Optional.ofNullable(denominations);
        return coinService.calculateMinimumCoins(amountOpt, denominationsOpt);
    }
}