package spring_boot;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Adrian.Flak on 6/22/2017.
 */
@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "movieId")
    private Integer id;

    @Version
    private Integer version;

    private String title;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<ProductionCompany> productionCompanyList;

    public Movie () {}

    public Movie (String title){
        this.setTitle(title);
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<ProductionCompany> getProductionCompanyList() {
        return productionCompanyList;
    }

    public void setProductionCompanyList(List<ProductionCompany> productionCompanyList) {
        this.productionCompanyList = productionCompanyList;
    }
}
