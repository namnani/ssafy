```
Arrays.sort(r, new Comparator<Room>() {
			@Override
			public int compare(Room o1, Room o2) {
				if(o1.end<o2.end) {
					return -1; //return -1이면 앞으로 오는건가벼?
				} else if(o1.end == o2.end ) {
					if(o1.start < o2.start)
						return -1;
					else return 0; //return 0이면 위치 안바꾸는건가벼?
				} else {
					return 1; //return 1이면 뒤로 가는건가벼?
				}
			}
		});
```
