package pjatk.jazs20495nbp.controller;

import org.springframework.web.bind.annotation.*;
import pjatk.jazs20495nbp.service.NbpService;


@RestController
@RequestMapping("/nbp")
public class NBPRestController {

   private final NbpService nbpService;

    public NBPRestController(NbpService nbpService) {
        this.nbpService = nbpService;
    }

//    @GetMapping(value = "/currency/calculate", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<> calculateCurrency(@PathVariable String currency, @RequestParam(defaultValue = "1") int numberOfDays){
//
//        return ResponseEntity.ok(nbpService.calculate(currency, numberOfDays));
//
//    }


}
