package pjatk.jazs20495nbp.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity(name = "gold")
public class Gold {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "Id of gold currency.", required = true, value = "id", example = "1")
    private Long id;

    @ApiModelProperty(notes = "Name of currency.", required = true, value = "gold", example = "Gold")
    private String currency_name;
    @ApiModelProperty(notes = "Start searching date.", required = true, value = "date", example = "2021-04-07")
    private LocalDate start_date;
    @ApiModelProperty(notes = "End searching date.", required = true, value = "date", example = "2021-04-07")
    private LocalDate end_date;
    @ApiModelProperty(notes = "The average exchange price of currency between given dates.", required = true, value = "double", example = "2.17")
    private double avg_currency;
    @ApiModelProperty(notes = "Request date.", required = true, value = "date", example = "2021-04-07")
    private LocalDate start_req_date;
    @ApiModelProperty(notes = "Request time.",required = true, value = "time", example = "00:00:00")
    private LocalTime start_req_time;

    public Gold() {
    }

    public Gold(Long id, String currency_name, LocalDate start_date, LocalDate end_date, double avg_currency, LocalDate start_req_date, LocalTime start_req_time) {
        this.id = id;
        this.currency_name = currency_name;
        this.start_date = start_date;
        this.end_date = end_date;
        this.avg_currency = avg_currency;
        this.start_req_date = start_req_date;
        this.start_req_time = start_req_time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrency_name() {
        return currency_name;
    }

    public void setCurrency_name(String currency_name) {
        this.currency_name = currency_name;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public LocalDate getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
    }

    public double getAvg_currency() {
        return avg_currency;
    }

    public void setAvg_currency(double avg_currency) {
        this.avg_currency = avg_currency;
    }

    public LocalDate getStart_req_date() {
        return start_req_date;
    }

    public void setStart_req_date(LocalDate start_req_date) {
        this.start_req_date = start_req_date;
    }

    public LocalTime getStart_req_time() {
        return start_req_time;
    }

    public void setStart_req_time(LocalTime start_req_time) {
        this.start_req_time = start_req_time;
    }
}
