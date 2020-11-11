package com.liu.server.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liu.server.dto.ChapterDto;
import com.liu.server.dto.PageDto;
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

    public void list(PageDto pageDto){
        PageHelper.startPage(pageDto.getPage(),pageDto.getSize());
        //使用代码生成器获取数据
        List<Chapter> chapters = chapterMapper.selectByExample(null);

        PageInfo<Chapter> pageInfo = new PageInfo<>(chapters);
        pageDto.setTotal(pageInfo.getTotal());

        ArrayList<ChapterDto> chapterDtoList = new ArrayList<>();
        //复制 返回的数据包装成我们控制的类型 返回给前端
        for (int i = 0; i < chapters.size(); i++) {
            Chapter chapter = chapters.get(i);
            ChapterDto chapterDto = new ChapterDto();
            BeanUtils.copyProperties(chapter,chapterDto);
            chapterDtoList.add(chapterDto);
        }
        pageDto.setList(chapterDtoList);
    }
}
