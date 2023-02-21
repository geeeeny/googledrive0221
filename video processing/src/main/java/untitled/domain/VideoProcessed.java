package untitled.domain;

import untitled.domain.*;
import untitled.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private String url;
    private String filekey;

    public VideoProcessed(Video aggregate){
        super(aggregate);
    }
    public VideoProcessed(){
        super();
    }
}
