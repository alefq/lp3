package py.com.afeltes.myapplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by afeltes on 26/10/17.
 */

public class AutoCarrera extends Auto {
    String principalSponsor;

    List<String> otroSponsors;

    public static void main(String[] args) {
        AutoCarrera autoCarrera = new AutoCarrera();
        autoCarrera.inicializar();
        System.out.println(autoCarrera.describe());
    }

    public void inicializar() {
        Auto hyundai = new Auto();
        hyundai.anho = 2014;
        hyundai.modelo = "i30";

        modelo = "Toyota";
        anho = 2015;
        modelo = "corolla";

        otroSponsors = new ArrayList<>();
        otroSponsors.add("LG");
        otroSponsors.add("Toshiba");
        otroSponsors.add("Heineken");
    }

    public String describe() {
        otroSponsors = Arrays.asList("LG", "Toshiba", "Heineken");
        String description = marca + ", "
                + modelo + ", "
                + anho + ", " + principalSponsor + ", otros: " + otroSponsors;
        return description;
    }
}
