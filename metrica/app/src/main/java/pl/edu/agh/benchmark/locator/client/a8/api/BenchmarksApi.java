package pl.edu.agh.benchmark.locator.client.a8.api;

import java.util.List;

import io.reactivex.Single;
import pl.edu.agh.benchmark.locator.client.a8.model.Benchmark;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface BenchmarksApi {

        @GET("/api/benchmarks")
        Single<List<Benchmark>> getLatestBenchmarks();

        @GET("/api/benchmarks/{number}")
        Single<Benchmark> getLatestBenchmark(@Path("number") String number);
}
