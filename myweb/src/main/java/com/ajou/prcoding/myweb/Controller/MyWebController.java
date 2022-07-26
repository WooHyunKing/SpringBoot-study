package com.ajou.prcoding.myweb.Controller;

import com.ajou.prcoding.myweb.dto.FavoriteMusicRequestDto;
import com.ajou.prcoding.myweb.dto.MusicList;
import com.ajou.prcoding.myweb.entity.FavoriteMusic;
import com.ajou.prcoding.myweb.repository.FavoriteRepository;
import com.ajou.prcoding.myweb.service.MusicService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.List;


@RestController
public class MyWebController {

    @Autowired
    FavoriteRepository albumsRepo;
    //클래스 변수로 정의
    RestTemplate restTemplate = new RestTemplate();

    MusicList list;



//    @GetMapping(value="/musicSearch/{term}")
//    public MusicList musicSearchByPath(@PathVariable String term){
//        try {
//            String url =String.format("https://itunes.apple.com/search?term=%s&entity=album",term);
//            String response = restTemplate.getForObject(url, String.class);
//
//            ObjectMapper mapper = new ObjectMapper();
//
//            list = mapper.readValue(response, MusicList.class);
//
//            System.out.println(list.getResultCount());
//
//            return list;
//
//        } catch(IOException e) {
//
//            System.out.println(e.toString());
//
//        }
//        return list;
//    }
//
//    @GetMapping(value="/musicSearch")
//    public MusicList musicSearchByParam(@RequestParam String term){
//        try {
//            String url =String.format("https://itunes.apple.com/search?term=%s&entity=album",term);
//            String response = restTemplate.getForObject(url, String.class);
//
//            ObjectMapper mapper = new ObjectMapper();
//
//            list = mapper.readValue(response, MusicList.class);
//
//            System.out.println(list.getResultCount());
//
//            return list;
//
//        } catch(IOException e) {
//
//            System.out.println(e.toString());
//
//        }
//        return list;
//    }
//
//    //Get Favorite Music list from Database
//
//    @GetMapping(value="/likes")
//    public List<FavoriteMusic> getLikes() {
//
//        try {
//
//            return albumsRepo.findAll();
//
//        } catch (Exception e) {
//
//            System.out.println(e.toString());
//
//            return null;
//
//        }
//
//    }
//
//    @PostMapping(value="/likes")
//    @Transactional
//    public int postLikes(@RequestBody FavoriteMusicRequestDto favorite){
//        FavoriteMusic music = albumsRepo.save(favorite.toEntity());
//
//        if(music != null) {
//            return 1;
//        }
//
//        else {
//            return 0;
//        }
//    }


    @Autowired
    MusicService service;

    @GetMapping(value = "/musicSearch/{name}")
    public MusicList musicSearchByPath(@PathVariable String name){

        return service.searchMusic(name);

    }

    @GetMapping(value="/musicSearch")
    public MusicList musicSearchByParam(@RequestParam(value="term") String name) {

        return service.searchMusic(name);

    }

    @GetMapping(value="/likes") //Get Favorite Music list from Database

    public List<FavoriteMusic> getLikes() {

        return service.getLikes();

    }

    @PostMapping(value="/likes")
    @Transactional
    public int postLikes(@RequestBody FavoriteMusicRequestDto favorite) {

        return service.saveFavorite(favorite);

    }

    @DeleteMapping(value="/likes")
    public int deleteFavorite(@RequestParam String id){
        return service.deleteFavorite(id);
    }

}
