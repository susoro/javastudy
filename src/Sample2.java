public class Sample2 {
    public static void main(String[] args) {

        float b = 10.5f;
        int i = (int)b;
        System.out.println(i);


        int a = 25;
        float c = 42.159f;
        int value = (int)(a*a + 2*(a*c) + c*c);
        System.out.println(value);
    }

    /*
    Java 명명 규칙은 변수, 메서드, 클래스, 패키지 및 기타 식별자의 이름을 정의하는 지침입니다. 이러한 규칙을 따르면 코드의 가독성과 유지보수성이 향상됩니다. 다음은 표준 Java 명명 규칙입니다:

1. 패키지

	•	규칙: 소문자를 사용하고, 구성 요소는 점(.)으로 구분합니다.
	•	예시: com.example.myapp

2. 클래스 및 인터페이스

	•	규칙: 각 단어의 첫 글자를 대문자로 씁니다(CamelCase).
	•	예시: MyClass, UserAccount, Runnable

3. 메서드

	•	규칙: 소문자로 시작하고, 이후 단어의 첫 글자를 대문자로 씁니다(camelCase).
	•	예시: calculateTotal(), getUserName(), printReport()

4. 변수

	•	규칙: 소문자로 시작하고, 이후 단어의 첫 글자를 대문자로 씁니다(camelCase).
	•	예시: totalAmount, userName, reportData

5. 상수

	•	규칙: 모든 글자를 대문자로 쓰고, 단어는 밑줄(_)로 구분합니다.
	•	예시: MAX_VALUE, DEFAULT_TIMEOUT, ERROR_MESSAGE

6. Enum 상수

	•	규칙: 모든 글자를 대문자로 쓰고, 단어는 밑줄(_)로 구분합니다.
	•	예시: RED, BLUE, HIGH_PRIORITY

7. 타입 매개변수

	•	규칙: 단일 대문자.
	•	예시: T, E, K, V

8. 로컬 변수

	•	규칙: 변수와 유사하게 소문자로 시작하고, 여러 단어는 camelCase로 씁니다.
	•	예시: temp, fileName, bufferSize

9. 인스턴스 변수 (필드)

	•	규칙: 변수와 유사하게 소문자로 시작하고, camelCase를 사용합니다.
	•	예시: employeeId, accountBalance, userAddress

10. 정적 변수

	•	규칙: final일 경우 상수와 유사하게(모든 글자 대문자와 밑줄), 그렇지 않으면 camelCase를 사용합니다.
	•	예시: STATIC_FINAL_VAR, staticCounter

11. 패키지

	•	규칙: 소문자를 사용하고, 계층적인 도메인 구조를 가질 수 있습니다.
	•	예시: com.companyname.project.module

예시 코드:*/
//package com.example.myapp;
//
//    public class MyClass {
//
//        private static final int MAX_USERS = 100;
//        private String userName;
//        private int userId;
//
//        public MyClass(String userName, int userId) {
//            this.userName = userName;
//            this.userId = userId;
//        }
//
//        public void printUserDetails() {
//            System.out.println("User: " + userName + ", ID: " + userId);
//        }
//
//        public static int getMaxUsers() {
//            return MAX_USERS;
//        }
//    }

}


