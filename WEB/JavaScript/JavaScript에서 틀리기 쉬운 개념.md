# 헷갈리기 쉬운 연산자.

```
console.log(1==1);
console.log(1=="1"); //값만 비교
console.log(1==="1"); //자료형 비교 && 값 비교
```

# 헷갈리기 쉬운 키워드, 연산자 undefined!
- undefined는 키워드이면서, 문자열이기도 한데, typeof가 붙냐 안붙냐에 따라 달라진다 라는 것 체크!
- 자바스크립트에서는 undefined의 역할이 중요하다.
if(names[0]) 의 경우 defined냐 undefined냐로 따진다.
자바스크립트는 boolean형이 들어가는 공간은 자동으로 undefined를 체크하는 신텍스가 숨어있다고 한다. 그래서 굳이 ==, != 이런거 안해도된다 한다.
ex) if(names[0] != undefined) 처리 안해도 된다.
```
if(names[0]){  // 1== 1,  names[0] != undefined 안해주고 옆에처럼 해주면된다.
    console.log('같다.');
} else {
	  console.log('다르다.');
}
```


# JavaScript에서 eval() 함수
- eval() 함수는 문자열을 자바스크립트 코드로 실행하는 함수입니다.

# JavaScript에서 typeof는 연산자다.
- 함수가 아님에 유의!

# 함수 안에서 변수명 앞에 var를 붙인것과 안붙인것의 차이
- 로컬 변수 앞에 var가 있다면 그 로컬변수는 함수 안에서만 작동하지만,
로컬 변수 앞에 var가 없다면 해당 함수가 한번 호출된 이후에는 글로벌 변수가 된다.
