package com.dbstudy.dto;

import org.apache.ibatis.type.Alias;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Alias("board")
@Getter
@Setter
@ToString
public class BoardDTO {
    int id;
    String title;
    String content;
    int readCnt;
    String registerId;
    LocalDateTime registerTime;
    LocalDateTime updateTime;


    public BoardDTO() {
        super();
    }
    
    public BoardDTO(int id, String title, String content, int readCnt, String registerId, LocalDateTime registerTime, LocalDateTime updateTime) {
        super();
        this.id = id;
        this.title = title;
        this.content = content;
        this.readCnt = readCnt;
        this.registerId = registerId;
        this.registerTime = registerTime;
        this.updateTime = updateTime;
    }

    public BoardDTO(int id, String title, String content, String registerId, LocalDateTime registerTime) {
        super();
        this.id = id;
        this.title = title;
        this.content = content;
        this.readCnt = 0;
        this.registerId = registerId;
        this.registerTime = registerTime;
        this.updateTime = this.registerTime;
    }

    public BoardDTO(String title, String content, String registerId, LocalDateTime registerTime) {
        super();
        this.title = title;
        this.content = content;
        this.readCnt = 0;
        this.registerId = registerId;
        this.registerTime = registerTime;
        this.updateTime = this.registerTime;
    }

    public BoardDTO(int id, String title, String content) {
        super();
        this.id = id;
        this.title = title;
        this.content = content;
    }
}
