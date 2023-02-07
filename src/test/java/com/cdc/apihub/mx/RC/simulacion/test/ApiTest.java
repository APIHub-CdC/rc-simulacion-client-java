package com.cdc.apihub.mx.RC.simulacion.test;

import okhttp3.OkHttpClient;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cdc.apihub.mx.RC.simulacion.client.ApiClient;
import com.cdc.apihub.mx.RC.simulacion.client.ApiException;
import com.cdc.apihub.mx.RC.simulacion.client.api.RCApi;
import com.cdc.apihub.mx.RC.simulacion.client.model.CatalogoEstados;
import com.cdc.apihub.mx.RC.simulacion.client.model.Consultas;
import com.cdc.apihub.mx.RC.simulacion.client.model.Creditos;
import com.cdc.apihub.mx.RC.simulacion.client.model.DomicilioPeticion;
import com.cdc.apihub.mx.RC.simulacion.client.model.DomiciliosRespuesta;
import com.cdc.apihub.mx.RC.simulacion.client.model.Empleos;
import com.cdc.apihub.mx.RC.simulacion.client.model.PersonaPeticion;
import com.cdc.apihub.mx.RC.simulacion.client.model.Respuesta;

import java.util.concurrent.TimeUnit;

public class ApiTest {

	private Logger logger = LoggerFactory.getLogger(ApiTest.class.getName());

    private final RCApi api = new RCApi();

    private ApiClient apiClient;
    private String xApiKey = "your_api_key";
    private String url = "the_url";

    @Before()
    public void setUp() {
        this.apiClient = api.getApiClient();
         this.apiClient.setBasePath(url);
         OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .readTimeout(30, TimeUnit.SECONDS)
                .build();
         apiClient.setHttpClient(okHttpClient);
    }

    @Test
    public void getFullReportTest() throws ApiException {
       
        PersonaPeticion body = new PersonaPeticion();

        body.setPrimerNombre("JUAN");
        body.setApellidoPaterno("PRUEBA");
        body.setApellidoMaterno("SIETE");
        body.setFechaNacimiento("1980-01-07");
        body.setRFC("PUAC800107");
        body.setNacionalidad("MX");

        DomicilioPeticion dom = new DomicilioPeticion();
        dom.setDireccion("INSURGENTES SUR 1001");
        dom.setColoniaPoblacion("INSURGENTES SUR");
        dom.setDelegacionMunicipio("CIUDAD DE MEXICO");
        dom.setCiudad("CIUDAD DE MEXICO");
        dom.setEstado(CatalogoEstados.DF);
        dom.setCP("11230");
        body.setDomicilio(dom);

        Respuesta response = api.getReporte(this.xApiKey, body);
        logger.info("FullReportTest: "+response.toString());
        Assert.assertTrue(response.getFolioConsulta() != null);
    }

}
