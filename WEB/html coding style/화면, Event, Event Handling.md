# 웹 화면쪽에서도 MVC를 적용한 코딩
- 애플리케이션 보안과 가독성에 좋다. 


###화면, 이벤트, 이벤트 핸들링이 한곳에
```
<body>
	<!-- 전형적인 A방식의 태그. 이벤트도 내가 걸고, 이벤트도 내가 처리해주고. -->
	<!-- form 태그 자체가 이벤트를 갖고 있음. -->
	<!-- form 태그랑 submit 타입의 input 태그랑 같이 쓰여야함. -->
	<h1>아이디를 입력하세요</h1>
	<form actin="aaaaa.jsp">
		<label for="id"></label>아이디 : <input id="inputId" name="inputId">
		 <input type="submit">
	</form>
</body>
```

###화면과 이벤트 발생을 모으고, 이벤트 핸들링만 분리한 코드.
```
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function sendId(){
		v = document.getElementById("inputId");
		alert("send..." + v.value);
	}
</script>
</head>
<body>
	<!-- 전형적인 B방식의 태그. 이벤트만 걸어주고, 이벤트 처리는 다른쪽에서. -->
	<!-- form 태그 자체가 이벤트를 갖고 있음. -->
	<!-- form 태그랑 submit 타입의 input 태그랑 같이 쓰여야함. -->
	<h1>아이디를 입력하세요</h1>
	아이디 :
	<input id="inputId" name="inputId">
	<!-- <input type="button" value="전송"> -->
	<button onclick="sendId()">전송</button>
</body>
```

###화면, 이벤트 발생, 이벤트 처리를 모두 분리한 코드.
```
<body>
	<!-- 전형적인 C방식의 태그. 이벤트 걸어주고, 이벤트처리 걸어주는것도 분할해서 처리. -->
	<!-- html 코드를 간단하게 할 수 있음. -->
	<h1>아이디를 입력하세요</h1>
	아이디 :
	<input >
	<!-- <input type="button" value="전송"> -->
	<button >전송</button>
	<script>
		/*  C방식은 디자인 코드 이후 이벤트를 정의하기 때문에 하단에 정의 권장 */
		document.querySelector("button").onclick = function(){
			var i = document.querySelector("input").value;
			alert(i);
		}
	</script>
</body>
```
