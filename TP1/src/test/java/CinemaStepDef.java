
import Models.Cinema;
import Models.Salle;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class CinemaStepDef {
    private Cinema cinema = new Cinema();
    private Salle salle1 = new Salle();
    private Salle salle2 = new Salle();

    @Given("un cinema")
    public void unCinema() {
        Assert.assertTrue(this.cinema!=null);
    }


    @Given("une salle de {int} places et une autre de {int} places")
    public void uneSalleDeNPlaces(int arg0, int arg1) {
        salle1.setPlaces(arg0);
        salle2.setPlaces(arg1);
    }

    @When("les salles sont ajoutees")
    public void lesSallesSontAjoutees() {
        this.cinema.addSalle(this.salle1);
        this.cinema.addSalle(this.salle2);
        Assert.assertTrue(this.cinema.getNsalles()>0);
    }


    @Then("le total des places de cinema est {int}")
    public void leTotalDesPlacesDeCinemaEstCalcule(Integer int1) {
        Assert.assertEquals(Integer.valueOf(int1), Integer.valueOf(this.cinema.getTotplaces()));
    }
}
