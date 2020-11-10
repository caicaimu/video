package com.liu.business.controller.admin;

import com.liu.server.dto.ChapterDto;
import com.liu.server.service.ChapterService;
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
	public List<ChapterDto> list() {
		System.out.println("heel");
		return chapterService.list();
	}
}
