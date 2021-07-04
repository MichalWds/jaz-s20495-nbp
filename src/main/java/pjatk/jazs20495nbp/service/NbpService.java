package pjatk.jazs20495nbp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pjatk.jazs20495nbp.model.Rate;
import pjatk.jazs20495nbp.repository.NBPRepository;

import java.util.List;

@Service
public class NbpService {

    private final RestTemplate restTemplate;
    private final NBPRepository nbpRepository;

    public NbpService(RestTemplate restTemplate, NBPRepository nbpRepository) {
        this.restTemplate = restTemplate;
        this.nbpRepository = nbpRepository;
    }

    public double calculate(List<Rate> reteList) {
        double sum = 0;
        long count = 0;
        for (Rate rate : reteList) {
            double mid = rate.getMiddle_value();
            sum += mid;
            count++;
        }
        return count > 0 ? sum / count : 0.0d;
    }
}
