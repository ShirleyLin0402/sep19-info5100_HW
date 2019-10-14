package Q5;

import java.util.LinkedHashMap;
import java.util.Map;

public interface Boardable {
   void setBoardStart(int month, int day, int year);
   void setBoardEnd(int month, int day, int year);
   boolean boarding(int month, int day, int year);
    Map<Integer,Integer> map= new LinkedHashMap<Integer, Integer>();
}