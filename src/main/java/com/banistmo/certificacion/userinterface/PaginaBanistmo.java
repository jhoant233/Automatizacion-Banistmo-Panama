package com.banistmo.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.List;

public class PaginaBanistmo {

    public static final Target PRODUCTOS_Y_SERVICIOS = Target.the("opción productos y servicios")
            .located(By.xpath("//a[contains(text(),'Productos & Servicios')]"));
    public static final Target BANIKIDS = Target.the("opción Banikids")
            .located(By.xpath("//a[contains(text(),'Banikids')]"));
    public static final Target TASAS_Y_TARIFAS = Target.the("Tasas y Tarifas")
            .located(By.xpath("//a[contains(text(),'Tasas y tarifas')]"));;
    public static final Target PDF_TARIFAS_CUENTAS = Target.the("PDF de Tarifas de Cuentas de Depósitos")
            .located(By.xpath("//div[@class='tab-content responsive col-sm-9 hidden-xs hidden-sm']//tr[1]//td[2]//span[1]//a[1]"));;;
    public static final Target TITULO_DE_PAGINA = Target.the("Titulo de la pagina donde se carga el PDF")
            .located(By.xpath(""));
}
