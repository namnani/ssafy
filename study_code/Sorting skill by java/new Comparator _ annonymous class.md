# 익명클래스로 Comparator 인터페이스를 만들어서, Cllections.sort()의 2번째 매개변수로 넣는다.

```
Collections.sort(list, new Comparator<Movie>() {
			public int compare(Movie m1, Movie m2) {
				if(m1.getTime() > m2.getTime())
					return 1;
				else if(m1.getTime() == m2.getTime())
					return 0;
				else
					return -1;
			}
		});
```
