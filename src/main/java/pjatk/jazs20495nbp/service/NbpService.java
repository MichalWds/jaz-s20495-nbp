package pjatk.jazs20495nbp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NbpService {

    private final RestTemplate restTemplate;

    public NbpService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

}