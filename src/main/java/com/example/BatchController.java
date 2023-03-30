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

        List<Data> datas = List.of(
                new Data(1L, "클로저는 무엇이며 어떻게, 왜 사용하나요?"),
                new Data(1L, "this가 JavaScript에서 어떻게 작동하는지 설명하세요."),
                new Data(1L, "호이스팅에 대해 설명하세요."),
                new Data(1L, "event bubbling에 대해 설명하세요."),
                new Data(1L, "Callback 대신 Promise를 사용할 때의 장점과 단점은 무엇인가요?"),
                new Data(1L, "이벤트 루프란 무엇인가요?"),
                new Data(1L, "동기, 비동기 함수의 차이점을 설명하세요."),
                new Data(1L, "실행 컨텍스트에 대해 설명해주세요."),
                new Data(1L, "깊은 복사와 얕은 복사에 대해 설명해주세요."),
                new Data(1L, "불변성을 유기하기 위해서는 어떻게 해야하나요?"),
                new Data(1L, "null과 undefined의 차이점은 무엇인가요?"),
                new Data(1L, "프로토타입 상속이  어떻게 작동하는지 설명하세요."),
                new Data(2L, "float이 어떻게 작동하는지 설명하세요."),
                new Data(2L, "inline과 inline-block의 차이점은 무엇인가요?"),
                new Data(2L, "relative, fixed, absolute, static 요소의 차이점은 무엇인가요?"),
                new Data(2L, "z-index와 스택 컨텍스트(stacking context)가 어떻게 형성되는지 설명하세요."),
                new Data(2L, "absolute 포지셔닝 대신 translate()을 사용하는 이유가 무엇인가요?"),
                new Data(2L, "쿠키와 세션스토리지, 로컬스토리지의 차이를 설명해주세요."),
                new Data(2L, "Progressive Rendering이 무엇인가요?"),
                new Data(2L, "SEO는 무엇인가요?"),
                new Data(2L, "Sementic tag에 대해 설명해주세요."),
                new Data(2L, "<section>과 <article>의 차이는 무엇인가요?"),
                new Data(3L, "React의 개념과 장점, 그리고 컴포넌트란 무엇인가요?"),
                new Data(3L, "React의 내부 작동 원리를 재조정 (Reconciliaiton) 개념과 함께 설명하세요."),
                new Data(3L, "React에서 DOM을 어떻게 랜더링하고 브라우저 이벤트를 처리하나요?"),
                new Data(3L, "React에 있는 라이프사이클과 각 라이프사이클의 역할을 설명하세요."),
                new Data(3L, "React의 Class Component의 생명주기 메소드에 대해서 설명하세요."),
                new Data(3L, "React Router같은 Client Side Routing에 대해서 설명하세요."),
                new Data(3L, "state를 직접 변경하지 않고 setState를 사용하는 이유에 대해서 설명하세요."),
                new Data(3L, "Props Drilling 이란 무엇인가요?"),
                new Data(3L, "React Hooks의 장점은 무엇인가요?"),
                new Data(3L, "React의 Class Component와 Function Component의 차이점에 대해서 설명하세요."),
                new Data(3L, "JSX란 무엇인가요?"),
                new Data(3L, "여러가지 상태 관리 라이브러리의 차이점에 대해서 설명하세요."),
                new Data(3L, "FLUX 패턴에 대해서 설명하세요."),
                new Data(3L, "Hydration은 무엇인가요?"),
                new Data(3L, "LCP란 무엇인가요?"),
                new Data(3L, "FCP란 무엇인가요?"),
                new Data(3L, "React에서 Redux란 무엇인가요? Redux를 사용하는 이유는 무엇인가요?"),
                new Data(3L, "React에서 Redux와 Context API의 차이점은 무엇인가요?"),
                new Data(3L, "React에서 React.memo()란 무엇인가요? 어떤 상황에서 사용하나요?"),
                new Data(3L, "React에서 Server Side Rendering (SSR)이란 무엇인가요? SSR을 구현하는 방법은 무엇인가요?"),
                new Data(3L, "React에서 React Testing Library란 무엇인가요? 어떻게 사용하나요?"),
                new Data(3L, "React에서 Lazy Loading이란 무엇인가요? 어떤 상황에서 사용하나요?"),
                new Data(4L, "spread 문법을 사용할 때의 이점은 무엇이며 rest 문법과 다른 점은 무엇인가요?"),
                new Data(4L, "구조 분해 할당(destructuring) 이란 무엇인가요?"),
                new Data(4L, "ES6 이상의 버전을 브라우저에서 인식하지 못한다면 어떻게 해결해야 하나요?"),
                new Data(4L, "ES6에서 화살표 함수와 일반 함수의 차이는 무엇인가요?"),
                new Data(4L, "var, let, const의 차이를 설명해주세요."),
                new Data(4L, "ES6의 템플릿 리터럴은 무엇이며, 어떻게 사용하나요?"),
                new Data(4L, "클래스(class)란 무엇이며, 어떻게 사용하나요?"),
                new Data(4L, "ES6에서 제공하는 Symbol은 무엇이며, 어떤 경우에 사용하면 좋은가요?"),
                new Data(4L, "ES6의 모듈 시스템은 무엇이며, 어떻게 사용하나요?"),
                new Data(4L, "ES6에서 제공하는 Map과 Set의 차이점은 무엇인가요? 어떤 경우에 사용하면 유용한가요?"),
                new Data(5L, "Node.js는 무엇이며 어떻게 프론트엔드 개발에 활용될 수 있나요?"),
                new Data(5L, "Express.js는 무엇이며 어떻게 사용되나요?"),
                new Data(5L, "Node.js에서 파일을 읽고 쓰는 방법은 무엇인가요?"),
                new Data(5L, "Node.js에서 동기와 비동기 프로그래밍의 차이점은 무엇인가요?"),
                new Data(5L, "Node.js에서 콜백 함수(callback function)란 무엇인가요?"),
                new Data(5L, "Node.js에서 이벤트 (Event)란 무엇인가요?"),
                new Data(5L, "Node.js에서 패키지 매니저 (Package Manager)는 어떤 것이 있고 어떻게 사용되나요?"),
                new Data(5L, "Node.js에서 모듈 (Module)이란 무엇인가요?"),
                new Data(5L, "Node.js에서 RESTful API를 만드는 방법은 무엇인가요?"),
                new Data(5L, "Node.js에서 WebSocket이란 무엇이며 어떻게 사용되나요?"),
                new Data(6L, "TypeScript를 쓰는 이유는 무엇인가요?"),
                new Data(6L, "TypeScript에서 원시 타입은 무엇인가요?"),
                new Data(6L, "TypeScript에서 any는 무엇인가요?"),
                new Data(6L, "TypeScript에서 void는 무엇인가요?"),
                new Data(6L, "TypeScript에서 unknown은 무엇인가요?"),
                new Data(6L, "TypeScript에서 null은 무엇인가요?"),
                new Data(6L, "TypeScript에서 undefined는 무엇인가요?"),
                new Data(6L, "TypeScript에서 never type의 목적은 무엇인가요?"),
                new Data(6L, "typeof 연산자는 TypeScript에서 어떻게 사용되나요?"),
                new Data(6L, "TypeScript에서 인터페이스 (Interface)란 무엇이며 어떻게 사용되나요?"),
                new Data(6L, "TypeScript에서 제네릭 (Generic)이란 무엇이며 어떻게 사용되나요?"),
                new Data(6L, "TypeScript에서 모듈 (Module)이란 무엇이며 어떻게 사용되나요?"),
                new Data(6L, "TypeScript에서 클래스 (Class)와 인터페이스 (Interface)의 차이점은 무엇인가요?"),
                new Data(6L, "TypeScript에서 타입 추론 (Type Inference)이란 무엇이며 어떻게 작동하나요?"),
                new Data(6L, "TypeScript에서 네임스페이스 (Namespace)란 무엇이며 어떻게 사용되나요?"),
                new Data(6L, "TypeScript에서 모듈 번들러 (Module Bundler)는 어떤 것이 있고 어떻게 사용되나요?")
        );
        for (Data data : datas) {
            restTemplate.postForEntity("http://localhost:8080/api/v1/questions", data, Object.class);
            Thread.sleep(240000);
        }
//        restTemplate.postForEntity("http://localhost:8080/api/v1/questions",new Data(1L,"hello"),Object.class );
        return "batch";
    }
}

record Data(Long midCategoryId, String question) {

}
