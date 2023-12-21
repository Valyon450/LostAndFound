package com.example.lost_and_found.bll.dto;

import lombok.Data;

@Data
public class ItemDTO {
    private String Name;
    private String Note;
    private Long LocationId;
	private Long StatusId;
	private Long ContactInfoId;
	private Long UserId;
    private Long KeywordId;
}
