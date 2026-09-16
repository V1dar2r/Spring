package project.board.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PingController {

    @GetMapping("/ping")
    public String ping(@RequestParam(name="name", required = false,defaultValue = "pong") String name, Model model){
        model.addAttribute("name",name);
        return "ping";
    }
}
