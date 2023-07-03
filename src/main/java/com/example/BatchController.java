package com.example;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BatchController {

    private final RestTemplate restTemplate;

    public BatchController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/batch")
    public String batch() throws InterruptedException {
        //midCategory Id=10
        //1. - Django에서 MVT 패턴이란 무엇이며, 각 구성 요소가 어떤 역할을 하는지 설명해보세요.
        //- Django에서 ORM이란 무엇이며, 어떻게 사용되는지 설명해보세요.
        //- Django에서 모델 간 관계를 설정하는 방법과 이를 사용하는 이유를 설명해보세요.
        //- Django에서 미들웨어란 무엇이며, 어떤 상황에서 사용되는지 설명해보세요.
        //- Django에서 쿼리셋(QuerySet)이란 무엇이며, 어떻게 사용되는지 설명해보세요.
        //- Django에서 캐시(cache)란 무엇이며, 어떻게 사용되는지 설명해보세요.
        //- Django에서 Form이란 무엇이며, 어떻게 사용되는지 설명해보세요.
        //- Django에서 사용되는 모듈 시스템(Module System)에 대해 설명해보세요.
        //- Django에서 인증(Authentication)과 권한 부여(Authorization)란 무엇이며, 어떻게 사용되는지 설명해보세요.
        //- Django에서 Celery와 같은 비동기 처리 방식을 사용하는 이유를 설명해보세요.
        List<Data> datas = List.of(
                new Data(10L, "Django에서 MVT 패턴이란 무엇이며, 각 구성 요소가 어떤 역할을 하는지 설명해보세요."),
                new Data(10L, "Django에서 ORM이란 무엇이며, 어떻게 사용되는지 설명해보세요."),
                new Data(10L, "Django에서 모델 간 관계를 설정하는 방법과 이를 사용하는 이유를 설명해보세요."),
                new Data(10L, "Django에서 미들웨어란 무엇이며, 어떤 상황에서 사용되는지 설명해보세요."),
                new Data(10L, "Django에서 쿼리셋(QuerySet)이란 무엇이며, 어떻게 사용되는지 설명해보세요."),
                new Data(10L, "Django에서 캐시(cache)란 무엇이며, 어떻게 사용되는지 설명해보세요."),
                new Data(10L, "Django에서 Form이란 무엇이며, 어떻게 사용되는지 설명해보세요."),
                new Data(10L, "Django에서 사용되는 모듈 시스템(Module System)에 대해 설명해보세요."),
                new Data(10L, "Django에서 인증(Authentication)과 권한 부여(Authorization)란 무엇이며, 어떻게 사용되는지 설명해보세요."),
                new Data(10L, "Django에서 Celery와 같은 비동기 처리 방식을 사용하는 이유를 설명해보세요.")
        );

        for (Data data : datas) {
            try {
                System.out.println(data.question());
                restTemplate.postForEntity("http://localhost:8080/api/v1/questions", data, Object.class);
                Thread.sleep(60000);
            } catch (Exception e) {
                System.out.println("error" + data.question());

//                e.printStackTrace();
            }
        }
        return "batch";
    }
}

record Data(Long midCategoryId, String question) {

}
