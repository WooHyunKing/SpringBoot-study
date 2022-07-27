//package com.ajou.prcoding.myweb.entity;
//
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(schema = "favoriteMusic")
//@Getter
//@Setter
//@ToString
//public class FavoriteMusic {
//    @Id @Column(length=32) private String trackId;
//    @Column private String collectionId;
//    @Column private String artworkUrl100;
//    @Column private String artistId;
//    @Column private String artistName;
//    @Column private String artistViewUrl;
//    @Column private String collectionName;
//    @Column private String collectionViewUrl;
//}
package com.ajou.prcoding.myweb.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(schema = "favoriteMusic")
@Getter
@Setter
@ToString

public class FavoriteMusic {
//    @Id @Column(length=32) private String trackId;
//    @Column private String collectionId;
//    @Column private String artistId;
//    @Column private String artistName;
//    @Column private String artistViewUrl;
//    @Column private String collectionName;
//    @Column private String collectionViewUrl;
//    @Column private String trackCensoredName;
//    @Column private String collectionCensoredName;
//    @Column(length=500) private String artworkUrl100;
    @Id @Column(length=32) private String collectionId;

    @Column private String collectionType;

    @Column private String artistId;

    @Column private String artistName;

    @Column private String artistViewUrl;

    @Column private String collectionName;

    @Column private String collectionViewUrl;
}
