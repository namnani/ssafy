# Class에서 implements Comparable을 구현
## 정렬기준이 되는 메소드인 compareTo() 메소드를 재정의해준다.
```
public int compareTo(Member o) {

//		return o.getAge() - age; //나이 내림차순
//		return age-o.getAge(); //나이 오름차순

//		return o.getName().compareTo(name); //내림차순
		return name.compareTo(o.getName()); //오름차순
//		int comp = name.compareTo(o.getName());  //이름 오름차순, 같으면 나이로 내림차순
//		if(comp == 0) {
//			comp = o.getAge() - age;
//		}
//		return comp;
	}
```
