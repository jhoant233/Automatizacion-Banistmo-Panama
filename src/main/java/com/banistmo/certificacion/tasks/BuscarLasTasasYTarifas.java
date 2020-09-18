package com.banistmo.certificacion.tasks;

import com.banistmo.certificacion.userinterface.PaginaBanistmo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class BuscarLasTasasYTarifas implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaBanistmo.PRODUCTOS_Y_SERVICIOS));
        actor.attemptsTo(Click.on(PaginaBanistmo.BANIKIDS));
        actor.attemptsTo(Click.on(PaginaBanistmo.TASAS_Y_TARIFAS));
        actor.attemptsTo(Click.on(PaginaBanistmo.PDF_TARIFAS_CUENTAS));
    }

    public static BuscarLasTasasYTarifas deBanikids(){
        return Tasks.instrumented(BuscarLasTasasYTarifas.class);
    }
}
