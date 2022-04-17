# 숫자 야구 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 목록
* 숫자 1부터 9까지 유효성 검증
* 3자리 숫자에서 중복된 숫자에 대한 유효성 검증
* 특정 위치에 있는 수와 자리수를 통해 스트라이크, 볼, 낫싱 판단
* 세자리 수를 통해 게임결과 판단
* 컴퓨터의 3자리 숫자를 지정할 수 하며 값이 잘못 입력할 때 IllegalArgumentException 에러 발생
* 사용자에게 값을 입력 받을 수 있으며 사용자가 값을 잘못 입력할 때 IllegalArgumentException 에러 발생
* 게임결과를 정상적으로 출력
* 3스트라이크일때 게임 종료
* 게임 종료시 다시 시작하거나 완전히 종료
