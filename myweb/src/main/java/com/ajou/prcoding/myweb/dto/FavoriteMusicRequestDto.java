//package com.ajou.prcoding.myweb.dto;
//
//import com.ajou.prcoding.myweb.entity.FavoriteMusic;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//
//import javax.persistence.Column;
//
//@Getter
//@Setter
//@ToString
//public class FavoriteMusicRequestDto {
//    private String trackId;
//    private String collectionId;
//    private String artWorkUrl100;
//    private String artistId;
//    private String artistName;
//    private String artistViewUrl;
//    private String collectionName;
//    private String collectionViewUrl;
//
//    public FavoriteMusic toEntity(){
//        FavoriteMusic music = new FavoriteMusic();
//        music.setTrackId(this.trackId);
//        music.setCollectionId(this.collectionId);
//        music.setArtworkUrl100(this.artWorkUrl100);
//        music.setArtistId(this.artistId);
//        music.setArtistName(this.artistName);
//        music.setArtistViewUrl(this.artistViewUrl);
//        music.setCollectionName(this.collectionName);
//        music.setCollectionViewUrl(this.collectionViewUrl);
//
//        return music;
//    }
//}
package com.ajou.prcoding.myweb.dto;

import com.ajou.prcoding.myweb.entity.FavoriteMusic;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Id;

@Getter
@Setter
@ToString
public class FavoriteMusicRequestDto {
//    private String collectionId;
//    private String trackId;
//    private String artistId;
//    private String artistName;
//    private String artistViewUrl;
//    private String collectionName;
//    private String collectionViewUrl;
//    private String trackCensoredName;
//    private String collectionCensoredName;
//    private String artworkUrl100;
    private String collectionId;

    private String collectionType;

    private String artistId;

    private String artistName;

    private String artistViewUrl;

    private String collectionName;

    private String collectionViewUrl;

    public FavoriteMusic toEntity(){
//        FavoriteMusic music = new FavoriteMusic();
//        music.setCollectionId(this.collectionId);
//        music.setTrackId(this.trackId);
//        music.setArtistId(this.artistId);
//        music.setArtistName(this.artistName);
//        music.setArtistViewUrl(this.artistViewUrl);
//        music.setCollectionName(this.collectionName);
//        music.setCollectionViewUrl(this.collectionViewUrl);
//        music.setTrackCensoredName(this.trackCensoredName);
//        music.setCollectionCensoredName(this.collectionCensoredName);
//        music.setArtworkUrl100(this.artworkUrl100);
        FavoriteMusic music = new FavoriteMusic();
        music.setCollectionId(this.collectionId);
        music.setCollectionType(this.collectionType);
        music.setArtistId(this.artistId);
        music.setArtistName(this.artistName);
        music.setArtistViewUrl(this.artistViewUrl);
        music.setCollectionName(this.collectionName);
        music.setCollectionViewUrl(this.collectionViewUrl);

        return music;
    }
}
