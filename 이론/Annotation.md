# 어노테이션

## 어노테이션이란?
보통 **@ 기호**를 앞에 붙여, 반복적으로 처리해야할 일의 자동화가 가능하게 해준다

> **메타데이터** 란?
> 
> 데이터의 대한 속성정보이다, 데이터의 대한 데이터로서
하위 레벨 데이터를 설명 및 기술하는 데이터라고 보면 된다.
도서관을 예시로 들어보자면 표제,저자,주제명,분류기호 등이 포함되어 있는 목록이 메타데이터의 속한다


> **어노테이션**은 무엇인가?
>
> 어노테이션이란 메타데이터라고 볼 수 있다.
프로그램 실행 관점에서보면 프로그램이 처리할 메인 데이터가 아니라 실행과정에서 데이터를 어떻게 처리할것인지
알려주는 서브 데이터라고 볼 수 있는 것 이다.

### 어노테이션의 기능
1. 컴파일러에 *코드 문법 에러를 체크* 하도록 정보 제공
2. 개발 툴에서 *코드를 자동으로 생성할 수 있는 지* 정보 제공
3. 실행 시 *특정 기능을 실행* 하도록 정보 제공

### 어노테이션 사용법 및 생성
1. 생성 하기

```java
public @interface TestAnnotation {
    String value();
}
```
2. 사용 하기

```java
@TestAnnotation("Test")
public String test(){
     return "test";
}
```


### JAVA에서 제공하는 Built-in Annotation
- 자바에서 기본적으로 제공하는 주요 Built-in Annotation
1. **@Override**
    - 메소드가 슈퍼 클래스의 메소드를 override 메소드라는 정보를 컴파일러에게 전달

2. **@Deprecated**
    - 버전 up을 하면서 해당 클래스/메소드 등이 지원되지 않을 수 있기 때문에, 더이상 사용하지 말라는 경고 메세지를 전달

3. **@SuppressWarning**
   - 코드에 대한 오류 경고가 발생시, 컴파일러에게 명령을 내려 발생하는 경고 제고

4. **@FunctionalInterface**
    - 컴파일러에게 다음의 인터페이스는 함수형 인터페이스라는 것을 알림
    - overriding annotation 같은 실수 방지 용도



### 블로그
1. [[Java] 어노테이션이 뭔데??](https://velog.io/@jkijki12/annotation)

2. [JAVA @어노테이션이란?](https://simostory.tistory.com/32)

3. [@Override 어노테이션의 의미와 사용 이유는 무엇일까?](https://velog.io/@pearl0725/Override-%EC%96%B4%EB%85%B8%ED%85%8C%EC%9D%B4%EC%85%98%EC%9D%98-%EC%9D%98%EB%AF%B8%EC%99%80-%EC%82%AC%EC%9A%A9-%EC%9D%B4%EC%9C%A0%EB%8A%94-%EB%AC%B4%EC%97%87%EC%9D%BC%EA%B9%8C)
