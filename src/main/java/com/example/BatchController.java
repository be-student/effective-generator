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
    public String batch() {
        //midCategory Id=7
//        1. Java에서의 인터페이스(Interface)란 무엇인가요?
//                2. Java에서의 추상 클래스(Abstract Class)란 무엇인가요?
//        3. Java에서의 상속(Inheritance)에 대해 설명해주세요.
//        4. Java에서의 다형성(Polymorphism)에 대해 설명해주세요.
//        5. Java에서의 final 키워드에 대해 설명해주세요.
//        6. Java에서의 static 키워드에 대해 설명해주세요.
//        7. Java에서의 synchronized 키워드에 대해 설명해주세요.
//        8. Java에서의 쓰레드(Thread)와 프로세스(Process)의 차이점은 무엇인가요?
//                9. Java에서의 람다 표현식(Lambda Expression)에 대해 설명해주세요.
//        10. Java에서의 스트림(Stream) API에 대해 설명해주세요.
//        11. Java에서의 열거형(Enum)에 대해 설명해주세요.
//        12. Java에서의 파일 입출력(File I/O)에 대해 설명해주세요.
//        13. Java에서의 네트워킹(Networking)에 대해 설명해주세요.
//        14. Java에서의 직렬화(Serialization)와 역직렬화(Deserialization)에 대해 설명해주세요.
//        15. Java에서의 예외(Exception)과 오류(Error)의 차이점은 무엇인가요?
//                16. Java에서의 애노테이션(Annotation)에 대해 설명해주세요.
//        17. Java에서의 리플렉션(Reflection)에 대해 설명해주세요.
//        18. Java에서의 제네릭(Generic)과 와일드카드(Wildcard)의 차이점은 무엇인가요?
//                19. Java에서의 인터페이스(Interface)와 추상 클래스(Abstract Class)의 차이점은 무엇인가요?
//                20. Java에서의 JDBC(Java Database Connectivity)에 대해 설명해주세요.
//        21. Java의 특징에는 어떤 것이 있나요?
//                22. Java와 C++의 차이점은 무엇인가요?
//        23. Java에서 객체 지향 프로그래밍(Object-oriented programming)에 대해 설명해주세요.
//        24. Java에서 사용되는 Garbage Collector(GC)란 무엇인가요?
//                25. Java에서의 예외 처리(Exception Handling) 방법에 대해 설명해주세요.
//        26. Java에서의 멀티쓰레드(Multi-thread) 프로그래밍에 대해 설명해주세요.
//        27. Java에서 사용되는 자바 가상 머신(Java Virtual Machine, JVM)이란 무엇인가요?
//        28. Java에서의 접근 제어자(Access Modifier)에 대해 설명해주세요.
//        29. Java에서의 제네릭(Generic)이란 무엇인가요?
//                30. Java에서의 컬렉션(Collection) 프레임워크에 대해 설명해주세요.
        List<Data> datas=List.of(
                new Data(7L,"Java에서의 인터페이스(Interface)란 무엇인가요?"),
                new Data(7L,"Java에서의 추상 클래스(Abstract Class)란 무엇인가요?"),
                new Data(7L,"Java에서의 상속(Inheritance)에 대해 설명해주세요."),
                new Data(7L,"Java에서의 다형성(Polymorphism)에 대해 설명해주세요."),
                new Data(7L,"Java에서의 final 키워드에 대해 설명해주세요."),
                new Data(7L,"Java에서의 static 키워드에 대해 설명해주세요."),

        )
        restTemplate.postForEntity("http://localhost:8080/api/v1/questions",new Data(1L,"hello"),Object.class );
        return "batch";
    }
}

class Data{
    private final Long midCategoryId;
    private final String question;

    public Data(Long midCategoryId, String question) {
        this.midCategoryId = midCategoryId;
        this.question = question;
    }

    public Long getMidCategoryId() {
        return midCategoryId;
    }

    public String getQuestion() {
        return question;
    }
}
