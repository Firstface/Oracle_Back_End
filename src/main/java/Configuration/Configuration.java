package Configuration;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.List;

public class Configuration extends io.dropwizard.Configuration {
    @NotNull
    private double defaultAmount = 0.0;

    @NotNull
    private List<Double> defaultDenominations = List.of(0.01, 0.05, 0.1, 0.25, 1.0, 5.0, 10.0);

    @JsonProperty
    public double getDefaultAmount() {
        return defaultAmount;
    }

    @JsonProperty
    public void setDefaultAmount(double defaultAmount) {
        this.defaultAmount = defaultAmount;
    }

    @JsonProperty
    public List<Double> getDefaultDenominations() {
        return defaultDenominations;
    }

    @JsonProperty
    public void setDefaultDenominations(List<Double> defaultDenominations) {
        this.defaultDenominations = defaultDenominations;
    }
}