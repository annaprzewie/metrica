package pl.edu.agh.benchmark.locator.client.a8.api;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class BenchmarksApiProvider {

    private static Retrofit retrofit;

    private static BenchmarksApi benchmarksApi;

    private static final String BASE_URL = "http://164.132.104.73:8080";

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static synchronized BenchmarksApi getBenchmarksApi() {
        if (benchmarksApi == null) {
            benchmarksApi =  getRetrofitInstance().create(BenchmarksApi.class);
        }
        return benchmarksApi;
    }
}
