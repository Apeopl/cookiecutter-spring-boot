package {{cookiecutter.package_first}}.{{cookiecutter.package_second}}.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello spring boot!";
    }

}
