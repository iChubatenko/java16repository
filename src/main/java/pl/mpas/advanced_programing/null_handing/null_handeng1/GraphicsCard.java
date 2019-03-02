package pl.mpas.advanced_programing.null_handing.null_handeng1;

public class GraphicsCard {

    private Chipset chipset;

    public GraphicsCard(Chipset chipset) {
        this.chipset = chipset;
    }

    public Chipset getChipset() {
        return chipset;
    }

    @Override
    public String toString() {
        return "GraphicsCard{" +
                "chipset=" + chipset +
                '}';
    }
}
