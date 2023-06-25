package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column
    String model;
    @Column
    int series;
    @OneToOne(mappedBy = "car")
    User user;
    public Car() {

    }
    public Car(int series, String model) {
        this.series = series;
        this.model = model;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return this.user;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setSeries(int series) {
        this.series = series;
    }
    public int getSeries() {
        return this.series;
    }
    @Override
    public String toString() {
        return this.model + " " + this.series;
    }
}
