package pl.mpas.advanced_programing.null_handing.null_handing_optional;

import java.util.Optional;

public class Chipset {

    private String vendorName;

    public Chipset(String vendorName) {
        this.vendorName = vendorName;
    }

    public Optional<String> getVendorName() {
        return Optional.ofNullable(vendorName);
    }

    @Override
    public String toString() {
        return "Chipset{" +
                "vendorName='" + vendorName + '\'' +
                '}';
    }
}
