package DataStructure.DataStructureExample12;
import java.util.*;
public class BoardDao {
   
    public List<Board> getBoardList(){
        List<Board> list = new ArrayList<Board>();
        for(int i = 1; i < 4; i++) {
        list.add(new Board("제목" + i, "내용" + i));
    }
    return list;
}
}
