// RomanNumeralsController.java
package com.libertymutual.goforcode.romanNumerals.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.libertymutual.goforcode.romanNumerals.services.HinduToRomanNumeralConverter;

@Controller
@RequestMapping("/")
public class RomanNumeralController {

    private HinduToRomanNumeralConverter converter;

    public RomanNumeralController() {
        converter = new HinduToRomanNumeralConverter();
    }

    @GetMapping("")
    public String showDefaultPage() {
        return "romanNumerals/default";
    }

    @PostMapping("")
    public ModelAndView convertNumber(int numberToConvert) {
        String result = converter.convert(numberToConvert);

        ModelAndView mv = new ModelAndView("romanNumerals/default");
        mv.addObject("conversion", result);
        return mv;
    }

}
