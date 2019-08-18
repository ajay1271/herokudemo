import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin") // http://localhost:8080/admin
public class Controller {


    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String login() {

        return "Hello";
    }
}
