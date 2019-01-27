# 멀티 스레드 환경에서 비효율성 문제를 해결하기 위한 코드
- synchronized만 사용해서는, 스레드들의 효율적인 관리가 어렵다
- 그러므로, wait(), notify(), notifyAll()을 이용해서 스레드들의 lock을 관리한다.
