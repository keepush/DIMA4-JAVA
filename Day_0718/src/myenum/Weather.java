/*
 *  문제
 *  	- 영단어로 매칭
 *  	- 각 날씨에 할 일을 메소드로! todo()
 *  	- 각 날씨에 놀 일을 메소드로! play()
 */
package myenum;


public enum Weather {
	밝음("Sunny"){
		public String todo() {
			return "빨래 널기";
		}
		public String play() {
			return "산책하기";
		}
	}, 안개("Foggy"){
		public String todo() {
			return "환기하기";
		}
		public String play() {
			return "책 읽기";
		}
	}, 흐림("Cloudy"){
		public String todo() {
			return "화상 회의";
		}
		public String play() {
			return "게임하기";
		}
	}, 비("Rainy"){
		public String todo() {
			return "빗물 퍼내기";
		}
		public String play() {
			return "방탈출";
		}
	}, 눈("Snowy"){
		public String todo() {
			return "집 앞 눈 치우기";
		}
		public String play() {
			return "눈사람 만들기";
		}
	};


	public String eng;
	Weather(String eng){
		this.eng = eng;
	}
	
	
	public String todo() {
		return "";
	}
	
	public String play() {
		return "";
	}
}
	