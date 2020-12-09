package masterIL.certification.example.demoRest.controller;

import masterIL.certification.example.demoRest.service.AdderService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/adder", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AdderController {

    private AdderService adderService;

    public AdderController(AdderService adderService) {
        this.adderService = adderService;
    }

    @GetMapping("/current")
    public int currentNum() {
        return adderService.currentBase();
    }

    @PostMapping("/add")
    public int add(@RequestParam(name = "num") int num) {
        return adderService.add(num);
    }

    @PostMapping("/sub")
    public int sub(@RequestParam(name = "num") int num) {
        return adderService.sub(num);
    }

    @PostMapping("/mult")
    public int mult(@RequestParam(name = "num") int num) {
        return adderService.mult(num);
    }

    @PostMapping("/div")
    public int div(@RequestParam(name = "num") int num) {
        return adderService.div(num);
    }

    @PostMapping("/accumul")
    public int accumul(@RequestParam(name = "num") int num) {
        return adderService.accumulate(num);
    }

}
