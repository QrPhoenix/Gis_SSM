package com.gis.service.Impl;

import com.gis.db.dao.MusicListMapper;
import com.gis.db.model.MusicList;
import com.gis.db.model.MusicListExample;
import com.gis.service.MusicListService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by QXY on 2018/10/8.
 */
@Service("MusicListService")
public class MusicListServiceImpl implements MusicListService {
    @Resource
    private MusicListMapper musicListMapper;
    public List<MusicList> getMusicList() {
        MusicListExample musicListExample = new MusicListExample();
        List<MusicList> List= musicListMapper.selectByExample(musicListExample);
        return List;
    }
}
