package com.liu.business.controller.admin;

import com.liu.server.dto.ChapterDto;
import com.liu.server.dto.PageDto;
import com.liu.server.service.ChapterService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/admin/chapter")
public class ChapterController {

	@Resource
	private ChapterService chapterService;

	@RequestMapping("/list")
	public PageDto list(@RequestBody PageDto pageDto) {
		chapterService.list(pageDto);
		return pageDto;
	}
}
