package com.banistmo.certificacion.tasks;

import com.banistmo.certificacion.userinterface.PaginaInicial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirElNavegador implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(new PaginaInicial()));
    }

    public static AbrirElNavegador enPaginaInicial(){
        return Tasks.instrumented(AbrirElNavegador.class);
    }

}
