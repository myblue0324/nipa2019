package hmd.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import hmd.util.FormatUtil;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 메뉴
 * 
 * @author jeongdae
 *
 */
@Getter
@Setter
@ToString
public class Menu {
	
	/******** 화면 트리 표시용 ********/
	private String open = "open";
	private String nodeType = "folder";
	private String parentName;
	// up : 위로, down : 아래로
	private String updateType;
	// Page Header 표시용
	private String aliasName;
	
	// 메뉴 접근 모든 권한
	private String allYn;
	// 읽기 권한
	private String readYn;
	// 쓰기 권한
	private String writeYn;
	// 수정 권한
	private String updateYn;
	// 삭제 권한
	private String deleteYn;

	// 고유번호
	private Integer menuId;
	// 0 : URL 기반, 1 : HTML ID
	private String menuType;
	// 0 : 사용자 사이트, 1 : 관리자 사이트
	private String menuTarget;
	// 메뉴명
	private String name;
	// 영어 메뉴명
	private String nameEn;
	// 언어별
	private String lang;
	// 조상
	private Integer ancestor;
	// 부모 고유번호
	private Integer parent;
	// 깊이
	private Integer depth;
	// 나열 순서
	private Integer viewOrder;
	// URL
	private String url;
	// URL Alias
	private String urlAlias;
	// 메뉴 타입이 HTML ID 일 경우 id값
	private String htmlId;
	// 메뉴 타입이 HTML ID 일 경우 메뉴와 한쌍으로 묶이는 content id값
	private String htmlContentId;
	// 이미지
	private String image;
	// 이미지 Alt
	private String imageAlt;
	// css class명
	private String cssClass;
	// 기본 표시 메뉴, Y : 기본, N : 선택
	private String defaultYn;
	// 사용유무, Y : 사용, N : 사용안함
	private String useYn;
	// 화면표시 여부, Y : 표시, N : 비표시
	private String displayYn;
	// 설명
	private String description;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone="Asia/Seoul")
	private Date insertDate;
	
	public String getViewInsertDate() {
		if(getInsertDate() == null) {
			return "";
		}
		
		String tempDate = FormatUtil.getViewDateyyyyMMddHHmmss(getInsertDate());
		return tempDate.substring(0, 19);
	}
}
