package com.tutomato.disasteralert.websocket.v1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter @Setter
@ToString
@NoArgsConstructor
public class CounterV1 {

    private int counter;
    private LocalDateTime updateDate;

    public void plus(){
        counter++;
        updateDate = LocalDateTime.now();
    }

}
