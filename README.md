# Reporte de crédito - Simulación

<p>Esta API simula el reporte del historial crediticio, el cumplimiento de pago de los compromisos que la persona ha adquirido con entidades financieras, no financieras e instituciones comerciales que dan crédito o participan en actividades afines al crédito.<br/><img src='https://www.circulodecredito.com.mx/assets/img/logocirculo.png' height='37' width='100'/></p><br/>

## Requisitos

1. Java >= 1.7
2. Maven >= 3.3

## Instalación

Para la instalación de las dependencias se deberá ejecutar el siguiente comando:

```shell
mvn install -Dmaven.test.skip=true
```

> **NOTA:** Este fragmento del comando *-Dmaven.test.skip=true* evitará que se lance la prueba unitaria.


## Guía de inicio

### Paso 1. Agregar el producto a la aplicación

Al iniciar sesión seguir os siguientes pasos:

 1. Dar clic en la sección "**Mis aplicaciones**".
 2. Seleccionar la aplicación.
 3. Ir a la pestaña de "**Editar '@tuApp**' ".
    <p align="center">
      <img src="https://github.com/APIHub-CdC/imagenes-cdc/blob/master/edit_applications.jpg" width="900">
    </p>
 4. Al abrirse la ventana emergente, seleccionar el producto.
 5. Dar clic en el botón "**Guardar App**":
    <p align="center">
      <img src="https://github.com/APIHub-CdC/imagenes-cdc/blob/master/selected_product.jpg" width="400">
    </p>

### Paso 2. Capturar los datos de la petición

Los siguientes datos a modificar se encuentran en ***src/test/java/io/apihub/client/api/ReporteDeCrditoApiTest.java***

Es importante contar con el setUp() que se encargará de inicializar la url. Modificar la URL ***('the_url')***, como se muestra en el siguiente fragmento de código:

```java
    private final ReporteDeCrditoApi api = new ReporteDeCrditoApi();

    private ApiClient apiClient;
    private String xApiKey = null;
    @Before()
    public void setUp() {
        this.apiClient = api.getApiClient();
         this.apiClient.setBasePath("the_url");
         OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .readTimeout(30, TimeUnit.SECONDS)
                .build();
        this.xApiKey = "XXXXXXXX";
    }

```

De igual manera, en el archivo **ReporteDeCrditoApiTest**, se deberá modificar el siguiente fragmento de código con los datos correspondientes:

```java
@Test
    public void getFullReportTest() throws ApiException {
        String xFullReport = "true";
        PersonaPeticion body = new PersonaPeticion();

        body.setPrimerNombre("XXXXXXXX");
        body.setApellidoPaterno("XXXXXXXX");
        body.setApellidoMaterno("XXXXXXXX");
        body.setFechaNacimiento("yyyy-MM-dd");
        body.setRFC("XXXXXXXX");
        body.setNacionalidad("XX");

        DomicilioPeticion dom = new DomicilioPeticion();
        dom.setDireccion("XXXXXXXX");
        dom.setColoniaPoblacion("XXXXXXXX");
        dom.setDelegacionMunicipio("XXXXXXXX");
        dom.setCiudad("XXXXXXXX");
        dom.setEstado(CatalogoEstados.DF);
        dom.setCP("XXXXXXXX");
        body.setDomicilio(dom);

        Respuesta response = api.getReporte(this.xApiKey, body, xFullReport);
        Assert.assertTrue(response.getFolioConsulta() != null);
    }
```

### Paso 3. Ejecutar la prueba unitaria

Teniendo los pasos anteriores ya solo falta ejecutar la prueba unitaria, con el siguiente comando:

```shell
mvn test -Dmaven.install.skip=true
```