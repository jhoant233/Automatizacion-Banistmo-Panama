package com.banistmo.certificacion.questions;

import com.banistmo.certificacion.userinterface.PaginaBanistmo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;

public class ElPDFDe implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PaginaBanistmo.TITULO_DE_PAGINA).viewedBy(actor).asString();
    }

    public static ElPDFDe tarifasYtasas(){
        return new ElPDFDe();
    }
}
