package com.sist.music;

import lombok.*;

//Music 관련 데이터 모아두는 곳

@Getter
@Setter
public class Music {
	private int no;
	private String title;
	private String singer;
	private String album;
	private String state;
	private int idcrement;
	private String poster;
}
