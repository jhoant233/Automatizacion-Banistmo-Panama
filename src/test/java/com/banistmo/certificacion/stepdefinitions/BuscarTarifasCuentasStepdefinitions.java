package com.banistmo.certificacion.stepdefinitions;

import com.banistmo.certificacion.questions.ElPDFDe;
import com.banistmo.certificacion.tasks.AbrirElNavegador;
import com.banistmo.certificacion.tasks.BuscarLasTasasYTarifas;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class BuscarTarifasCuentasStepdefinitions {

    @Managed(driver = "chrome")
    private WebDriver suNavegador;
    private Actor Johan = Actor.named("Johan");

    @Before
    public void prepararNavegador(){
        Johan.can(BrowseTheWeb.with(suNavegador));
        suNavegador.manage().window().maximize();
    }

    @Given("Johan ingreso a Banistmo")
    public void johanIngresoABanistmo() {
        Johan.wasAbleTo(AbrirElNavegador.enPaginaInicial());
    }

    @When("El busca las tasas y tarifas de cuentas")
    public void elBuscaLasTasasYTarifasDeCuentas() {
        Johan.attemptsTo(BuscarLasTasasYTarifas.deBanikids());
    }

    @Then("El deberia ver el PDF de las tasas y tarifas")
    public void elDeberiaVerElPDFDeLasTasasYTarifas() {
       // Johan.should(seeThat(ElPDFDe.tarifasYtasas(), equalTo("banistmo_tarifario_junio 2018")));
    }
}
