Feature: Buscar PDF de tasas y tarifas de cuentas de deposito
Yo como usuario de la pagina Banistmo
Quiero buscar las tasas y tarifas
Para validar que le PDF generado sea el correcto

Scenario: Busqueda exitosa de tasas y tarifas
  Given Johan ingreso a Banistmo
  When El busca las tasas y tarifas de cuentas
  Then El deberia ver el PDF de las tasas y tarifas