package io.apihub.client.api;

import io.apihub.client.ApiCallback;
import io.apihub.client.ApiClient;
import io.apihub.client.ApiException;
import io.apihub.client.ApiResponse;
import io.apihub.client.Configuration;
import io.apihub.client.Pair;
import io.apihub.client.ProgressRequestBody;
import io.apihub.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.apihub.client.model.Consultas;
import io.apihub.client.model.Creditos;
import io.apihub.client.model.DomiciliosRespuesta;
import io.apihub.client.model.Empleos;
import io.apihub.client.model.Errores;
import io.apihub.client.model.Mensajes;
import io.apihub.client.model.PersonaPeticion;
import io.apihub.client.model.Respuesta;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReporteDeCrditoApi {
    private ApiClient apiClient;
    public ReporteDeCrditoApi() {
        this(Configuration.getDefaultApiClient());
    }
    public ReporteDeCrditoApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public okhttp3.Call getConsultasCall(String folioConsulta, String xApiKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/{folioConsulta}/consultas"
            .replaceAll("\\{" + "folioConsulta" + "\\}", apiClient.escapeString(folioConsulta.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getConsultasValidateBeforeCall(String folioConsulta, String xApiKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (folioConsulta == null) {
            throw new ApiException("Missing the required parameter 'folioConsulta' when calling getConsultas(Async)");
        }
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getConsultas(Async)");
        }
        
        okhttp3.Call call = getConsultasCall(folioConsulta, xApiKey, progressListener, progressRequestListener);
        return call;
    }
    
    public Consultas getConsultas(String folioConsulta, String xApiKey) throws ApiException {
        ApiResponse<Consultas> resp = getConsultasWithHttpInfo(folioConsulta, xApiKey);
        return resp.getData();
    }
    
    public ApiResponse<Consultas> getConsultasWithHttpInfo(String folioConsulta, String xApiKey) throws ApiException {
        okhttp3.Call call = getConsultasValidateBeforeCall(folioConsulta, xApiKey, null, null);
        Type localVarReturnType = new TypeToken<Consultas>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call getConsultasAsync(String folioConsulta, String xApiKey, final ApiCallback<Consultas> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = getConsultasValidateBeforeCall(folioConsulta, xApiKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Consultas>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
    
    public okhttp3.Call getCreditosCall(String folioConsulta, String xApiKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/{folioConsulta}/creditos"
            .replaceAll("\\{" + "folioConsulta" + "\\}", apiClient.escapeString(folioConsulta.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCreditosValidateBeforeCall(String folioConsulta, String xApiKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (folioConsulta == null) {
            throw new ApiException("Missing the required parameter 'folioConsulta' when calling getCreditos(Async)");
        }
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getCreditos(Async)");
        }
        
        okhttp3.Call call = getCreditosCall(folioConsulta, xApiKey, progressListener, progressRequestListener);
        return call;
    }
    
    public Creditos getCreditos(String folioConsulta, String xApiKey) throws ApiException {
        ApiResponse<Creditos> resp = getCreditosWithHttpInfo(folioConsulta, xApiKey);
        return resp.getData();
    }
    
    public ApiResponse<Creditos> getCreditosWithHttpInfo(String folioConsulta, String xApiKey) throws ApiException {
        okhttp3.Call call = getCreditosValidateBeforeCall(folioConsulta, xApiKey, null, null);
        Type localVarReturnType = new TypeToken<Creditos>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call getCreditosAsync(String folioConsulta, String xApiKey, final ApiCallback<Creditos> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = getCreditosValidateBeforeCall(folioConsulta, xApiKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Creditos>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
    
    public okhttp3.Call getDomiciliosCall(String folioConsulta, String xApiKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/{folioConsulta}/domicilios"
            .replaceAll("\\{" + "folioConsulta" + "\\}", apiClient.escapeString(folioConsulta.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDomiciliosValidateBeforeCall(String folioConsulta, String xApiKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (folioConsulta == null) {
            throw new ApiException("Missing the required parameter 'folioConsulta' when calling getDomicilios(Async)");
        }
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getDomicilios(Async)");
        }
        
        okhttp3.Call call = getDomiciliosCall(folioConsulta, xApiKey, progressListener, progressRequestListener);
        return call;
    }
    
    public DomiciliosRespuesta getDomicilios(String folioConsulta, String xApiKey) throws ApiException {
        ApiResponse<DomiciliosRespuesta> resp = getDomiciliosWithHttpInfo(folioConsulta, xApiKey);
        return resp.getData();
    }
    
    public ApiResponse<DomiciliosRespuesta> getDomiciliosWithHttpInfo(String folioConsulta, String xApiKey) throws ApiException {
        okhttp3.Call call = getDomiciliosValidateBeforeCall(folioConsulta, xApiKey, null, null);
        Type localVarReturnType = new TypeToken<DomiciliosRespuesta>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call getDomiciliosAsync(String folioConsulta, String xApiKey, final ApiCallback<DomiciliosRespuesta> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = getDomiciliosValidateBeforeCall(folioConsulta, xApiKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DomiciliosRespuesta>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
    
    public okhttp3.Call getEmpleosCall(String folioConsulta, String xApiKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/{folioConsulta}/empleos"
            .replaceAll("\\{" + "folioConsulta" + "\\}", apiClient.escapeString(folioConsulta.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getEmpleosValidateBeforeCall(String folioConsulta, String xApiKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (folioConsulta == null) {
            throw new ApiException("Missing the required parameter 'folioConsulta' when calling getEmpleos(Async)");
        }
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getEmpleos(Async)");
        }
        
        okhttp3.Call call = getEmpleosCall(folioConsulta, xApiKey, progressListener, progressRequestListener);
        return call;
    }
    
    public Empleos getEmpleos(String folioConsulta, String xApiKey) throws ApiException {
        ApiResponse<Empleos> resp = getEmpleosWithHttpInfo(folioConsulta, xApiKey);
        return resp.getData();
    }
    
    public ApiResponse<Empleos> getEmpleosWithHttpInfo(String folioConsulta, String xApiKey) throws ApiException {
        okhttp3.Call call = getEmpleosValidateBeforeCall(folioConsulta, xApiKey, null, null);
        Type localVarReturnType = new TypeToken<Empleos>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call getEmpleosAsync(String folioConsulta, String xApiKey, final ApiCallback<Empleos> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = getEmpleosValidateBeforeCall(folioConsulta, xApiKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Empleos>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
    
    public okhttp3.Call getMensajesCall(String folioConsulta, String xApiKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/{folioConsulta}/mensajes"
            .replaceAll("\\{" + "folioConsulta" + "\\}", apiClient.escapeString(folioConsulta.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getMensajesValidateBeforeCall(String folioConsulta, String xApiKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (folioConsulta == null) {
            throw new ApiException("Missing the required parameter 'folioConsulta' when calling getMensajes(Async)");
        }
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getMensajes(Async)");
        }
        
        okhttp3.Call call = getMensajesCall(folioConsulta, xApiKey, progressListener, progressRequestListener);
        return call;
    }
    
    public Mensajes getMensajes(String folioConsulta, String xApiKey) throws ApiException {
        ApiResponse<Mensajes> resp = getMensajesWithHttpInfo(folioConsulta, xApiKey);
        return resp.getData();
    }
    
    public ApiResponse<Mensajes> getMensajesWithHttpInfo(String folioConsulta, String xApiKey) throws ApiException {
        okhttp3.Call call = getMensajesValidateBeforeCall(folioConsulta, xApiKey, null, null);
        Type localVarReturnType = new TypeToken<Mensajes>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call getMensajesAsync(String folioConsulta, String xApiKey, final ApiCallback<Mensajes> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = getMensajesValidateBeforeCall(folioConsulta, xApiKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Mensajes>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
    
    public okhttp3.Call getReporteCall(String xApiKey, PersonaPeticion request, String xFullReport, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        String localVarPath = "";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (xFullReport != null)
        localVarHeaderParams.put("x-full-report", apiClient.parameterToString(xFullReport));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getReporteValidateBeforeCall(String xApiKey, PersonaPeticion request, String xFullReport, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getReporte(Async)");
        }
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling getReporte(Async)");
        }
        
        okhttp3.Call call = getReporteCall(xApiKey, request, xFullReport, progressListener, progressRequestListener);
        return call;
    }
    
    public Respuesta getReporte(String xApiKey, PersonaPeticion request, String xFullReport) throws ApiException {
        ApiResponse<Respuesta> resp = getReporteWithHttpInfo(xApiKey, request, xFullReport);
        return resp.getData();
    }
    
    public ApiResponse<Respuesta> getReporteWithHttpInfo(String xApiKey, PersonaPeticion request, String xFullReport) throws ApiException {
        okhttp3.Call call = getReporteValidateBeforeCall(xApiKey, request, xFullReport, null, null);
        Type localVarReturnType = new TypeToken<Respuesta>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call getReporteAsync(String xApiKey, PersonaPeticion request, String xFullReport, final ApiCallback<Respuesta> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = getReporteValidateBeforeCall(xApiKey, request, xFullReport, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Respuesta>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
}
