package com.sist.back;

import com.sist.vo.Music;

public abstract class CommonsMusic {
	public static Music[] musics = new Music[50];
	
	//데이터 수집
	public abstract void init();
	
	//목록 출력
	public Music[] musicAllData() {
		return musics;
	}
}
