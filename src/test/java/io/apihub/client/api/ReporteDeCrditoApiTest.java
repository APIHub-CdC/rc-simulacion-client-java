package io.apihub.client.api;

import io.apihub.client.ApiClient;
import io.apihub.client.ApiException;
import io.apihub.client.model.*;
import okhttp3.OkHttpClient;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Ignore
public class ReporteDeCrditoApiTest {
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

    @Test
    public void getReporteTest() throws ApiException {
        String xFullReport = "false";
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


        if (response.getFolioConsulta() != null) {
            String folioConsulta = response.getFolioConsulta();

            Consultas consultas = api.getConsultas(folioConsulta, xApiKey);
            Assert.assertTrue(consultas.getConsultas() != null);

            Creditos creditos = api.getCreditos(folioConsulta, xApiKey);
            Assert.assertTrue(creditos.getCreditos() != null);

            DomiciliosRespuesta domicilios = api.getDomicilios(folioConsulta, xApiKey);
            Assert.assertTrue(domicilios.getDomicilios() != null);

            Empleos empleos = api.getEmpleos(folioConsulta, xApiKey);
            Assert.assertTrue(empleos.getEmpleos() != null);
        }
    }
}
