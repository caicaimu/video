package com.liu.business.controller.admin;

import com.liu.server.dto.ChapterDto;
import com.liu.server.dto.PageDto;
import com.liu.server.dto.ResponseDto;
import com.liu.server.service.ChapterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@RequestMapping("/admin/chapter")
public class ChapterController {


	private static final Logger LOG = LoggerFactory.getLogger(ChapterController.class);

	@Resource
	private ChapterService chapterService;

	@PostMapping("/list")
	public ResponseDto list(PageDto pageDto) {
		ResponseDto responseDto = new ResponseDto<>();
		chapterService.list(pageDto);
		responseDto.setContent(pageDto);
		System.out.println(responseDto);
		return responseDto;
	}


	@PostMapping("/save")
	public ResponseDto  save (@RequestBody  ChapterDto chapterDto){
		ResponseDto responseDto = new ResponseDto<>();
		LOG.info("ChapterDto:{}", chapterDto);
		chapterService.save(chapterDto);
		responseDto.setContent(chapterDto);
		return responseDto;
	}

	@GetMapping("/delete/{id}")
	private ResponseDto delete(@PathVariable String id){
		ResponseDto<Object> responseDto = new ResponseDto<>();
		chapterService.delete(id);
		return responseDto;
	}
}
