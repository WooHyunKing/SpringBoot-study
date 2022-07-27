package com.ajou.prcoding.myweb.service;

import com.ajou.prcoding.myweb.dto.FavoriteMusicRequestDto;
import com.ajou.prcoding.myweb.dto.MusicList;
import com.ajou.prcoding.myweb.entity.FavoriteMusic;
import com.ajou.prcoding.myweb.repository.FavoriteRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MusicService {
    private final FavoriteRepository albumsRepo;
    RestTemplate restTemplate = new RestTemplate();
    MusicList list;

    public MusicList searchMusic(@PathVariable String term){
        try {
            String url =String.format("https://itunes.apple.com/search?term=%s&entity=album",term);
            String response = restTemplate.getForObject(url, String.class);

            ObjectMapper mapper = new ObjectMapper();

            list = mapper.readValue(response, MusicList.class);

            System.out.println(list.getResultCount());

            return list;

        } catch(IOException e) {

            System.out.println(e.toString());

        }
        return list;
    }

    public List<FavoriteMusic> getLikes(){
        try {

            return albumsRepo.findAll();

        } catch (Exception e) {

            System.out.println(e.toString());

            return null;

        }
    }

    public int saveFavorite(@RequestBody FavoriteMusicRequestDto favorite){
        FavoriteMusic music = albumsRepo.save(favorite.toEntity());

        if(music != null) {
            return 1;
        }

        else {
            return 0;
        }
    }

    public int deleteFavorite(@PathVariable String id){
        try{
            albumsRepo.deleteById(id);
            return 1;
        }catch(Exception e){
            System.out.println(e.toString());
            return 0;
        }

    }
}
