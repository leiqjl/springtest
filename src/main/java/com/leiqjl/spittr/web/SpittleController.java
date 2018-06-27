package com.leiqjl.spittr.web;

import com.leiqjl.spittr.Spittle;
import com.leiqjl.spittr.data.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/spittles")
public class SpittleController {

    private SpittleRepository spittleRepository;

    private static final String MAX_LONG_AS_STRING = "9223372036854775807";

    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    @GetMapping("/{spittleId}")
    public String spittle(@PathVariable("spittleId") long spittleId, Model model) {
        model.addAttribute(spittleRepository.findOne(spittleId));
        return "spittle";
    }

    @GetMapping
    public List<Spittle> spittles(@RequestParam(value = "max", defaultValue = MAX_LONG_AS_STRING) long max,
                                  @RequestParam(value = "count",defaultValue = "20") int count) {
        return spittleRepository.findSpittles(max, count);
    }
}
