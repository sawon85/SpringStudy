package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController  // ==> restApi의 rest
public class LogTestController {

    //Slf4j 쓰면 필요 없
 //   private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name); // old

        log.trace("trace log=" + name); //연산이 일어난다. 출력도 없는데 쓸모없는 리소소를 사용할 수 있다. 이렇게 사용X

        log.trace("trace log={}", name);

        log.debug("debug log={}", name);
        log.info("info log = {}", name); //log
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }
}
