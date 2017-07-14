package spring_boot;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Adrian.Flak on 6/22/2017.
 */

@Entity
public class ProductionCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "productionCompanyId")
    private Integer id;

    @Version
    private Integer version;

    private String companyName;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Movie> movieList;

    public ProductionCompany () {}

    public ProductionCompany(String companyName){
        this.setCompanyName(companyName);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }
}
