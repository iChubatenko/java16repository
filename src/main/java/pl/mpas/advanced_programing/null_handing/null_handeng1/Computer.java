package pl.mpas.advanced_programing.null_handing.null_handeng1;

public class Computer {

    private GraphicsCard graphicsCard;

    public Computer(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "graphicsCard=" + graphicsCard +
                '}';
    }
}
