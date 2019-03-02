package pl.mpas.advanced_programing.null_handing.null_handeng1;

import java.util.Optional;

public class Example {

    public static void main(String[] args) {
        Computer fullOne = new Computer(new GraphicsCard(new Chipset("nVidia")));
        Computer withOutVendor = new Computer(new GraphicsCard(new Chipset(null)));
        Computer withOutChipset = new Computer(new GraphicsCard(null));
        Computer withOutGraphicsCard = new Computer(null);
        Computer maybeComputer = null;

        Optional<String> maybeMyName = Optional.ofNullable(null);
        if (maybeMyName.isPresent()) {
            System.out.println(maybeMyName.get());
        }

        //maybeMyName.ifPresent(s -> System.out.println(s));
        maybeMyName.ifPresent(System.out::println);
    }

    public static String getVendorNameSuperNaiveImpl(Computer computer) {
        return computer.getGraphicsCard().getChipset().getVendorName();
    }

    public static String getVendorNameSaveImpl(Computer computer) {
        String result = "";

        if (null != computer) {
            GraphicsCard maybeCard = computer.getGraphicsCard();
            if (null != maybeCard) {
                Chipset maybeChipset = maybeCard.getChipset();
                if (null != maybeChipset) {
                    String maybeVendorName = maybeChipset.getVendorName();
                    if (null != maybeVendorName) {
                        result = maybeVendorName;
                    }
                }
            }
        }
        return result;
    }

//    public static Optional<String> getVendorNameJavaBWay(Computer computer) {
//        return Optional.ofNullable(computer)
//                .map(computer1 -> computer1.getGraphicsCard())
//                .map(graphicsCard -> graphicsCard.getChipset())
//                .map(chipset -> chipset.getVendorName());
//    }

    public static Optional<String> getVendorNameJavaBWayShortWay(Computer computer) {
        return Optional.ofNullable(computer)
                .map(Computer::getGraphicsCard)
                .map(GraphicsCard::getChipset)
                .map(Chipset::getVendorName);
    }
}
