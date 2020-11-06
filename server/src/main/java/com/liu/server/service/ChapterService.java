package com.liu.server.service;

import com.liu.server.dto.ChapterDto;
import com.liu.server.mapper.ChapterMapper;
import com.liu.server.pojo.Chapter;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service("ChapterService")
public class ChapterService {

    @Resource
    private ChapterMapper chapterMapper;

    public List<ChapterDto> list(){
        List<Chapter> chapters = chapterMapper.selectByExample(null);
        ArrayList<ChapterDto> chapterDtoList = new ArrayList<>();
        for (int i = 0; i < chapters.size(); i++) {
            Chapter chapter = chapters.get(i);
            ChapterDto chapterDto = new ChapterDto();
            BeanUtils.copyProperties(chapter,chapterDto);
            chapterDtoList.add(chapterDto);
        }
        return chapterDtoList;
    }
}
