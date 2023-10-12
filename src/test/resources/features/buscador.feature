#encoding:UTF-8


  Feature: Busqueda y Captura en Wikipedia

  Scenario: Buscar automatizacion en Google, acceder a Wikipedia, capturar y almacenar informacion.
    Given que estoy en el sitio web de Google
    When busco "automatización" y accedo a la pagina de Wikipedia
    Then comprobar anio que se hizo el primer proceso automatico "Egipto ptolemaico"
