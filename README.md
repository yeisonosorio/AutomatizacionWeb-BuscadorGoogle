# AutomatizacionWeb-BuscadorGoogle

Automatización Web con Screenplay, Java, Selenium, Gherkin y Cucumber
Descripción
Este proyecto de automatización se enfoca en realizar una serie de pasos automatizados en un sitio web. A continuación, se detallan los pasos que se llevaron a cabo:

Búsqueda en Google: Se realiza una búsqueda en Google de la palabra "automatización".
Búsqueda del Enlace de Wikipedia: Se busca el enlace de Wikipedia que se muestra en los resultados de búsqueda.
Verificación de la Fecha del Primer Proceso Automático: Se verifica en qué año se realizó el primer proceso automático según la página de Wikipedia.
Captura de Pantalla de la Página de Wikipedia: Se toma una captura de pantalla de la página de Wikipedia.

## Repositorio de Control de Versiones: El proyecto se aloja en un repositorio de control de versiones para facilitar la colaboración y revisión de la arquitectura y codificación.

## Tecnologías Utilizadas
- Screenplay Pattern
- Java
- Selenium WebDriver Manager
- Gherkin
- Cucumber

Se realiza la automatizacion utilizando el patron screenplay con el lenguaje de programacion Java donde realizo mi scenario en gherkin para utilizarlos en mi Step Definitions para realizar la automatizacion al momento de tomar las capturas de pantalla screenplay viene
con esta funcion al momento de ejecutar la prueba el va tomando los pantallazos y me crea el report en la carpeta Tarjet donde se puede evidenciar toda la prueba paso a paso.


![image](https://github.com/yeisonosorio/AutomatizacionWeb-BuscadorGoogle/assets/28449105/12ca833e-9281-41d0-a534-27f2fd7fa6d8)


## Estructura del Proyecto
<pre>
src
├── main
│   └── java
│       └── com
│           └── inditex
│               ├── questions
│               │   └── AnioProcesoAuto
│               ├── tasks
│               │   ├── AbrirPaginaInicial
│               │   └── Google
│               ├── ui
│               │   └── Google
│               │       └── PaginaInicial
│               ├── util
│               └── test
│                   └── java
│                       └── com
│                           └── inditex
│                               └── runners
│                                   └── GoogleTest
│                       └── setup
│                           └── Configuracion
│                       └── stepdefinitions
│                           └── GoogleStepDefinitions
└── resources
    └── features
        ├── buscador.feature
    ├── log4j.properties
    └── serenity.properties
</pre>
