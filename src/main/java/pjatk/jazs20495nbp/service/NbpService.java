package pjatk.jazs20495nbp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pjatk.jazs20495nbp.model.Gold;
import pjatk.jazs20495nbp.model.Rate;
import pjatk.jazs20495nbp.repository.NBPRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class NbpService {

    private final RestTemplate restTemplate;
    private final NBPRepository nbpRepository;

    public NbpService(RestTemplate restTemplate, NBPRepository nbpRepository) {
        this.restTemplate = restTemplate;
        this.nbpRepository = nbpRepository;
    }

    private Gold getGold(String curr, LocalDate startDate, LocalDate endDate, double calc) {
        Gold gold = new Gold();
        gold.setCurrency_name(curr);
        gold.setStart_date(startDate);
        gold.setEnd_date(endDate);
        gold.setAvg_currency(calc);
        gold.setStart_req_date(LocalDate.now());
        gold.setStart_req_time(LocalTime.now());
        return gold;
    }

}
