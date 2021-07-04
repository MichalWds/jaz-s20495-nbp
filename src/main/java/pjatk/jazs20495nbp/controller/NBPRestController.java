package pjatk.jazs20495nbp.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pjatk.jazs20495nbp.model.Gold;
import pjatk.jazs20495nbp.service.NbpService;


@RestController
@RequestMapping("/nbp")
public class NBPRestController {

    private final NbpService nbpService;

    public NBPRestController(NbpService nbpService) {
        this.nbpService = nbpService;
    }

//    @ApiOperation(value =  "Average exchange rate",
//            response = Gold.class,
//            notes = "Average exchange rate between dates")
//
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Perfect!"),
//            @ApiResponse(code = 401, message = "Access denied"),
//            @ApiResponse(code = 404, message = "Not Found"),
//            @ApiResponse(code = 403, message = "Forbidden")
//    })


}
