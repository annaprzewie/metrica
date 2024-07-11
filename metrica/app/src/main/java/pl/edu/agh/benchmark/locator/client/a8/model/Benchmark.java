package pl.edu.agh.benchmark.locator.client.a8.model;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Benchmark {

    private String number;

    private Long revision = 0L;

    private String remarks;

    private double latitude;

    private double longitude;

    private double level;

    private String address;

    private Boolean destroyed;

    private Boolean measurementPossible;

    private Date lastModificationDate;

    private Date creationDate;

    private String author;

    private String originalAuthor;
}
