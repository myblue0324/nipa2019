package hmd.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import hmd.util.FormatUtil;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 사용자 그룹별 Role
 * @author jeongdae
 *
 */
@Getter
@Setter
@ToString
public class UserGroupRole {
	
	private Search search;
	
	/****** validator ********/
	private String methodMode;
	
	// 사용자ID
	private String userId;
	// check role_id
	private String checkIds;
	
	// 고유번호
	private Integer userGroupRoleId;
	// 사용자 그룹 고유키
	private Integer userGroupId;
	// Role 고유키
	private Integer roleId;
	// Role 명
	private String roleName;
	// Role KEY
	private String roleKey;
	// Role 타켓. 0 : 사용자 페이지, 1 : 관리자  페이지, 2 : 서버
	private String roleTarget;
	// Role 업무 유형. 0 : 사용자, 1 : 서버, 3 : api
	private String roleType;
	// 사용유무. Y : 사용, N : 사용안함
	private String useYn;
	// 기본사용 유무. Y : 사용, N : 사용안함
	private String defaultYn;
	// 설명
	private String description;
	// 등록일
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
