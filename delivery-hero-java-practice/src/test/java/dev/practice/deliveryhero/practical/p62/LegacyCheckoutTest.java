package dev.practice.deliveryhero.practical.p62;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LegacyCheckoutTest {
    private LegacyCheckout feature(String brand,String enabled) {
        return new LegacyCheckout(key -> switch(key) {
            case "brand" -> brand;
            case "express.enabled" -> enabled;
            default -> null;
        });
    }
    @Test void defaultUsesLegacyConfiguration() {
        assertEquals("Delivery Hero: standard", new LegacyCheckout().deliveryLabel());
    }
    @Test void injectedConfigurationControlsFeature() {
        assertEquals("Fidelity: express",feature("Fidelity","true").deliveryLabel());
    }
    @Test void normalizesWhitespaceAndFlagCase() {
        assertEquals("Shop: express",feature("  Shop  "," TRUE ").deliveryLabel());
    }
    @Test void fallsBackForMissingValues() {
        assertEquals("Shop: standard",feature(null,null).deliveryLabel());
    }
    @Test void blankBrandAndUnknownFlag() {
        assertEquals("Shop: standard",feature("  ","yes").deliveryLabel());
    }
    @Test void instancesRemainIsolatedFromEachOtherAndLegacy() {
        var a=feature("A","true");var b=feature("B","false");
        assertEquals("A: express",a.deliveryLabel());
        assertEquals("B: standard",b.deliveryLabel());
        assertEquals("A: express",a.deliveryLabel());
        assertEquals("false",LegacyCheckout.LegacyConfigurator.instance().get("express.enabled"));
    }
    @Test void rejectsMissingDependency() {
        assertThrows(IllegalArgumentException.class,()->new LegacyCheckout(null));
    }
}
